package ro.ase.csie.cts.sem4;

import java.math.BigInteger;
import java.util.Random;

import ro.ase.csie.cts.sem4.banking.Bank;
import ro.ase.csie.cts.sem4.banking.BankAccount;
import ro.ase.csie.cts.sem4.banking.CreditBankAccount;
import ro.ase.csie.cts.sem4.banking.DebitBankAccount;
import ro.ase.csie.cts.sem4.banking.EmailNotificationService;
import ro.ase.csie.cts.sem4.banking.InsufficientFundsException;
import ro.ase.csie.cts.sem4.banking.NotificationService;
import ro.ase.csie.cts.sem4.banking.Person;
import ro.ase.csie.cts.sem4.banking.SMSNotificationService;
import ro.ase.csie.cts.sem4.singleton.Elvis;
import ro.ase.csie.cts.sem4.singleton.Elvis2;
import ro.ase.csie.cts.sem4.singleton.Elvis3;
import ro.ase.csie.cts.sem4.singleton.ElvisV2;

public class Main {

	public static void main(String[] args) {
		NotificationService emailService = new EmailNotificationService();
		NotificationService smsService = new SMSNotificationService();
		
		Person p3 = new Person("Van Damme");
		p3.setAge(60);
		p3.setEmail("van@damme.com");
		p3.setMobile("+40572583856");
		p3.setNotificationType(Person.NotificationType.EMAIL);
		
		

		CreditBankAccount b = CreditBankAccount.createCreditBankAccountWithBalance(emailService, "INGB12354534", p3, 100);
		
		CreditBankAccount b1 = CreditBankAccount.createCreditBankAccount(emailService, "RFZB42484", p3);
		
		BigInteger bi = new BigInteger(24, 11, new Random());
		BigInteger bi2 = BigInteger.probablePrime(12, new Random());
		
		Boolean value = Boolean.valueOf(false);
		
		b.deposit(50);
		
		System.out.println(b.toString());
		
		Elvis elvis = Elvis.theTrueElvis;		
		elvis.sing();
		
		Elvis2 elvis2 = Elvis2.getInstance();
		elvis2.sing();
		Elvis2 elvis22 = Elvis2.getInstance();
		
		System.out.println(elvis2 == elvis22);
		
		Elvis3 elvis3 = Elvis3.getInstance();
		elvis3.sing();
		
		ElvisV2 elvisV2 = ElvisV2.INSTANCE;
		elvisV2.sing();
		
		System.out.println("\n\n");
		
		Bank bank = Bank.getInstance();
		
		DebitBankAccount debit1 = bank.openDebitAccount(p3);
		
		debit1.deposit(20);
		try {
			debit1.withdraw(15);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(debit1);
		
		System.out.println("\n");
		
		Person major = new Person("major");
		major.setEmail("major@fee.com");
		major.setMobile("07424657524");
		major.setAge(45);
		major.setNotificationType(Person.NotificationType.EMAIL);
		
		Person minor = new Person("minor");
		minor.setEmail("minor@debit.com");
		minor.setMobile("0742444324");
		minor.setAge(15);
		minor.setNotificationType(Person.NotificationType.SMS);
		
		DebitBankAccount debitAdult = bank.openDebitAccount(major);
		DebitBankAccount debitCopil = bank.openDebitAccount(minor);

		debitAdult.deposit(20);
		debitCopil.deposit(5);
		try {
			debitAdult.withdraw(15);
			debitCopil.withdraw(3);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(debitAdult);
		System.out.println(debitCopil);

		
	}

}
