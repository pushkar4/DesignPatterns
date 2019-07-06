package resources;

/*
 * This is the interface which specifies the methods that
 * any resource must implement.
 * A subset of these methods will then be used by a view to 
 * display the content.
 */
public interface IResource {

	public String getName();
	public int getRating();
	public int getSize();
	public String getDescription();
	public int getVersion();
	public String getOwner();
	public float getPrice();
	
}
