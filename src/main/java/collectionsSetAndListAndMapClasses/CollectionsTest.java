package collectionsSetAndListAndMapClasses;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        // SET
        // The Set interface is used for unique elements
        // ( If you pass in duplicate values, they will be treated as one value or element

        // HashSet is an implementation of the SET interface that is not
        // ordered, meaning that there's no indexing like we are used to with Arrays
        // The HashSet randomizes output

        //HashSet hashSet = new HashSet<>();
        Set<String> names = new HashSet<>();
        names.add("Bobby");
        names.add("Peter");
        names.add("Billy");
        names.add("Phebe");
        names.add("Laura");

        Object[] theNames = names.toArray(); // teeb objekti names array
        //System.out.println(names.size());
        //System.out.println(names.contains("Bobby"));

        System.out.println(Arrays.toString(theNames)); // print names array

        System.out.println("=======");

        for(String name : names){
            System.out.println(name);
        }

        System.out.println("=======");

        // TreeSet has built-in comparator that allows it to sort itmes/elements/objects
        // in ascending order.

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(4);
        numbers.add(8);
        numbers.add(6);

        System.out.println(numbers);

        System.out.println("=======");

        // LinkedHashSet is different from the other 2 in the sense that, it
        // maintains the order in which the items are passed in.
        Set<Integer> nums = new LinkedHashSet<>();
        nums.add(5);
        nums.add(3);
        nums.add(7);

        System.out.println(nums);


        // LIST
        // The List is an interface that represents ordered collections.
        // - Can contain duplicates
        // - indexing (like arrays starting from 0)

        // ArrayList is ordered and each item is added to the bottom of the list
        // the items are returned based on their index.
        List<String> name = new ArrayList<>();
        name.add("Harry");
        name.add("Peeter");
        name.add("Liza");
        name.add("Liisa");
        name.add("Liza");

        name.add(1, "Allan");

        System.out.println(name.get(1));

    }
}
