package abstraction.abstractionExcercice;

public class Square extends Shape{

    public Square(double radius, double sideA, double sideB) {
        super(radius, sideA, sideB);
    }

    @Override
    public double getArea() {
        //area = a*pow2 / a*a
        return Math.pow(getSideA(),2);
    }

    @Override
    public double getPerimeter() {
        //perimeter = 4 * a
        return 4*getSideA();
    }

}
