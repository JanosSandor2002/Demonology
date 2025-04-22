package defaultpackage;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Game {
	JFrame window = new JFrame();
	Container con;
	JPanel titleNamePanel = new JPanel();
	JPanel startButtonPanel = new JPanel();
	JPanel mainTextPanel = new JPanel();
	JPanel picturePanel = new JPanel(); 
	JPanel choiceButtonPanel = new JPanel();
	JPanel playerPanel = new JPanel();
	JPanel enemyPanel = new JPanel();
	JPanel enemyNamePanel = new JPanel();
	JPanel playerNamePanel = new JPanel();
	JPanel warriorPicPanel = new JPanel();
	JPanel warriorStatPanel = new JPanel();
	JPanel warriorSpecPanel = new JPanel();
	JPanel magePicPanel = new JPanel();
	JPanel mageStatPanel = new JPanel();
	JPanel mageSpecPanel = new JPanel();
	JPanel thiefPicPanel = new JPanel();
	JPanel thiefStatPanel = new JPanel();
	JPanel thiefSpecPanel = new JPanel();
	
	JLabel titleNameLabel = new JLabel();
	JLabel enemyLabel = new JLabel();
	JLabel hpLabel = new JLabel();
    JLabel hpLabelNumber = new JLabel();
    JLabel mpLabel = new JLabel();
    JLabel mpLabelNumber = new JLabel();
    JLabel defLabel = new JLabel();
    JLabel defLabelNumber = new JLabel();
    JLabel evasionLabel = new JLabel();
    JLabel evasionLabelNumber = new JLabel();
    JLabel hpLabel2 = new JLabel();
    JLabel hpLabelNumber2 = new JLabel();
    JLabel mpLabel2 = new JLabel();
    JLabel mpLabelNumber2 = new JLabel();
    JLabel defLabel2 = new JLabel();
    JLabel defLabelNumber2 = new JLabel();
    JLabel evasionLabel2 = new JLabel();
    JLabel evasionLabelNumber2 = new JLabel();
    JLabel playerNameLabel = new JLabel();
    JLabel enemyNameLabel = new JLabel();
    JLabel attackLabel = new JLabel();
    JLabel attackLabelNumber = new JLabel();
    JLabel attackLabel2 = new JLabel();
    JLabel attackLabelNumber2 = new JLabel();
    JLabel warriorPicLabel = new JLabel();
    JLabel magePicLabel = new JLabel();
    JLabel thiefPicLabel = new JLabel();
    JLabel warriorName = new JLabel();
    JLabel warriorHp = new JLabel();
    JLabel warriorMp = new JLabel();
    JLabel warriorDef = new JLabel();
    JLabel warriorEva = new JLabel();
    JLabel warriorAtk = new JLabel();
    JLabel warriorSpec = new JLabel();
    JLabel mageName = new JLabel();
    JLabel mageHp = new JLabel();
    JLabel mageMp = new JLabel();
    JLabel mageDef = new JLabel();
    JLabel mageEva = new JLabel();
    JLabel mageAtk = new JLabel();
    JLabel mageSpec = new JLabel();
    JLabel thiefName = new JLabel();
    JLabel thiefHp = new JLabel();
    JLabel thiefMp = new JLabel();
    JLabel thiefDef = new JLabel();
    JLabel thiefEva = new JLabel();
    JLabel thiefAtk = new JLabel();
    JLabel thiefSpec = new JLabel();
    JLabel warriorName2 = new JLabel();
    JLabel warriorHp2 = new JLabel();
    JLabel warriorMp2 = new JLabel();
    JLabel warriorDef2 = new JLabel();
    JLabel warriorEva2 = new JLabel();
    JLabel warriorAtk2 = new JLabel();
    JLabel mageName2 = new JLabel();
    JLabel mageHp2 = new JLabel();
    JLabel mageMp2 = new JLabel();
    JLabel mageDef2 = new JLabel();
    JLabel mageEva2 = new JLabel();
    JLabel mageAtk2 = new JLabel();
    JLabel thiefName2 = new JLabel();
    JLabel thiefHp2 = new JLabel();
    JLabel thiefMp2 = new JLabel();
    JLabel thiefDef2 = new JLabel();
    JLabel thiefEva2 = new JLabel();
    JLabel thiefAtk2 = new JLabel();
	
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 25);
	Font littleFont = new Font("Times New Roman", Font.PLAIN, 18);
	JButton startButton = new JButton();
	JButton choice1 = new JButton();
	JButton choice2 = new JButton();
	JButton choice3 = new JButton();
	JButton choice4 = new JButton();
	JButton warriorButton = new JButton();
	JButton mageButton = new JButton();
	JButton thiefButton = new JButton();
	JTextArea mainTextArea = new JTextArea();
	Image sirenheadImage, sirenheadImage2, valakImage, valakImage2, annabelleImage, annabelleImage2, slendermanImage, slendermanImage2,
		alienImage, alienImage2, bonnyImage, bonnyImage2, boogeymanImage, boogeymanImage2, chicaImage, chicaImage2, demogorgonImage, demogorgonImage2,
		foxyImage, foxyImage2, freddyImage, freddyImage2, kingkongImage, kingkongImage2, maraImage, maraImage2, jasonImage, jasonImage2;
	ImageIcon valak, annabelle, slenderman, sirenhead, warrior, mage, thief, alien, bonny, foxy, chica, freddy, jason, mara, kingkong, 
		demogorgon, boogeyman, scaledIcon = new ImageIcon();
	Monster monster, monster2;
	Player player, player2, Warrior, Warrior2, Mage, Mage2, Thief, Thief2;
	int choiceSum = 0, monsterAttackDelay = 0, enemyBleedNum = 0, thiefEvasionUse = 0, thiefEvasionUseTurn = 0, enemyBlindNum = 0, playerBlindNum = 0,
			playerBleedNum = 0, upgradeExp = 100, levelNum = 0, size; 
	String playerName;
	//magic numbers
	int strike = 10, blow = 15, huffpuff = 4, thaumatise = 6, mpDrain = 2, cure = 6, bleed = 10, blind = 8, fasten = 7;
	boolean classOk = true, hitEnemy = false, enemyBleed = false, enemyBlind = false, playerBlind = false, playerBleed = false, playerSetted;
	
	setPlayerClass toFightScreen = new setPlayerClass();
    ChoiceHandler choiceHandler = new ChoiceHandler();
    SpecChoiceHandler specChoiceHandler = new SpecChoiceHandler();
    ChooseClass chooseClass = new ChooseClass();
    //how many enemy
	public static void main(String[] args) {
		new Game();
	}
	public Game() {
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
				con.add(titleNamePanel);
				titleNamePanel.setVisible(false);
				con.add(startButtonPanel);
				startButtonPanel.setVisible(false);
		
		con.add(picturePanel);
		picturePanel.setVisible(false);
		con.add(enemyNamePanel);
		enemyNamePanel.setVisible(false);
		con.add(playerNamePanel);
		playerNamePanel.setVisible(false);
		con.add(playerPanel);
		playerPanel.setVisible(false);
		con.add(enemyPanel);
		enemyPanel.setVisible(false);
		con.add(enemyNamePanel);
		enemyNamePanel.setVisible(false);
		con.add(choiceButtonPanel);
		choiceButtonPanel.setVisible(false);
		con.add(mainTextPanel);
		mainTextPanel.setVisible(false);
		con.add(warriorPicPanel);
		warriorPicPanel.setVisible(false);
		con.add(warriorStatPanel);
		warriorStatPanel.setVisible(false);
		con.add(warriorSpecPanel);
		warriorSpecPanel.setVisible(false);
		con.add(magePicPanel);
		magePicPanel.setVisible(false);
		con.add(mageStatPanel);
		mageStatPanel.setVisible(false);
		con.add(mageSpecPanel);
		mageSpecPanel.setVisible(false);
		con.add(thiefPicPanel);
		thiefPicPanel.setVisible(false);
		con.add(thiefStatPanel);
		thiefStatPanel.setVisible(false);
		con.add(thiefSpecPanel);
		thiefSpecPanel.setVisible(false);
		
		// Image initialization
			//players
				warrior = new ImageIcon(getClass().getResource("/assets/players/warrior.jpg"));
				warriorPicLabel = new JLabel(warrior);
				mage = new ImageIcon(getClass().getResource("/assets/players/mage.jpg"));
				magePicLabel = new JLabel(mage);
				thief = new ImageIcon(getClass().getResource("/assets/players/thief.jpg"));
				thiefPicLabel = new JLabel(thief);

				Warrior = new Player("Warrior", 250, 40, 140, 30, 1, 69, 0);
				Mage = new Player("Mage", 155, 90, 95, 35, 1, 13, 0);
				Thief = new Player("Thief", 190, 32, 125, 40, 1, 51, 0);
				
				
			//monsters first round
				valak = new ImageIcon(getClass().getResource("/assets/monsters/valak.jpg"));
				annabelle = new ImageIcon(getClass().getResource("/assets/monsters/annabelle.jpg"));
				slenderman = new ImageIcon(getClass().getResource("/assets/monsters/slenderman.jpg"));
				sirenhead = new ImageIcon(getClass().getResource("/assets/monsters/sirenhead.jpg"));
			//monsters second round
				foxy = new ImageIcon(getClass().getResource("/assets/monsters/foxy.jpg"));
				bonny = new ImageIcon(getClass().getResource("/assets/monsters/bonny.jpg"));
				chica = new ImageIcon(getClass().getResource("/assets/monsters/chica.jpg"));
				freddy = new ImageIcon(getClass().getResource("/assets/monsters/freddy.jpg"));
			//monsters third round
				mara = new ImageIcon(getClass().getResource("/assets/monsters/mara.jpg"));
				jason = new ImageIcon(getClass().getResource("/assets/monsters/jason.jpg"));
				demogorgon = new ImageIcon(getClass().getResource("/assets/monsters/demogorgon.jpg"));
				alien = new ImageIcon(getClass().getResource("/assets/monsters/alien.jpg"));
			//Mainboss
				kingkong = new ImageIcon(getClass().getResource("/assets/monsters/kingkong.jpg"));
				
				monster = new Monster("null", 0, 0, 0, 0, 0, 0, 0);
				monster2 = new Monster("null", 0, 0, 0, 0, 0, 0, 0);
				enemyLabel.setPreferredSize(new Dimension(400, 300));

		gameStart();
	}
	//StartScreen
	public void gameStart() {
		System.out.println("Gamestart started");
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
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);
		//buttons
		startButton.setText("START");
		startButton.setPreferredSize(new Dimension(300, 50));
		startButton.setBackground(Color.red);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButtonPanel.add(startButton);
		startButton.addActionListener(chooseClass);
				
		
		//refresh
		window.revalidate();
		window.repaint();
	}
	public class ChooseClass implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			//disappear Beforepanels
			titleNamePanel.setVisible(false);
			startButtonPanel.setVisible(false);
			classScreen();
			window.revalidate();
			window.repaint();
		}
	}
	//ClassChooseScreen
	public void classScreen() {
		//panels
		warriorPicPanel.setBounds(0, 0, 250, 200);
		warriorPicPanel.setBackground(Color.blue);
		warriorPicPanel.setVisible(true);
		
		warriorStatPanel.setBounds(0, 200, 250, 200);
		warriorStatPanel.setBackground(Color.green);
		warriorStatPanel.setLayout(new GridLayout(6, 2));
		warriorStatPanel.setVisible(true);
		
		warriorSpecPanel.setBounds(0, 400, 250, 200);
		warriorSpecPanel.setBackground(Color.red);
		warriorSpecPanel.setVisible(true);
		
		magePicPanel.setBounds(275, 0, 250, 200);
		magePicPanel.setBackground(Color.blue);
		magePicPanel.setVisible(true);
		
		mageStatPanel.setBounds(275, 200, 250, 200);
		mageStatPanel.setBackground(Color.green);
		mageStatPanel.setLayout(new GridLayout(6, 2));
		mageStatPanel.setVisible(true);
		
		mageSpecPanel.setBounds(275, 400, 250, 200);
		mageSpecPanel.setBackground(Color.red);
		mageSpecPanel.setVisible(true);
		
		thiefPicPanel.setBounds(550, 0, 250, 200);
		thiefPicPanel.setBackground(Color.blue);
		thiefPicPanel.setVisible(true);
		
		thiefStatPanel.setBounds(550, 200, 250, 200);
		thiefStatPanel.setBackground(Color.green);
		thiefStatPanel.setLayout(new GridLayout(6, 2));
		thiefStatPanel.setVisible(true);
		
		thiefSpecPanel.setBounds(550, 400, 250, 200);
		thiefSpecPanel.setBackground(Color.red);
		thiefSpecPanel.setVisible(true);
		//Labels
		warriorName.setText("NAME:");
		warriorName.setForeground(Color.red);
		warriorName.setFont(normalFont);
		warriorStatPanel.add(warriorName);
		
		warriorName2.setText(Warrior.getName());
		warriorName2.setForeground(Color.red);
		warriorName2.setFont(normalFont);
		warriorStatPanel.add(warriorName2);
		
		warriorHp.setText("HP:");
		warriorHp.setForeground(Color.red);
		warriorHp.setFont(normalFont);
		warriorStatPanel.add(warriorHp);
		
		warriorHp2.setText(String.valueOf(Warrior.getHp()));
		warriorHp2.setForeground(Color.red);
		warriorHp2.setFont(normalFont);
		warriorStatPanel.add(warriorHp2);
		
		warriorMp.setText("MP:");
		warriorMp.setForeground(Color.red);
		warriorMp.setFont(normalFont);
		warriorStatPanel.add(warriorMp);
		
		warriorMp2.setText(String.valueOf(Warrior.getMp()));
		warriorMp2.setForeground(Color.red);
		warriorMp2.setFont(normalFont);
		warriorStatPanel.add(warriorMp2);
		
		warriorDef.setText("DEF:");
		warriorDef.setForeground(Color.red);
		warriorDef.setFont(normalFont);
		warriorStatPanel.add(warriorDef);
		
		warriorDef2.setText(String.valueOf(Warrior.getDef()));
		warriorDef2.setForeground(Color.red);
		warriorDef2.setFont(normalFont);
		warriorStatPanel.add(warriorDef2);
		
		warriorEva.setText("EVASION:");
		warriorEva.setForeground(Color.red);
		warriorEva.setFont(normalFont);
		warriorStatPanel.add(warriorEva);
		
		warriorEva2.setText(String.valueOf(Warrior.getEvasion()));
		warriorEva2.setForeground(Color.red);
		warriorEva2.setFont(normalFont);
		warriorStatPanel.add(warriorEva2);
		
		warriorAtk.setText("ATK:");
		warriorAtk.setForeground(Color.red);
		warriorAtk.setFont(normalFont);
		warriorStatPanel.add(warriorAtk);
		
		warriorAtk2.setText(String.valueOf(Warrior.getAttack()));
		warriorAtk2.setForeground(Color.red);
		warriorAtk2.setFont(normalFont);
		warriorStatPanel.add(warriorAtk2);
		
		mageName.setText("NAME:");
		mageName.setForeground(Color.red);
		mageName.setFont(normalFont);
		mageStatPanel.add(mageName);
		
		mageName2.setText(Mage.getName());
		mageName2.setForeground(Color.red);
		mageName2.setFont(normalFont);
		mageStatPanel.add(mageName2);
		
		mageHp.setText("HP:");
		mageHp.setForeground(Color.red);
		mageHp.setFont(normalFont);
		mageStatPanel.add(mageHp);
		
		mageHp2.setText(String.valueOf(Mage.getHp()));
		mageHp2.setForeground(Color.red);
		mageHp2.setFont(normalFont);
		mageStatPanel.add(mageHp2);
		
		mageMp.setText("MP:");
		mageMp.setForeground(Color.red);
		mageMp.setFont(normalFont);
		mageStatPanel.add(mageMp);
		
		mageMp2.setText(String.valueOf(Mage.getMp()));
		mageMp2.setForeground(Color.red);
		mageMp2.setFont(normalFont);
		mageStatPanel.add(mageMp2);
		
		mageDef.setText("DEF:");
		mageDef.setForeground(Color.red);
		mageDef.setFont(normalFont);
		mageStatPanel.add(mageDef);
		
		mageDef2.setText(String.valueOf(Mage.getDef()));
		mageDef2.setForeground(Color.red);
		mageDef2.setFont(normalFont);
		mageStatPanel.add(mageDef2);
		
		mageEva.setText("EVASION:");
		mageEva.setForeground(Color.red);
		mageEva.setFont(normalFont);
		mageStatPanel.add(mageEva);
		
		mageEva2.setText(String.valueOf(Mage.getEvasion()));
		mageEva2.setForeground(Color.red);
		mageEva2.setFont(normalFont);
		mageStatPanel.add(mageEva2);
		
		mageAtk.setText("ATK:");
		mageAtk.setForeground(Color.red);
		mageAtk.setFont(normalFont);
		mageStatPanel.add(mageAtk);
		
		mageAtk2.setText(String.valueOf(Mage.getAttack()));
		mageAtk2.setForeground(Color.red);
		mageAtk2.setFont(normalFont);
		mageStatPanel.add(mageAtk2);
		
		thiefName.setText("NAME:");
		thiefName.setForeground(Color.red);
		thiefName.setFont(normalFont);
		thiefStatPanel.add(thiefName);
		
		thiefName2.setText(Thief.getName());
		thiefName2.setForeground(Color.red);
		thiefName2.setFont(normalFont);
		thiefStatPanel.add(thiefName2);
		
		thiefHp.setText("HP:");
		thiefHp.setForeground(Color.red);
		thiefHp.setFont(normalFont);
		thiefStatPanel.add(thiefHp);
		
		thiefHp2.setText(String.valueOf(Thief.getHp()));
		thiefHp2.setForeground(Color.red);
		thiefHp2.setFont(normalFont);
		thiefStatPanel.add(thiefHp2);
		
		thiefMp.setText("MP:");
		thiefMp.setForeground(Color.red);
		thiefMp.setFont(normalFont);
		thiefStatPanel.add(thiefMp);
		
		thiefMp2.setText(String.valueOf(Thief.getMp()));
		thiefMp2.setForeground(Color.red);
		thiefMp2.setFont(normalFont);
		thiefStatPanel.add(thiefMp2);
		
		thiefDef.setText("DEF:");
		thiefDef.setForeground(Color.red);
		thiefDef.setFont(normalFont);
		thiefStatPanel.add(thiefDef);
		
		thiefDef2.setText(String.valueOf(Thief.getDef()));
		thiefDef2.setForeground(Color.red);
		thiefDef2.setFont(normalFont);
		thiefStatPanel.add(thiefDef2);
		
		thiefEva.setText("EVASION:");
		thiefEva.setForeground(Color.red);
		thiefEva.setFont(normalFont);
		thiefStatPanel.add(thiefEva);
		
		thiefEva2.setText(String.valueOf(Thief.getEvasion()));
		thiefEva2.setForeground(Color.red);
		thiefEva2.setFont(normalFont);
		thiefStatPanel.add(thiefEva2);
		
		thiefAtk.setText("ATK:");
		thiefAtk.setForeground(Color.red);
		thiefAtk.setFont(normalFont);
		thiefStatPanel.add(thiefAtk);
		
		thiefAtk2.setText(String.valueOf(Thief.getAttack()));
		thiefAtk2.setForeground(Color.red);
		thiefAtk2.setFont(normalFont);
		thiefStatPanel.add(thiefAtk2);
		//add pictures to panels
		warriorPicPanel.add(warriorPicLabel);
		magePicPanel.add(magePicLabel);
		thiefPicPanel.add(thiefPicLabel);
		//buttons
		warriorButton.setText("SELECT");
		warriorButton.setBackground(Color.black);
		warriorButton.setForeground(Color.white);
		warriorButton.setFont(normalFont);
		warriorSpecPanel.add(warriorButton);
		warriorButton.addActionListener(toFightScreen);
		
		mageButton.setText("SELECT");
		mageButton.setBackground(Color.black);
		mageButton.setForeground(Color.white);
		mageButton.setFont(normalFont);
		mageSpecPanel.add(mageButton);
		mageButton.addActionListener(toFightScreen);
		
		thiefButton.setText("SELECT");
		thiefButton.setBackground(Color.black);
		thiefButton.setForeground(Color.white);
		thiefButton.setFont(normalFont);
		thiefSpecPanel.add(thiefButton);
		thiefButton.addActionListener(toFightScreen);
	}
	public class setPlayerClass implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			JButton s = (JButton) event.getSource();
			
			warriorPicPanel.setVisible(false);
			warriorStatPanel.setVisible(false);
			warriorSpecPanel.setVisible(false);
			magePicPanel.setVisible(false);
			mageStatPanel.setVisible(false);
			mageSpecPanel.setVisible(false);
			thiefPicPanel.setVisible(false);
			thiefStatPanel.setVisible(false);
			thiefSpecPanel.setVisible(false);
			if (s == warriorButton) {
				if(classOk == true) {
					playerName = "Warrior";
					classOk = false;
				}
			} else if (s == mageButton) {
				if(classOk == true) {
					playerName = "Mage";
					classOk = false;
				}
			} else if (s == thiefButton) {
				if(classOk == true) {
					playerName = "Thief";
					classOk = false;
				}
			}
			warriorButton.removeActionListener(toFightScreen);
			mageButton.removeActionListener(toFightScreen);
			thiefButton.removeActionListener(toFightScreen);
			
			fightScreen();
		}
	}
	//set Things up
	public void setPlayer(Player p) {
		if (levelNum == 0) {	
			player = new Player(p.getName(), p.getHp(), p.getMp(), p.getDef(), p.getEvasion(), 1, p.getAttack(), p.getExp());
		    player2 = new Player(p.getName(), p.getHp(), p.getMp(), p.getDef(), p.getEvasion(), 1, p.getAttack(), upgradeExp);
		    System.out.println("Player set: "+ player.getName());
		} else {
			upgradePlayer(player.getExp());
		}
		levelNum = 1;
	}
	public void setEnemy() {
		switch(size) {
	    case 0:
        	sirenheadImage = sirenhead.getImage();
            sirenheadImage2 = sirenheadImage.getScaledInstance(enemyLabel.getPreferredSize().width,
                    enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(sirenheadImage2);
            
            monster.setName("SirenHead");
            monster.setHp(95);
            monster.setMp(85);
            monster.setDef(135);
            monster.setEvasion(25);
            monster.setLevel(1);
            monster.setAttack(29);
            monster.setExp(50);
            break;
        case 1:
        	annabelleImage = annabelle.getImage();
        	annabelleImage2 = annabelleImage.getScaledInstance(enemyLabel.getPreferredSize().width,
                    enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(annabelleImage2);
        	
            monster.setName("ANNABELLE");
            monster.setHp(165);
            monster.setMp(100);
            monster.setDef(105);
            monster.setEvasion(25);
            monster.setLevel(1);
            monster.setAttack(32);
            monster.setExp(50);
            break;
        case 2:
        	slendermanImage = slenderman.getImage();
        	slendermanImage2 = slendermanImage.getScaledInstance(enemyLabel.
        	 getPreferredSize().width,enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(slendermanImage2);
        	
            monster.setName("Slenderman");
            monster.setHp(180);
            monster.setMp(100);
            monster.setDef(80);
            monster.setEvasion(30);
            monster.setLevel(1);
            monster.setAttack(31);
            monster.setExp(50);
            break;
        case 3:
        	valakImage = valak.getImage();
        	valakImage2 = valakImage.getScaledInstance(enemyLabel.getPreferredSize().width,
                    enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(valakImage2);
            
            monster.setName("VALAK");
            monster.setHp(145);
            monster.setMp(120);
            monster.setDef(110);
            monster.setEvasion(35);
            monster.setLevel(1);
            monster.setAttack(26);
            monster.setExp(50);
            break;
        case 4:
        	foxyImage = foxy.getImage();
        	foxyImage2 = foxyImage.getScaledInstance(enemyLabel.getPreferredSize().width,
                    enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(foxyImage);
            
            monster.setName("FOXY");
            monster.setHp(133);
            monster.setMp(120);
            monster.setDef(100);
            monster.setEvasion(35);
            monster.setLevel(1);
            monster.setAttack(26);
            monster.setExp(50);
            break;
        case 5:
        	bonnyImage = bonny.getImage();
        	bonnyImage2 = bonnyImage.getScaledInstance(enemyLabel.getPreferredSize().width,
                    enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(bonnyImage2);
            
            monster.setName("BONNY");
            monster.setHp(165);
            monster.setMp(120);
            monster.setDef(100);
            monster.setEvasion(35);
            monster.setLevel(1);
            monster.setAttack(26);
            monster.setExp(50);
            break;
        case 6:
        	chicaImage = chica.getImage();
        	chicaImage2 = chicaImage.getScaledInstance(enemyLabel.getPreferredSize().width,
                    enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(chicaImage2);
            
            monster.setName("CHICA");
            monster.setHp(100);
            monster.setMp(120);
            monster.setDef(130);
            monster.setEvasion(35);
            monster.setLevel(1);
            monster.setAttack(26);
            monster.setExp(50);
            break;
        case 7:
        	freddyImage = freddy.getImage();
        	freddyImage2 = freddyImage.getScaledInstance(enemyLabel.getPreferredSize().width,
                    enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(freddyImage2);
            
            monster.setName("FREDDY");
            monster.setHp(105);
            monster.setMp(120);
            monster.setDef(125);
            monster.setEvasion(35);
            monster.setLevel(1);
            monster.setAttack(26);
            monster.setExp(50);
            break;
        case 8:
        	maraImage = mara.getImage();
        	maraImage2 = maraImage.getScaledInstance(enemyLabel.getPreferredSize().width,
                    enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(maraImage2);
            
            monster.setName("MARA");
            monster.setHp(155);
            monster.setMp(120);
            monster.setDef(110);
            monster.setEvasion(35);
            monster.setLevel(1);
            monster.setAttack(26);
            monster.setExp(50);
            break;
        case 9:
        	jasonImage = jason.getImage();
        	jasonImage2 = jasonImage.getScaledInstance(enemyLabel.getPreferredSize().width,
                    enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(jasonImage2);
            
            monster.setName("JASON");
            monster.setHp(132);
            monster.setMp(120);
            monster.setDef(125);
            monster.setEvasion(35);
            monster.setLevel(1);
            monster.setAttack(26);
            monster.setExp(50);
            break;
        case 10:
        	demogorgonImage = demogorgon.getImage();
        	demogorgonImage2 = demogorgonImage.getScaledInstance(enemyLabel.getPreferredSize().width,
                    enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(demogorgonImage2);
            
            monster.setName("DEMORGORGON");
            monster.setHp(110);
            monster.setMp(120);
            monster.setDef(145);
            monster.setEvasion(35);
            monster.setLevel(1);
            monster.setAttack(26);
            monster.setExp(50);
            break;
        case 11:
        	alienImage = alien.getImage();
        	alienImage2 = alienImage.getScaledInstance(enemyLabel.getPreferredSize().width,
                    enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(alienImage2);
            
            monster.setName("ALIEN");
            monster.setHp(150);
            monster.setMp(120);
            monster.setDef(120);
            monster.setEvasion(35);
            monster.setLevel(1);
            monster.setAttack(26);
            monster.setExp(50);
            break;
        case 12:
        	kingkongImage = kingkong.getImage();
        	kingkongImage2 = kingkongImage.getScaledInstance(enemyLabel.getPreferredSize().width,
                    enemyLabel.getPreferredSize().height, Image.SCALE_SMOOTH);
            scaledIcon.setImage(kingkongImage2);
            
            monster.setName("THE KING-KONG");
            monster.setHp(205);
            monster.setMp(120);
            monster.setDef(120);
            monster.setEvasion(35);
            monster.setLevel(1);
            monster.setAttack(26);
            monster.setExp(0);
            break;
        case 13:
        	backToMainScreen();
        	System.out.println(size);
        	break;
	    }
	    size++;
	    enemyLabel.setIcon(scaledIcon);
	    
	    monster2.setName(monster.getName());
        monster2.setHp(monster.getHp());
        monster2.setMp(monster.getMp());
        monster2.setDef(monster.getDef());
        monster2.setEvasion(monster.getEvasion());
        monster2.setLevel(monster.getLevel());
        monster2.setAttack(monster.getAttack());
	    picturePanel.add(enemyLabel);
	    System.out.println("Enemy set: "+monster.getName());
        //refresh
	    picturePanel.revalidate();
	    picturePanel.repaint();
	    
	}
	//FightScreen
	public void fightScreen() {
		//setPlayer
		if (playerSetted == false) {	
			if(playerName == "Warrior") {
				setPlayer(Warrior);
			} else if(playerName == "Mage") {
				setPlayer(Mage);
			} else {
				setPlayer(Thief);
			}
			playerSetted = true;
		}
		//setenemy
		if (size  < 13) {
		setEnemy();
		//panels
			fightPanels();
		//labels
			fightLabels();
		//textareas
			mainTextArea.setText("You came across a "+monster.getName()+"!");
			mainTextArea.setBounds(0, 0, 400, 300);
			mainTextArea.setBackground(Color.gray);
			mainTextArea.setForeground(Color.red);
			mainTextArea.setFont(normalFont);
			mainTextArea.setLineWrap(true);
			mainTextPanel.add(mainTextArea);
		//buttons
			fightButtons();
		//setStats
			setStats();
		//refresh
			window.revalidate();
			window.repaint();
		} else {
			player.setHp(0);
			monster.setHp(2);
			setStats();
			//System.exit(0);
			//backToMainScreen();
		}
		
		
	}
	public void fightPanels() {
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
	public void fightLabels() {
		playerNameLabel.setText(player.getName());
		playerNameLabel.setFont(normalFont);
		playerNameLabel.setForeground(Color.red);
		playerNamePanel.add(playerNameLabel);
		
		hpLabel.setText("HP:");
		hpLabel.setFont(normalFont);
		hpLabel.setForeground(Color.blue);
		playerPanel.add(hpLabel);
		
		hpLabelNumber.setFont(normalFont);
		hpLabelNumber.setForeground(Color.blue);
		playerPanel.add(hpLabelNumber);
		
		mpLabel.setText("MP:");
		mpLabel.setFont(normalFont);
		mpLabel.setForeground(Color.blue);
		playerPanel.add(mpLabel);
		
		mpLabelNumber.setFont(normalFont);
		mpLabelNumber.setForeground(Color.blue);
		playerPanel.add(mpLabelNumber);
		
		defLabel.setText("DEF:");
		defLabel.setFont(normalFont);
		defLabel.setForeground(Color.blue);
		playerPanel.add(defLabel);
		
		defLabelNumber.setFont(normalFont);
		defLabelNumber.setForeground(Color.blue);
		playerPanel.add(defLabelNumber);
		
		evasionLabel.setText("EVA:");
		evasionLabel.setFont(normalFont);
		evasionLabel.setForeground(Color.blue);
		playerPanel.add(evasionLabel);
		
		evasionLabelNumber.setFont(normalFont);
		evasionLabelNumber.setForeground(Color.blue);
		playerPanel.add(evasionLabelNumber);
		
		attackLabel.setText("ATK:");
		attackLabel.setFont(normalFont);
		attackLabel.setForeground(Color.blue);
		playerPanel.add(attackLabel);
		
		attackLabelNumber.setFont(normalFont);
		attackLabelNumber.setForeground(Color.blue);
		playerPanel.add(attackLabelNumber);
		//monsterlabels
		enemyNameLabel.setText(monster.getName());
		enemyNameLabel.setFont(normalFont);
		enemyNameLabel.setForeground(Color.red);
		enemyNamePanel.add(enemyNameLabel);
		
		hpLabel2.setText("HP:");
		hpLabel2.setFont(normalFont);
		hpLabel2.setForeground(Color.blue);
		enemyPanel.add(hpLabel2);
		
		hpLabelNumber2.setFont(normalFont);
		hpLabelNumber2.setForeground(Color.blue);
		enemyPanel.add(hpLabelNumber2);
		
		mpLabel2.setText("MP:");
		mpLabel2.setFont(normalFont);
		mpLabel2.setForeground(Color.blue);
		enemyPanel.add(mpLabel2);
		
		mpLabelNumber2.setFont(normalFont);
		mpLabelNumber2.setForeground(Color.blue);
		enemyPanel.add(mpLabelNumber2);
		
		defLabel2.setText("DEF:");
		defLabel2.setFont(normalFont);
		defLabel2.setForeground(Color.blue);
		enemyPanel.add(defLabel2);
		
		defLabelNumber2.setFont(normalFont);
		defLabelNumber2.setForeground(Color.blue);
		enemyPanel.add(defLabelNumber2);
		
		evasionLabel2.setText("EVA:");
		evasionLabel2.setFont(normalFont);
		evasionLabel2.setForeground(Color.blue);
		enemyPanel.add(evasionLabel2);
		
		evasionLabelNumber2.setFont(normalFont);
		evasionLabelNumber2.setForeground(Color.blue);
		enemyPanel.add(evasionLabelNumber2);
		
		attackLabel2.setText("ATK:");
		attackLabel2.setFont(normalFont);
		attackLabel2.setForeground(Color.blue);
		enemyPanel.add(attackLabel2);
		
		attackLabelNumber2.setFont(normalFont);
		attackLabelNumber2.setForeground(Color.blue);
		enemyPanel.add(attackLabelNumber2);
	}
	public void fightButtons() {
		choice1.setText("Attack");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choiceButtonPanel.add(choice1);
		choice1.addActionListener(choiceHandler);
				
		choice2.setText("Special");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choiceButtonPanel.add(choice2);
		choice2.addActionListener(choiceHandler);
				
		choice3.setText("Defend");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choiceButtonPanel.add(choice3);
		choice3.addActionListener(choiceHandler);
				
		choice4.setText("Inventory");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choiceButtonPanel.add(choice4);
		choice4.addActionListener(choiceHandler);
	}
	public void specButtons(String name) {
		switch(name) {
		case "Warrior":
			choice1.setText("Strike - "+strike+"MP");
			if (player.getMp() >= strike) {
				choice1.addActionListener(specChoiceHandler);
			}
			choice2.setText("Blow - "+blow+"MP");
			if (player.getMp() >= blow) {
				choice2.addActionListener(specChoiceHandler);
			}
			choice3.setText("Huff-Puff - "+huffpuff+"MP");
			if (player.getMp() >= huffpuff) {
				choice3.addActionListener(specChoiceHandler);
			}
			choice4.setText("Back");
			System.out.println("Go Back");
			break;
		case "Mage":
			choice1.setText("Thaumatise - "+thaumatise+"MP");
			if (player.getMp() >= thaumatise) {
				choice1.addActionListener(specChoiceHandler);
			}
			choice2.setText("MP-Drain - "+mpDrain+"MP");
			if (player.getMp() >= mpDrain) {
				choice2.addActionListener(specChoiceHandler);
			}
			choice3.setText("Cure - "+cure+"MP");
			if (player.getMp() >= cure) {
				choice3.addActionListener(specChoiceHandler);
			}
			choice4.setText("Back");
			System.out.println("Go Back");
			break;
		case "Thief":
			choice1.setText("Bleed - "+bleed+"MP");
			if (player.getMp() >= bleed) {
				choice1.addActionListener(specChoiceHandler);
			}
			choice2.setText("Blind - "+blind+"MP");
			if (player.getMp() >= blind) {
				choice2.addActionListener(specChoiceHandler);
			}
			choice3.setText("Fasten - "+fasten+"MP");
			if (player.getMp() >= fasten) {
				choice3.addActionListener(specChoiceHandler);
			}
			choice4.setText("Back");
			break;
		}
		choice4.addActionListener(specChoiceHandler);
		System.out.println("SpecChoice opened");
	}
	public class ChoiceHandler implements ActionListener {
    	
		public void actionPerformed(ActionEvent event) {
			JButton source = (JButton) event.getSource();
			monsterAttackDelay = 0;
			checkStatusEffects();
			if (source == choice1) {
				System.out.println("Attack clicked");
				playerAttack();
				
			} else if (source == choice2) {
				System.out.println("Special clicked");
				choice1.removeActionListener(choiceHandler);
				choice2.removeActionListener(choiceHandler);
				choice3.removeActionListener(choiceHandler);
				choice4.removeActionListener(choiceHandler);
				specButtons(player.getName());
				monsterAttackDelay++;
				choiceSum++;
			} else if (source == choice3 && choiceSum < 1) {
				System.out.println("Defend clicked");
				choice3.removeActionListener(choiceHandler);
				choiceSum++;
				player.setDef(player.getDef() + 10);
				player.setEvasion(player.getEvasion() + 5);
				setStats();
				mainTextArea.append("You gained +10 Def points and 5% Evasion");
				
			} else if (source == choice4) {
				choiceSum--;
				mainTextArea.append("Choice 4 clicked");
				System.out.println("Choice 4 clicked");
				
				}
			if (source == choice1 || source == choice3 || source == choice4) {
				if(choiceSum > 0) {
					System.out.println("Waiting for DEf: "+choiceSum);
					choiceSum--;
				} else {
					System.out.println("You can Defend cuz: "+choiceSum);
					choice3.addActionListener(choiceHandler);
					player.setEvasion(player2.getEvasion());
				}
			}
			
			if (monsterAttackDelay == 0) {
				monsterAttack();
			} else {
				monsterAttackDelay--;
			}
			window.revalidate();
			window.repaint();
		}
	}
	public class SpecChoiceHandler implements ActionListener {	
	
		public void actionPerformed(ActionEvent event) {
			JButton source = (JButton) event.getSource();
			switch(player.getName()) {
			case "Warrior":
				if (source == choice1 && player.getMp() >= strike) {
					System.out.println("Strike clicked");
					player.setAttack((int) (player.getAttack() * 1.3));
					playerAttack();
					player.setMp(player.getMp() - strike);
					player.setAttack(player2.getAttack());
					monsterAttack();
					
				} else if (source == choice2 && player.getMp() >= blow) {
					System.out.println("Blow clicked");
					if(monster.getDef() > 0) {
						player.setAttack((int) (player.getAttack() * 2.7));
					} else {
						player.setAttack((int) (player.getAttack() * 1.1));
					}
					playerAttack();
					player.setMp(player.getMp() - blow);
					player.setAttack(player2.getAttack());
					monsterAttack();
					
				} else if (source == choice3 && player.getMp() >= huffpuff) {
					System.out.println("Huff-Puff clicked");
					int a = (int) ((Math.random() * 20) + 40);
					System.out.println(a);
					player.setHp(player.getHp() + a);
					mainTextArea.append("U healed "+a+"HP!");
					player.setMp(player.getMp() - huffpuff);
					monsterAttack();
					
				} else if (source == choice4) {
					System.out.println("Back clicked");
					monsterAttackDelay++;
				}
				break;
			case "Mage":
				if (source == choice1 && player.getMp() >= thaumatise) {
					System.out.println("Thaumatise clicked");
					player.setAttack((int) (player.getAttack() * 8.45));
					playerAttack();
					
					player.setMp(player.getMp() - thaumatise);
					player.setAttack(player2.getAttack());
					monsterAttack();
				
				} else if (source == choice2 && player.getMp() >= mpDrain) {
					System.out.println("MP-DRAIN clicked");
					player.setAttack((int) (player.getAttack() * 1.3));
					playerAttack();
					player.setMp(player.getMp() - mpDrain);
					if (hitEnemy == true) {
						player.setMp(player.getMp() + player.getAttack());
						hitEnemy = false;
					}
					player.setAttack(player2.getAttack());
					monsterAttack();
					
				} else if (source == choice3 && player.getMp() >= cure) {
					System.out.println("Cure clicked");
					int a = (int) ((Math.random() * 35) + 53);
					player.setHp(player.getHp() + a);
					mainTextArea.append("U healed "+a+"HP!");
					player.setMp(player.getMp() - cure);
					monsterAttack();

				} else if (source == choice4) {
					System.out.println("Back clicked");
					monsterAttackDelay++;
					}
				break;
			case "Thief":
				if (source == choice1 && player.getMp() >= bleed) {
					System.out.println("Bleed clicked");
					player.setAttack((int) (player.getAttack() * 1.3));
					playerAttack();
					player.setMp(player.getMp() - bleed);
					player.setAttack(player2.getAttack());
					if(hitEnemy == true){
						enemyBleed = true;
						enemyBleedNum = (int) (player.getAttack() * 0.6);
						mainTextArea.append("Enemy is bleeding");
						hitEnemy = false;
					}
					monsterAttack();
					
				} else if (source == choice2 && player.getMp() >= blind) {
					System.out.println("Blind clicked");
					player.setAttack((int) (player.getAttack() * 0.95));
					playerAttack();
					player.setMp(player.getMp() - blind);
					if (hitEnemy == true) {
						mainTextArea.append("Enemy got blinded");
						hitEnemy = false;
					}
					player.setAttack(player2.getAttack());
					monsterAttack();
					
				} else if (source == choice3 && player.getMp() >= fasten) {
					System.out.println("Fasten clicked");
					int a = 10;
					player.setEvasion(player.getEvasion() + a);
					mainTextArea.append("U gained "+a+"EVASION!");
					player.setMp(player.getMp() - fasten);
					thiefEvasionUseTurn = 4;
					thiefEvasionUse += 5;
					monsterAttack();
					thiefEvasionUse--;

				} else if (source == choice4) {
					System.out.println("Back clicked");
					choiceSum++;
					monsterAttackDelay++;
				}
				break;
			}
			if(thiefEvasionUse > 0){
				thiefEvasionUse--;
			}
			if(thiefEvasionUseTurn > 0){
				thiefEvasionUseTurn--;
			}
			resetChoiceButtons();
			setStats();
			window.revalidate();
			window.repaint();
		}
		private void resetChoiceButtons() {
	        choice1.removeActionListener(specChoiceHandler);
	        choice2.removeActionListener(specChoiceHandler);
	        choice3.removeActionListener(specChoiceHandler);
	        choice4.removeActionListener(specChoiceHandler);

	        choice1.addActionListener(choiceHandler);
	        choice2.addActionListener(choiceHandler);
	        choice3.addActionListener(choiceHandler);
	        choice4.addActionListener(choiceHandler);

	        choice1.setText("Attack");
	        choice2.setText("Special");
	        choice3.setText("Defend");
	        choice4.setText("Inventory");
	    }
	}
	//fight Events
	public void upgradePlayer(int exp) {
		if(exp >= upgradeExp) {
			player.setExp(0);
			//upgradeExp = (int) (upgradeExp * 1.25);
			player.setLevel(player.getLevel()+1);
			player2.setHp(((int)(player2.getHp() * 1.12)));
			player2.setMp(((int)(player2.getMp() * 1.12)));
			player2.setDef(((int)(player2.getDef() * 1.06)));
			player.setAttack(((int)(player.getAttack() * 1.11)));
			System.out.println("Level upgrade!");
			System.out.println(player);
		}
	}
	public void playerAttack() {
		if(monster.getDef() > 0) {
			if(((int) (Math.random() * 100 + 1)) > monster.getEvasion() && ((int) (Math.random() * 100 + 1)) > playerBlindNum) {
				hitEnemy = true;
				monster.setDef(monster.getDef() - ((int) (player.getAttack() / 2)));
				System.out.println("Ur hit: "+((int) (player.getAttack() / 2)));
				if (monster.getDef() < 0) {
					monster.setHp(monster.getHp() + monster.getDef());
					monster.setDef(0);
					mainTextArea.append("\nYou hit the Monster. Its Defence broke and It have yet "+monster.getHp()+"Hp left");
					} else {
				mainTextArea.append("\nYou hit the Monster. It have yet "+monster.getDef()+"Def left");
				}
				setStats();
				} 
			else {
				mainTextArea.append("\nYou missed");
			}
		}
	else {
		if(((int) (Math.random() * 100 + 1)) >= monster.getEvasion() && ((int) (Math.random() * 100 + 1)) > playerBlindNum) {
			hitEnemy = true;
			monster.setHp(monster.getHp() - player.getAttack());
			System.out.println("Ur hit: "+player.getAttack());
			if (monster.getHp() < 0) {
				monster.setHp(0);
			} else {
			mainTextArea.append("\nYou hit the Monster. It have yet "+monster.getHp()+"Hp left");
			}
		}
	}
	setStats();
	}
	public void monsterAttack() {
		if(player.getDef() > 0) {
			if(((int) (Math.random() * 100 + 1)) >= player.getEvasion() && ((int) (Math.random() * 100 + 1)) > enemyBlindNum) {
				player.setDef(player.getDef() - ((int) (monster.getAttack() / 2)));
				System.out.println("Enemy hit: "+monster.getAttack());
				if (player.getDef() < 0) {
					player.setHp(player.getHp() + player.getDef());
					player.setDef(0);
					mainTextArea.append("\nIt hit you. Your Defence broke and You have yet "+player.getHp()+"Hp left");
					} else {
						mainTextArea.append("\nIt hit You. You have yet "+player.getDef()+"Def left");
					}
				} 
			else {
				mainTextArea.append("\nIt missed");
			}
		}
		else {
			if(((int) (Math.random() * 100 + 1)) >= player.getEvasion()) {
				player.setHp(player.getHp() - monster.getAttack());
				System.out.println("Enemy hit: "+monster.getAttack());
				if (player.getHp() < 0) {
					player.setHp(0);
				} 
				else {
					mainTextArea.append("\nIt hit You. You have yet "+player.getHp()+"Hp left");
				}
			} 
			else {
			mainTextArea.append("\nIt missed");
		}
	}
	setStats();
	}
	public void setStats() {
		//win check
		if(monster.getHp() < 1) {
			mainTextArea.append("\nYou Won");
			System.out.println("You won");
			player.setExp(player.getExp()+monster.getExp());
			//exp check
			upgradePlayer(player.getExp());
			
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
			
			choice1.removeActionListener(specChoiceHandler);
	        choice2.removeActionListener(specChoiceHandler);
	        choice3.removeActionListener(specChoiceHandler);
	        choice4.removeActionListener(specChoiceHandler);
	        
	        choice1.removeActionListener(choiceHandler);
	        choice2.removeActionListener(choiceHandler);
	        choice3.removeActionListener(choiceHandler);
	        choice4.removeActionListener(choiceHandler);
	        player.setHp(player.getHp() + 75);
	        player.setMp(player.getMp() + 20);
	        player.setDef(player.getDef() + 20);
	        
			fightScreen();
			}
		if (player.getHp() < 1) {
			mainTextArea.append("\nYou Lost");
			System.out.println("You Lost");
			backToMainScreen();
		}
		//monster
		if(monster.getHp() > monster2.getHp()) {
			monster.setHp(monster2.getHp());
		}
		if(monster.getMp() > monster2.getMp()) {
			monster.setMp(monster2.getMp());
		}
		if(monster.getDef() > monster2.getDef()) {
			monster.setDef(monster2.getDef());
		}
        hpLabelNumber2.setText(String.valueOf(monster.getHp())+"/"+monster2.getHp());
        mpLabelNumber2.setText(String.valueOf(monster.getMp())+"/"+monster2.getMp());
        defLabelNumber2.setText(String.valueOf(monster.getDef())+"/"+monster2.getDef());
        evasionLabelNumber2.setText(String.valueOf(monster.getEvasion()));
        attackLabelNumber2.setText(String.valueOf(monster.getAttack()));
        //player
        if(player.getHp() > player2.getHp()) {
        	player.setHp(player2.getHp());
		}
		if(player.getMp() > player2.getMp()) {
			player.setMp(player2.getMp());
		}
		if(player.getDef() > player2.getDef()) {
			player.setDef(player2.getDef());
		}
        hpLabelNumber.setText(String.valueOf(player.getHp())+"/"+String.valueOf(player2.getHp()));
        mpLabelNumber.setText(String.valueOf(player.getMp())+"/"+String.valueOf(player2.getMp()));
        defLabelNumber.setText(String.valueOf(player.getDef())+"/"+String.valueOf(player2.getDef()));
        evasionLabelNumber.setText(String.valueOf(player.getEvasion()));
        attackLabelNumber.setText(String.valueOf(player.getAttack()));
	}
	public void checkStatusEffects() {
		mainTextArea.setText("");
		hitEnemy = false;
		//enemy
		if (enemyBleed == true) {
			monster.setHp(monster.getHp()- ((int)(enemyBleedNum / 3)));
			mainTextArea.append("The monster is bleeding "+((int)(enemyBleedNum / 3))+"HP!");
		}
		if (enemyBlind == true) {
			enemyBlindNum = 60;
		}
		//player
		if (playerBleed == true) {
			player.setHp(player.getHp()- ((int)(playerBleedNum / 3)));
			mainTextArea.append("You are bleeding "+playerBleedNum+"HP!");
		}
		if (playerBlind == true) {
			playerBlindNum = 60;
		}
		if(thiefEvasionUseTurn == 0) {
			player.setEvasion(player2.getEvasion());
		}
	}
	//Go Back
	public void backToMainScreen() {
		//buttons
		choice1.removeActionListener(specChoiceHandler);
        choice2.removeActionListener(specChoiceHandler);
        choice3.removeActionListener(specChoiceHandler);
        choice4.removeActionListener(specChoiceHandler);
        
        choice1.removeActionListener(choiceHandler);
        choice2.removeActionListener(choiceHandler);
        choice3.removeActionListener(choiceHandler);
        choice4.removeActionListener(choiceHandler);

        startButton.removeActionListener(chooseClass);
        mageButton.removeActionListener(toFightScreen);
        warriorButton.removeActionListener(toFightScreen);
        thiefButton.removeActionListener(toFightScreen);
		//StartScreen
			//panels
			titleNamePanel.setVisible(false);
			//labels
			titleNamePanel.remove(titleNameLabel);
		//ClassChooseScreen
			//panels
			warriorPicPanel.setVisible(false);
			warriorStatPanel.setVisible(false);
			warriorSpecPanel.setVisible(false);
			magePicPanel.setVisible(false);
			mageStatPanel.setVisible(false);
			mageSpecPanel.setVisible(false);
			thiefPicPanel.setVisible(false);
			thiefStatPanel.setVisible(false);
			thiefSpecPanel.setVisible(false);
			//labels
			warriorStatPanel.remove(warriorName);
	        warriorStatPanel.remove(warriorHp);
	        warriorStatPanel.remove(warriorMp);
	        warriorStatPanel.remove(warriorDef);
	        warriorStatPanel.remove(warriorEva);
	        warriorStatPanel.remove(warriorAtk);
	        warriorStatPanel.remove(warriorName2);
	        warriorStatPanel.remove(warriorHp2);
	        warriorStatPanel.remove(warriorMp2);
	        warriorStatPanel.remove(warriorDef2);
	        warriorStatPanel.remove(warriorEva2);
	        warriorStatPanel.remove(warriorAtk2);

	        mageName.remove(mageName);
	        mageName.remove(mageHp);
	        mageName.remove(mageMp);
	        mageName.remove(mageDef);
	        mageName.remove(mageEva);
	        mageName.remove(mageAtk);
	        mageName.remove(mageName2);
	        mageName.remove(mageHp2);
	        mageName.remove(mageMp2);
	        mageName.remove(mageDef2);
	        mageName.remove(mageEva2);
	        mageName.remove(mageAtk2);
	        
	        thiefName.remove(thiefName);
	        thiefName.remove(thiefHp);
	        thiefName.remove(thiefMp);
	        thiefName.remove(thiefDef);
	        thiefName.remove(thiefEva);
	        thiefName.remove(thiefAtk);
	        thiefName.remove(thiefName2);
	        thiefName.remove(thiefHp2);
	        thiefName.remove(thiefMp2);
	        thiefName.remove(thiefDef2);
	        thiefName.remove(thiefEva2);
	        thiefName.remove(thiefAtk2);
	        //speclabels
	        warriorSpecPanel.remove(warriorSpec);
	        mageSpecPanel.remove(mageSpec);
	        thiefSpecPanel.remove(thiefSpec);
			//labels to pics
	        warriorPicPanel.remove(warriorPicLabel);
	        magePicPanel.remove(magePicLabel);
	        thiefPicPanel.remove(thiefPicLabel);
		//fightScreen
	        //panels
	        mainTextPanel.setVisible(false);
			picturePanel.setVisible(false);
			enemyNamePanel.setVisible(false);
			playerNamePanel.setVisible(false);
			playerPanel.setVisible(false);
			enemyPanel.setVisible(false);
			choiceButtonPanel.setVisible(false);
	        //labels
			mainTextPanel.remove(mainTextArea);
			picturePanel.remove(enemyLabel);
			enemyNamePanel.remove(enemyNameLabel);
			playerNamePanel.remove(playerNameLabel);
			playerPanel.remove(hpLabel);
			playerPanel.remove(hpLabelNumber);
			playerPanel.remove(mpLabel);
			playerPanel.remove(mpLabelNumber);
			playerPanel.remove(defLabel);
			playerPanel.remove(defLabelNumber);
			playerPanel.remove(evasionLabel);
			playerPanel.remove(evasionLabelNumber);
			enemyPanel.remove(hpLabel2);
			enemyPanel.remove(hpLabelNumber2);
			enemyPanel.remove(mpLabel2);
			enemyPanel.remove(mpLabelNumber2);
			enemyPanel.remove(defLabel2);
			enemyPanel.remove(defLabelNumber2);
			enemyPanel.remove(evasionLabel2);
			enemyPanel.remove(evasionLabelNumber2);
			playerPanel.remove(attackLabel);
			playerPanel.remove(attackLabelNumber);
			enemyPanel.remove(attackLabel2);
			enemyPanel.remove(attackLabelNumber2);
		System.out.println("game resetted newly");
		gameStart();
	}
}
