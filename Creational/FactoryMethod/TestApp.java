public class TestApp {

  public static void main(String[] args) {

    OpponentFactory oFactory = new OpponentFactory();

    Opponent o = oFactory.makeOpponent("small");
    o.display();
    o.attack();

    o = oFactory.makeOpponent("big");
    o.display();
    o.attack();

    o = oFactory.makeOpponent("boss");
    o.display();
    o.attack();
  }
}
