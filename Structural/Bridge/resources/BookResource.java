package resources;

import products.Book;

/*
 * This the book resource which contains the book object.
 * This resource is now suitable to be used by a view.
 */
public class BookResource implements IResource {
	
	Book book;
	
	public BookResource(Book book) {
		this.book = book;
	}

	@Override
	public String getName() {
		return book.getName();
	}

	@Override
	public int getRating() {
		return book.getRating();
	}

	@Override
	public int getSize() {
		return book.getSize();
	}

	@Override
	public String getDescription() {
		return "\nAuthor: " + book.getAuthor() + 
			"\nAbout: " + book.getDescription() + 
			"\nLanguage: " + book.getLanguage() + 
			"\nPages: " + book.getPages();
	}

	@Override
	public int getVersion() {
		return -1;
	}

	@Override
	public String getOwner() {
		return book.getPublisher();
	}

	@Override
	public float getPrice() {
		return book.getPrice();
	}
}
