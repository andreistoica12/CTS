package ro.ase.csie.cts.sem2.solid;

public class BankAccount {
	private String iban;
	private long balance;
	
	private Person accountHolder;
	
	public BankAccount(String iban, Person person) {
		this.iban = iban;
		this.accountHolder = person;
		this.balance = 0;
	}
	
	public void withdraw(long amount) {
		System.out.println("withdrawing " + amount + " from " + iban);
		this.balance -= amount;
	}
	
	public void deposit(long amount) {
		this.balance += amount;
	}

	public String getIban() {
		return iban;
	}

	public long getBalance() {
		return balance;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}
	
	
	
}
