public class Sheep implements Cloneable {

  public Sheep() {
    System.out.println("Sheep is created...");
  }

  public Sheep makeAClone() {

    System.out.println("Sheep is being cloned");

    Sheep sheep = null;

    try {
      sheep = (Sheep) super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("Cloning not supported.");
    }

    return sheep;
  }

  @Override
  public String toString() {
    return this.hashCode() + " ";
  }
}
