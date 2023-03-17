package exercisesAllTopics;

import javax.security.sasl.SaslClient;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> oddNums = new ArrayList<>();
        List<Integer> evenNums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int input = sc.nextInt();
            if (input % 2 == 0){
                evenNums.add(input);
                //System.out.println(i + " :even number");
            } else {
                oddNums.add(input);
                //System.out.println(i + " :odd number");
            }
        }
        System.out.println("Even numbers : " + Arrays.toString(new List[]{evenNums}));
        System.out.println(" Odd numbers : " + oddNums);
    }
}
