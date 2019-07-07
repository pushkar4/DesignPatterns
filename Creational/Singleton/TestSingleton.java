import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestSingleton {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * We will use a thread pool of 4 threads and launch 8 threads concurrently
		 * all of which will try to obtain an instance of Singleton.
		 * Only the first thread to find the instance object null should
		 * create the object and the rest should use the created one.
		 */
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		executor.submit(new Task());
		executor.submit(new Task());
		executor.submit(new Task());
		executor.submit(new Task());
		executor.submit(new Task());
		executor.submit(new Task());
		executor.submit(new Task());
		executor.submit(new Task());
		
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.DAYS);		
	}
}
