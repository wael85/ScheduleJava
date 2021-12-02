package Course;

import java.util.ArrayList;

public class Courses {

    private ArrayList<Course> coursesList;

    public Courses() {
        coursesList = new ArrayList<>();
    }

    public void addCourse(Course course){
        coursesList.add(course);
    }

    public void removeCourse(Course course){
        coursesList.remove(course);
    }
}
