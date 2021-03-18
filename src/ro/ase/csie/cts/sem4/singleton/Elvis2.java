package ro.ase.csie.cts.sem4.singleton;

public class Elvis2 {
	private final static Elvis2 theTrueElvis2 = new Elvis2();
	
	public static Elvis2 getInstance() {
		return theTrueElvis2;
	}
	
	private Elvis2() {
		
	}
	
	public void sing() {
		System.out.println("Elvis2 is singing");
	}
}
