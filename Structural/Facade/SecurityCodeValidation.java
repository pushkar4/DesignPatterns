public class SecurityCodeValidation {

  private int availableSecurityCode = 1234;

  public boolean validate(int securityCode) {

    // In reality we would be querying DB / some algorithm for securityCode validation

    if (securityCode == availableSecurityCode) return true;
    return false;
  }
}
