package defaultpackage;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import interactions.FightButtons;
import interactions.SpecButtons;

public class SetThingsUp {
	
	public static Player player;

	public static Player player2;
	
	public static Monster monster;

	public static Monster monster2;
	
	public static Image sirenheadImage, sirenheadImage2, valakImage, valakImage2, annabelleImage, annabelleImage2, slendermanImage, slendermanImage2,
	alienImage, alienImage2, bonnyImage, bonnyImage2, boogeymanImage, boogeymanImage2, chicaImage, chicaImage2, demogorgonImage, demogorgonImage2,
	foxyImage, foxyImage2, freddyImage, freddyImage2, kingkongImage, kingkongImage2, maraImage, maraImage2, jasonImage, jasonImage2;
	
	public static ImageIcon valak, annabelle, slenderman, sirenhead, warrior, mage, thief, alien, bonny, foxy, chica, freddy, jason, mara, kingkong, 
	demogorgon, boogeyman, scaledIcon = new ImageIcon();
	
	public static JLabel enemyLabel = new JLabel();
	
	public static void setPlayer(Player p) {
		if (GameStart1.levelNum == 0) {	
			player = new Player(p.getName(), p.getHp(), p.getMp(), p.getDef(), p.getEvasion(), 1, p.getAttack());
		    player2 = new Player(p.getName(), p.getHp(), p.getMp(), p.getDef(), p.getEvasion(), 1, p.getAttack());
		    player2.setExp(GameStart1.upgradeExp);
		    System.out.println("Player set: "+ player.getName());
		} else {
			upgradePlayer(player.getExp());
		}
		GameStart1.levelNum = 1;
	}
	public static void setEnemy() {
		switch(GameStart1.size) {
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
        	BackToMain4.backToMainScreen();
        	System.out.println(GameStart1.size);
        	break;
	    }
	    GameStart1.size++;
	    enemyLabel.setIcon(scaledIcon);
	    
	    monster2.setName(monster.getName());
        monster2.setHp(monster.getHp());
        monster2.setMp(monster.getMp());
        monster2.setDef(monster.getDef());
        monster2.setEvasion(monster.getEvasion());
        monster2.setLevel(monster.getLevel());
        monster2.setAttack(monster.getAttack());
	    FightScreen3.picturePanel.add(enemyLabel);
	    System.out.println("Enemy set: "+monster.getName());
        //refresh
	    FightScreen3.picturePanel.revalidate();
	    FightScreen3.picturePanel.repaint();
	    
	}
	public static void upgradePlayer(int exp) {
		if(exp >= GameStart1.upgradeExp) {
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
	public static void setStats() {
		//win check
		if(monster.getHp() < 1) {
			FightScreen3.mainTextArea.append("\nYou Won");
			System.out.println("You won");
			player.setExp(player.getExp()+monster.getExp());
			//exp check
			upgradePlayer(player.getExp());
			
			GameStart1.hitEnemy = false; 
			GameStart1.enemyBleed = false;
			GameStart1.enemyBlind = false;
			GameStart1.playerBlind = false;
			GameStart1.playerBleed = false;
			GameStart1.choiceSum = 0;
			GameStart1.monsterAttackDelay = 0;
			GameStart1.enemyBleedNum = 0;
			GameStart1.thiefEvasionUse = 0;
			GameStart1.thiefEvasionUseTurn = 0;
			GameStart1.enemyBlindNum = 0;
			GameStart1.playerBlindNum = 0;
			GameStart1.playerBleedNum = 0;
			
			FightButtons.choice1.removeActionListener(SpecButtons.specChoiceHandler);
			FightButtons.choice2.removeActionListener(SpecButtons.specChoiceHandler);
			FightButtons.choice3.removeActionListener(SpecButtons.specChoiceHandler);
			FightButtons.choice4.removeActionListener(SpecButtons.specChoiceHandler);
	        
	        FightButtons.choice1.removeActionListener(FightButtons.choiceHandler);
	        FightButtons.choice2.removeActionListener(FightButtons.choiceHandler);
	        FightButtons.choice3.removeActionListener(FightButtons.choiceHandler);
	        FightButtons.choice4.removeActionListener(FightButtons.choiceHandler);
	        player.setHp(player.getHp() + 75);
	        player.setMp(player.getMp() + 20);
	        player.setDef(player.getDef() + 20);
	        
			FightScreen3.fightScreen();
			}
		if (player.getHp() < 1) {
			FightScreen3.mainTextArea.append("\nYou Lost");
			System.out.println("You Lost");
			BackToMain4.backToMainScreen();
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
		FightScreen3.hpLabelNumber2.setText(String.valueOf(monster.getHp())+"/"+monster2.getHp());
		FightScreen3.mpLabelNumber2.setText(String.valueOf(monster.getMp())+"/"+monster2.getMp());
		FightScreen3.defLabelNumber2.setText(String.valueOf(monster.getDef())+"/"+monster2.getDef());
		FightScreen3.evasionLabelNumber2.setText(String.valueOf(monster.getEvasion()));
		FightScreen3.attackLabelNumber2.setText(String.valueOf(monster.getAttack()));
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
		FightScreen3.hpLabelNumber.setText(String.valueOf(player.getHp())+"/"+String.valueOf(player2.getHp()));
		FightScreen3.mpLabelNumber.setText(String.valueOf(player.getMp())+"/"+String.valueOf(player2.getMp()));
		FightScreen3.defLabelNumber.setText(String.valueOf(player.getDef())+"/"+String.valueOf(player2.getDef()));
		FightScreen3.evasionLabelNumber.setText(String.valueOf(player.getEvasion()));
		FightScreen3.attackLabelNumber.setText(String.valueOf(player.getAttack()));
	}
	public static void checkStatusEffects() {
		FightScreen3.mainTextArea.setText("");
		GameStart1.hitEnemy = false;
		//enemy
		if (GameStart1.enemyBleed == true) {
			monster.setHp(monster.getHp()- ((int)(GameStart1.enemyBleedNum / 3)));
			FightScreen3.mainTextArea.append("The monster is bleeding "+((int)(GameStart1.enemyBleedNum / 3))+"HP!");
		}
		if (GameStart1.enemyBlind == true) {
			GameStart1.enemyBlindNum = 60;
		}
		//player
		if (GameStart1.playerBleed == true) {
			player.setHp(player.getHp()- ((int)(GameStart1.playerBleedNum / 3)));
			FightScreen3.mainTextArea.append("You are bleeding "+GameStart1.playerBleedNum+"HP!");
		}
		if (GameStart1.playerBlind == true) {
			GameStart1.playerBlindNum = 60;
		}
		if(GameStart1.thiefEvasionUseTurn == 0) {
			player.setEvasion(player2.getEvasion());
		}
	}
}
