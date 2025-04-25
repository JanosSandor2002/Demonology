package defaultpackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameStart1 {
	public static JPanel titleNamePanel = new JPanel();
	public static JPanel startButtonPanel = new JPanel();
	
	public static JLabel titleNameLabel = new JLabel();
	
	public static JButton startButton = new JButton();
	
	public static ChooseClass chooseClass;
	
	public static int choiceSum = 0, monsterAttackDelay = 0, enemyBleedNum = 0, thiefEvasionUse = 0, thiefEvasionUseTurn = 0, enemyBlindNum = 0, playerBlindNum = 0,
			playerBleedNum = 0, upgradeExp = 100, levelNum = 0, size;
	
	public static boolean classOk = true, hitEnemy = false, enemyBleed = false, enemyBlind = false, playerBlind = false, playerBleed = false, playerSetted;
	
	public static void gameStart() {
		System.out.println("Gamestart started");
		chooseClass = new GameStart1().new ChooseClass();
		playerSetted = false;
		size = 0;
		classOk = true;
		levelNum = 0;
		hitEnemy = false; 
		enemyBleed = false;
		enemyBlind = false;
		playerBlind = false;
		playerBleed = false;
		choiceSum = 0;
		monsterAttackDelay = 0;
		enemyBleedNum = 0;
		thiefEvasionUse = 0;
		thiefEvasionUseTurn = 0;
		enemyBlindNum = 0;
		playerBlindNum = 0;
		playerBleedNum = 0;
		
		//panels
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.gray);
		titleNamePanel.setVisible(true);
				
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.gray);
		startButtonPanel.setVisible(true);	
				
		//labels
		titleNameLabel.setText("<<Demonology>>");
		titleNameLabel.setForeground(Color.red);
		titleNameLabel.setFont(Main.titleFont);
		titleNamePanel.add(titleNameLabel);
		//buttons
		startButton.setText("START");
		startButton.setPreferredSize(new Dimension(300, 50));
		startButton.setBackground(Color.red);
		startButton.setForeground(Color.white);
		startButton.setFont(Main.normalFont);
		startButtonPanel.add(startButton);
		startButton.addActionListener(chooseClass);
				
		//refresh
		Main.window.revalidate();
		Main.window.repaint();
	}
	public class ChooseClass implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			//disappear Beforepanels
			titleNamePanel.setVisible(false);
			startButtonPanel.setVisible(false);
			
			ClassScreen2.classScreen();
			startButton.removeActionListener(chooseClass);
			System.out.println("chooseClass ActionListener eltávolítva");
			Main.window.revalidate();
			Main.window.repaint();
			}
		}
}
