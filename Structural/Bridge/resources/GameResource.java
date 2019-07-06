package resources;

import products.Game;

/*
 * This the game resource which contains the game object.
 * This resource is now suitable to be used by a view.
 */
public class GameResource implements IResource {
	
	Game game;
	
	public GameResource(Game game) {
		this.game = game;
	}

	@Override
	public String getName() {
		return game.getName();
	}

	@Override
	public int getRating() {
		return game.getRating();
	}

	@Override
	public int getSize() {
		return game.getSize();
	}

	@Override
	public String getDescription() {
		return game.getDescription();
	}

	@Override
	public int getVersion() {
		return game.getVersion();
	}

	@Override
	public String getOwner() {
		return game.getDeveloper();
	}

	@Override
	public float getPrice() {
		return game.getPrice();
	}
}
