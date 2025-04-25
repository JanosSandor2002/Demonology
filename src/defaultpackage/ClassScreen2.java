package defaultpackage;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClassScreen2 {
	
	public static JPanel warriorPicPanel = new JPanel();
	public static JPanel warriorStatPanel = new JPanel();
	public static JPanel warriorSpecPanel = new JPanel();
	public static JPanel magePicPanel = new JPanel();
	public static JPanel mageStatPanel = new JPanel();
	public static JPanel mageSpecPanel = new JPanel();
	public static JPanel thiefPicPanel = new JPanel();
	public static JPanel thiefStatPanel = new JPanel();
	public static JPanel thiefSpecPanel = new JPanel();
	
	public static JLabel warriorName = new JLabel();
	public static JLabel warriorHp = new JLabel();
	public static JLabel warriorMp = new JLabel();
	public static JLabel warriorDef = new JLabel();
	public static JLabel warriorEva = new JLabel();
	public static JLabel warriorAtk = new JLabel();
	public static JLabel warriorSpec = new JLabel();
	public static JLabel mageName = new JLabel();
	public static JLabel mageHp = new JLabel();
	public static JLabel mageMp = new JLabel();
	public static JLabel mageDef = new JLabel();
	public static JLabel mageEva = new JLabel();
	public static JLabel mageAtk = new JLabel();
	public static JLabel mageSpec = new JLabel();
	public static JLabel thiefName = new JLabel();
	public static JLabel thiefHp = new JLabel();
	public static JLabel thiefMp = new JLabel();
	public static JLabel thiefDef = new JLabel();
	public static JLabel thiefEva = new JLabel();
	public static JLabel thiefAtk = new JLabel();
	public static JLabel thiefSpec = new JLabel();
	public static JLabel warriorName2 = new JLabel();
	public static JLabel warriorHp2 = new JLabel();
	public static JLabel warriorMp2 = new JLabel();
	public static JLabel warriorDef2 = new JLabel();
	public static JLabel warriorEva2 = new JLabel();
	public static JLabel warriorAtk2 = new JLabel();
	public static JLabel mageName2 = new JLabel();
	public static JLabel mageHp2 = new JLabel();
	public static JLabel mageMp2 = new JLabel();
	public static JLabel mageDef2 = new JLabel();
	public static JLabel mageEva2 = new JLabel();
	public static JLabel mageAtk2 = new JLabel();
	public static JLabel thiefName2 = new JLabel();
	public static JLabel thiefHp2 = new JLabel();
	public static JLabel thiefMp2 = new JLabel();
	public static JLabel thiefDef2 = new JLabel();
	public static JLabel thiefEva2 = new JLabel();
	public static JLabel thiefAtk2 = new JLabel();
	
	public static JLabel warriorPicLabel = new JLabel();
	public static JLabel magePicLabel = new JLabel();
	public static JLabel thiefPicLabel = new JLabel();
	
	public static JButton warriorButton = new JButton();
	public static JButton mageButton = new JButton();
	public static JButton thiefButton = new JButton();
	
	public static setPlayerClass toFightScreen;
	
	static String playerName;
	
	public static void classScreen() {
		toFightScreen = new ClassScreen2().new setPlayerClass();
		//panels
		ClassScreen2.warriorPicPanel.setBounds(0, 0, 250, 200);
		ClassScreen2.warriorPicPanel.setBackground(Color.blue);
		ClassScreen2.warriorPicPanel.setVisible(true);
		
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
		warriorName.setFont(Main.normalFont);
		warriorStatPanel.add(warriorName);
		
		warriorName2.setText(Main.Warrior.getName());
		warriorName2.setForeground(Color.red);
		warriorName2.setFont(Main.normalFont);
		warriorStatPanel.add(warriorName2);
		
		warriorHp.setText("HP:");
		warriorHp.setForeground(Color.red);
		warriorHp.setFont(Main.normalFont);
		warriorStatPanel.add(warriorHp);
		
		warriorHp2.setText(String.valueOf(Main.Warrior.getHp()));
		warriorHp2.setForeground(Color.red);
		warriorHp2.setFont(Main.normalFont);
		warriorStatPanel.add(warriorHp2);
		
		warriorMp.setText("MP:");
		warriorMp.setForeground(Color.red);
		warriorMp.setFont(Main.normalFont);
		warriorStatPanel.add(warriorMp);
		
		warriorMp2.setText(String.valueOf(Main.Warrior.getMp()));
		warriorMp2.setForeground(Color.red);
		warriorMp2.setFont(Main.normalFont);
		warriorStatPanel.add(warriorMp2);
		
		warriorDef.setText("DEF:");
		warriorDef.setForeground(Color.red);
		warriorDef.setFont(Main.normalFont);
		warriorStatPanel.add(warriorDef);
		
		warriorDef2.setText(String.valueOf(Main.Warrior.getDef()));
		warriorDef2.setForeground(Color.red);
		warriorDef2.setFont(Main.normalFont);
		warriorStatPanel.add(warriorDef2);
		
		warriorEva.setText("EVASION:");
		warriorEva.setForeground(Color.red);
		warriorEva.setFont(Main.normalFont);
		warriorStatPanel.add(warriorEva);
		
		warriorEva2.setText(String.valueOf(Main.Warrior.getEvasion()));
		warriorEva2.setForeground(Color.red);
		warriorEva2.setFont(Main.normalFont);
		warriorStatPanel.add(warriorEva2);
		
		warriorAtk.setText("ATK:");
		warriorAtk.setForeground(Color.red);
		warriorAtk.setFont(Main.normalFont);
		warriorStatPanel.add(warriorAtk);
		
		warriorAtk2.setText(String.valueOf(Main.Warrior.getAttack()));
		warriorAtk2.setForeground(Color.red);
		warriorAtk2.setFont(Main.normalFont);
		warriorStatPanel.add(warriorAtk2);
		
		mageName.setText("NAME:");
		mageName.setForeground(Color.red);
		mageName.setFont(Main.normalFont);
		mageStatPanel.add(mageName);
		
		mageName2.setText(Main.Mage.getName());
		mageName2.setForeground(Color.red);
		mageName2.setFont(Main.normalFont);
		mageStatPanel.add(mageName2);
		
		mageHp.setText("HP:");
		mageHp.setForeground(Color.red);
		mageHp.setFont(Main.normalFont);
		mageStatPanel.add(mageHp);
		
		mageHp2.setText(String.valueOf(Main.Mage.getHp()));
		mageHp2.setForeground(Color.red);
		mageHp2.setFont(Main.normalFont);
		mageStatPanel.add(mageHp2);
		
		mageMp.setText("MP:");
		mageMp.setForeground(Color.red);
		mageMp.setFont(Main.normalFont);
		mageStatPanel.add(mageMp);
		
		mageMp2.setText(String.valueOf(Main.Mage.getMp()));
		mageMp2.setForeground(Color.red);
		mageMp2.setFont(Main.normalFont);
		mageStatPanel.add(mageMp2);
		
		mageDef.setText("DEF:");
		mageDef.setForeground(Color.red);
		mageDef.setFont(Main.normalFont);
		mageStatPanel.add(mageDef);
		
		mageDef2.setText(String.valueOf(Main.Mage.getDef()));
		mageDef2.setForeground(Color.red);
		mageDef2.setFont(Main.normalFont);
		mageStatPanel.add(mageDef2);
		
		mageEva.setText("EVASION:");
		mageEva.setForeground(Color.red);
		mageEva.setFont(Main.normalFont);
		mageStatPanel.add(mageEva);
		
		mageEva2.setText(String.valueOf(Main.Mage.getEvasion()));
		mageEva2.setForeground(Color.red);
		mageEva2.setFont(Main.normalFont);
		mageStatPanel.add(mageEva2);
		
		mageAtk.setText("ATK:");
		mageAtk.setForeground(Color.red);
		mageAtk.setFont(Main.normalFont);
		mageStatPanel.add(mageAtk);
		
		mageAtk2.setText(String.valueOf(Main.Mage.getAttack()));
		mageAtk2.setForeground(Color.red);
		mageAtk2.setFont(Main.normalFont);
		mageStatPanel.add(mageAtk2);
		
		thiefName.setText("NAME:");
		thiefName.setForeground(Color.red);
		thiefName.setFont(Main.normalFont);
		thiefStatPanel.add(thiefName);
		
		thiefName2.setText(Main.Thief.getName());
		thiefName2.setForeground(Color.red);
		thiefName2.setFont(Main.normalFont);
		thiefStatPanel.add(thiefName2);
		
		thiefHp.setText("HP:");
		thiefHp.setForeground(Color.red);
		thiefHp.setFont(Main.normalFont);
		thiefStatPanel.add(thiefHp);
		
		thiefHp2.setText(String.valueOf(Main.Thief.getHp()));
		thiefHp2.setForeground(Color.red);
		thiefHp2.setFont(Main.normalFont);
		thiefStatPanel.add(thiefHp2);
		
		thiefMp.setText("MP:");
		thiefMp.setForeground(Color.red);
		thiefMp.setFont(Main.normalFont);
		thiefStatPanel.add(thiefMp);
		
		thiefMp2.setText(String.valueOf(Main.Thief.getMp()));
		thiefMp2.setForeground(Color.red);
		thiefMp2.setFont(Main.normalFont);
		thiefStatPanel.add(thiefMp2);
		
		thiefDef.setText("DEF:");
		thiefDef.setForeground(Color.red);
		thiefDef.setFont(Main.normalFont);
		thiefStatPanel.add(thiefDef);
		
		thiefDef2.setText(String.valueOf(Main.Thief.getDef()));
		thiefDef2.setForeground(Color.red);
		thiefDef2.setFont(Main.normalFont);
		thiefStatPanel.add(thiefDef2);
		
		thiefEva.setText("EVASION:");
		thiefEva.setForeground(Color.red);
		thiefEva.setFont(Main.normalFont);
		thiefStatPanel.add(thiefEva);
		
		thiefEva2.setText(String.valueOf(Main.Thief.getEvasion()));
		thiefEva2.setForeground(Color.red);
		thiefEva2.setFont(Main.normalFont);
		thiefStatPanel.add(thiefEva2);
		
		thiefAtk.setText("ATK:");
		thiefAtk.setForeground(Color.red);
		thiefAtk.setFont(Main.normalFont);
		thiefStatPanel.add(thiefAtk);
		
		thiefAtk2.setText(String.valueOf(Main.Thief.getAttack()));
		thiefAtk2.setForeground(Color.red);
		thiefAtk2.setFont(Main.normalFont);
		thiefStatPanel.add(thiefAtk2);
		//add pictures to panels
		warriorPicPanel.add(warriorPicLabel);
		magePicPanel.add(magePicLabel);
		thiefPicPanel.add(thiefPicLabel);
		//buttons
		warriorButton.setText("SELECT");
		warriorButton.setBackground(Color.black);
		warriorButton.setForeground(Color.white);
		warriorButton.setFont(Main.normalFont);
		warriorSpecPanel.add(warriorButton);
		warriorButton.addActionListener(toFightScreen);
		
		mageButton.setText("SELECT");
		mageButton.setBackground(Color.black);
		mageButton.setForeground(Color.white);
		mageButton.setFont(Main.normalFont);
		mageSpecPanel.add(mageButton);
		mageButton.addActionListener(toFightScreen);
		
		thiefButton.setText("SELECT");
		thiefButton.setBackground(Color.black);
		thiefButton.setForeground(Color.white);
		thiefButton.setFont(Main.normalFont);
		thiefSpecPanel.add(thiefButton);
		thiefButton.addActionListener(toFightScreen);
	}
	public class setPlayerClass implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			JButton s = (JButton) event.getSource();
			
			ClassScreen2.warriorPicPanel.setVisible(false);
			warriorStatPanel.setVisible(false);
			warriorSpecPanel.setVisible(false);
			magePicPanel.setVisible(false);
			mageStatPanel.setVisible(false);
			mageSpecPanel.setVisible(false);
			thiefPicPanel.setVisible(false);
			thiefStatPanel.setVisible(false);
			thiefSpecPanel.setVisible(false);
			if (s == warriorButton) {
				if(GameStart1.classOk == true) {
					playerName = "Warrior";
					GameStart1.classOk = false;
				}
			} else if (s == mageButton) {
				if(GameStart1.classOk == true) {
					playerName = "Mage";
					GameStart1.classOk = false;
				}
			} else if (s == thiefButton) {
				if(GameStart1.classOk == true) {
					playerName = "Thief";
					GameStart1.classOk = false;
				}
			}
			warriorButton.removeActionListener(toFightScreen);
			mageButton.removeActionListener(toFightScreen);
			thiefButton.removeActionListener(toFightScreen);
			FightScreen3.fightScreen();
		}
	}
}
