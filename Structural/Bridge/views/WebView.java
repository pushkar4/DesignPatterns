package views;

import resources.IResource;

/*
 * This is the view that is associated with big screens like monitors
 */
public class WebView extends View {

  public WebView(IResource resource) {
    super(resource);
  }

  @Override
  public void render() {

    System.out.println("Name: " + resource.getName());
    System.out.println("Rating: " + resource.getRating());
    System.out.println("Size: " + resource.getSize() + "MB");
    System.out.println(resource.getDescription());
    if (resource.getVersion() != -1) System.out.println("Version: " + resource.getVersion());
    System.out.println("By: " + resource.getOwner());
    System.out.println("Price: INR " + resource.getPrice());
  }
}
