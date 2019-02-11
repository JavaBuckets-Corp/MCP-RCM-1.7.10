package javabuckets.mods.rcm.commands;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.LevelUpUtil;

public class CommandSetLvlChecker 
{
	public static void checker(String skill, int level)
	{
		
		setXpFromLevel(skill, level);
		RCM.instance.skillHandler.levelUp(skill, level);
	}

	private static void setXpFromLevel(String skill, int level)
	{
		RCM.instance.skillHandler.addXPToSkill(skill, getXpFromLevel(level) - RCM.instance.skillHandler.getExperience(skill));
		RCM.instance.skillHandler.setLevel(skill, level, getXpFromLevel(level));
		
		LevelUpUtil.updateLvls();
	}
	
	public static double getXpFromLevel(int level)
	{
		if (level == 1) { return 0D; }
		else if (level == 2) { return 83D; }
		else if (level == 3) { return 174D; }
		else if (level == 4) { return 276D; }
		else if (level == 5) { return 388D; }
		else if (level == 6) { return 512D; }
		else if (level == 7) { return 650D; }
		else if (level == 8) { return 801D; }
		else if (level == 9) { return 969D; }
		else if (level == 10) { return 1154D; }
		else if (level == 11) { return 1358D; }
		else if (level == 12) { return 1584D; }
		else if (level == 13) { return 1833D; }
		else if (level == 14) { return 2107D; }
		else if (level == 15) { return 2411D; }
		else if (level == 16) { return 2746D; }
		else if (level == 17) { return 3115D; }
		else if (level == 18) { return 3523D; }
		else if (level == 19) { return 3973D; }
		else if (level == 20) { return 4470D; }
		else if (level == 21) { return 5018D; }
		else if (level == 22) { return 5624D; }
		else if (level == 23) { return 6291D; }
		else if (level == 24) { return 7028D; }
		else if (level == 25) { return 7842D; }
		else if (level == 26) { return 8740D; }
		else if (level == 27) { return 9730D; }
		else if (level == 28) { return 10824D; }
		else if (level == 29) { return 12031D; }
		else if (level == 30) { return 13363D; }
		else if (level == 31) { return 14833D; }
		else if (level == 32) { return 16456D; }
		else if (level == 33) { return 18247D; }
		else if (level == 34) { return 20224D; }
		else if (level == 35) { return 22406D; }
		else if (level == 36) { return 24815D; }
		else if (level == 37) { return 27473D; }
		else if (level == 38) { return 30408D; }
		else if (level == 39) { return 33648D; }
		else if (level == 40) { return 37224D; }
		else if (level == 41) { return 41171D; }
		else if (level == 42) { return 45529D; }
		else if (level == 43) { return 50339D; }
		else if (level == 44) { return 55649D; }
		else if (level == 45) { return 61512D; }
		else if (level == 46) { return 67983D; }
		else if (level == 47) { return 75127D; }
		else if (level == 48) { return 83014D; }
		else if (level == 49) { return 91721D; }
		else if (level == 50) { return 101333D; }
		else if (level == 51) { return 111945D; }
		else if (level == 52) { return 123660D; }
		else if (level == 53) { return 136594D; }
		else if (level == 54) { return 150872D; }
		else if (level == 55) { return 166636D; }
		else if (level == 56) { return 184040D; }
		else if (level == 57) { return 203254D; }
		else if (level == 58) { return 224466D; }
		else if (level == 59) { return 247886D; }
		else if (level == 60) { return 273742D; }
		else if (level == 61) { return 302288D; }
		else if (level == 62) { return 333804D; }
		else if (level == 63) { return 368599D; }
		else if (level == 64) { return 407015D; }
		else if (level == 65) { return 449428D; }
		else if (level == 66) { return 496254D; }
		else if (level == 67) { return 547953D; }
		else if (level == 68) { return 605032D; }
		else if (level == 69) { return 668051D; }
		else if (level == 70) { return 737627D; }
		else if (level == 71) { return 814445D; }
		else if (level == 72) { return 899257D; }
		else if (level == 73) { return 992895D; }
		else if (level == 74) { return 1096278D; }
		else if (level == 75) { return 1210421D; }
		else if (level == 76) { return 1336443D; }
		else if (level == 77) { return 1475581D; }
		else if (level == 78) { return 1629200D; }
		else if (level == 79) { return 1798808D; }
		else if (level == 80) { return 1986068D; }
		else if (level == 81) { return 2192818D; }
		else if (level == 82) { return 2421087D; }
		else if (level == 83) { return 2673114D; }
		else if (level == 84) { return 2951373D; }
		else if (level == 85) { return 3258594D; }
		else if (level == 86) { return 3597792D; }
		else if (level == 87) { return 3972294D; }
		else if (level == 88) { return 4385776D; }
		else if (level == 89) { return 4842295D; }
		else if (level == 90) { return 5346332D; }
		else if (level == 91) { return 5902831D; }
		else if (level == 92) { return 6517253D; }
		else if (level == 93) { return 7195629D; }
		else if (level == 94) { return 7944614D; }
		else if (level == 95) { return 8771558D; }
		else if (level == 96) { return 9684577D; }
		else if (level == 97) { return 10692629D; }
		else if (level == 98) { return 11805606D; }
		else if (level == 99) { return 13034431D; }
		else if (level == 100) { return 14391136D; }
		else if (level == 101) { return 15889028D; }
		else if (level == 102) { return 17542801D; }
		else if (level == 103) { return 19368677D; }
		else if (level == 104) { return 21384566D; }
		else if (level == 105) { return 23610242D; }
		else if (level == 106) { return 26067536D; }
		else if (level == 107) { return 28780553D; }
		else if (level == 108) { return 31775904D; }
		else if (level == 109) { return 35082972D; }
		else if (level == 110) { return 38734196D; }
		else if (level == 111) { return 42765390D; }
		else if (level == 112) { return 47216097D; }
		else if (level == 113) { return 52129974D; }
		else if (level == 114) { return 57555223D; }
		else if (level == 115) { return 63545059D; }
		else if (level == 116) { return 70158237D; }
		else if (level == 117) { return 77459627D; }
		else if (level == 118) { return 85520849D; }
		else if (level == 119) { return 94420975D; }
		else if (level == 120) { return 104247307D; }
		else { return 0D; }
	}
}