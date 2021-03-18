package ro.ase.csie.cts.sem4.singleton;

public class Elvis3 {
	private static Elvis3 theTrueElvis3;
	
	private Elvis3() {
		
	}
	
	public static Elvis3 getInstance() {
//		synchronized (Elvis.class) {
//			if(theTrueElvis3 == null) {
//				theTrueElvis3 = new Elvis3();			
//			}
//			return theTrueElvis3;
//		}
		
		if(theTrueElvis3 == null) {
			theTrueElvis3 = new Elvis3();			
		}
		return theTrueElvis3;
	}
	

	
	public void sing() {
		System.out.println("Elvis3 is singing");
	}
}
