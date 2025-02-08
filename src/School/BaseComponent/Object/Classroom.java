package School.BaseComponent.Object;

import School.BaseComponent.Exception.NotFoundException;
import School.BaseComponent.Protagonists.Student;
import School.BaseComponent.Protagonists.Teacher;

import java.util.ArrayList;

public class Classroom {

    ArrayList<Student> students;
    ArrayList<Teacher> teachers;
    String className; // example '5A' '2B' or '1C'

    Classroom(int number, char letter){
        if(!verifyClass((number))){
            throw new IllegalArgumentException("The number of class is illegal," +
                    " select number between 1 and 5");
        }
        this.className = number +""+ letter;
    }

    public String get(){
        return this.className;
    }

    private boolean verifyClass(int number) {
        return number >= 1 && number <= 5;
    }

    protected void addStudent(Student s){
        students.add(s);
    }
    protected void removeStudent(Student s) throws NotFoundException {
        if(students.contains(s)){
            students.remove(s);
        }else{
            throw new NotFoundException("Student not found" + s.get());
        }
    }

    protected  void setClass (ArrayList<Student> stds){
        students.addAll(stds);
    }


}
