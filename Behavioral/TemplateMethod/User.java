public class User extends DBRecord {

  private String name, password;

  public User(String name, String password) {
    this.name = name;
    this.password = password;
  }

  @Override
  protected void validate() {
    System.out.println("DEBUG: Performing user validation...");
  }

  @Override
  protected void beforeSave() {
    System.out.println("DEBUG: Performing operations before saving user...");
  }

  @Override
  protected void afterSave() {
    System.out.println("DEBUG: Performing post save operations for user...");
  }
}
