package Person;

public class PeopleList {
    Person person1 = new Person();
    Person person2 = new Person();
    Person person3 = new Person();

    protected PeopleList(){
        createPersons();
    }
    private void createPersons() {
        person1.set("Luca", "Michelin", 12);
        person2.set("Mario", "Schozzi", 25);
        person3.set("Maria", "Maradi", 30);
    }

    public void get() {
        System.out.println(person1.get());
        System.out.println(person2.get());
        System.out.println(person3.get());
    }


}
