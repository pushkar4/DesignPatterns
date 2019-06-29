package pizzas;

public class CheesePizza extends Pizza {
	
	public CheesePizza() {
		description = "Cheese pizza";
	}

	@Override
	public double getCost() {
		return 70.0;
	}

}
