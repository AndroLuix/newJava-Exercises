package Person ;

import School.CreationComponent.Builder;

public class Person extends Builder {
    private String name;
    private String surname;
    private int age;

   public Person( String name,
            String surname,
            int age){
        this.name = name; this.surname = surname; this.age =  age;
    }
    public Person(){};
    public void set(
            String name,
            String surname,
            int age
                    ){
        this.name = name; this.surname = surname; this.age =  age;

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }


    protected String get(){
        return this.surname+ " "+ this.name+ ", " + this.age;
    }

    public void update(){
        this.generateData(this);
    }
}
