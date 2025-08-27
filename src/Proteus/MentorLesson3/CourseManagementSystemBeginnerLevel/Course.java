package Proteus.MentorLesson3.CourseManagementSystemBeginnerLevel;

public class Course {
    private int id;
    private String name;
    private String instructor;

    private static int nextId;

    public Course(String name, String instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
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
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
