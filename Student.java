import java.util.ArrayList;

public class Student extends Person {

    private int studentId;
    private String department;
    private ArrayList<Subject> subjects;
    private double attendancePercentage;

    public Student(int studentId, String name, int age, String department) {

        super(name, age);

        this.studentId = studentId;
        this.department = department;
        this.subjects = new ArrayList<>();
        this.attendancePercentage = 0.0;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(double attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    @Override
    public void displayInfo() {

        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.printf("Attendance: %.2f%%%n", attendancePercentage);
    }
}
