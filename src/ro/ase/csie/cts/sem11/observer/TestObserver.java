package ro.ase.csie.cts.sem11.observer;

public class TestObserver {

	public static void main(String[] args) {
		
		ModulConexiuneInternet modulConexiune = new ModulConexiuneInternet();
		
		ModulAutoSalvare modulSalvare = new ModulAutoSalvare();
		ModulNotificareJucator modulNotificari = new ModulNotificareJucator();
		
		modulConexiune.registerModul(modulNotificari);
		modulConexiune.registerModul(modulSalvare);
		
		modulConexiune.pierdereConexiune();
		
		modulConexiune.unregisterModul(modulSalvare);
		
		modulConexiune.pierdereConexiune();
		
	}

}
