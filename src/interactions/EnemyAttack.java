package interactions;

import defaultpackage.FightScreen3;
import defaultpackage.GameStart1;
import defaultpackage.SetThingsUp;

public class EnemyAttack {
	public static void monsterAttack() {
		if(SetThingsUp.player.getDef() > 0) {
			if(((int) (Math.random() * 100 + 1)) >= SetThingsUp.player.getEvasion() && ((int) (Math.random() * 100 + 1)) > GameStart1.enemyBlindNum) {
				SetThingsUp.player.setDef(SetThingsUp.player.getDef() - ((int) (SetThingsUp.monster.getAttack() / 2)));
				System.out.println("Enemy hit: "+SetThingsUp.monster.getAttack());
				if (SetThingsUp.player.getDef() < 0) {
					SetThingsUp.player.setHp(SetThingsUp.player.getHp() + SetThingsUp.player.getDef());
					SetThingsUp.player.setDef(0);
					FightScreen3.mainTextArea.append("\nIt hit you. Your Defence broke and You have yet "+SetThingsUp.player.getHp()+"Hp left");
					} else {
						FightScreen3.mainTextArea.append("\nIt hit You. You have yet "+SetThingsUp.player.getDef()+"Def left");
					}
				} 
			else {
				FightScreen3.mainTextArea.append("\nIt missed");
			}
		}
		else {
			if(((int) (Math.random() * 100 + 1)) >= SetThingsUp.player.getEvasion()) {
				SetThingsUp.player.setHp(SetThingsUp.player.getHp() - SetThingsUp.monster.getAttack());
				System.out.println("Enemy hit: "+SetThingsUp.monster.getAttack());
				if (SetThingsUp.player.getHp() < 0) {
					SetThingsUp.player.setHp(0);
				} 
				else {
					FightScreen3.mainTextArea.append("\nIt hit You. You have yet "+SetThingsUp.player.getHp()+"Hp left");
				}
			} 
			else {
				FightScreen3.mainTextArea.append("\nIt missed");
		}
	}
	SetThingsUp.setStats();
	}
}
