package ro.ase.csie.cts.sem3;

public interface Payable {
	void withdraw(long amount) throws InsufficientFundsException;
}
