package ro.ase.csie.cts.sem4;

import java.math.BigInteger;
import java.util.Random;

import ro.ase.csie.cts.sem4.banking.BankAccount;
import ro.ase.csie.cts.sem4.banking.CreditBankAccount;
import ro.ase.csie.cts.sem4.banking.DebitBankAccount;
import ro.ase.csie.cts.sem4.banking.EmailNotificationService;
import ro.ase.csie.cts.sem4.banking.NotificationService;
import ro.ase.csie.cts.sem4.banking.Person;

public class Main {

	public static void main(String[] args) {
		NotificationService emailService = new EmailNotificationService();
		
		Person p3 = new Person("Van Damme");
		p3.setEmail("van@damme.com");
		p3.setMobile("+40572583856");
		
		

		CreditBankAccount b = CreditBankAccount.createCreditBankAccountWithBalance(emailService, "INGB12354534", p3, 100);
		
		CreditBankAccount b1 = CreditBankAccount.createCreditBankAccount(emailService, "RFZB42484", p3);
		
		BigInteger bi = new BigInteger(24, 11, new Random());
		BigInteger bi2 = BigInteger.probablePrime(12, new Random());
		
		Boolean value = Boolean.valueOf(false);
		
		b.deposit(50);
		
		System.out.println(b.toString());
	}

}
