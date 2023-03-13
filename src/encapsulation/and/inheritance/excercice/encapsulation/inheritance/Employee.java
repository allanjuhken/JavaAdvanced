package encapsulation.and.inheritance.excercice.encapsulation.inheritance;

public class Employee extends Person {

    private String occupation;
    private String employeeID;

    // constructor
    //inheritance -- kasutab constructoris ' super ' meetodit
    public Employee(String firstName, String lastName, int age, String occupation, String employeeID) {
        super(firstName, lastName, age);
        this.occupation = occupation;
        this.employeeID = employeeID;

    }

    // getters / setters
    public String getOccupation() {return occupation;}
    //public void setOccupation(String occupation) {this.occupation = occupation;}

    public String getEmployeeID() {return employeeID;}
    //public void setEmployeeID(String employeeID) {this.employeeID = employeeID;}
}
