package School.CreationComponent;

import Person.Person;

import java.util.List;
import java.util.Random;

public class Builder  {

    private static final Random random = new Random();

    private static final List<String> NAMES =
            List.of("Alice", "Bob", "Charlie", "David", "Eva", "Frank");
    private static final List<String> SURNAMES =
            List.of("Smith", "Johnson", "Williams", "Jones", "Brown", "Davis");



    public void generateData(Person person) {
        String name = NAMES.get(random.nextInt(NAMES.size()));

        String surname = SURNAMES.get(random.nextInt(SURNAMES.size()));

        int age = random.nextInt(25) + 6;

        // Aggiorna i campi della persona
        person.setName(name);
        person.setSurname(surname);
        person.setAge(age);
    }


}
