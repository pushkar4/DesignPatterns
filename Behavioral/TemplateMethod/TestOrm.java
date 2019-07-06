/*
 * We are trying to model an ORM.
 * So, if we create an object and call save on the object
 * the it will be persisted to the DB.
 * Similarly for any object.
 */
public class TestOrm {

	public static void main(String[] args) {
		
		User user = new User("username", "Pass@word123");
		
		/*
		 * Persist to DB
		 */
		System.out.println("Saving user");
		user.save();
		
		
		Employee employee = new Employee("Jon Doe", "Google Inc", 100000.0f);
		
		/*
		 * Persist to DB
		 */
		System.out.println("\nSaving employee");
		employee.save();
	}
}
