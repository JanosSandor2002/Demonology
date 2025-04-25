package interactions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import defaultpackage.FightScreen3;
import defaultpackage.GameStart1;
import defaultpackage.Main;
import defaultpackage.SetThingsUp;

public class SpecButtons {
	
	public static SpecChoiceHandler specChoiceHandler;
	
	public static void specButtons(String name) {
		specChoiceHandler = new SpecButtons().new SpecChoiceHandler();
		switch(name) {
		case "Warrior":
			FightButtons.choice1.setText("Strike - "+PlayerAttack.strike+"MP");
			if (SetThingsUp.player.getMp() >= PlayerAttack.strike) {
				FightButtons.choice1.addActionListener(specChoiceHandler);
			}
			FightButtons.choice2.setText("Blow - "+PlayerAttack.blow+"MP");
			if (SetThingsUp.player.getMp() >= PlayerAttack.blow) {
				FightButtons.choice2.addActionListener(specChoiceHandler);
			}
			FightButtons.choice3.setText("Huff-Puff - "+PlayerAttack.huffpuff+"MP");
			if (SetThingsUp.player.getMp() >= PlayerAttack.huffpuff) {
				FightButtons.choice3.addActionListener(specChoiceHandler);
			}
			FightButtons.choice4.setText("Back");
			System.out.println("Go Back");
			break;
		case "Mage":
			FightButtons.choice1.setText("Thaumatise - "+PlayerAttack.thaumatise+"MP");
			if (SetThingsUp.player.getMp() >= PlayerAttack.thaumatise) {
				FightButtons.choice1.addActionListener(specChoiceHandler);
			}
			FightButtons.choice2.setText("MP-Drain - "+PlayerAttack.mpDrain+"MP");
			if (SetThingsUp.player.getMp() >= PlayerAttack.mpDrain) {
				FightButtons.choice2.addActionListener(specChoiceHandler);
			}
			FightButtons.choice3.setText("Cure - "+PlayerAttack.cure+"MP");
			if (SetThingsUp.player.getMp() >= PlayerAttack.cure) {
				FightButtons.choice3.addActionListener(specChoiceHandler);
			}
			FightButtons.choice4.setText("Back");
			System.out.println("Go Back");
			break;
		case "Thief":
			FightButtons.choice1.setText("Bleed - "+PlayerAttack.bleed+"MP");
			if (SetThingsUp.player.getMp() >= PlayerAttack.bleed) {
				FightButtons.choice1.addActionListener(specChoiceHandler);
			}
			FightButtons.choice2.setText("Blind - "+PlayerAttack.blind+"MP");
			if (SetThingsUp.player.getMp() >= PlayerAttack.blind) {
				FightButtons.choice2.addActionListener(specChoiceHandler);
			}
			FightButtons.choice3.setText("Fasten - "+PlayerAttack.fasten+"MP");
			if (SetThingsUp.player.getMp() >= PlayerAttack.fasten) {
				FightButtons.choice3.addActionListener(specChoiceHandler);
			}
			FightButtons.choice4.setText("Back");
			break;
		}
		FightButtons.choice4.addActionListener(specChoiceHandler);
		System.out.println("SpecChoice opened");
	}
	
	public class SpecChoiceHandler implements ActionListener {	
	
		public void actionPerformed(ActionEvent event) {
			JButton source = (JButton) event.getSource();
			switch(SetThingsUp.player.getName()) {
			case "Warrior":
				if (source == FightButtons.choice1 && SetThingsUp.player.getMp() >= PlayerAttack.strike) {
					System.out.println("Strike clicked");
					SetThingsUp.player.setAttack((int) (SetThingsUp.player.getAttack() * 1.3));
					PlayerAttack.playerAttack();
					SetThingsUp.player.setMp(SetThingsUp.player.getMp() - PlayerAttack.strike);
					SetThingsUp.player.setAttack(SetThingsUp.player2.getAttack());
					EnemyAttack.monsterAttack();
					
				} else if (source == FightButtons.choice2 && SetThingsUp.player.getMp() >= PlayerAttack.blow) {
					System.out.println("Blow clicked");
					if(SetThingsUp.monster.getDef() > 0) {
						SetThingsUp.player.setAttack((int) (SetThingsUp.player.getAttack() * 2.7));
					} else {
						SetThingsUp.player.setAttack((int) (SetThingsUp.player.getAttack() * 1.1));
					}
					PlayerAttack.playerAttack();
					SetThingsUp.player.setMp(SetThingsUp.player.getMp() - PlayerAttack.blow);
					SetThingsUp.player.setAttack(SetThingsUp.player2.getAttack());
					EnemyAttack.monsterAttack();
					
				} else if (source == FightButtons.choice3 && SetThingsUp.player.getMp() >= PlayerAttack.huffpuff) {
					System.out.println("Huff-Puff clicked");
					int a = (int) ((Math.random() * 20) + 40);
					System.out.println(a);
					SetThingsUp.player.setHp(SetThingsUp.player.getHp() + a);
					FightScreen3.mainTextArea.append("U healed "+a+"HP!");
					SetThingsUp.player.setMp(SetThingsUp.player.getMp() - PlayerAttack.huffpuff);
					EnemyAttack.monsterAttack();
					
				} else if (source == FightButtons.choice4) {
					System.out.println("Back clicked");
					GameStart1.monsterAttackDelay++;
				}
				break;
			case "Mage":
				if (source == FightButtons.choice1 && SetThingsUp.player.getMp() >= PlayerAttack.thaumatise) {
					System.out.println("Thaumatise clicked");
					SetThingsUp.player.setAttack((int) (SetThingsUp.player.getAttack() * 8.45));
					PlayerAttack.playerAttack();
					
					SetThingsUp.player.setMp(SetThingsUp.player.getMp() - PlayerAttack.thaumatise);
					SetThingsUp.player.setAttack(SetThingsUp.player2.getAttack());
					EnemyAttack.monsterAttack();
				
				} else if (source == FightButtons.choice2 && SetThingsUp.player.getMp() >= PlayerAttack.mpDrain) {
					System.out.println("MP-DRAIN clicked");
					SetThingsUp.player.setAttack((int) (SetThingsUp.player.getAttack() * 1.3));
					PlayerAttack.playerAttack();
					SetThingsUp.player.setMp(SetThingsUp.player.getMp() - PlayerAttack.mpDrain);
					if (GameStart1.hitEnemy == true) {
						SetThingsUp.player.setMp(SetThingsUp.player.getMp() + SetThingsUp.player.getAttack());
						GameStart1.hitEnemy = false;
					}
					SetThingsUp.player.setAttack(SetThingsUp.player2.getAttack());
					EnemyAttack.monsterAttack();
					
				} else if (source == FightButtons.choice3 && SetThingsUp.player.getMp() >= PlayerAttack.cure) {
					System.out.println("Cure clicked");
					int a = (int) ((Math.random() * 35) + 53);
					SetThingsUp.player.setHp(SetThingsUp.player.getHp() + a);
					FightScreen3.mainTextArea.append("U healed "+a+"HP!");
					SetThingsUp.player.setMp(SetThingsUp.player.getMp() - PlayerAttack.cure);
					EnemyAttack.monsterAttack();

				} else if (source == FightButtons.choice4) {
					System.out.println("Back clicked");
					GameStart1.monsterAttackDelay++;
					}
				break;
			case "Thief":
				if (source == FightButtons.choice1 && SetThingsUp.player.getMp() >= PlayerAttack.bleed) {
					System.out.println("Bleed clicked");
					SetThingsUp.player.setAttack((int) (SetThingsUp.player.getAttack() * 1.3));
					PlayerAttack.playerAttack();
					SetThingsUp.player.setMp(SetThingsUp.player.getMp() - PlayerAttack.bleed);
					SetThingsUp.player.setAttack(SetThingsUp.player2.getAttack());
					if(GameStart1.hitEnemy == true){
						GameStart1.enemyBleed = true;
						GameStart1.enemyBleedNum = (int) (SetThingsUp.player.getAttack() * 0.6);
						FightScreen3.mainTextArea.append("Enemy is bleeding");
						GameStart1.hitEnemy = false;
					}
					EnemyAttack.monsterAttack();
					
				} else if (source == FightButtons.choice2 && SetThingsUp.player.getMp() >= PlayerAttack.blind) {
					System.out.println("Blind clicked");
					SetThingsUp.player.setAttack((int) (SetThingsUp.player.getAttack() * 0.95));
					PlayerAttack.playerAttack();
					SetThingsUp.player.setMp(SetThingsUp.player.getMp() - PlayerAttack.blind);
					if (GameStart1.hitEnemy == true) {
						FightScreen3.mainTextArea.append("Enemy got blinded");
						GameStart1.hitEnemy = false;
					}
					SetThingsUp.player.setAttack(SetThingsUp.player2.getAttack());
					EnemyAttack.monsterAttack();
					
				} else if (source == FightButtons.choice3 && SetThingsUp.player.getMp() >= PlayerAttack.fasten) {
					System.out.println("Fasten clicked");
					int a = 10;
					SetThingsUp.player.setEvasion(SetThingsUp.player.getEvasion() + a);
					FightScreen3.mainTextArea.append("U gained "+a+"EVASION!");
					SetThingsUp.player.setMp(SetThingsUp.player.getMp() - PlayerAttack.fasten);
					GameStart1.thiefEvasionUseTurn = 4;
					GameStart1.thiefEvasionUse += 5;
					EnemyAttack.monsterAttack();
					GameStart1.thiefEvasionUse--;

				} else if (source == FightButtons.choice4) {
					System.out.println("Back clicked");
					GameStart1.choiceSum++;
					GameStart1.monsterAttackDelay++;
				}
				break;
			}
			if(GameStart1.thiefEvasionUse > 0){
				GameStart1.thiefEvasionUse--;
			}
			if(GameStart1.thiefEvasionUseTurn > 0){
				GameStart1.thiefEvasionUseTurn--;
			}
			resetChoiceButtons();
			SetThingsUp.setStats();
			Main.window.revalidate();
			Main.window.repaint();
		}
		private void resetChoiceButtons() {
			FightButtons.choice1.removeActionListener(specChoiceHandler);
			FightButtons.choice2.removeActionListener(specChoiceHandler);
			FightButtons.choice3.removeActionListener(specChoiceHandler);
			FightButtons.choice4.removeActionListener(specChoiceHandler);

			FightButtons.choice1.addActionListener(FightButtons.choiceHandler);
			FightButtons.choice2.addActionListener(FightButtons.choiceHandler);
			FightButtons.choice3.addActionListener(FightButtons.choiceHandler);
			FightButtons.choice4.addActionListener(FightButtons.choiceHandler);

			FightButtons.choice1.setText("Attack");
			FightButtons.choice2.setText("Special");
			FightButtons.choice3.setText("Defend");
			FightButtons.choice4.setText("Inventory");
	    }
	}
}
