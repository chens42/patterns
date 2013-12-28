package decorator;

class Milk extends CoffeeDecorator {
    public Milk (Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    
    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }
    
    @Override
    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Milk";
    }
}
