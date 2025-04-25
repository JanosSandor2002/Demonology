package defaultpackage;

import interactions.FightButtons;
import interactions.SpecButtons;

public class BackToMain4 {
	public static void backToMainScreen() {
		//buttons
		FightButtons.choice1.removeActionListener(SpecButtons.specChoiceHandler);
		FightButtons.choice2.removeActionListener(SpecButtons.specChoiceHandler);
		FightButtons.choice3.removeActionListener(SpecButtons.specChoiceHandler);
		FightButtons.choice4.removeActionListener(SpecButtons.specChoiceHandler);
        
		FightButtons.choice1.removeActionListener(FightButtons.choiceHandler);
		FightButtons.choice2.removeActionListener(FightButtons.choiceHandler);
		FightButtons.choice3.removeActionListener(FightButtons.choiceHandler);
		FightButtons.choice4.removeActionListener(FightButtons.choiceHandler);

        GameStart1.startButton.removeActionListener(GameStart1.chooseClass);
        ClassScreen2.mageButton.removeActionListener(ClassScreen2.toFightScreen);
        ClassScreen2.warriorButton.removeActionListener(ClassScreen2.toFightScreen);
        ClassScreen2.thiefButton.removeActionListener(ClassScreen2.toFightScreen);
		//StartScreen
			//panels
        GameStart1.titleNamePanel.setVisible(false);
			//labels
        GameStart1.titleNamePanel.remove(GameStart1.titleNameLabel);
		//ClassChooseScreen
			//panels
			ClassScreen2.warriorPicPanel.setVisible(false);
			ClassScreen2.warriorStatPanel.setVisible(false);
			ClassScreen2.warriorSpecPanel.setVisible(false);
			ClassScreen2.magePicPanel.setVisible(false);
			ClassScreen2.mageStatPanel.setVisible(false);
			ClassScreen2.mageSpecPanel.setVisible(false);
			ClassScreen2.thiefPicPanel.setVisible(false);
			ClassScreen2.thiefStatPanel.setVisible(false);
			ClassScreen2.thiefSpecPanel.setVisible(false);
			//labels
			ClassScreen2.warriorStatPanel.remove(ClassScreen2.warriorName);
			ClassScreen2.warriorStatPanel.remove(ClassScreen2.warriorHp);
			ClassScreen2.warriorStatPanel.remove(ClassScreen2.warriorMp);
			ClassScreen2.warriorStatPanel.remove(ClassScreen2.warriorDef);
			ClassScreen2.warriorStatPanel.remove(ClassScreen2.warriorEva);
			ClassScreen2.warriorStatPanel.remove(ClassScreen2.warriorAtk);
			ClassScreen2.warriorStatPanel.remove(ClassScreen2.warriorName2);
			ClassScreen2.warriorStatPanel.remove(ClassScreen2.warriorHp2);
			ClassScreen2.warriorStatPanel.remove(ClassScreen2.warriorMp2);
			ClassScreen2.warriorStatPanel.remove(ClassScreen2.warriorDef2);
			ClassScreen2.warriorStatPanel.remove(ClassScreen2.warriorEva2);
			ClassScreen2.warriorStatPanel.remove(ClassScreen2.warriorAtk2);

			ClassScreen2.mageName.remove(ClassScreen2.mageName);
			ClassScreen2.mageName.remove(ClassScreen2.mageHp);
			ClassScreen2.mageName.remove(ClassScreen2.mageMp);
			ClassScreen2.mageName.remove(ClassScreen2.mageDef);
			ClassScreen2.mageName.remove(ClassScreen2.mageEva);
			ClassScreen2.mageName.remove(ClassScreen2.mageAtk);
			ClassScreen2.mageName.remove(ClassScreen2.mageName2);
			ClassScreen2.mageName.remove(ClassScreen2.mageHp2);
			ClassScreen2.mageName.remove(ClassScreen2.mageMp2);
			ClassScreen2.mageName.remove(ClassScreen2.mageDef2);
			ClassScreen2.mageName.remove(ClassScreen2.mageEva2);
			ClassScreen2.mageName.remove(ClassScreen2.mageAtk2);
	        
			ClassScreen2.thiefName.remove(ClassScreen2.thiefName);
			ClassScreen2.thiefName.remove(ClassScreen2.thiefHp);
			ClassScreen2.thiefName.remove(ClassScreen2.thiefMp);
			ClassScreen2.thiefName.remove(ClassScreen2.thiefDef);
			ClassScreen2.thiefName.remove(ClassScreen2.thiefEva);
			ClassScreen2.thiefName.remove(ClassScreen2.thiefAtk);
			ClassScreen2.thiefName.remove(ClassScreen2.thiefName2);
			ClassScreen2.thiefName.remove(ClassScreen2.thiefHp2);
			ClassScreen2.thiefName.remove(ClassScreen2.thiefMp2);
			ClassScreen2.thiefName.remove(ClassScreen2.thiefDef2);
			ClassScreen2.thiefName.remove(ClassScreen2.thiefEva2);
			ClassScreen2.thiefName.remove(ClassScreen2.thiefAtk2);
	        //speclabels
			ClassScreen2.warriorSpecPanel.remove(ClassScreen2.warriorSpec);
			ClassScreen2.mageSpecPanel.remove(ClassScreen2.mageSpec);
			ClassScreen2.thiefSpecPanel.remove(ClassScreen2.thiefSpec);
			//labels to pics
	        ClassScreen2.warriorPicPanel.remove(ClassScreen2.warriorPicLabel);
	        ClassScreen2.magePicPanel.remove(ClassScreen2.magePicLabel);
	        ClassScreen2.thiefPicPanel.remove(ClassScreen2.thiefPicLabel);
		//fightScreen
	        //panels
	        FightScreen3.mainTextPanel.setVisible(false);
	        FightScreen3.picturePanel.setVisible(false);
	        FightScreen3.enemyNamePanel.setVisible(false);
	        FightScreen3.playerNamePanel.setVisible(false);
	        FightScreen3.playerPanel.setVisible(false);
	        FightScreen3.enemyPanel.setVisible(false);
	        FightScreen3.choiceButtonPanel.setVisible(false);
	        //labels
	        FightScreen3.mainTextPanel.remove(FightScreen3.mainTextArea);
	        FightScreen3.picturePanel.remove(SetThingsUp.enemyLabel);
	        FightScreen3.enemyNamePanel.remove(FightScreen3.enemyNameLabel);
	        FightScreen3.playerNamePanel.remove(FightScreen3.playerNameLabel);
	        FightScreen3.playerPanel.remove(FightScreen3.hpLabel);
	        FightScreen3.playerPanel.remove(FightScreen3.hpLabelNumber);
	        FightScreen3.playerPanel.remove(FightScreen3.mpLabel);
	        FightScreen3.playerPanel.remove(FightScreen3.mpLabelNumber);
	        FightScreen3.playerPanel.remove(FightScreen3.defLabel);
	        FightScreen3.playerPanel.remove(FightScreen3.defLabelNumber);
	        FightScreen3.playerPanel.remove(FightScreen3.evasionLabel);
	        FightScreen3.playerPanel.remove(FightScreen3.evasionLabelNumber);
	        FightScreen3.enemyPanel.remove(FightScreen3.hpLabel2);
	        FightScreen3.enemyPanel.remove(FightScreen3.hpLabelNumber2);
	        FightScreen3.enemyPanel.remove(FightScreen3.mpLabel2);
	        FightScreen3.enemyPanel.remove(FightScreen3.mpLabelNumber2);
	        FightScreen3.enemyPanel.remove(FightScreen3.defLabel2);
	        FightScreen3.enemyPanel.remove(FightScreen3.defLabelNumber2);
	        FightScreen3.enemyPanel.remove(FightScreen3.evasionLabel2);
	        FightScreen3.enemyPanel.remove(FightScreen3.evasionLabelNumber2);
	        FightScreen3.playerPanel.remove(FightScreen3.attackLabel);
	        FightScreen3.playerPanel.remove(FightScreen3.attackLabelNumber);
	        FightScreen3.enemyPanel.remove(FightScreen3.attackLabel2);
	        FightScreen3.enemyPanel.remove(FightScreen3.attackLabelNumber2);
		System.out.println("game resetted newly");
		GameStart1.gameStart();
	}
}
