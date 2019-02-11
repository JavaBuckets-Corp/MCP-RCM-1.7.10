package javabuckets.mods.rcm.dailies;

import java.util.ArrayList;
import java.util.Random;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.nbt.NBTTagCompound;

public class DailyChallengeHandler
{
	private String dailyChallenge;
	
	public ArrayList<String> dailies = new ArrayList<String>();
	
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		par1NBTTagCompound.setString("dailyChallenge", dailyChallenge);
	}
	
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		dailyChallenge = par1NBTTagCompound.getString("dailyChallenge");
	}
	
	public String getDailyChallenge()
	{
		return dailyChallenge;
	}
	
	public void setDailyChallenge(String challenge)
	{
		this.dailyChallenge = challenge;
	}
	
	public void setRandomDailyChallenge()
	{
		Random rand = new Random();
		
		String dailyChallenge = dailies.get(rand.nextInt(dailies.size()));
		
		setDailyChallenge(dailyChallenge);
	}
	
	public void addDailyChallengeToList(String skill, String task, int amount)
	{
		String challenge = skill + "-" + task + "-" + amount;
		
		dailies.add(challenge);
	}
	
	public void addDailyChallengeToList(String challenge)
	{
		dailies.add(challenge);
	}
	
	public void addPossibleDailiesToList()
	{
		getPossibleDailiesToList();
	}
	
	public void getPossibleDailiesToList()
	{
		/**
		 * Mining
		 */
		addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.stone, 1);
		addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.copperOre, 1);
		addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.tinOre, 1);
		addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.coalOre, 5);
		addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.ironOre, 15);
		addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.silverOre, 20);
		addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.lapisOre, 20);
		addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.goldOre, 25);
		addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.redstoneOre, 30);
		addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.diamondOre, 30);
		addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.mithrilOre, 50);
		addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.adamantiteOre, 70);
		//addPossibleDailyFromLvl(SkillReference.mine, DailyChallengeReference.runiteOre, 85);
		
		/**
		 * Prayer
		 */
		addPossibleDailyFromLvl(SkillReference.pray, DailyChallengeReference.bones, 1);
		addPossibleDailyFromLvl(SkillReference.pray, DailyChallengeReference.bigBones, 10);
		//addPossibleDailyFromLvl(SkillReference.pray, DailyChallengeReference.dragonBones, 25);
		
		/**
		 * Woodcutting
		 */
		addPossibleDailyFromLvl(SkillReference.wc, DailyChallengeReference.oakLogs, 1);
		
		/**
		 * Slayer
		 */
		addPossibleDailyFromLvl(SkillReference.slay, DailyChallengeReference.novice, 1);
		addPossibleDailyFromLvl(SkillReference.slay, DailyChallengeReference.killer, 15);
		addPossibleDailyFromLvl(SkillReference.slay, DailyChallengeReference.master, 40);
		addPossibleDailyFromLvl(SkillReference.slay, DailyChallengeReference.grandMaster, 68);
	}
	
	public void addPossibleDailyFromLvl(String skill, String challenge, int requiredLvl)
	{
		if (RCM.instance.skillHandler.getLevel(skill) >= requiredLvl) 
		{
			RCM.instance.dailies.addDailyChallengeToList(challenge);
		}
	}
}