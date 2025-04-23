package classes;

import defaultpackage.Player;

public class Thief extends Player{

	public Thief(String name, int hp, int mp, int def, int evasion, int level, int attack) {
		super(name, hp, mp, def, evasion, level, attack);
		setSpecs(new String[] {"Bleed", "Blind", "Fasten"});
	}
}