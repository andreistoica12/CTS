package ro.ase.csie.cts.sem11.subiect_adapter;

public interface ContBancar {
	public void transfer(ContBancar destinatie, double suma);
	public void depune(double suma);
}
