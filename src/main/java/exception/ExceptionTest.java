package exception;

public class ExceptionTest {
    public static void main(String[] args) {
        //int[] nums = new int[5];
        //int value = nums[5]; // indeks on suurem kui array ulatus

        try {
            accessArray(3);
            float value = divide(4,0);
//            System.out.println("Before number is called");
//            int value = nums[5];
//            System.out.println(value);
            System.out.println(value);

        } catch (CannotDivideByZeroException | ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred");
            System.out.println(e.getMessage());
        }
    }

    public static void accessArray(int index) {
        int[] nums = new int[5];

        if (index >= nums.length) {
            throw new ArrayIndexOutOfBoundsException("No such index: " + index);
        }
        int value = nums[index];
        System.out.println(value);
    }


    public static  float divide(float dividend, float divisor){
        if (divisor == 0){
            String message = "cannot divide " +dividend + " by n0";
            Throwable cause =new ArithmeticException("division by zero");
            throw new CannotDivideByZeroException(message, cause);
        }
        return dividend / divisor;
    }

    // Error exceptions are special exceptions, try not to handle them
    // instead try to prevent them from occurring first place. Examples would be the
    // StackOverFlowError  and OutOfMemoryError
}

