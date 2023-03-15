package abstraction.abstractionExcercice;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4,4,4);
        System.out.printf("Area of the circle: %.2f\n", circle.getArea());
        System.out.printf("Perimeter of the circle: %.2f\n ", circle.getPerimeter());

        System.out.println("========");
        Square square = new Square(0,4,4);
        System.out.println("Area of the square: "+ square.getArea());
        System.out.println("Perimeter of the square: "+ square.getPerimeter());

        System.out.println("========");
        Rectangle rectangle = new Rectangle(4,4,5);
        System.out.println("Area of the rectangle: "+ rectangle.getArea());
        System.out.println("Perimeter of the rectangle: "+ rectangle.getPerimeter());
    }
}
