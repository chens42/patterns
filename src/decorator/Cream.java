package decorator;

public class Cream extends CoffeeDecorator {

	public Cream(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 0.25;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + ingredientSeparator + "Cream";
	}

}
