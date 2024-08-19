import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        StudentManagerImpl manager = new StudentManagerImpl();
        Scanner scanner = new Scanner(System.in);

        // Adding students
        manager.addStudent(new Student(1, "Melissa", 22));
        manager.addStudent(new Student(2, "Jose", 20));
        manager.addStudent(new Student(3, "Alexander", 23));
        manager.addStudent(new Student(4, "Daniel", 21));
        manager.addStudent(new Student(5, "Alejandra", 28));

        // Display all students
        System.out.println("Todos los estudiantes:");
        manager.getAllStudents().forEach(System.out::println);

        // Filter students older than 21
        System.out.println("\nEstudiantes mayores de 21:");
        List<Student> olderStudents = manager.getAllStudents().stream()
                .filter(s -> s.getAge() > 25)
                .collect(Collectors.toList());
        olderStudents.forEach(System.out::println);

        // Sort students by name
        System.out.println("\nEstudiantes ordenados por nombre:");
        List<Student> sortedStudents = manager.getAllStudents().stream()
                .sorted((s1, s2) -> s1.getNombre().compareTo(s2.getNombre()))
                .collect(Collectors.toList());
        sortedStudents.forEach(System.out::println);

        // Example of finding a student
        try {
            Student foundStudent = manager.findStudent(4);
            System.out.println("\nEstudiante Encontrado:");
            System.out.println(foundStudent);
        } catch (StudentNotFoundException e) {
            System.err.println(e.getMessage());
        }

        // Example of removing a student
        manager.removeStudent(5);
        System.out.println("\nTodos los estudiantes después de la eliminación:");
        manager.getAllStudents().forEach(System.out::println);

        scanner.close();

    }
}