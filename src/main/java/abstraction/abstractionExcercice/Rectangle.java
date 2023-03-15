package abstraction.abstractionExcercice;

public class Rectangle extends Shape{
    public Rectangle(double radius, double sideA, double sideB) {
        super(radius, sideA, sideB);
    }

    @Override
    public double getArea() {
        // area = a * b
        return getSideA() * getSideB();
    }

    @Override
    public double getPerimeter() {
        //perimeter = 2 * (a + b)
        return 2 * (getSideA() + getSideB());
    }

}
