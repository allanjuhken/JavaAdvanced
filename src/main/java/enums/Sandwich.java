package enums;

public enum Sandwich {
    // An Enum is a special type of object in Java for storing or
    // defining a fixed number of instances for a given type.
    // It's also used to house constant values

    // When defining Enums, its conventional to use all capital letters,
    // since these are essentially constants

    // similarities between classes and enums
    // Enum can contain:
    // constructors
    // fields
    // methods
    // access modifiers

    // they can also implement interfaces
    // they can't
    PI(3.142); // 3.142

    private final double piValue;
    Sandwich(final double piValue) {
        this.piValue= piValue;
    }

    public double getPiValue(){
        return piValue;
    }

}
