package ro.ase.csie.cts.sem7.factorymethod;

import ro.ase.csie.cts.sem7.simplefactory.CaracterDCComics;
import ro.ase.csie.cts.sem7.simplefactory.CaracterDisney;
import ro.ase.csie.cts.sem7.simplefactory.CaracterMarvel;
import ro.ase.csie.cts.sem7.simplefactory.SuperErouAbstract;
import ro.ase.csie.cts.sem7.simplefactory.TipErou;

public class FactoryTemaFantasy extends FactoryAbstract {

	@Override
	public SuperErouAbstract getSuperErou(TipErou tip, String nume) {
		SuperErouAbstract superErou = null;
		switch(tip) {
		case DISNEY:
			superErou = new CaracterFanatasyDisney(nume, 100);
			break;
		case MARVEL:
			superErou = new CaracterFantasyMarvel(nume, 500);
			break;
		case DC:
			superErou = new CaracterFantasyDCComics(nume, 500);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return superErou;
	}

}
