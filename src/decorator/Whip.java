package decorator;

public class Whip extends CoffeeDecorator {
    public Whip (Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
 
    @Override
    public double getPrice() {
        return super.getPrice() + 0.7;
    }
 
    @Override
    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Whip";
    }
}
