package abstraction.abstractionExcercice;

public class Circle extends Shape{
    //public Circle(int radius){
    //    super(radius);
    //}
    public Circle(double radius, double sideA, double sideB) {
        super(radius, sideA, sideB);
    }

    public double getArea(){
        // area PI*r2
        return Math.PI*Math.pow(getRadius(),2.0);
    }

    @Override
    public double getPerimeter() {
        //2*PI*r
        return 2*Math.PI*getRadius();
    }

}
