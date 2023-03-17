package exercisesAllTopics;

public class Employee extends Person{
    private String occupation;
    private double salary;
    private String employeeId;

    public Employee(Person person, String occupation, double salary, String employeeId){
        super(person);
        this.occupation = occupation;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public Employee(String firstName, String lastName, int age,
                    String occupation, double salary, String employeeId) {
        super(firstName, lastName, age);
        this.occupation = occupation;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    // getters
    public String getOccupation() {
        return occupation;
    }


    public double getSalary() {
        return salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "occupation='" + occupation + '\'' +
                ", salary=" + salary +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
