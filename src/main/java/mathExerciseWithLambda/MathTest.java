package mathExerciseWithLambda;

public class MathTest {
    public static void main(String[] args) {

        double numA = 15;
        double numB = 6;

        // Implement  the arithmetic operations
        MathOperation addition = (x, y) -> x+y;
        MathOperation subtraction = (x,y) -> x-y;
        MathOperation multiplication = (x,y) -> x*y;
        MathOperation division = (x,y) -> x/y;

        System.out.println(numA + " + " + numB + " = " + doOperation(numA,numB, addition));
        System.out.println(numA + " - " + numB + " = " + doOperation(numA,numB, subtraction));
        System.out.println(numA + " * " + numB + " = " + doOperation(numA,numB, multiplication));
        System.out.println(numA + " / " + numB + " = " + doOperation(numA,numB, division));
    }

    private static double doOperation(double numA, double numB, MathOperation operation){
        return operation.operate(numA,numB);
    }

    // Generics -
}
