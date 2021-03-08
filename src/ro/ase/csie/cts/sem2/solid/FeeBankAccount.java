package ro.ase.csie.cts.sem2.solid;

public class FeeBankAccount extends BankAccount {
	
	private long fee = 2;

	public FeeBankAccount(String iban, Person person) {
		super(iban, person);
	}
	
	@Override
	public void withdraw(long amount) throws InsufficientFundsException {
		System.out.println("Assign " + fee + " fee to withdrawal");
		super.withdraw(amount + 2);
	}
	
	

	

}
