package services;

import entities.Student;
import repositories.StudentRepository;

import java.util.ArrayList;

public class StudentsServices {

    private StudentRepository studentRepository = new StudentRepository();

    public void saveData(Student student){

        //Validations
        if(student.getNote() < 0 || student.getNote() > 5){
            System.out.println("La nota debe ser entre 0 y 5");
            return;
        }

        if(studentRepository.findByCode(student.getCode()) != null){
            System.out.println("El Estudiante ya Existe");
            return;
        }
        studentRepository.save(student);
        System.out.println("Se guardó el estudiante correctamente");
    }

    public double calculateAverage(){
        ArrayList<Student> list = studentRepository.listAll();
        if(list.isEmpty()) return 0;
        double average = 0;
        for(Student s: list){
            average += s.getNote();
        }

        return average/list.size();
    }

    public void listAll(){
        studentRepository.listAllStudents();
    }

    public boolean deleteStudent(int code){
        return studentRepository.delete(code);
    }

    public boolean verifyStudent(int code){
        Student s = studentRepository.findByCode(code);

        if(s != null){
            return s.getNote() > 3;
            /*if(s.getNote() > 2.9){
                return true;
            }else{
                return false;
            }*/
        }else{
            System.out.println("Ocurrio un error en la verificacion");
        }
        return false;
    }
}
