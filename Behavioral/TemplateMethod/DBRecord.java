
public abstract class DBRecord {

	/*
	 * This is the template method with the validate, beforesave
	 * and aftersave methods that can vary for different sub-classes
	 */
	public void save() {
		
		validate();
		
		beforeSave();
		
		/*
		 * Persist the object to DB
		 * Here we would execute an SQL query to do the save.
		 */
		
		afterSave();
	}

	protected abstract void validate();
	protected abstract void beforeSave();
	protected abstract void afterSave();
}
