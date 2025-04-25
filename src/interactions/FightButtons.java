package interactions;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import defaultpackage.FightScreen3;
import defaultpackage.GameStart1;
import defaultpackage.Main;
import defaultpackage.SetThingsUp;

public class FightButtons {
	
	public static ChoiceHandler choiceHandler;
	
	public static JButton choice1 = new JButton();
	public static JButton choice2 = new JButton();
	public static JButton choice3 = new JButton();
	public static JButton choice4 = new JButton();
	
	public static void fightButtons() {
		choiceHandler = new FightButtons().new ChoiceHandler();
		choice1.setText("Attack");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(Main.normalFont);
		FightScreen3.choiceButtonPanel.add(choice1);
		choice1.addActionListener(choiceHandler);
				
		choice2.setText("Special");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(Main.normalFont);
		FightScreen3.choiceButtonPanel.add(choice2);
		choice2.addActionListener(choiceHandler);
				
		choice3.setText("Defend");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(Main.normalFont);
		FightScreen3.choiceButtonPanel.add(choice3);
		choice3.addActionListener(choiceHandler);
				
		choice4.setText("Inventory");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(Main.normalFont);
		FightScreen3.choiceButtonPanel.add(choice4);
		choice4.addActionListener(choiceHandler);
	}
public class ChoiceHandler implements ActionListener {
    	
		public void actionPerformed(ActionEvent event) {
			JButton source = (JButton) event.getSource();
			GameStart1.monsterAttackDelay = 0;
			SetThingsUp.checkStatusEffects();
			if (source == choice1) {
				System.out.println("Attack clicked");
				PlayerAttack.playerAttack();
				
			} else if (source == choice2) {
				System.out.println("Special clicked");
				choice1.removeActionListener(choiceHandler);
				choice2.removeActionListener(choiceHandler);
				choice3.removeActionListener(choiceHandler);
				choice4.removeActionListener(choiceHandler);
				SpecButtons.specButtons(SetThingsUp.player.getName());
				GameStart1.monsterAttackDelay++;
				GameStart1.choiceSum++;
			} else if (source == choice3 && GameStart1.choiceSum < 1) {
				System.out.println("Defend clicked");
				choice3.removeActionListener(choiceHandler);
				GameStart1.choiceSum++;
				SetThingsUp.player.setDef(SetThingsUp.player.getDef() + 10);
				SetThingsUp.player.setEvasion(SetThingsUp.player.getEvasion() + 5);
				SetThingsUp.setStats();
				FightScreen3.mainTextArea.append("You gained +10 Def points and 5% Evasion");
				
			} else if (source == choice4) {
				GameStart1.choiceSum--;
				FightScreen3.mainTextArea.append("Choice 4 clicked");
				System.out.println("Choice 4 clicked");
				
				}
			if (source == choice1 || source == choice3 || source == choice4) {
				if(GameStart1.choiceSum > 0) {
					System.out.println("Waiting for DEf: "+GameStart1.choiceSum);
					GameStart1.choiceSum--;
				} else {
					System.out.println("You can Defend cuz: "+GameStart1.choiceSum);
					choice3.addActionListener(choiceHandler);
					SetThingsUp.player.setEvasion(SetThingsUp.player2.getEvasion());
				}
			}
			
			if (GameStart1.monsterAttackDelay == 0) {
				EnemyAttack.monsterAttack();
			} else {
				GameStart1.monsterAttackDelay--;
			}
			Main.window.revalidate();
			Main.window.repaint();
		}
	}
}
