package collectionsSetAndListClasses;

import java.util.*;

public class CollectionsExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> numbers = new TreeSet<>(); // 6 sorted numbers
        for (int i = 0; i < 6; i++) {
            System.out.println(" Enter a number: ");
            int input = sc.nextInt();
            numbers.add(input);
        }
        System.out.println(numbers);

        System.out.println("=====");

        Set<String> lines = new HashSet<>(); // 5 strings
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a random line: ");
            String input = sc.nextLine();
            lines.add(input);
        }
        System.out.println(lines);

        System.out.println("=====");

        Set<String> names = new LinkedHashSet<>(); // 4 names
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a name: ");
            String input = sc.nextLine();
            names.add(input);
        }
        System.out.println(names);

    }
}
