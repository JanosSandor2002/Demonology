package classes;

import defaultpackage.Player;

public class Warrior extends Player{

	public Warrior(String name, int hp, int mp, int def, int evasion, int level, int attack) {
		super(name, hp, mp, def, evasion, level, attack);
		setSpecs(new String[] {"Strike", "Blow", "Huff-Puff"});
	}
}
