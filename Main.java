import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentManager studentManager = new StudentManager();
        AcademicManager academicManager = new AcademicManager();
        AttendanceManager attendanceManager = new AttendanceManager();
        FileHandler fileHandler = new FileHandler();
        AcademicReport reportGenerator = new AcademicReport();

        fileHandler.loadStudents(studentManager.getStudents());

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println("   SMART STUDENT ACADEMIC MANAGEMENT");
            System.out.println("========================================");

            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Add Subject and Marks");
            System.out.println("6. View Academic Performance");
            System.out.println("7. Update Marks");
            System.out.println("8. Record Attendance");
            System.out.println("9. View Attendance");
            System.out.println("10. Generate Academic Report");
            System.out.println("11. Save Data");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    studentManager.addStudent(scanner);
                    break;

                case 2:
                    studentManager.viewStudents();
                    break;

                case 3:
                    studentManager.searchStudent(scanner);
                    break;

                case 4:
                    studentManager.deleteStudent(scanner);
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    Student studentForSubject =
                            studentManager.findStudent(scanner.nextInt());

                    if (studentForSubject != null) {
                        academicManager.addSubject(scanner, studentForSubject);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Student ID: ");
                    Student studentForPerformance =
                            studentManager.findStudent(scanner.nextInt());

                    if (studentForPerformance != null) {
                        academicManager.viewAcademicPerformance(
                                studentForPerformance);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter Student ID: ");
                    Student studentForMarks =
                            studentManager.findStudent(scanner.nextInt());

                    if (studentForMarks != null) {
                        academicManager.updateMarks(scanner, studentForMarks);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 8:
                    System.out.print("Enter Student ID: ");
                    Student studentForAttendance =
                            studentManager.findStudent(scanner.nextInt());

                    if (studentForAttendance != null) {
                        attendanceManager.recordAttendance(
                                scanner, studentForAttendance);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 9:
                    System.out.print("Enter Student ID: ");
                    Student studentForAttendanceView =
                            studentManager.findStudent(scanner.nextInt());

                    if (studentForAttendanceView != null) {
                        attendanceManager.viewAttendance(
                                studentForAttendanceView);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 10:
                    System.out.print("Enter Student ID: ");
                    Student studentForReport =
                            studentManager.findStudent(scanner.nextInt());

                    if (studentForReport != null) {
                        reportGenerator.generateReport(studentForReport);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 11:
                    fileHandler.saveStudents(studentManager.getStudents());
                    break;

                case 0:
                    fileHandler.saveStudents(studentManager.getStudents());
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
