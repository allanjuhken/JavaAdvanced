package collectionsSetAndListAndMapClasses;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Queue {
    public static void main(String[] args) {

        // throw exceptions
        //add(E e)
        //remove()
        //element()

        //dont throw exceptions
        //offer(E e) - alternative to add
        //poll() - alternative to remove
        //peek() - alternative to element

        // FIFO - first in first out
        java.util.Queue<String> starbucksQueue = new LinkedList<>();
        starbucksQueue.add("Fred");
        starbucksQueue.offer("Barry");
        starbucksQueue.offer("Johnson");

        //starbucksQueue.poll(); // removes the first from front of list

        starbucksQueue.remove(); // removes from the front of list
        System.out.println(starbucksQueue);



        // Map
        /*
        { // Key   : Value
            "David": 14,
            "barry": 16,
            "Larry": 18
        }
         */

        // Three main implementations of the Map
        // HashMap
        // Treemap
        // LinkedHashMap

        Map<String,Integer> peopleAges = new LinkedHashMap<>();
        peopleAges.put("David", 14);
        //peopleAges.put("Barry", 16);
        peopleAges.put("Larry", 18);

        peopleAges.putIfAbsent("Barry", 16);
        peopleAges.remove("Barry");

        System.out.println(peopleAges);
        System.out.println(peopleAges.size());
        System.out.println(peopleAges.containsKey("David"));
        System.out.println(peopleAges.containsValue(16));
        System.out.println(peopleAges.values());

    }
}
