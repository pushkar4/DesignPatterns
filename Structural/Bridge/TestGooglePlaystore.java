import products.Album;
import resources.AlbumResource;
import resources.IResource;
import views.MobileView;
import views.View;
import views.WebView;

/*
 * We are trying to model the playstore where we wish to sell
 * games, albums, books.
 * The catalogue can be rendered on monitors or mobile displays
 * for which we have the 2 views webview, mobileview.
 */
public class TestGooglePlaystore {

  public static void main(String[] args) {

    /*
     * Construct an album object.
     * This could also have been a Book or a Game object.
     * All these are the products which we want to sell on playstore
     * under different categories.
     */
    Album album = new Album();
    album.setName("PRISM (Deluxe)");
    album.setRating(4);
    album.setSize(48);
    album.setArtist("Kety Perry");
    album.setDescription(
        "Prism is the fourth studio album by American singer Katy Perry. It was released by Capitol Records on October 18, 2013.");
    album.setGenre("Pop");
    album.setNumSongs(16);
    album.setPublisher("Capitol Records, LLC");
    album.setPrice(170);

    /*
     * Create an Iresource for the album.
     * This resource is designed to work with the views
     * that is to be displayed on big devices or mobile devices or tabs.
     */
    IResource albumResource = new AlbumResource(album);

    /*
     * Create 2 different views for the resource.
     * The webview will show a lot more info as it displays on monitor
     * The mobileview will show lesser but important content as it has a smaller screen
     * for the purpose.
     */
    View webView = new WebView(albumResource);
    View mobileView = new MobileView(albumResource);

    /*
     * Render simply renders the content on the display.
     * We can similarly create book and game objects.
     * Then create their respective resources and then
     * their respective webview and mobileview.
     */
    System.out.println("===== ON BIG DISPLAYS =====");
    webView.render();
    System.out.println("\n\n\n===== ON MOBILE DISPLAYS =====");
    mobileView.render();
  }
}
