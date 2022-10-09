public class MenuItem {
    private String item;
    private double cost;
    private int calorieAmount;

    public MenuItem(String item, double cost, int calorieAmount) {
        this.item = item;
        this.cost = cost;
        this.calorieAmount = calorieAmount;
    }

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