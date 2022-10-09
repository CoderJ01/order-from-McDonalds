public class Main {
    public static void main(String[] args) {
        Customer customerA = new Customer("Abby", -90);
        System.out.println("Name: " + customerA.getName());
        System.out.println("Balance: $" + customerA.getBalance());
    }
}