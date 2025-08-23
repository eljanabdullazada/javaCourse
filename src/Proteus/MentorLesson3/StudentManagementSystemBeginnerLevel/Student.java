package Proteus.MentorLesson3.StudentManagementSystemBeginnerLevel;


public class Student {
    private int id;
    private String name;

    static int nextId;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "The student with ID " + id + " is named " + name + ".";
    }
}
