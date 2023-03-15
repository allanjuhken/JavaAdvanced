package abstraction.abstractionExcercice;

public abstract class Shape {

    private double radius;
    private double sideA;
    private double sideB;


    //constructor
    public Shape(double radius, double sideA, double sideB) {
        this.radius = radius;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // getters
    public double getRadius() {
        return radius;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    // abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();
}
