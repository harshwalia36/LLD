package DecoratorPattern;

public class EggBurger extends Meal {
    private double PRICE = 65;

    public EggBurger() {
        description = "Egg Burger";
    }

    public double getPrice() {
        return PRICE;
    }
}
