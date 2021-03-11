package ro.ase.csie.cts.sem3;

public interface Account {

	void withdraw(long amount) throws InsufficientFundsException;

	void deposit(long amount);

}