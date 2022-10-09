public class Main {
    public static void main(String[] args) {
        Customer customerA = new Customer("", 0);
        customerA.setName("Abby");
        customerA.setBalance(1000.35);
        System.out.println("Name: " + customerA.getName());
        System.out.println("Balance: $" + customerA.getBalance());
    }
}