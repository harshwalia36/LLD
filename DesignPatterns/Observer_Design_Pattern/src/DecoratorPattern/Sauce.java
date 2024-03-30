package DecoratorPattern;

public class Sauce extends AddOn {
    private double PRICE = 8.0;
    private Meal meal;

    public Sauce(Meal meal) {
        this.meal = meal;
    }

    public String getDescription() {
        return meal.getDescription() + ", Sauce";
    }

    public double getPrice() {
        return PRICE + meal.getPrice();
    }
}
