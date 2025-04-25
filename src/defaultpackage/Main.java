package defaultpackage;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import classes.Mage;
import classes.Thief;
import classes.Warrior;

public class Main {
	
	public static JFrame window = new JFrame();
	public static Container con;
	
	public static Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	public static Font normalFont = new Font("Times New Roman", Font.PLAIN, 25);
	public static Font littleFont = new Font("Times New Roman", Font.PLAIN, 18);
	
    public static Warrior Warrior = new Warrior("Warrior", 280, 40, 140, 30, 1, 69);
    public static Warrior Warrior2;
    public static Mage Mage = new Mage("Mage", 195, 90, 95, 35, 1, 13);
    public static Mage Mage2;;
    public static Thief Thief = new Thief("Thief", 220, 32, 125, 40, 1, 51);
    public static Thief Thief2;
    
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		//window
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.gray);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		//all panels
			//startpanels
				con.add(GameStart1.titleNamePanel);
				GameStart1.titleNamePanel.setVisible(false);
				con.add(GameStart1.startButtonPanel);
				GameStart1.startButtonPanel.setVisible(false);
		
		con.add(FightScreen3.picturePanel);
		FightScreen3.picturePanel.setVisible(false);
		con.add(FightScreen3.enemyNamePanel);
		FightScreen3.enemyNamePanel.setVisible(false);
		con.add(FightScreen3.playerNamePanel);
		FightScreen3.playerNamePanel.setVisible(false);
		con.add(FightScreen3.playerPanel);
		FightScreen3.playerPanel.setVisible(false);
		con.add(FightScreen3.enemyPanel);
		FightScreen3.enemyPanel.setVisible(false);
		con.add(FightScreen3.enemyNamePanel);
		FightScreen3.enemyNamePanel.setVisible(false);
		con.add(FightScreen3.choiceButtonPanel);
		FightScreen3.choiceButtonPanel.setVisible(false);
		con.add(FightScreen3.mainTextPanel);
		FightScreen3.mainTextPanel.setVisible(false);
		con.add(ClassScreen2.warriorPicPanel);
		ClassScreen2.warriorPicPanel.setVisible(false);
		con.add(ClassScreen2.warriorStatPanel);
		ClassScreen2.warriorStatPanel.setVisible(false);
		con.add(ClassScreen2.warriorSpecPanel);
		ClassScreen2.warriorSpecPanel.setVisible(false);
		con.add(ClassScreen2.magePicPanel);
		ClassScreen2.magePicPanel.setVisible(false);
		con.add(ClassScreen2.mageStatPanel);
		ClassScreen2.mageStatPanel.setVisible(false);
		con.add(ClassScreen2.mageSpecPanel);
		ClassScreen2.mageSpecPanel.setVisible(false);
		con.add(ClassScreen2.thiefPicPanel);
		ClassScreen2.thiefPicPanel.setVisible(false);
		con.add(ClassScreen2.thiefStatPanel);
		ClassScreen2.thiefStatPanel.setVisible(false);
		con.add(ClassScreen2.thiefSpecPanel);
		ClassScreen2.thiefSpecPanel.setVisible(false);
		// Image initialization
			//players
				SetThingsUp.warrior = new ImageIcon(getClass().getResource("/assets/players/warrior.jpg"));
				ClassScreen2.warriorPicLabel = new JLabel(SetThingsUp.warrior);
				SetThingsUp.mage = new ImageIcon(getClass().getResource("/assets/players/mage.jpg"));
				ClassScreen2.magePicLabel = new JLabel(SetThingsUp.mage);
				SetThingsUp.thief = new ImageIcon(getClass().getResource("/assets/players/thief.jpg"));
				ClassScreen2.thiefPicLabel = new JLabel(SetThingsUp.thief);	
			//monsters first round
				SetThingsUp.valak = new ImageIcon(getClass().getResource("/assets/monsters/valak.jpg"));
				SetThingsUp.annabelle = new ImageIcon(getClass().getResource("/assets/monsters/annabelle.jpg"));
				SetThingsUp.slenderman = new ImageIcon(getClass().getResource("/assets/monsters/slenderman.jpg"));
				SetThingsUp.sirenhead = new ImageIcon(getClass().getResource("/assets/monsters/sirenhead.jpg"));
			//monsters second round
				SetThingsUp.foxy = new ImageIcon(getClass().getResource("/assets/monsters/foxy.jpg"));
				SetThingsUp.bonny = new ImageIcon(getClass().getResource("/assets/monsters/bonny.jpg"));
				SetThingsUp.chica = new ImageIcon(getClass().getResource("/assets/monsters/chica.jpg"));
				SetThingsUp.freddy = new ImageIcon(getClass().getResource("/assets/monsters/freddy.jpg"));
			//monsters third round
				SetThingsUp.mara = new ImageIcon(getClass().getResource("/assets/monsters/mara.jpg"));
				SetThingsUp.jason = new ImageIcon(getClass().getResource("/assets/monsters/jason.jpg"));
				SetThingsUp.demogorgon = new ImageIcon(getClass().getResource("/assets/monsters/demogorgon.jpg"));
				SetThingsUp.alien = new ImageIcon(getClass().getResource("/assets/monsters/alien.jpg"));
			//Mainboss
				SetThingsUp.kingkong = new ImageIcon(getClass().getResource("/assets/monsters/kingkong.jpg"));
				
				SetThingsUp.monster = new Monster("null", 0, 0, 0, 0, 0, 0, 0);
				SetThingsUp.monster2 = new Monster("null", 0, 0, 0, 0, 0, 0, 0);
				SetThingsUp.enemyLabel.setPreferredSize(new Dimension(400, 300));

		GameStart1.gameStart();
	}
}
