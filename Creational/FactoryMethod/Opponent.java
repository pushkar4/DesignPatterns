public abstract class Opponent {

  String name;
  int damage;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public void display() {
    System.out.println(name + " is here...");
  }

  public void attack() {
    System.out.println(name + " did " + damage + " damage.");
  }
}
