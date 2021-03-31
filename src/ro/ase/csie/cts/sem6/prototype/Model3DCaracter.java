package ro.ase.csie.cts.sem6.prototype;

import java.util.ArrayList;
import java.util.Random;

// nu e obligatoriu sa pun Cloneable, fiindca metoda clone() exista deja in Object
// (orice clasa extinde Object, deci avem deja clone(), insa trebuie sa o suprascriem
public class Model3DCaracter implements Cloneable {
	
	String culoare;
	int inaltime;
	
	// PROTOTYPE = creez obiect nou, dar nu mai trec prin operatiile de creere (castig timp)
	
	// Colectii: EAGER !!
	ArrayList<Integer> puncte = new ArrayList<>();
	
	public Model3DCaracter(String culoare) {
		this.culoare = culoare;
		
		System.out.println("Incarcare model 3D din fisier .....");
		try {
			Thread.sleep(2000);
			
			Random random = new Random(10);
			for(int i = 0; i < 20; i++) {
				this.puncte.add(random.nextInt(1000));
			}
			
			System.out.println("Model 3D generat");
			
		} catch (InterruptedException e) {

		}
	}
	
	// am nevoie de constructorul default private
	// => il pastrez pentru a avea un container in care sa pun viitori valori
	private Model3DCaracter() {
		
	}

	// DEEP-COPY
	@Override
	public Object clone() throws CloneNotSupportedException {
		// GRESIT : apelez acelasi constructor costisitor (astept din nou 2 secunde)
//		Model3DCaracter copie = new Model3DCaracter(this.culoare);
		
		Model3DCaracter copie = new Model3DCaracter();
		copie.culoare = this.culoare;
		copie.inaltime = this.inaltime;
		copie.puncte = (ArrayList<Integer>) this.puncte.clone();
		return copie;
	}
	
	
	
}
