package Proteus.MentorLesson3.CourseManagementSystemBeginnerLevel;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CourseManagementSystem {
    private static List<Course> courseList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {

            try {
                System.out.println(
                        """
                                1. Add Course
                                2. Delete Course
                                3. Update Course
                                4. Find Course
                                5. Get All Courses
                                6. Exit
                                """
                );
                int selectedOption = scanner.nextInt();
                scanner.nextLine();
                switch (selectedOption) {
                    case 1:
                        System.out.println("Enter course name.");
                        String courseName = scanner.nextLine();
                        System.out.println("Enter instructor");
                        String instructor = scanner.nextLine();
                        addCourse(new Course(courseName, instructor));
                        break;
                    case 2:
                        System.out.println("Enter course ID.");
                        int id = scanner.nextInt();
                        deleteCourse(id);
                        break;
                    case 3:
                        System.out.println("Enter course ID.");
                        int courseId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter new course name.");
                        String newCourseName = scanner.next();
                        scanner.nextLine();
                        System.out.println("Enter new instructor.");
                        String newInstructor = scanner.nextLine();
                        updateCourse(courseId, newCourseName, newInstructor);
                        break;
                    case 4:
                        System.out.println("Enter course ID.");
                        int searchId = scanner.nextInt();
                        System.out.println(getCourseById(searchId));
                        break;

                    case 5:
                        showCourses();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Enter one of the options above.");
                }

            } catch (CourseNotFoundException e) {
                System.out.println("Course not found: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error in the input type: " + e.getMessage());
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }

    public static void addCourse(Course course) {
        courseList.add(course);
        System.out.println(course + " Added successfully.");
    }

    static void showCourses() {
        if (courseList.isEmpty()) {
            throw new CourseNotFoundException("There are no courses in the list.");
        }
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    public static void deleteCourse(int id) {
        Course course = getCourseById(id);
        boolean removed = courseList.remove(course);
        if (removed) {
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Could not delete the course.");
        }
    }

    public static void updateCourse(int id, String name, String instructor) {
        getCourseById(id).setName(name);
        getCourseById(id).setInstructor(instructor);
        System.out.println("Course with id " + id + " is updated successfully.");
    }

    public static Course getCourseById(int id) {
        if (!courseList.isEmpty()) {
            for (Course course : courseList) {
                if (course.getId() == id) {
                    return course;
                }
            }
        }
        throw new CourseNotFoundException("No course found with id " + id);
    }

}
