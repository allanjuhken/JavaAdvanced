package encapsulation.and.inheritance.excercice.encapsulation.inheritance;

public class Person {

    // properties / fields
    private String firstName;
    private String lastName;
    private int age;

    public Person(Person person){
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.age = person.getAge();

    }

    // constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // getters / setters
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
