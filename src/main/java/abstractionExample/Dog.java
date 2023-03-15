package abstractionExample;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age,"mammal");
    }

    // NOTE: when you inherit abstract class you have two choices:
    // - either you implement the abstract methods that have been inherited
    // - you make the class that is inheriting an abstract class itself.

    public  void  makeSound(){
        System.out.println("Woof");
    }
}
