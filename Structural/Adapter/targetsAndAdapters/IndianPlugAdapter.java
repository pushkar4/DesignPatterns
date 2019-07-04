package targetsAndAdapters;
import source.IUkPlug;

public class IndianPlugAdapter implements IUkPlug {
	
	IndianPlug indianPlug;
	
	public IndianPlugAdapter(IndianPlug indianPlug) {
		this.indianPlug = indianPlug;
	}

	@Override
	public void plugIntoUkSocket() {
		System.out.println("Plugged into adapter's UK socket.");
		System.out.println("Now plug adapter into Indian socket.");
		
		indianPlug.plugIntoIndianSocket();
	}
}
