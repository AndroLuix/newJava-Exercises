package School.BaseComponent.Object;

import School.BaseComponent.Protagonists.Teacher;

import java.util.ArrayList;

public class Course {
    private Discipline discipline;
    private ArrayList<Teacher> teachers;

    Course(Discipline discipline){
        this.discipline = discipline;
        this.teachers = new ArrayList<>();
    }

    Course(Discipline discipline, Teacher tc){
        this.discipline = discipline;
        setTeacher(tc);
    }

    public Discipline getCourse(){
        return this.discipline;
    }

    public void setTeacher(Teacher t){
        this.teachers.add(t);
    }

    public ArrayList<Teacher> getTeachers(){
        return this.teachers;
    }
}
