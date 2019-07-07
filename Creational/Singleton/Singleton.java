/*
 * Only a single instance of this class can be created.
 * We use synchronization to ensure that upon using threads
 * we do not end up with more than 1 instance creation due to race conditions.
 */
public class Singleton {

	public static Singleton instance;
	public static Object lock = new Object();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		synchronized (lock) {
			if(instance == null) {
				instance = new Singleton();
				System.out.println("Instance created.");
			}
		}
		
		return instance;
	}

	public void display() {
		System.out.println("Singleton instance used.");
	}
}
