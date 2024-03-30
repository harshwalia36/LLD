package DecoratorPattern;

public class ChickenBurger extends Meal{
    private double PRICE = 70;

    public ChickenBurger() {
        description = "Chicken Burger";
    }

    public double getPrice() {
        return PRICE;
    }
}
