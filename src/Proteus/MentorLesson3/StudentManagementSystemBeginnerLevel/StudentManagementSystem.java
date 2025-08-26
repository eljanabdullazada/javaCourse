package Proteus.MentorLesson3.StudentManagementSystemBeginnerLevel;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.List;

public class StudentManagementSystem {
    private static List<Student> studentList;
    Scanner scanner = new Scanner(System.in);

    public  static void main(String [] args){

    }

    public static void addStudent(Student student) throws StudentNotFoundException{
        studentList.add(student);
        System.out.println(student);
    }

    static void showStudents(){
        for(Student student: studentList){
            System.out.println(student);
        }
    }

    public static void deleteStudent(int id){
        for(Student student: studentList){
            if(student.getId() == id){
                studentList.remove(student);
                System.out.println("Student with id " + id + " deleted successfully");
            }
            else{
                throw new StudentNotFoundException("Student with ID" + id + " does not exist.");
            }
        }
    }

    public static void updateStudent(int id, String name){
        boolean studentFound = false;
        for(Student student: studentList){
            if(student.getId() == id){
                System.out.println("Student name" + student.getName() + " with ID " + id + " is changed to -> " + name);
                student.setName(name);
                studentFound = true;
                break;
            }
        }
        if(!studentFound){
            throw new StudentNotFoundException("Student with ID" + id + " does not exist.");
        }
    }

    public static Student getStudentById(int id){

        for(Student student: studentList){
            if(student.getId() == id){
                return student;
            }
        }

        throw new StudentNotFoundException("Student with ID" + id + " does not exist.");
    }

}
