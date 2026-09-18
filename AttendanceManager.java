import java.util.Scanner;

public class AttendanceManager {

    public void recordAttendance(Scanner scanner, Student student) {

        if (student.getSubjects().isEmpty()) {
            System.out.println("Add subjects first.");
            return;
        }

        scanner.nextLine();

        System.out.print("Enter Subject Name: ");
        String subjectName = scanner.nextLine();

        for (Subject subject : student.getSubjects()) {

            if (subject.getSubjectName().equalsIgnoreCase(subjectName)) {

                System.out.print("Enter Total Classes: ");
                int total = scanner.nextInt();

                System.out.print("Enter Attended Classes: ");
                int attended = scanner.nextInt();

                if (total <= 0 || attended < 0 || attended > total) {
                    System.out.println("Invalid attendance values.");
                    return;
                }

                subject.setAttendance(total, attended);

                System.out.println("Attendance recorded successfully.");
                return;
            }
        }

        System.out.println("Subject not found.");
    }

    public void viewAttendance(Student student) {

        if (student.getSubjects().isEmpty()) {
            System.out.println("No subjects available.");
            return;
        }

        System.out.println("\n===== ATTENDANCE REPORT =====");

        for (Subject subject : student.getSubjects()) {

            System.out.println("Subject: " + subject.getSubjectName());
            System.out.printf("Attendance: %.2f%%%n",
                    subject.getAttendancePercentage());

            if (subject.getAttendancePercentage() < 75) {
                System.out.println("Warning: Attendance below 75%");
            }

            System.out.println("-----------------------------");
        }
    }
}

