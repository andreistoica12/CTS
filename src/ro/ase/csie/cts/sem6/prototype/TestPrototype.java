package ro.ase.csie.cts.sem6.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		// trec prin aceiasi pasi => REDUNDANT
		Model3DCaracter superman1 = new Model3DCaracter("albastru");
//		Model3DCaracter superman2 = new Model3DCaracter("albastru");
		
		Model3DCaracter superman2 = (Model3DCaracter) superman1.clone();
	}

}
