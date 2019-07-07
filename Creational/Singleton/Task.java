/*
 * This is a runnable which uses the singleton
 * It calls the display on the instance.
 */
public class Task implements Runnable {

	@Override
	public void run() {
		
		Singleton instance = Singleton.getInstance();
		instance.display();
	}

}
