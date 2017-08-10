import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // Implement the methods here
    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }

    public static void main(String[] args) {
        System.out.println("Exercise: 76.1 - adding a meal");
        System.out.println("Exercise: 76.2 - print menu");
        System.out.println("Exercise: 76.3 - clear menu");
    }
}