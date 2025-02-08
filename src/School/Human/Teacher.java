package School.Human;

import Employee.Employee;
import School.Exception.NotFoundException;
import School.Object.Classroom;
import School.Object.Discipline;

import java.util.ArrayList;
import java.util.UUID;

public class Teacher extends Employee {

    protected ArrayList<Classroom> classRooms;
    protected ArrayList<Discipline> disciplines;

    Teacher(String name, String surname, int age){
        super(name, surname, age, UUID.randomUUID().toString());
    }

    public void setClassRooms(Classroom cr) {
        this.classRooms.add(cr);
    }

    public void setDisciplines(Discipline dis) {
        this.disciplines.add(dis);
    }

    public ArrayList<Classroom> getClassRooms() {
        return classRooms;
    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public void removeClassRoom(Classroom cr) throws NotFoundException {
        if(this.classRooms.contains(cr)){
            this.classRooms.remove(cr);
        }else{
            throw new NotFoundException("Classroom not found: " + cr.get());
        }
    }

    public void removeDiscipline(Discipline d) throws NotFoundException {
        if(this.disciplines.contains(d)){
            this.disciplines.remove(d);
        }else{
            throw new NotFoundException("Discipline not found"+ d.getDiscipline());
        }
    }
}
