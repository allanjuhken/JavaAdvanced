package exercisesAllTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Person jaak = new Person("Jaak", "Jaanus", 25);
//        Person jaanus = new Person("Jaanus","Jaak",36);
//
//        Employee jaakEmployee  = new Employee(jaak, "Fishing", 28000, "asdf45");
//        Employee jaanusEmployee = new Employee(jaanus, "mechanic", 35000, "ert200");
//
        List<Employee> employees = new ArrayList<>();
//        employees.add(jaakEmployee);
//        employees.add(jaanusEmployee);

        Company sailorCO = new Company("SailorCO", employees);
        //System.out.println(sailorCO.averageSalary());

        // Scanneriga person andmete küsimine:
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees?");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter firstname: ");
            String fName = sc.next();
            System.out.println("Enter a lastname: ");
            String lName = sc.next();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Enter occupation: ");
            String occ = sc.next();
            System.out.println("Enter a salary");
            double salary = sc.nextDouble();
            System.out.println("Eneter employeeID: ");
            String id = sc.next();

            sailorCO.addEmployee(new Employee(fName,lName,age,occ,salary,id));

        }
        System.out.println(employees);
    }
}
