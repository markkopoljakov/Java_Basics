import java.util.ArrayList;
public class Menu {
    private ArrayList<String>meal;

    public Menu() {
        this.meal = new ArrayList<String>();
    }
        public void addMeals(String meal) {
            if (!this.meal.contains(meal)) {
                this.meal.add(meal);
            }
        }
        public  void printMeals() {
            for (String meal : this.meal) {
                System.out.println(meal);
            }
        }
        public void clearMenus() {
            this.meal.clear();
        }

}
