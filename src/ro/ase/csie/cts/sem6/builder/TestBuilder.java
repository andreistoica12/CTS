package ro.ase.csie.cts.sem6.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		// DE EVITAT: constructorii default: putem uita sa initializam campuri importante (CNP etc.)
		//1. construiesti obiectul
		SuperErou superErou = new SuperErou();
		//2. initializarea atributelor
		superErou.nume = "Superman";
		
		// DE EVITAT: ne pierdem printre parametrii constructorului, nu stim ce reprezinta
		// error-prone daca se schimba responsabilul/daca responsabilul uita => greu de apelat
		SuperErou superErou2 = 
				new SuperErou("Batman", 100, false, false, new Arma(), null, null, null);
		
	}

}
