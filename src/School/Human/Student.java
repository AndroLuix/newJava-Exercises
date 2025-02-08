package School.Human;

import Employee.Employee;
import Person.Person;

import java.util.UUID; // crea un codice univoco random

public class Student extends Employee {

    public Student(String name, String surname, int age) {
        super(name, surname, age, UUID.randomUUID().toString());
    }




}
