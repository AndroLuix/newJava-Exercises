package School.Object;

import School.Human.Teacher;

import java.util.ArrayList;

public class Course {
    private String course;
    private ArrayList<Teacher> teachers;

    Course(String course){
        this.course = course;
        this.teachers = new ArrayList<>();
    }

    public String getCourse(){
        return this.course;
    }

    public void setTheacher(Teacher t){
        this.teachers.add(t);
    }
    public ArrayList<Teacher> getTeachers(){
        return this.teachers;
    }
}
