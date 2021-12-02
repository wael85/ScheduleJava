package Schedule;

import Course.Courses;

import java.util.ArrayList;

public class Schedule {
    private String id;
    private String semester;
    private String className;
    private ArrayList<Courses>courses;

    public Schedule(String id,String semester,String className,ArrayList<Courses>courses ){
        this.id=id;
        this.semester=semester;
        this.className=className;

        this.courses=new ArrayList<>();

    }
    
}
