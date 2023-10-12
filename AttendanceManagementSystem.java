import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private boolean isPresent;

    public Student(String name, boolean isPresent) {
        this.name = name;
        this.isPresent = isPresent;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + ", Present: " + isPresent;
    }
}

public class AttendanceManagementSystem {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAttendance Management System");
            System.out.println("1. Add Student Attendance");
            System.out.println("2. View Student Attendance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Is the student present? (true/false): ");
                    boolean isPresent = scanner.nextBoolean();
                    scanner.nextLine();  // Consume newline
                    Student student = new Student(studentName, isPresent);
                    studentList.add(student);
                    System.out.println("Attendance recorded for " + studentName);
                    break;
                case 2:
                    System.out.println("Student Attendance Records:");
                    for (Student studentRecord : studentList) {
                        System.out.println(studentRecord);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
