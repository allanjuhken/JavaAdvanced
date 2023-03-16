package exercisesAllTopics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {
    private String companyName;
    private List<Employee> employees;

    // constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.employees = new ArrayList<>();
    }
    public Company(String companyName, List<Employee> employees){
        this.companyName= companyName;
        this.employees = employees;
    }

    // getters
    public String getCompanyName() {return companyName;}

    public List<Employee> getEmployees() {return employees;}

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employees=" + employees +
                '}';
    }

    // methods
    public boolean addEmployee(Employee...employees){  // See meetod lisab kõik korraga
        return this.employees.addAll(Arrays.asList(employees));
        // for (Employee employee : employees){  // See meetod lisab ükshaaval employee Employee listi
        //this.employees.add(employee);
    }

    public double averageSalary(){
        // initialize a variable for the sum
        double sum = 0;

        // Loop through and sum the salaries
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        double sumAverage = sum / employees.size();
        return sumAverage;
    }

}
