import source.IUkPlug;
import targetsAndAdapters.EuPlug;
import targetsAndAdapters.EuPlugAdapter;
import targetsAndAdapters.IndianPlug;
import targetsAndAdapters.IndianPlugAdapter;

public class TestAdapter {

	public static void main(String[] args) {

		// We have a European plug and we want to be able to use a UK socket.
		// Code terms we have a ukPlug and can call plugIntoUkSocket()
		// But we want to be able to call plugIntoXYZSocket()



		// Adaptee
		EuPlug euPlug = new EuPlug();

		// Adapter
		IUkPlug euPlugAdapter = new EuPlugAdapter(euPlug);

		// Call the known function on adapter
		// Adapter handles calling the unknown function of adaptee
		euPlugAdapter.plugIntoUkSocket();

		System.out.println();



		// We have same European plug and now we want to be able to use an Indian socket.

		// Adaptee
		IndianPlug indianPlug = new IndianPlug();

		// Adapter
		IUkPlug indianPlugAdapter = new IndianPlugAdapter(indianPlug);

		// Call the known function on adapter
		// Adapter handles calling the unknown function of adaptee
		indianPlugAdapter.plugIntoUkSocket();
	}
}
