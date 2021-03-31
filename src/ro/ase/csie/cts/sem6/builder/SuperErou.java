package ro.ase.csie.cts.sem6.builder;

public class SuperErou {
	
	private String nume;		// valoare implicita = null
	private int puncteViata;	// valoare implicita = 0
	
	private boolean esteNegativ;	// valoare implicita = false
	private boolean esteRanitGrav;
	
	private InterfataArma armaStanga;	// valoare implicita = null
	private InterfataArma armaDreapta;
	private InterfataSuperPutere superPutere;
	private InterfataSuperPutere superSuperPutere;
	
	private SuperErou() {
		
	}

	private SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga,
			InterfataArma armaDreapta, InterfataSuperPutere superPutere, InterfataSuperPutere superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteNegativ = esteNegativ;
		this.esteRanitGrav = esteRanitGrav;
		this.armaStanga = armaStanga;
		this.armaDreapta = armaDreapta;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}
	
	// fara static: clasa se comporta ca un membru al clasei SuperErou => am nevoie de un obiect creat
	public static class SuperErouBuilder {
		// in GoF, nu am referinta la obiect, ci am toate campurile trecute aici,
		// iar in build() apelez constructorul cu parametri
		
		SuperErou superErou;

		public SuperErouBuilder(String nume, int puncteViata) {
			//PAS 1: construiesc obiect gol
			this.superErou = new SuperErou();
			//PAS 2: initializez campurile obligatorii
			this.superErou.nume = nume;
			this.superErou.puncteViata = puncteViata;
		}
		
		public SuperErouBuilder esteNegativ() {
			this.superErou.esteNegativ = true;
			return this;
		}
		
		public SuperErouBuilder esteRanit() {
			this.superErou.esteRanitGrav = true;
			return this;
		}
		
		public SuperErouBuilder setArmaStanga(InterfataArma arma) {
			this.superErou.armaStanga = arma;
			return this;
		}
		
		public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
			this.superErou.armaDreapta = arma;
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere) {
			this.superErou.superPutere = superPutere;
			return this;
		}
		
		public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superSuperPutere) {
			this.superErou.superSuperPutere = superSuperPutere;
			return this;
		}
		
		public SuperErou build() {
			return this.superErou;
		}
		
		
		
		
	}
	
	
	
}
