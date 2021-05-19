package ro.ase.csie.cts.sem12.testare.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.sem12.testare.exceptii.ExceptieImpartireLaZero;
import ro.ase.csie.cts.sem12.testare.modele.OperatiiMatematice;

public class TestOperatiiMatematice {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Salut");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("La revedere");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Pregatire test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Stergere resurse folosite");
	}

	@Test
	public void test() {
//		System.out.println("Test de test");
		fail("Not yet implemented");
	}

	@Test
	public void testAdunaValoriPozitive() {
//		System.out.println("Test aduna()");
		int a = 5;
		int b = 5;
		int rezultatAsteptat = 10;
		int rezultatCalculat = OperatiiMatematice.aduna(a, b);

		assertEquals("Suma cu numere pozitive", rezultatAsteptat, rezultatCalculat);
	}

//	@Test
//	public void testImpartireValoriPozitive() throws ExceptieImpartireLaZero {
//		int a = 1;
//		int b = 2;
//		double rezultatAsteptat = 0.5;
//		
//		double rezultatCalculat = OperatiiMatematice.impartire(a, b);
//		
//		assertEquals("Impartire 1/2", rezultatAsteptat, rezultatCalculat);
//	}

	@Test
	public void testImpartireValoriPozitive() {
		int a = 1;
		int b = 2;
		double rezultatAsteptat = 0.5;

		double rezultatCalculat = 0;
		try {
			rezultatCalculat = OperatiiMatematice.impartire(a, b);
		} catch (ExceptieImpartireLaZero e) {
			fail("Am primit exceptie, desi nu trebuia");
		}


		// ultimul parametru (delta) e diferenta (marja de eroare) intre rezultatul asteptat si rezultatul obtinut
		// pot aparea probleme la impartirea numerelor in virgula mobila
		// calculatorul nu stie sa stocheze numere in virgula mobila
		assertEquals("Impartire 1/2", rezultatAsteptat, rezultatCalculat, 0);
		
		
		
		// CHESTII EXTRA
		float vb = (float) 1 / 3 + (float) 1 / 3 + (float) 1 / 3;
		if(vb == 1) {
			// nu intra niciodata aici
			System.out.println("Sunt egale");
		}

	}

}
