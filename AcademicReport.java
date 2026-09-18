public class AcademicReport implements ReportGenerator {

    @Override
    public void generateReport(Student student) {

        System.out.println("\n================================");
        System.out.println("       ACADEMIC REPORT");
        System.out.println("================================");

        student.displayInfo();

        double total = 0;

        for (Subject subject : student.getSubjects()) {

            total += subject.getMarks();

            System.out.println("\nSubject: " + subject.getSubjectName());
            System.out.println("Marks: " + subject.getMarks());
            System.out.println("Grade: " + Grade.calculateGrade(subject.getMarks()));
        }

        if (!student.getSubjects().isEmpty()) {

            double average = total / student.getSubjects().size();

            System.out.printf("\nAverage Marks: %.2f%n", average);
            System.out.println("Overall Grade: " + Grade.calculateGrade(average));
        }

        System.out.println("================================");
    }
}

