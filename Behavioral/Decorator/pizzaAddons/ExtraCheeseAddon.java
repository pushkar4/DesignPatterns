package pizzaAddons;
import pizzas.Pizza;

public class ExtraCheeseAddon extends PizzaAddonDecorator {
	
	private Pizza pizza;
	
	public ExtraCheeseAddon(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Extra cheese";
	}
	
	@Override
	public double getCost() {
		return pizza.getCost() + 10.0;
	}
}
