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
    }

    private void displayMenuChoices() {
        System.out.println("MENU");
        
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