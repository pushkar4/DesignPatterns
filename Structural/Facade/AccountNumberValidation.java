public class AccountNumberValidation {

  private int availableAccountNumber = 12345678;

  public boolean validate(int accountNumber) {

    // In reality we would be querying DB for accountNumber validation

    if (accountNumber == availableAccountNumber) return true;
    return false;
  }
}
