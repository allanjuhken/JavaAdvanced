package mapClasses;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> phoneBook = new TreeMap<>();

        while (true) {
            System.out.println("Choices Menu:\n " +
                    "1. Add contact\n " +
                    "2. Find Contact by name\n " +
                    "3. List Contacts\n " +
                    "4. Exit\n");
            System.out.println("Enter a menu option number: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a contact name: ");
                    String name = sc.next();
                    System.out.println("Add a contact number: ");
                    String number = sc.next();
                    phoneBook.put(name, number);
                    System.out.println("Contact added: "+ name + " (" + number + ") \n");
                    break;
                case 2:
                    System.out.println("Enter contact name: ");
                    name = sc.next();
                    number = phoneBook.get(name);
                    if (number==null){
                        System.out.println("Contact not found: " + name + "\n");
                    }else {
                        System.out.println("Contact retrieved: " + name + " phone number:(" + number + ") \n");
                    }
                    break;
                case 3:
                    System.out.println("Contact list: ");
                    for (String contactName : phoneBook.keySet()) {
                        number = phoneBook.get(contactName);
                        System.out.println(contactName + " (" + number + ") \n");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0); // Terminate the program execution
                default:
                    System.out.println("Invalid menu option. \n");

            }
        }
    }
}
