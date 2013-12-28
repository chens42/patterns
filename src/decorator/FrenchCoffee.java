package decorator;

public class FrenchCoffee extends Coffee {

	@Override
	public String getIngredients() {
		return "French brewed coffee";
	}

	@Override
	public double getPrice() {
		return 1;
	}
	
	
}
