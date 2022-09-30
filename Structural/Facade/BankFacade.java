public class BankFacade {

  private int accountNumber;
  private int securityCode;

  private AccountNumberValidation accountNumberValidation;
  private SecurityCodeValidation securityCodeValidation;
  private FundOp fundOp;

  public BankFacade(int accountNumber, int securityCode) {

    this.accountNumber = accountNumber;
    this.securityCode = securityCode;

    accountNumberValidation = new AccountNumberValidation();
    securityCodeValidation = new SecurityCodeValidation();
    fundOp = new FundOp(accountNumber);
  }

  public void withdraw(double amt) {
    if (accountNumberValidation.validate(accountNumber)
        && securityCodeValidation.validate(securityCode)) fundOp.makeWithdraw(amt);
    else System.out.println("Invalid credentials");
  }

  public void deposit(double amt) {
    if (accountNumberValidation.validate(accountNumber)
        && securityCodeValidation.validate(securityCode)) fundOp.makeDeposit(amt);
    else System.out.println("Invalid credentials");
  }
}
