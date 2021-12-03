package Course;

import Person.Students;
import Person.Teachers;
import Rooms.Room;

import java.util.ArrayList;


public class Course {

    private int eCTS;
    private String semester;
    private String name;
    private String className;

    private ArrayList<Room>rooms;
    private ArrayList<Students>students;
    private ArrayList<Teachers>teachers;


    public Course(String courseName, String semester, String className, int eCTS, ArrayList<Room> rooms, ArrayList<Students> students, ArrayList<Teachers> teachers) {
        this.eCTS = eCTS;
        this.semester=semester;
        this.name = courseName;
        this.className = className;
        this.rooms = new ArrayList<>();
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public int getECTS() {
        return eCTS;
    }

    public void setECTS(int ECTS) {
        this.eCTS = ECTS;
    }

    public String getCourseName() {
        return name;
    }

    public void setCourseName(String courseName) {
        this.name = courseName;
    }

    public String getClassID() {
        return className;
    }

    public void setClassID(String className) {
        this.className = className;
    }
    public boolean equals( Object obj){
        if ((obj instanceof Course)){
            return false;
        }
        Course other= (Course) obj;

        return eCTS==other.eCTS &&semester.equals(other.semester)&&name.equals(other.name)&&className.equals(other.className)
                &&rooms.equals(other.rooms)&&students.equals(other.students)&&teachers.equals(other.teachers);
    }

}

