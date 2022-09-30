package commands;

import receiver.Light;

public class NoCommand implements ICommand {

  /*
   * The light is the object on which the commands have to be executed.
   */
  Light light;

  public NoCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    System.out.println("Unsupported Operation");
  }

  @Override
  public void unExecute() {
    System.out.println("Unsupported Operation");
  }
}
