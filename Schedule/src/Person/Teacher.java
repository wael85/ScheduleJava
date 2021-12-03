package Person;

import Course.Course;
import Rooms.BookedTime;
import Rooms.DateTime;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<Course> teachingCourses;
    private ArrayList<BookedTime> occupiedTime ;

    public Teacher(String firstName, String lastName, String email, String telephoneNumber, String studentsClass, String semester, ArrayList<Course> teachingCourses, ArrayList<BookedTime> occupiedTime) {
        super(firstName, lastName, email, telephoneNumber);
        this.teachingCourses =new ArrayList<>();
        this.occupiedTime = new ArrayList<>();
    }

    public void addTeachingHours(BookedTime teachingTime){
        if (isAvailable(teachingTime)) {
            occupiedTime.add(teachingTime);
        }
        else
            System.out.println("is working");

    }

    public boolean isAvailable(BookedTime period){
        for (BookedTime time:occupiedTime) {
            DateTime start = time.getStart();
            DateTime end = time.getEnd();

            if ((period.getStart().isBefore(end) && period.getStart().isAfter(start))
                    || (period.getEnd().isBefore(end) && period.getEnd().isAfter(start))
                    || (period.getStart().isBefore(start) && period.getEnd().isAfter(end))
                    || period.getStart().equals(start) || period.getEnd().equals(end)) {
                return false;
            }
        }
        return true;

    }

    public void addOffDay(BookedTime bookedTime){

            occupiedTime.add(bookedTime);


    }

    public void assignToCourse(Course course){
        teachingCourses.add(course);

    }

    public void unassignFromCourse(Course course){
        teachingCourses.remove(course);

    }

    @Override
    public String getFullName() {
        return getFirstName()+" "+getLastName();
    }

    public String toString(){
        return super.toString() + "Teaching courses = " + teachingCourses + " Occupied time = " + occupiedTime;
    }
}
