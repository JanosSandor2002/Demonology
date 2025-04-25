package interactions;

import defaultpackage.FightScreen3;
import defaultpackage.GameStart1;
import defaultpackage.SetThingsUp;

public class PlayerAttack {
	
	public static int strike = 10, blow = 15, huffpuff = 4, thaumatise = 6, mpDrain = 2, cure = 6, bleed = 10, blind = 8, fasten = 7;
	public static void playerAttack() {
		if(SetThingsUp.monster.getDef() > 0) {
			if(((int) (Math.random() * 100 + 1)) > SetThingsUp.monster.getEvasion() && ((int) (Math.random() * 100 + 1)) > GameStart1.playerBlindNum) {
				GameStart1.hitEnemy = true;
				SetThingsUp.monster.setDef(SetThingsUp.monster.getDef() - ((int) (SetThingsUp.player.getAttack() / 2)));
				System.out.println("Ur hit: "+((int) (SetThingsUp.player.getAttack() / 2)));
				if (SetThingsUp.monster.getDef() < 0) {
					SetThingsUp.monster.setHp(SetThingsUp.monster.getHp() + SetThingsUp.monster.getDef());
					SetThingsUp.monster.setDef(0);
					FightScreen3.mainTextArea.append("\nYou hit the Monster. Its Defence broke and It have yet "+SetThingsUp.monster.getHp()+"Hp left");
					} else {
						FightScreen3.mainTextArea.append("\nYou hit the Monster. It have yet "+SetThingsUp.monster.getDef()+"Def left");
				}
				SetThingsUp.setStats();
				} 
			else {
				FightScreen3.mainTextArea.append("\nYou missed");
			}
		}
	else {
		if(((int) (Math.random() * 100 + 1)) >= SetThingsUp.monster.getEvasion() && ((int) (Math.random() * 100 + 1)) > GameStart1.playerBlindNum) {
			GameStart1.hitEnemy = true;
			SetThingsUp.monster.setHp(SetThingsUp.monster.getHp() - SetThingsUp.player.getAttack());
			System.out.println("Ur hit: "+SetThingsUp.player.getAttack());
			if (SetThingsUp.monster.getHp() < 0) {
				SetThingsUp.monster.setHp(0);
			} else {
			FightScreen3.mainTextArea.append("\nYou hit the Monster. It have yet "+SetThingsUp.monster.getHp()+"Hp left");
			}
		}
	}
	SetThingsUp.setStats();
	}
}
