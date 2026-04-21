package services;

import entities.Student;
import repositories.StudentRepository;

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
    }
}
