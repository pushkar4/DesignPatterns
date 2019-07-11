

public class TestCloning {

	public static void main(String[] args) {
		
		Sheep sheep = new Sheep();
		
		Sheep clonedSheep = sheep.makeAClone();
		
		System.out.println(sheep.toString());
		System.out.println(clonedSheep.toString());
	}
}
