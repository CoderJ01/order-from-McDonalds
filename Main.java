public class Main {
    public static void main(String[] args) {
        // tests for customer
        Customer customerA = new Customer("Abby", 5.75);
        System.out.println("Name: " + customerA.getName());
        System.out.println("Balance: $" + customerA.getBalance());
    
        // space 
        System.out.println(" ");

        // test for menu item
        MenuItem BigMac = new MenuItem("Big Mac", 3.99, 563);
        System.out.println("Name: " + BigMac.getItem());
        System.out.println("Cost: $" + BigMac.getCost());
        System.out.println("Calories: " + BigMac.getCalories()); 

        // space 
        System.out.println(" ");

        MenuItem mediumFry = new MenuItem("Medium Fries", 1.79, 378);
        System.out.println("Name: " + mediumFry.getItem());
        System.out.println("Cost: $" + mediumFry.getCost());
        System.out.println("Calories: " + mediumFry.getCalories()); 

        // space 
        System.out.println(" ");

        // add item
        customerA.addItem(BigMac);
        customerA.addItem(mediumFry);
        
        customerA.getTotalCost();
        
        // space 
        System.out.println(" ");
        
        customerA.purchaseOrder();
    }
}