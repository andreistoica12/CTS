package ro.ase.csie.cts.sem7.simplefactory;

public class FactorySuperErou {
	
	// static => nu se justifica sa instantiez un FactorySuperErou pentru a apela metoda 
	public static SuperErouAbstract getSuperErou(TipErou tip, String nume) {
		SuperErouAbstract superErou = null;
		switch(tip) {
		case DISNEY:
			superErou = new CaracterDisney(nume, 100, false);
			break;
		case MARVEL:
			superErou = new CaracterMarvel(nume, 500, 0);
			break;
		case DC:
			superErou = new CaracterDCComics(nume, 500, 100);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return superErou;
	}
	
}
