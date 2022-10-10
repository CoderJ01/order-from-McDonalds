public class Main {
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
}