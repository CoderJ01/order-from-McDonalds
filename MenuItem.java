public class MenuItem {
    // variables
    private String item;
    private double cost;
    private int calorieAmount;

    // constructor
    public MenuItem(String item, double cost, int calorieAmount) {
        this.item = item;
        if(cost < 0) {
            this.cost = 0;
        }
        else {
            this.cost = cost;
        }
        if(calorieAmount < 0) {
            this.calorieAmount = 0;
        }
        else {
            this.calorieAmount = calorieAmount;
        }
    }

    // use non-parameter constructor to display "Exit program" selection
    public MenuItem() {
        this.item = "Exit program";
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