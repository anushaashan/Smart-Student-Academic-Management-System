import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    private static final String FILE_NAME = "data/students.txt";

    public void saveStudents(ArrayList<Student> students) {

        try {

            File folder = new File("data");

            if (!folder.exists()) {
                folder.mkdir();
            }

            FileWriter writer = new FileWriter(FILE_NAME);

            for (Student student : students) {

                writer.write(
                        student.getStudentId() + "," +
                        student.getName() + "," +
                        student.getAge() + "," +
                        student.getDepartment() + "\n"
                );
            }

            writer.close();

            System.out.println("Student data saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public void loadStudents(ArrayList<Student> students) {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 4) {

                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    int age = Integer.parseInt(data[2]);
                    String department = data[3];

                    students.add(new Student(id, name, age, department));
                }
            }

            reader.close();

        } catch (IOException | NumberFormatException e) {

            System.out.println("Error loading data.");
        }
    }
}

