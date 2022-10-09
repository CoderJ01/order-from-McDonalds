public class MenuItem {
    // variables
    private String item;
    private double cost;
    private int calorieAmount;

    // constructor
    public MenuItem(String item, double cost, int calorieAmount) {
        this.item = item;
        this.cost = cost;
        this.calorieAmount = calorieAmount;
    }

    // getters
    public String getItem() {
        return this.item;
    }

    public double getCost() {
        return this.cost;
    }

    public int getCalories() {
        return this.calorieAmount;
    }
}