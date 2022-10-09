public class Main {
    public static void main(String[] args) {
        // tests for customer
        Customer customerA = new Customer("Abby", 1000);
        System.out.println("Name: " + customerA.getName());
        System.out.println("Balance: $" + customerA.getBalance());
        customerA.addMoney(50);
        System.out.println("Balance: $" + customerA.getBalance());
        customerA.addMoney(150);
        System.out.println("Balance: $" + customerA.getBalance());

        // space 
        System.out.println(" ");

        // test for menu item
        MenuItem itemA = new MenuItem("Big Mac", 3.99, 563);
        System.out.println("Name: " + itemA.getItem());
        System.out.println("Cost: $" + itemA.getCost());
        System.out.println("Calories: " + itemA.getCalories()); 

        // add item
        customerA.addItem(itemA);
    }
}