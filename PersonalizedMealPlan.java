import java.util.*;

interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High-Protein";
    }
}

class Meal<T extends MealPlan> {
    private String mealName;
    private T mealType;

    public Meal(String mealName, T mealType) {
        this.mealName = mealName;
        this.mealType = mealType;
    }

    public String getMealName() {
        return mealName;
    }

    public T getMealType() {
        return mealType;
    }
}

class MealPlanGenerator {
    private List<Meal<? extends MealPlan>> meals = new ArrayList<>();

    public void addMeal(Meal<? extends MealPlan> meal) {
        meals.add(meal);
    }

    public void showMealPlan() {
        for (Meal<? extends MealPlan> meal : meals) {
            System.out.println("Meal: " + meal.getMealName() + ", Type: " + meal.getMealType().getMealType());
        }
    }
}

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        Meal<VegetarianMeal> salad = new Meal<>("Garden Salad", new VegetarianMeal());
        Meal<VeganMeal> smoothie = new Meal<>("Vegan Smoothie", new VeganMeal());
        Meal<KetoMeal> steak = new Meal<>("Keto Steak", new KetoMeal());
        Meal<HighProteinMeal> chicken = new Meal<>("Grilled Chicken", new HighProteinMeal());

        MealPlanGenerator generator = new MealPlanGenerator();
        generator.addMeal(salad);
        generator.addMeal(smoothie);
        generator.addMeal(steak);
        generator.addMeal(chicken);

        generator.showMealPlan();
    }
}

