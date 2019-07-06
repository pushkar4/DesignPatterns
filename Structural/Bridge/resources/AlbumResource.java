package resources;

import products.Album;

/*
 * This the album resource which contains the album object.
 * This resource is now suitable to be used by a view.
 */
public class AlbumResource implements IResource {
	
	Album album;
	
	public AlbumResource(Album album) {
		this.album = album;
	}

	@Override
	public String getName() {
		return album.getName();
	}

	@Override
	public int getRating() {
		return album.getRating();
	}

	@Override
	public int getSize() {
		return album.getSize();
	}

	@Override
	public String getDescription() {
		return "Artist: " + album.getArtist() + 
			"\nAbout: " + album.getDescription() +
			"\nGenre: " + album.getGenre() +
			"\nSongs: " + album.getNumSongs();
	}

	@Override
	public int getVersion() {
		return -1;
	}

	@Override
	public String getOwner() {
		return album.getPublisher();
	}

	@Override
	public float getPrice() {
		return album.getPrice();
	}
}
