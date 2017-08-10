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
			System.out.println("Added " + meal + " to the menu.");
        }
    }

    public void printMeals() {
		if (this.meals.size() > 0) {
			for (String meal : this.meals) {
				System.out.println(meal);
			}
		} else {
			System.out.println("Nothing on the menu!!");
		}
    }

    public void clearMenu() {
        this.meals.clear();
		//System.out.println(this.meals.size());
    }

    public static void main(String[] args) {
		Menu flipfood = new Menu();

        System.out.println("Exercise: 76.1 - adding a meal");
		flipfood.addMeal("Balatong");
		flipfood.addMeal("Adobo");
		flipfood.addMeal("Balut");

        System.out.println("Exercise: 76.2 - print menu");
		flipfood.printMeals();

        System.out.println("Exercise: 76.3 - clear menu");
		flipfood.clearMenu();
		flipfood.printMeals();
    }
}
