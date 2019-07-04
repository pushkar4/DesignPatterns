import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

import pizzaAddons.CornAddon;
import pizzaAddons.ExtraCheeseAddon;
import pizzaAddons.MayoAddon;
import pizzaAddons.PaneerAddon;
import pizzaAddons.SauceAddon;
import pizzas.CheesePizza;
import pizzas.Pizza;
import pizzas.PlainPizza;

public class TestPizzaStore {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How many pizzas?");
		int t = Integer.parseInt(br.readLine());
		
		LinkedList<Pizza> orders = new LinkedList<Pizza>();
		double cost = 0.0;
		
		while(t != 0) {
			t--;
			
			Pizza pizza = null;
			int ch;
			
			System.out.println("Choose a pizza:");
			System.out.println("1. Plain Pizza");
			System.out.println("2. Cheese Pizza");
			switch(Integer.parseInt(br.readLine())) {
				case 1:
					pizza = new PlainPizza();
					break;
				case 2:
					pizza = new CheesePizza();
					break;
				default:
			}
			
			do {
				System.out.println("Choose addons (0. TO EXIT):");
				System.out.println("1. Corn");
				System.out.println("2. Extra cheese");
				System.out.println("3. Mayo");
				System.out.println("4. Paneer");
				System.out.println("5. Sauce");
				ch = Integer.parseInt(br.readLine());
				switch(ch) {
					case 1:
						pizza = new CornAddon(pizza);
						break;
					case 2:
						pizza = new ExtraCheeseAddon(pizza);
						break;
					case 3:
						pizza = new MayoAddon(pizza);
						break;
					case 4:
						pizza = new PaneerAddon(pizza);
						break;
					case 5:
						pizza = new SauceAddon(pizza);
						break;
					default:
						ch = 0;					
				}
			} while(ch != 0);
			
			orders.add(pizza);			
		}
		
		System.out.println("==================================");
		System.out.println("ORDER SUMMARY");
		
		for (Pizza p : orders) {
			System.out.println("INR " + p.getCost() + " : " + p.getDescription());
			cost += p.getCost();
		}
		
		System.out.println("----------------------------------");
		System.out.println("INR " + cost + " : Total");
	}
}
