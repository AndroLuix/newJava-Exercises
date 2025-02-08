package School.BaseComponent.Protagonists;

import Employee.Employee;

import java.util.UUID; // crea un codice univoco random

public class Student extends Employee {

    public Student(String name, String surname, int age) {
        super(name, surname, age, UUID.randomUUID().toString());
    }

     public Student(){
        super(UUID.randomUUID().toString());
     };

    @Override
    public String get(){
        return super.get();
    }


}
