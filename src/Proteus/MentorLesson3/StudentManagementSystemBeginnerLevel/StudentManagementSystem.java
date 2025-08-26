package Proteus.MentorLesson3.StudentManagementSystemBeginnerLevel;

import java.sql.SQLOutput;
import java.util.*;

public class StudentManagementSystem {
    private static List<Student> studentList = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Student[] students = {
                new Student("Eljan"),
                new Student("Sanan"),
                new Student("Huseyn"),
                new Student("Ali")
        };

        for (Student student : students) {
            addStudent(student);
        }

        while(true){
            System.out.println(
                    """
                            1. Add Student
                            2. Delete Student
                            3. Update Student
                            4. Find Student
                            5. Get All Students
                            6. Exit"""
            );
            System.out.println("Choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter student name:");
                    String name = scanner.nextLine();
                    addStudent(new Student(name));
                    break;
                case 2:
                    System.out.println("Enter student ID to delete");
                    int deleteId = scanner.nextInt();
                    deleteStudent(deleteId);
                    break;
                case 3:
                    System.out.println("Please enter student ID!");
                    int ID = scanner.nextInt();
                    System.out.println("Please enter new student name!");
                    String newStudentName = scanner.nextLine();
                    updateStudent(ID, newStudentName);
                    break;
                case 5:
                    showStudents();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please enter number of the operation you would like to execute");
            }
        }
    }

    public static void addStudent(Student student) throws StudentNotFoundException {
        studentList.add(student);
        System.out.println("Student added: " + student);
    }

    static void showStudents() {
        if(studentList.isEmpty()){
            System.out.println("No students in the system");
        } else{
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    public static void deleteStudent(int id) {
        boolean studentFound = false;
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                System.out.println("Student with id " + id + " deleted successfully");
                studentFound = true;
                break;
            }
        }
        if (!studentFound) {
            throw new StudentNotFoundException("Student with ID" + id + " does not exist.");
        }
    }

    public static void updateStudent(int id, String newName) {
        boolean studentFound = false;
        for (Student student : studentList) {
            if (student.getId() == id) {
                System.out.println("Student name" + student.getName() + " with ID " + id + " is changed to -> " + newName);
                student.setName(newName);
                studentFound = true;
                break;
            }
        }
        if (!studentFound) {
            throw new StudentNotFoundException("Student with ID" + id + " does not exist.");
        }
    }

    public static Student getStudentById(int id) {

        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }

        throw new StudentNotFoundException("Student with ID" + id + " does not exist.");
    }
}
