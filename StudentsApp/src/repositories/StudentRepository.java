package repositories;

import entities.Student;

import java.util.ArrayList;

public class StudentRepository {
    private ArrayList<Student> list = new ArrayList<>();

    public void save(Student s){
        list.add(s);
    }

    public ArrayList<Student> listAll(){
        return list;
    }

    public void listAllStudents(){
        list.forEach(System.out::println);
    }

    public Student findByCode(int code){
        for(Student s: list){
            if(s.getCode() == code){
                return s;
            }
        }
        return null;
    }

    public Student findByCodeShort(int code){
        return (Student) list.stream().filter(s-> s.getCode() == code);
    }

    public boolean delete(int code){
        return list.removeIf(s-> s.getCode()== code);
    }
}
