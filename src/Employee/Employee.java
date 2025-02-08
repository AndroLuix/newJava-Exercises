package Employee;

import Person.Person;

public class Employee extends Person {
    private String numberEmployee;


    public Employee(String name, String surname, int age, String number){
        this.set(name, surname,age);
        setNumberEmployee(number);
    }
    public Employee(String number){
        super();
        setNumberEmployee(number);
    }
    private void setNumberEmployee(String number){
        this.numberEmployee = number;
    }

    //no set number

    @Override
    public String get(){
       return "number: "+this.numberEmployee +" Data: "+ super.get();
    }
}
