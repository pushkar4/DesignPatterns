public class Employee extends DBRecord {

  private String name, company;
  private float salary;

  public Employee(String name, String company, float salary) {
    this.name = name;
    this.company = company;
    this.salary = salary;
  }

  @Override
  protected void validate() {
    System.out.println("DEBUG: Performing employee validation...");
  }

  @Override
  protected void beforeSave() {
    System.out.println("DEBUG: Performing operations before saving employee...");
  }

  @Override
  protected void afterSave() {
    System.out.println("DEBUG: Performing post save operations for employee...");
  }
}
