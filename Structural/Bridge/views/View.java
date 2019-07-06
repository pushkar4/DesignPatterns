package views;

import resources.IResource;

/*
 * There can be many views each to display on different types of devices
 * such as on big monitors, on small mobile displays
 * or even on the very small smart watch display.
 */
public abstract class View {
	
	IResource resource;
	
	public View(IResource resource) {
		this.resource = resource;
	}
	
	public abstract void render();

}
