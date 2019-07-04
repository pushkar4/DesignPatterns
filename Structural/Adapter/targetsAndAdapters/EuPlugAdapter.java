package targetsAndAdapters;
import source.IUkPlug;

public class EuPlugAdapter implements IUkPlug {
	
	EuPlug euPlug;
	
	public EuPlugAdapter(EuPlug euPlug) {
		this.euPlug = euPlug;
	}

	@Override
	public void plugIntoUkSocket() {
		System.out.println("Plugged into adapter's UK socket.");
		System.out.println("Now plug adapter into European socket.");
		
		euPlug.plugIntoEuSocket();
	}
}
