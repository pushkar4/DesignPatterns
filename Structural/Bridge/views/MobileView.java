package views;

import resources.IResource;

/*
 * This is the view that is specialized for mobile devices.
 * As there is a scarcity of display we will render lesser info 
 * for the product we want to sell.
 */
public class MobileView extends View {

	public MobileView(IResource resource) {
		super(resource);
	}

	@Override
	public void render() {
		System.out.println("Name: " + resource.getName());
		System.out.println("Rating: " + resource.getRating());
		System.out.println("Size: " + resource.getSize() + "MB");
		System.out.println("Price: INR " + resource.getPrice());
	}
}
