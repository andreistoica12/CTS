package ro.ase.csie.cts.sem6.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
//		// DE EVITAT: constructorii default: putem uita sa initializam campuri importante (CNP etc.)
//		//1. construiesti obiectul
//		SuperErou superErou = new SuperErou();
//		//2. initializarea atributelor
//		superErou.nume = "Superman";
		
//		// DE EVITAT: ne pierdem printre parametrii constructorului, nu stim ce reprezinta
//		// error-prone daca se schimba responsabilul/daca responsabilul uita => greu de apelat
//		SuperErou superErou2 = 
//				new SuperErou("Batman", 100, false, false, new Arma(), null, null, null);
		
		// in clasa SuperErou, nu mai am setteri => nu vreau ca altii sa modifice campuri mai tarziu
		// => ii oblig sa adauge detaliile necesare la momentul crearii
		// dupa ce am creat obiectul, nu mai pot modifica atribute (sunt private)
		SuperErou superman = 
				new SuperErou.SuperErouBuilder("Superman", 100)
				.setArmaDreapta(new Arma())
				.setArmaStanga(new Arma())
				.build();
		
		SuperErou joker = 
				new SuperErou.SuperErouBuilder("Joker", 200)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.build();
		
		SuperErou joker2 = 
				new SuperErou.SuperErouBuilder("Joker", 200)
				.esteNegativ()
				.esteRanit()
				.setArmaDreapta(new Arma())
				.build();
		
		
	}

}
