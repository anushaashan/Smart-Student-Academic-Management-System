public class Subject {

    private String subjectName;
    private double marks;
    private int totalClasses;
    private int attendedClasses;

    public Subject(String subjectName, double marks) {
        this.subjectName = subjectName;
        this.marks = marks;
        this.totalClasses = 0;
        this.attendedClasses = 0;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void setAttendance(int totalClasses, int attendedClasses) {
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    public double getAttendancePercentage() {

        if (totalClasses == 0) {
            return 0.0;
        }

        return (attendedClasses * 100.0) / totalClasses;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }
}

