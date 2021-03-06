package ro.ase.csie.cts.sem4.banking;

public class DebitBankAccount extends BankAccount implements Payable, Receivable, Transferable {
	

	public DebitBankAccount(NotificationService ns, String iban, Person person) {
		super(ns);
		this.iban = iban;
		this.accountHolder = person;
		balance = 0;
	}

	@Override
	public void withdraw(long amount) throws InsufficientFundsException {
		if (amount > balance)
			throw new InsufficientFundsException("Insufficient funds " + balance);
		notificationService.sendNotification(accountHolder, "Withdrawing " + amount + " from " + iban);
		balance -= amount;
	}

	@Override
	public void deposit(long amount) {
		notificationService.sendNotification(accountHolder, "Adding " + amount + " to " + iban);
		balance += amount;
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

	@Override
	public void transfer(Receivable destination, long amount) throws InsufficientFundsException {
		this.withdraw(amount);
		destination.deposit(amount);
	}

}
