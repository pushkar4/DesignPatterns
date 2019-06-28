import ducks.Duck;
import ducks.RubberDuck;
import ducks.SuperDuck;
import ducks.WildDuck;
import ducks.WoodDuck;

public class TestStrategy {

	public static void main(String[] args) {
		
		Duck rubberDuck = new RubberDuck();
		Duck wildDuck = new WildDuck();
		Duck superDuck = new SuperDuck();
		Duck woodDuck = new WoodDuck();
		
		rubberDuck.display();
		wildDuck.display();
		superDuck.display();
		woodDuck.display();
		
	}
}
