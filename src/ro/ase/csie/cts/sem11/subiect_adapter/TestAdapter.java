package ro.ase.csie.cts.sem11.subiect_adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		ContBancarDebit cont = new ContBancarDebit(100, "RO12");
		BankAccount account = new AdapterCont2Account(cont);
		
		// folosesc contul ca un BankAccount
		account.accountTransfer(new DebitAccount(), 50);
		
		System.out.println("Valoare in cont: " + cont.balanta);
		
	}

}
