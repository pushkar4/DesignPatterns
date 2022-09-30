package pizzas;

public class PlainPizza extends Pizza {

  public PlainPizza() {
    description = "Plain pizza";
  }

  @Override
  public double getCost() {
    return 50.0;
  }
}
