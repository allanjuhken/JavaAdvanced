package Queue;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> countries = new LinkedHashMap<>();
        System.out.println("Enter countries as asked and for quit enter a 'z'?");
        //int mapSize = sc.nextInt();

        for (;;){
            System.out.println("Enter country: ");
            String country = sc.next();
            if (country.equals("z")){
                break;
            }
            System.out.println("Enter capital: ");
            String capital = sc.next();
            countries.put(country,capital);
            if (capital.equals("z")){
                break;
            }
        }
        //System.out.println(countries);
//        for (String country : countries.keySet()) {
//            System.out.println("The capital of " + country + " is: " + countries.get(country));
//        }
        for (Map.Entry<String,String> countriesAndCapitals : countries.entrySet()) {
            System.out.println("The capital of " + countriesAndCapitals.getKey().toUpperCase()
            + " is " + countriesAndCapitals.getValue().toUpperCase());
        }
    }
}
