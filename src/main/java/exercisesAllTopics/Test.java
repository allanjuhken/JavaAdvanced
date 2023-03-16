package exercisesAllTopics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Person jaak = new Person("Jaak", "Jaanus", 25);
        Person jaanus = new Person("Jaanus","Jaak",36);

        Employee jaakEmployee  = new Employee(jaak, "Fishing", 28000, "asdf45");
        Employee jaanusEmployee = new Employee(jaanus, "mechanic", 35000, "ert200");

        List<Employee> employees = new ArrayList<>();
        employees.add(jaakEmployee);
        employees.add(jaanusEmployee);

        Company sailorCO = new Company("SailorCO", employees);
        System.out.println(sailorCO.averageSalary());
    }
}
