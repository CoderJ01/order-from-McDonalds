import java.util.ArrayList;
import java.util.List;

public class Customer {
    // variables
    private String name;
    private double balance;
    private List<MenuItem> orderedItems = new ArrayList<>();

    // constructor
    public Customer(String name, double balance) {
        this.name = name;
        if(balance < 0) {
            // prohibit creation negative values
            this.balance = 0;
        }
        else {
            this.balance = balance;
        }
    }

    // getters
    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    // add money to bank account
    public void addMoney(double amount) {
        if(amount < 0) {
            amount = 0;
        }
        this.balance += amount;
    }

    // add items that the customer orders
    public void addItem(MenuItem item) {
        this.orderedItems.add(item);
        System.out.println(item.getItem() + " has been added to the customer's order list");
    }

    // retrieve all the items that the customer order
    public void getList() {
        System.out.println("***Items Ordered***");
        int i = 1;
        for(MenuItem item : orderedItems) {
            System.out.println(i + ". " + item.getItem() + ": $" + String.format("%.2f", item.getCost()));
            i++;
        }
    }

    // get the cost of the entire order
    public double getTotalCost() {
        double cost = 0;
        for(int i = 0; i < this.orderedItems.size(); i++) {
            cost += this.orderedItems.get(i).getCost();
        }
        System.out.println("**Total Cost**");
        System.out.println("$" + String.format("%.2f", cost));
        return cost;
    }

    // get the customer's remainig balance
    public void purchaseOrder() {
        double costOfOrder = getTotalCost();
        if(this.balance - costOfOrder < 0) {
            // Notify customer if balance is insufficient
            System.out.println("\nYou cannot afford this order");
            this.balance = 0;
        }
        else {
            // print remaining balance
            System.out.println("\n**Remaining Balance**");
            System.out.println("$" + String.format("%.2f", (this.balance - costOfOrder)));
        }
    }
}