import commands.ICommand;
import commands.LightOffCommand;
import commands.LightOnCommand;
import commands.NoCommand;
import receiver.Invoker;
import receiver.Light;

public class TestCommands {

  public static void main(String[] args) {

    Light light = new Light();

    ICommand on = new LightOnCommand(light);
    ICommand off = new LightOffCommand(light);
    ICommand up = new NoCommand(light);
    ICommand down = new NoCommand(light);

    Invoker invoker = new Invoker(on, off, up, down);

    invoker.clickOn();
    invoker.clickOff();
    invoker.clickUp();
  }
}
