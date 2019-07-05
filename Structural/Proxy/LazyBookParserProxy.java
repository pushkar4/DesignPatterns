
public class LazyBookParserProxy implements IBookParser {
	
	private String book;
	private BookParser parser;
	
	public LazyBookParserProxy(String book) {
		this.book = book;
		this.parser = null;
	}

	@Override
	public long getNumberOfPages() {
		
		if(parser == null) {
			parser = new BookParser(book);
		}
		return parser.getNumberOfPages();
	}

	@Override
	public long getNumberOfLines() {
		if(parser == null) {
			parser = new BookParser(book);
		}
		return parser.getNumberOfLines();
	}

	@Override
	public long getNumberOfWords() {
		if(parser == null) {
			parser = new BookParser(book);
		}
		return parser.getNumberOfWords();
	}

	@Override
	public long getNumberOfAdverbs() {
		if(parser == null) {
			parser = new BookParser(book);
		}
		return parser.getNumberOfAdverbs();
	}

}
