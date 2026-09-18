import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Scanner scanner) {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (findStudent(id) != null) {
            System.out.println("Student ID already exists.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        Student student = new Student(id, name, age, department);
        students.add(student);

        System.out.println("Student added successfully.");
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n===== ALL STUDENTS =====");

        for (Student student : students) {
            student.displayInfo();
        }
    }

    public Student findStudent(int id) {

        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }

        return null;
    }

    public void searchStudent(Scanner scanner) {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        Student student = findStudent(id);

        if (student != null) {
            student.displayInfo();
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(Scanner scanner) {

        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        Student student = findStudent(id);

        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
