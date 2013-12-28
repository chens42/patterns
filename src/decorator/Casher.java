package decorator;

public class Casher {
	public static final void main(String[] args) {
		Coffee c = new FrenchCoffee();
		System.out.println("Cost: " + c.getPrice() + "; Ingredients: "
				+ c.getIngredients());

		c = new Milk(c);
		System.out.println("Cost: " + c.getPrice() + "; Ingredients: "
				+ c.getIngredients());

		c = new Whip(c);
		System.out.println("Cost: " + c.getPrice() + "; Ingredients: "
				+ c.getIngredients());
		
		c = new Milk(c);
		System.out.println("Cost: " + c.getPrice() + "; Ingredients: "
				+ c.getIngredients());

		c = new Cream(c);
		System.out.println("Cost: " + c.getPrice() + "; Ingredients: "
				+ c.getIngredients());
	}
}
