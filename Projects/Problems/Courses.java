/*

Write a Java program to create a class called "Course" with attributes for
course name, instructor, and credits. Create a subclass "OnlineCourse" that 
adds attributes for platform and duration. Implement methods to display 
course details 
and check if the course is eligible for a certificate based on duration.
*/

public class Courses {
    String courseName;
    String instructor;
    int credits;

    public Courses(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }
    

}
