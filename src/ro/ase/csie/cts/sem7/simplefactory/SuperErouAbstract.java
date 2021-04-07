package ro.ase.csie.cts.sem7.simplefactory;

public abstract class SuperErouAbstract {
	String nume;
	int puncteViata;
	
	public SuperErouAbstract(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}

	public void setPuncteViata(int puncteViata) {
		this.puncteViata = puncteViata;
	}

	public abstract void seDeplaseaza();
}
