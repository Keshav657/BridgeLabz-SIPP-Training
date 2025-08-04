import java.util.*;

// MealPlan interface and subtypes
interface MealPlan {
    String getDescription();
}

class VegetarianMeal implements MealPlan {
    public String getDescription() { return "Vegetarian Meal: Paneer, Dal, Rice, Salad"; }
}

class VeganMeal implements MealPlan {
    public String getDescription() { return "Vegan Meal: Tofu, Lentils, Brown Rice, Veggies"; }
}

class KetoMeal implements MealPlan {
    public String getDescription() { return "Keto Meal: Eggs, Chicken, Avocado, Cheese"; }
}

class HighProteinMeal implements MealPlan {
    public String getDescription() { return "High-Protein Meal: Fish, Beans, Quinoa, Broccoli"; }
}

// Generic Meal class
class Meal<T extends MealPlan> {
    private T mealPlan;
    public Meal(T mealPlan) { this.mealPlan = mealPlan; }
    public T getMealPlan() { return mealPlan; }
}

// Generic method to validate and generate meal plan
class MealPlanUtils {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        // Simple validation (can be extended)
        if (mealPlan == null) throw new IllegalArgumentException("Meal plan cannot be null");
        System.out.println("Generating meal plan: " + mealPlan.getDescription());
        return new Meal<>(mealPlan);
    }
}

// Demo
public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = MealPlanUtils.generateMealPlan(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = MealPlanUtils.generateMealPlan(new VeganMeal());
        Meal<KetoMeal> ketoMeal = MealPlanUtils.generateMealPlan(new KetoMeal());
        Meal<HighProteinMeal> hpMeal = MealPlanUtils.generateMealPlan(new HighProteinMeal());
    }
}
