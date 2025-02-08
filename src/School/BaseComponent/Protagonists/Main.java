package School.BaseComponent.Protagonists;

public class Main {
    public static void main(String[] args) {

        Student stud = new Student();
        stud.update();

        Teacher tc = new Teacher();
        tc.update();
        System.out.println(tc.get());

        System.out.println(stud.get());


    }
}