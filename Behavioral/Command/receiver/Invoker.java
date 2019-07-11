package receiver;

import commands.ICommand;

/*
 * The invoker is a remote device which has many buttons.
 * A button on this device can be programmed to call a specific behavior 
 * on the receiver. Some buttons can be also left unprogrammed
 * pressing which will result in no-op.
 */
public class Invoker {

	ICommand on;
	ICommand off;
	ICommand up;
	ICommand down;
	
	public Invoker(ICommand on, ICommand off, ICommand up, ICommand down) {
		this.on = on;
		this.off = off;
		this.up = up;
		this.down = down;
	}
	
	public void clickOn() {
		on.execute();
	}
	
	public void clickOff() {
		off.execute();
	}
	
	public void clickUp() {
		up.execute();
	}
	
	public void clickDown() {
		down.execute();
	}
	
}
