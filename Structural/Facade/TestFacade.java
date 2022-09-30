public class TestFacade {

  public static void main(String[] args) {

    BankFacade bank = new BankFacade(12345678, 1234);

    bank.withdraw(1100);

    bank.withdraw(200);

    bank.withdraw(500);

    bank.deposit(1000);
  }
}
