
public class TestProxy {

	public static void main(String[] args) {

		System.out.println("Normal usage:");
		BookParser parser = new BookParser("A very long sentence.....");
		System.out.println("------ Parser initialized ------");
		System.out.println("Pages " + parser.getNumberOfPages());
		System.out.println("Lines " + parser.getNumberOfLines());
		System.out.println("Words " + parser.getNumberOfWords());
		System.out.println("Adverbs " + parser.getNumberOfAdverbs());


		System.out.println("\nLazy parsing usage:");
		LazyBookParserProxy parser2 = new LazyBookParserProxy("A very long sentence.....");
		System.out.println("------ Parser initialized ------");
		System.out.println("Pages " + parser2.getNumberOfPages());
		System.out.println("Lines " + parser2.getNumberOfLines());
		System.out.println("Words " + parser2.getNumberOfWords());
		System.out.println("Adverbs " + parser2.getNumberOfAdverbs());

	}
}
