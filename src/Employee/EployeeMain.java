import Employee.Employee;

public class EployeeMain {
    public static void main(String[] args) {
        Employee emplyee1 = new Employee("Gianni","Rossi",20, "10293847");
        System.out.println(emplyee1.get());

        Employee emp = new Employee("0000000");
        emp.update();
        System.out.println(emp.get());


    }
}