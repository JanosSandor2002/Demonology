package defaultpackage;

public class Monster {
	private String name;
	private int hp, mp, def, evasion, level, attack, exp;
	
	public Monster(String name, int hp, int mp, int def, int evasion, int level, int attack, int exp) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.def = def;
		this.evasion = evasion;
		this.level = level;
		this.attack = attack;
		this.exp = exp;
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getEvasion() {
		return evasion;
	}
	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Monster [name=" + name + ", hp=" + hp + ", mp=" + mp + ", def=" + def + ", evasion=" + evasion
				+ ", level=" + level + ", attack=" + attack + ", exp=" + exp + "]";
	}
	
}
