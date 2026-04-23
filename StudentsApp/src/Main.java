
import entities.Student;
import repositories.StudentRepository;
import services.StudentsServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentsServices services = new StudentsServices();
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("\n===== MENÚ ESTUDIANTES =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar todos los estudiantes");
            System.out.println("3. Eliminar estudiante por código");
            System.out.println("4. Calcular promedio de notas");
            System.out.println("5. Verificar al Estudiante");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    saveStudent(scanner, services);
                    break;

                case 2:
                    listAll(services);
                    break;

                case 3:
                    delete(scanner, services);
                    break;

                case 4:
                    calculateAverage(services);
                    break;

                case 5:
                    verifyStudent(scanner, services);
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (option != 0);

        scanner.close();
    }

    static void saveStudent(Scanner sc, StudentsServices studentsServices){
        System.out.println("Registro de Estudiante");
        System.out.println("Ingrese el codigo: ");
        int code = sc.nextInt();

        System.out.println("Ingrese el Nombre: ");
        String name = sc.next();

        System.out.println("Ingrese la Nota: ");
        int note = sc.nextInt();

        Student student = new Student(code, name, note);
        studentsServices.saveData(student);
    }

    static void listAll(StudentsServices studentsServices){
        studentsServices.listAll();
    }

    static void delete(Scanner sc, StudentsServices studentsServices){
       System.out.println("Ingrese el codigo a Eliminar: ");
       int code = sc.nextInt();
       boolean del = studentsServices.deleteStudent(code);
       if(del){
           System.out.println("Se ha Eliminado el Estudiante");
       }else{
           System.out.println("Ocurrio un error");
       }
    }

    static void calculateAverage(StudentsServices studentsServices){
        System.out.println("El promedio es: " + studentsServices.calculateAverage());
    }

    static void verifyStudent(Scanner sc, StudentsServices studentsServices){
        System.out.println("Ingrese el codigo a Verificar: ");
        int code = sc.nextInt();
        boolean verified = studentsServices.verifyStudent(code);
        if(verified){
            System.out.println("El Estudiante Ganó la Materia de POO");
        }else{
            System.out.println("Ha valido Madres!");
        }
    }
}