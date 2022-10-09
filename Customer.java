public class Customer {
    // variables
    private String name;
    private double balance;

    // constructor
    public Customer(String name, double balance) {
        this.name = name;
        if(balance < 0) {
            this.balance = 0;
        }
        this.balance = balance;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }
}