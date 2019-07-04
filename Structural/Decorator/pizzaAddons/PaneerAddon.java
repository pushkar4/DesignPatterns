package pizzaAddons;
import pizzas.Pizza;

public class PaneerAddon extends PizzaAddonDecorator {
	
	private Pizza pizza;
	
	public PaneerAddon(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Paneer";
	}
	
	@Override
	public double getCost() {
		return pizza.getCost() + 20.0;
	}
}
