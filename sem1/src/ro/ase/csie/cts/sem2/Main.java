package ro.ase.csie.cts.sem2;

import java.math.BigDecimal;

import ro.ase.csie.cts.sem2.solid.BankAccount;
import ro.ase.csie.cts.sem2.solid.Person;

public class Main {
	public static void main(String args[]) {
//		CalendarUtil cu = new CalendarUtil();
//		
//		double d1 = 1.02;
//		double d2 = 0.43;
//		
//		BigDecimal bd1 = new BigDecimal("1.02");
//		BigDecimal bd2 = new BigDecimal("0.43");
//		
//		System.out.println(d1 - d2);
//		
//		try {
//			System.out.println(cu.weekDay(4));
//			System.out.println(cu.weekDay2(3));
//			System.out.println(cu.weekDay3(2));
//			System.out.println(cu.weekDay4(2));
//
//
//		} catch (IncorrectDayException e) {
//			System.out.println(e.getMessage());
//		}
		
		Person p = new Person("Andrei");
		BankAccount account = new BankAccount("INGB12341234", p);

	}
}
