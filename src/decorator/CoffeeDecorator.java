package decorator;

public abstract class CoffeeDecorator extends Coffee {
    protected final Coffee decoratedCoffee;
    protected String ingredientSeparator = ", ";
 
    public CoffeeDecorator (Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
 
    @Override
    public double getPrice() { // implementing methods of the abstract class
        return decoratedCoffee.getPrice();
    }
 
    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}
