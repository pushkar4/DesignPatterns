
public class OpponentFactory {

	public Opponent makeOpponent(String type) {
		
		switch (type) {
		case "small":
			return new SmallOpponent();
		
		case "big":
			return new BigOpponent();
		
		case "boss":
			return new BossOpponent();
			
		default:
			return new SmallOpponent();
		}
	}
}
