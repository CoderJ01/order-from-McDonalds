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
        this.balance += amount;
    }

    // add items that the customer orders
    public void addItem(MenuItem item) {
        this.orderedItems.add(item);
        System.out.println(item.getItem() + " has been added to the customer's order list");
    }

    // retrieve all the items that the customer order
    public void getList() {
        for(int i = 0; i < this.orderedItems.size(); i++) {
            System.out.println(this.orderedItems.get(i).getItem());
        }
    }

    // list the price of each item
    public void getPriceList() {
        for(int i = 0; i < this.orderedItems.size(); i++) {
            System.out.println(this.orderedItems.get(i).getCost());
        }
    }
}