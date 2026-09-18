import java.util.Scanner;

public class AcademicManager {

    public void addSubject(Scanner scanner, Student student) {

        scanner.nextLine();

        System.out.print("Enter Subject Name: ");
        String subjectName = scanner.nextLine();

        System.out.print("Enter Marks (out of 100): ");
        double marks = scanner.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Enter between 0 and 100.");
            return;
        }

        Subject subject = new Subject(subjectName, marks);
        student.addSubject(subject);

        System.out.println("Subject added successfully.");
    }

    public void viewAcademicPerformance(Student student) {

        if (student.getSubjects().isEmpty()) {
            System.out.println("No academic records found.");
            return;
        }

        double total = 0;

        System.out.println("\n===== ACADEMIC PERFORMANCE =====");

        for (Subject subject : student.getSubjects()) {

            Grade grade = Grade.calculateGrade(subject.getMarks());

            System.out.println("Subject: " + subject.getSubjectName());
            System.out.println("Marks: " + subject.getMarks());
            System.out.println("Grade: " + grade);
            System.out.println("-----------------------------");

            total += subject.getMarks();
        }

        double average = total / student.getSubjects().size();

        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Overall Grade: " + Grade.calculateGrade(average));
    }

    public void updateMarks(Scanner scanner, Student student) {

        scanner.nextLine();

        System.out.print("Enter Subject Name: ");
        String subjectName = scanner.nextLine();

        for (Subject subject : student.getSubjects()) {

            if (subject.getSubjectName().equalsIgnoreCase(subjectName)) {

                System.out.print("Enter New Marks: ");
                double marks = scanner.nextDouble();

                if (marks >= 0 && marks <= 100) {
                    subject.setMarks(marks);
                    System.out.println("Marks updated successfully.");
                } else {
                    System.out.println("Invalid marks.");
                }

                return;
            }
        }

        System.out.println("Subject not found.");
    }
}
