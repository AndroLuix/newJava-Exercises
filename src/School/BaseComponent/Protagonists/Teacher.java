package School.BaseComponent.Protagonists;

import Employee.Employee;
import School.BaseComponent.Exception.NotFoundException;
import School.BaseComponent.Object.Classroom;

import java.util.ArrayList;
import java.util.UUID;

public class Teacher extends Employee {

    protected ArrayList<Classroom> classRooms;

    public Teacher(String name, String surname, int age){
        super(name, surname, age, UUID.randomUUID().toString());
    }
    public Teacher(){
        super(UUID.randomUUID().toString());
    }

    public void setClassRooms(Classroom cr) {
        this.classRooms.add(cr);
    }


    public ArrayList<Classroom> getClassRooms() {
        return classRooms;
    }


    public void removeClassRoom(Classroom cr) throws NotFoundException {
        if(this.classRooms.contains(cr)){
            this.classRooms.remove(cr);
        }else{
            throw new NotFoundException("Classroom not found: " + cr.get());
        }
    }


}
