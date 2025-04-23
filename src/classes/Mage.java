package classes;

import defaultpackage.Player;

public class Mage extends Player{

	public Mage(String name, int hp, int mp, int def, int evasion, int level, int attack) {
		super(name, hp, mp, def, evasion, level, attack);
		setSpecs(new String[] {"Thaumatise", "MP-Drain", "Cure"});
	}
}