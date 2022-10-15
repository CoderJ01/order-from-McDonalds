import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static List<MenuItem> items = new ArrayList<>(); // hold array of menu items
    
    public static void main(String[] args) {

        // exit program, selection choice 0
        items.add(new MenuItem());
        
        // burgers
        items.add(new MenuItem("hamburger", 1.00, 300));
        items.add(new MenuItem("cheeseburger", 1.00, 300));
        items.add(new MenuItem("double cheeseburger", 1.69, 450));
        items.add(new MenuItem("Big Mac", 3.99, 563));
        items.add(new MenuItem("Quarter Pounder", 3.79, 520));
     
        // fries
        items.add(new MenuItem("small fry", 1.39, 230));
        items.add(new MenuItem("medium fry", 1.79, 320));
        items.add(new MenuItem("large fry", 1.89, 480));

        // desserts
        items.add(new MenuItem("bag of cookies", 1.00, 510));
        items.add(new MenuItem("apple pie", 0.99, 230));

        // primative variables
        int choice = 0;
        double balance = 0.0;
        boolean loop = false;

        // String variable
        String name;

        // prompt user for inputs
        System.out.print("Hello, what is your name? ");
        name = input.next();

        do {
            System.out.print("Enter your debit card balance: ");
            balance = input.nextDouble();
            if(balance < 0) {
                System.out.println("Invalid input! Balance cannot be a negative number.");
                loop = true;
            }
            else {
                loop = false;
            }
        } while(loop == true);

        // customer 
        Customer customer = new Customer(name, balance);

        displayMenuChoices();

        do {
            System.out.print("\nWhat would you like to order: ");
            choice = input.nextInt();
            // loop through options
            for(int i = 1; i < items.size(); i++) {
                if(choice == i) {
                    customer.addItem(items.get(i));
                    loop = true;
                }
            }
             // if user choses 0, exit the program
            if(choice == 0) {
                System.out.println("Exit...");
                loop = false;
            }
            // display menu
            else if(choice == 100) {
                displayMenuChoices();
                loop = true;
            }
            else {
                loop = true;
            }
        } while (loop == true);

        // display list of ordered items
        System.out.println("");
        customer.getList();

        // display the total cost
        System.out.println("");
        customer.purchaseOrder();

        // say by to the customer
        System.out.println("");
        System.out.println("Have a nice day, " + customer.getName() + "!");
    }

    private static void displayMenuChoices() {
        System.out.println("*******MENU*******");
        // display menue items
        for(int i = 1; i < items.size(); i++) {
            System.out.println((i) + " - " + items.get(i).getItem());
        }
        // option to display menu again
        System.out.println("100 - display menu items again");
        // option to exit program
        System.out.println("0 - Exit the program");
    }
}