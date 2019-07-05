import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// This class could have implemented IBookParser but we are making the assumption 
// that this is 3rd party code and we only know what functions are available to us
// and so cannot change this code to add the implements statement.

public class BookParser {
	
	private String book;
	private long numberOfPages;
	private long numberOfLines;
	private long numberOfWords;
	private long numberOfAdverbs;
	
	public BookParser(String book) {

		this.book = book;
		
		System.out.println("Parsing started for: " + this.book);
		
		// This is an expensive operation simulated by sleeping 8 seconds.
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.submit(new Runnable() {
			public void run() {
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {}
			}
		});
		es.shutdown();
		try {
			es.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {}
		
		Random r = new Random();
		
		numberOfPages = r.nextLong();
		numberOfLines = r.nextLong();
		numberOfWords = r.nextLong();
		numberOfAdverbs = r.nextLong();
	}

	public long getNumberOfPages() {
		return numberOfPages;
	}

	public long getNumberOfLines() {
		return numberOfLines;
	}

	public long getNumberOfWords() {
		return numberOfWords;
	}

	public long getNumberOfAdverbs() {
		return numberOfAdverbs;
	}
}
