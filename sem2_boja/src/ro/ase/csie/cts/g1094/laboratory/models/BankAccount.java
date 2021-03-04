package ro.ase.csie.cts.g1094.laboratory.models;

import ro.ase.csie.cts.g1094.laboratory.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1094.laboratory.exceptions.InsufficientFundsException;

public class BankAccount extends Account {
	protected double balance;
	protected String iban;
	
	public BankAccount(String iban, double balance) {
		this.iban = iban;
		this.balance = balance;
	}

	@Override
	public Object getBalance() {
		return this.balance;
	}

	@Override
	public void deposit(Double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(Double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
