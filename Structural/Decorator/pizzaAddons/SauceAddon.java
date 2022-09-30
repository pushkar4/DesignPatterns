package pizzaAddons;

import pizzas.Pizza;

public class SauceAddon extends PizzaAddonDecorator {

  private Pizza pizza;

  public SauceAddon(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + ", Sauce";
  }

  @Override
  public double getCost() {
    return pizza.getCost() + 2.0;
  }
}
