# Smart-Student-Academic-Management-System
## Project Overview

The Smart Student Academic Management System is a command-line based Java application designed to manage student academic information in one place. It allows users to add and manage student records, store subject marks, calculate grades, record attendance, and generate academic reports.

The project demonstrates core concepts of Object-Oriented Programming in Java, including classes and objects, inheritance, abstraction, interfaces, encapsulation, collections, enumerations, exception handling, and file handling.

## Features

. Add a new student.

. View all registered students.

. Search for a student using the student ID.

. Delete a student record.

. Add subjects and marks for a student.

. Calculate grades based on marks.

. Update subject marks.

. Record attendance for individual subjects.

. View attendance percentage and low-attendance warnings.

. Generate an academic report.

. Save student data to a local text file.

## Technologies Used

. Java

. Java Collections Framework (ArrayList)

. Java File Handling (FileWriter, FileReader, BufferedReader)

## Command Line Interface (CLI)

## Project Structure

SmartStudentAcademicSystem/
├── src/
│   ├── Person.java
│   ├── Student.java
│   ├── Subject.java
│   ├── Grade.java
│   ├── StudentManager.java
│   ├── AcademicManager.java
│   ├── AttendanceManager.java
│   ├── FileHandler.java
│   ├── ReportGenerator.java
│   ├── AcademicReport.java
│   └── Main.java
├── data/
│   └── students.txt
├── docs/
├── out/
├── README.md
└── STATEMENT.md

## Requirements

Before running the project, install:

Java Development Kit (JDK 8 or above)

A terminal or command prompt

To check whether Java is installed:

java -version
javac -version

## How to Run

1. Clone the repository

Replace the URL with the actual public GitHub repository URL.

git clone https://github.com/your-username/SmartStudentAcademicSystem.git
cd SmartStudentAcademicSystem

2. Compile the source files

 On Windows PowerShell:

 javac -d out src\*.java

 On Linux/macOS:

 javac -d out src/*.java

3. Run the application

 java -cp out Main

## Menu Options

When the program starts, the following menu is displayed:

1. Add Student
2. View All Students
3. Search Student
4. Delete Student
5. Add Subject and Marks
6. View Academic Performance
7. Update Marks
8. Record Attendance
9. View Attendance
10. Generate Academic Report
11. Save Data
0. Exit

Select an option by entering its number in the terminal.

## Data Storage

Student information is stored locally in:

data/students.txt

The application creates the data folder if it does not already exist. Use option 11 to save data manually. Data is also saved when the application is closed using option 0.

## Grade Calculation

Marks

Grade

90–100

A_PLUS

80–89

A

70–79

B

60–69

C

50–59

D

Below 50

F

## Attendance Calculation

Attendance percentage is calculated using:

Attendance Percentage =
(Attended Classes / Total Classes) × 100

A warning is displayed when attendance falls below 75%.

## Concepts Demonstrated

The project uses the following Java concepts:

Encapsulation: Private fields with public methods for controlled access.

Inheritance: Student extends the abstract Person class.

Abstraction: Person is an abstract class containing the common student information structure.

Interface: ReportGenerator defines the report generation contract.

Polymorphism: AcademicReport implements the ReportGenerator interface.

Enum: Grade represents the possible academic grades.

Collections: ArrayList stores multiple students and subjects.

Exception Handling: File operations use exception handling to manage input/output errors.

File Handling: Student records are stored in a text file for local persistence.

## Author

Developed as part of the Programming in Java course project.

## License

This project is intended for academic and educational use.
