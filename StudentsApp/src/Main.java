import entities.Student;
import services.StudentsServices;

public class Main {
    public static void main(String[] args) {

        StudentsServices services = new StudentsServices();

        Student s = new Student(1, "Jose", 5);

        System.out.println("Iniciando");
        services.saveData(s);

    }
}