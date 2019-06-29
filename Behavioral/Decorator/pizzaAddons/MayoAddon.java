package pizzaAddons;
import pizzas.Pizza;

public class MayoAddon extends PizzaAddonDecorator {
	
	private Pizza pizza;
	
	public MayoAddon(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Mayo";
	}
	
	@Override
	public double getCost() {
		return pizza.getCost() + 8.0;
	}
}
