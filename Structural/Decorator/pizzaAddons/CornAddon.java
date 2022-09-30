package pizzaAddons;

import pizzas.Pizza;

public class CornAddon extends PizzaAddonDecorator {

  private Pizza pizza;

  public CornAddon(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + ", Corn";
  }

  @Override
  public double getCost() {
    return pizza.getCost() + 5.0;
  }
}
