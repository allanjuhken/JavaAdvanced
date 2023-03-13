package encapsulation.and.inheritance.excercice.encapsulation.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person david = new Person("David", "Spunk", 20);

        Employee david01 = new Employee(david.getFirstName(), david.getLastName(), david.getAge(), "driver", "jree26");

        Employee david02 = new Employee(david.getFirstName(), david01.getLastName(), david.getAge(), "businessman", "ikt22");

        System.out.println("David01: " + david01.getFirstName());
        System.out.println("David02: " + david02.getFirstName());

        System.out.println("David01 employee number: " + david01.getEmployeeID());
        System.out.println("David02 employee number: " + david02.getEmployeeID());
        System.out.println(david.getFirstName());
    }
}
