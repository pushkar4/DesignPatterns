package commands;

import receiver.Light;

public class LightOnCommand implements ICommand {

	/*
	 * The light is the object on which the commands have to be executed.
	 */
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void unExecute() {
		light.off();
	}

}
