package Person;

public class Person {
    private String name;
    private String surname;
    private int age;

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


    public String get(){
        return this.surname+ " "+ this.name+ ", " + this.age;
    }
}
