package defaultpackage;

public class Player {
	private String name;
	private int hp, mp, def, evasion, level, attack, exp;
	private String[] specs;
	
	public Player(String name, int hp, int mp, int def, int evasion, int level, int attack) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.def = def;
		this.evasion = evasion;
		this.level = level;
		this.attack = attack;
		this.exp = 0;
		this.specs = new String[3];
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
	public String[] getSpecs() {
		return specs;
	}
	public void setSpecs(String[] specs) {
		this.specs = specs;
	}
	//ToString
	@Override
	public String toString() {
		return "Player [name=" + name + ", hp=" + hp + ", mp=" + mp + ", def=" + def + ", evasion=" + evasion
				+ ", level=" + level + ", attack=" + attack + ", exp=" + exp + "]";
	}
}
