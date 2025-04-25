package defaultpackage;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import interactions.FightButtons;

public class FightScreen3 {
	
	static JPanel mainTextPanel = new JPanel();
	
	public static JTextArea mainTextArea = new JTextArea();
	
	public static void fightScreen() {
		//setPlayer
		if (GameStart1.playerSetted == false) {	
			if(ClassScreen2.playerName == "Warrior") {
				SetThingsUp.setPlayer(Main.Warrior);
			} else if(ClassScreen2.playerName == "Mage") {
				SetThingsUp.setPlayer(Main.Mage);
			} else {
				SetThingsUp.setPlayer(Main.Thief);
			}
			GameStart1.playerSetted = true;
		}
		//setenemy
		if (GameStart1.size  < 13) {
			SetThingsUp.setEnemy();
		//panels
			fightPanels();
		//labels
			fightLabels();
		//textareas
			mainTextArea.setText("You came across a "+SetThingsUp.monster.getName()+"!");
			mainTextArea.setBounds(0, 0, 400, 300);
			mainTextArea.setBackground(Color.gray);
			mainTextArea.setForeground(Color.red);
			mainTextArea.setFont(Main.normalFont);
			mainTextArea.setLineWrap(true);
			mainTextPanel.add(mainTextArea);
		//buttons
			FightButtons.fightButtons();
		//setStats
			SetThingsUp.setStats();
		//refresh
			Main.window.revalidate();
			Main.window.repaint();
		} else {
			SetThingsUp.player.setHp(0);
			SetThingsUp.monster.setHp(2);
			SetThingsUp.setStats();
			//System.exit(0);
			//backToMainScreen();
		}
		
		
	}
	
	static JPanel picturePanel = new JPanel(); 
	public static JPanel choiceButtonPanel = new JPanel();
	static JPanel playerPanel = new JPanel();
	static JPanel enemyPanel = new JPanel();
	static JPanel enemyNamePanel = new JPanel();
	static JPanel playerNamePanel = new JPanel();
	
	public static void fightPanels() {
		enemyNamePanel.setBounds(580, 300, 200, 40);
		enemyNamePanel.setBackground(Color.blue);
		enemyNamePanel.setVisible(true);
		
		//playerNamePanel = new JPanel();
		playerNamePanel.setBounds(20, 300, 200, 40);
		playerNamePanel.setBackground(Color.blue);
		playerNamePanel.setVisible(true);
		
		//picturePanel = new JPanel();
		picturePanel.setBounds(400, 0, 400, 300);
		picturePanel.setBackground(Color.cyan);
		picturePanel.setVisible(true);
		
		//mainTextPanel = new JPanel();
		mainTextPanel.setBounds(0, 0, 400, 300);
		mainTextPanel.setBackground(Color.red);
		mainTextPanel.setVisible(true);
		
		//choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 350, 300, 150);
		choiceButtonPanel.setBackground(Color.blue);
		choiceButtonPanel.setLayout(new GridLayout(4, 1));
		choiceButtonPanel.setVisible(true);
		
		//enemyPanel = new JPanel();
		enemyPanel.setBounds(560, 340, 215, 160);
		enemyPanel.setBackground(Color.green);
		enemyPanel.setLayout(new GridLayout(5, 2));
		enemyPanel.setVisible(true);
		
		//playerPanel = new JPanel();
		playerPanel.setBounds(0, 340, 200, 160);
		playerPanel.setBackground(Color.green);
		playerPanel.setLayout(new GridLayout(5, 2));
		playerPanel.setVisible(true);
	}
	
	static JLabel hpLabel = new JLabel();
	static JLabel hpLabelNumber = new JLabel();
	static JLabel mpLabel = new JLabel();
	static JLabel mpLabelNumber = new JLabel();
	static JLabel defLabel = new JLabel();
	static JLabel defLabelNumber = new JLabel();
	static JLabel evasionLabel = new JLabel();
	static JLabel evasionLabelNumber = new JLabel();
	static JLabel hpLabel2 = new JLabel();
	static JLabel hpLabelNumber2 = new JLabel();
	static JLabel mpLabel2 = new JLabel();
	static JLabel mpLabelNumber2 = new JLabel();
	static JLabel defLabel2 = new JLabel();
	static JLabel defLabelNumber2 = new JLabel();
	static JLabel evasionLabel2 = new JLabel();
	static JLabel evasionLabelNumber2 = new JLabel();
	static JLabel playerNameLabel = new JLabel();
	static JLabel enemyNameLabel = new JLabel();
	static JLabel attackLabel = new JLabel();
	static JLabel attackLabelNumber = new JLabel();
	static JLabel attackLabel2 = new JLabel();
	static JLabel attackLabelNumber2 = new JLabel();
    
	public static void fightLabels() {
		playerNameLabel.setText(SetThingsUp.player.getName());
		playerNameLabel.setFont(Main.normalFont);
		playerNameLabel.setForeground(Color.red);
		playerNamePanel.add(playerNameLabel);
		
		hpLabel.setText("HP:");
		hpLabel.setFont(Main.normalFont);
		hpLabel.setForeground(Color.blue);
		playerPanel.add(hpLabel);
		
		hpLabelNumber.setFont(Main.normalFont);
		hpLabelNumber.setForeground(Color.blue);
		playerPanel.add(hpLabelNumber);
		
		mpLabel.setText("MP:");
		mpLabel.setFont(Main.normalFont);
		mpLabel.setForeground(Color.blue);
		playerPanel.add(mpLabel);
		
		mpLabelNumber.setFont(Main.normalFont);
		mpLabelNumber.setForeground(Color.blue);
		playerPanel.add(mpLabelNumber);
		
		defLabel.setText("DEF:");
		defLabel.setFont(Main.normalFont);
		defLabel.setForeground(Color.blue);
		playerPanel.add(defLabel);
		
		defLabelNumber.setFont(Main.normalFont);
		defLabelNumber.setForeground(Color.blue);
		playerPanel.add(defLabelNumber);
		
		evasionLabel.setText("EVA:");
		evasionLabel.setFont(Main.normalFont);
		evasionLabel.setForeground(Color.blue);
		playerPanel.add(evasionLabel);
		
		evasionLabelNumber.setFont(Main.normalFont);
		evasionLabelNumber.setForeground(Color.blue);
		playerPanel.add(evasionLabelNumber);
		
		attackLabel.setText("ATK:");
		attackLabel.setFont(Main.normalFont);
		attackLabel.setForeground(Color.blue);
		playerPanel.add(attackLabel);
		
		attackLabelNumber.setFont(Main.normalFont);
		attackLabelNumber.setForeground(Color.blue);
		playerPanel.add(attackLabelNumber);
		//monsterlabels
		enemyNameLabel.setText(SetThingsUp.monster.getName());
		enemyNameLabel.setFont(Main.normalFont);
		enemyNameLabel.setForeground(Color.red);
		enemyNamePanel.add(enemyNameLabel);
		
		hpLabel2.setText("HP:");
		hpLabel2.setFont(Main.normalFont);
		hpLabel2.setForeground(Color.blue);
		enemyPanel.add(hpLabel2);
		
		hpLabelNumber2.setFont(Main.normalFont);
		hpLabelNumber2.setForeground(Color.blue);
		enemyPanel.add(hpLabelNumber2);
		
		mpLabel2.setText("MP:");
		mpLabel2.setFont(Main.normalFont);
		mpLabel2.setForeground(Color.blue);
		enemyPanel.add(mpLabel2);
		
		mpLabelNumber2.setFont(Main.normalFont);
		mpLabelNumber2.setForeground(Color.blue);
		enemyPanel.add(mpLabelNumber2);
		
		defLabel2.setText("DEF:");
		defLabel2.setFont(Main.normalFont);
		defLabel2.setForeground(Color.blue);
		enemyPanel.add(defLabel2);
		
		defLabelNumber2.setFont(Main.normalFont);
		defLabelNumber2.setForeground(Color.blue);
		enemyPanel.add(defLabelNumber2);
		
		evasionLabel2.setText("EVA:");
		evasionLabel2.setFont(Main.normalFont);
		evasionLabel2.setForeground(Color.blue);
		enemyPanel.add(evasionLabel2);
		
		evasionLabelNumber2.setFont(Main.normalFont);
		evasionLabelNumber2.setForeground(Color.blue);
		enemyPanel.add(evasionLabelNumber2);
		
		attackLabel2.setText("ATK:");
		attackLabel2.setFont(Main.normalFont);
		attackLabel2.setForeground(Color.blue);
		enemyPanel.add(attackLabel2);
		
		attackLabelNumber2.setFont(Main.normalFont);
		attackLabelNumber2.setForeground(Color.blue);
		enemyPanel.add(attackLabelNumber2);
	}
	
}
