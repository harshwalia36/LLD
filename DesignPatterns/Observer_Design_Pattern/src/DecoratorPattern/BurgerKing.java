package DecoratorPattern;

public class BurgerKing {
    public static void main(String[] args) {
        // Order: Chicken Burger with Cheese and Chips
        Meal burgerMeal = new ChickenBurger();
        burgerMeal = new Cheese(burgerMeal);
        burgerMeal = new Chips(burgerMeal);

        System.out.println("Order placed: " + burgerMeal.getDescription());
        System.out.println("Price: " + burgerMeal.getPrice());
    }
}
