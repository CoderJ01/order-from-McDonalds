import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // burgers
        MenuItem BigMac = new MenuItem("Big Mac", 3.99, 563);
        MenuItem QuarterPounder = new MenuItem("Quarter Pounder", 3.79, 520);
        MenuItem doubleCheeseburger = new MenuItem("Double Cheeseburger", 1.69, 450);
        MenuItem cheeseburger = new MenuItem("cheeseburger", 1.00, 300);
        MenuItem hamburger = new MenuItem("hamburger", 1.00, 250);

        // fries
        MenuItem smallFry = new MenuItem("Small Fry", 1.39, 230);
        MenuItem mediumFry = new MenuItem("Medium Fry", 1.79, 320);
        MenuItem largeFry = new MenuItem("Large Fries", 1.89, 480);

        // desserts
        MenuItem cookies = new MenuItem("bag of cookies", 1.00, 510);
        MenuItem bakedApplePie = new MenuItem("apple pie", 0.99, 230);

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
            if(balance < 0) 
                System.out.println("Invalid input! Balance cannot be a negative number.");
                loop = true;
        }while(loop == true);

        displayMenuChoices();

        System.out.print("What would you like to order: ");
        choice = input.nextInt();

        // customer 
        Customer customer = new Customer(name, balance);

        // switch statement
        switch(choice) {
            case 0: 
                System.out.println("Exit...");
                break;
            case 1: 
                customer.addItem(hamburger);
                break;
            case 2:
                customer.addItem(cheeseburger);
                break;
            case 3:
                customer.addItem(doubleCheeseburger);
                break;
            case 4:
                customer.addItem(QuarterPounder);
                break;
            case 5:
                customer.addItem(BigMac);
                break;
            case 6: 
                customer.addItem(smallFry);
                break;
            case 7:
                customer.addItem(mediumFry);
                break;
            case 8: 
                customer.addItem(largeFry);
                break;
            case 9: 
                customer.addItem(cookies);
                break;
            case 10: 
                customer.addItem(bakedApplePie);
                break;
            default:
                System.out.print("Invalid option");
        }
    }

    private static void displayMenuChoices() {
        System.out.println("*******MENU*******");
        
        // burgers
        System.out.println(" 1 - hamburger");
        System.out.println(" 2 - cheeseburger");
        System.out.println(" 3 - doublecheeseburger");
        System.out.println(" 4 - Quarter Pounder");
        System.out.println(" 5 - Big Mac");

        // fries
        System.out.println(" 6 - small fry");
        System.out.println(" 7 - medium fry");
        System.out.println(" 8 - large fry");

        // desserts
        System.out.println(" 9 - bag of cookies");
        System.out.println("10 - apple pie");

        // exit
        System.out.println(" 0 - exit program");
    }
}