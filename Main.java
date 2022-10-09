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
    }
}