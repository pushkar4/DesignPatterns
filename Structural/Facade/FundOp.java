
public class FundOp {
	
	private int accountNumber = 12345678;
	private double funds = 1000;
	
	public FundOp(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getFunds() {
		
		// In reality we would be querying DB to get funds for accountNumber
		
		return funds;
	}
	
	public void makeDeposit(double amt) {
		funds += amt;
		System.out.println("Txn success. Current balance: INR " + funds);
	}

	public void makeWithdraw(double amt) {
		if(amt > getFunds()) {
			System.out.println("Txn failed. Insufficient funds. Balance: INR " + funds);
			return;
		}
		
		funds -= amt;
		System.out.println("Txn success. Current balance: INR " + funds);
	}
}
