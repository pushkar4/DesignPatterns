package commands;

import receiver.Light;

public class LightOffCommand implements ICommand {

  /*
   * The light is the object on which the commands have to be executed.
   */
  Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void unExecute() {
    light.on();
  }
}
