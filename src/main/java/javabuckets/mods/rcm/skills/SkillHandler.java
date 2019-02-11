package javabuckets.mods.rcm.skills;

import javabuckets.mods.rcm.huds.HUDSkills;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.DoubleXPUtil;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class SkillHandler 
{
	private int[] skillsLvl = new int[26];
	private double[] skillsXP = new double[26];
	private int[] skillsBoost = new int[26];

	// Combat Level
	private double combatLvl;

	// If this is the first time the game is run (per session)
	private boolean hasRunned = false;
	
	private int[] lvlsEarnedSession = new int[26];
	private double[] xpEarnedSession = new double[26];

	/**
	 * Update method including player and world param's
	 * @param player The EntityPlayer
	 * @param world The World
	 */
	public void onUpdate(EntityPlayer player, World world)
	{
		RCM.instance.skill.skill(player, world);
		checkCombatLevel();
		boostedLvlHandling();

		// Updates boost lvl's upon player entering the world (only runs once)
		if (!hasRunned)
		{
			updateBoostLvls();
			hasRunned = true;
		}
	}

	private boolean isFirstTimeLogon = true;
	
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		for (int i = 0; i < 26; i++)
		{
			par1NBTTagCompound.setInteger(SkillReference.skill[i] + "Level", skillsLvl[i]);
			par1NBTTagCompound.setDouble(SkillReference.skill[i] + "Experience", skillsXP[i]);
		}

		// Combat Level
		par1NBTTagCompound.setDouble("CombatLevel", combatLvl);
		
		// First time logon
		par1NBTTagCompound.setBoolean("isFirstTimeLogon", isFirstTimeLogon);
		
		/**
		 * Moved into here since levels don't save if they aren't
		 */
		RCM.instance.gpHandler.writeToNBT(par1NBTTagCompound);
		RCM.instance.combat.writeToNBT(par1NBTTagCompound);
		RCM.instance.magic.writeToNBT(par1NBTTagCompound);
		RCM.instance.slayer.writeToNBT(par1NBTTagCompound);
		RCM.instance.prayer.writeToNBT(par1NBTTagCompound);
		RCM.instance.summoning.writeToNBT(par1NBTTagCompound);
		
		//RCM.instance.dailyGiftHandler.writeToNBT(par1NBTTagCompound);
		RCM.instance.playerBonuses.writeToNBT(par1NBTTagCompound);
		//RCM.instance.dailies.writeToNBT(par1NBTTagCompound);
	}
	
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		for (int i = 0; i < 26; i++)
		{
			skillsLvl[i] = par1NBTTagCompound.getInteger(SkillReference.skill[i] + "Level");
			skillsXP[i] = par1NBTTagCompound.getDouble(SkillReference.skill[i] + "Experience");
		}

		// Combat Level
		combatLvl = par1NBTTagCompound.getDouble("CombatLevel");
		
		// First time logon
		isFirstTimeLogon = par1NBTTagCompound.getBoolean("isFirstTimeLogon");
		
		/**
		 * Moved into here since levels don't save if they aren't
		 */
		RCM.instance.gpHandler.readFromNBT(par1NBTTagCompound);
		RCM.instance.combat.readFromNBT(par1NBTTagCompound);
		RCM.instance.magic.readFromNBT(par1NBTTagCompound);
		RCM.instance.slayer.readFromNBT(par1NBTTagCompound);
		RCM.instance.prayer.readFromNBT(par1NBTTagCompound);
		RCM.instance.summoning.readFromNBT(par1NBTTagCompound);
		
		//RCM.instance.dailyGiftHandler.readFromNBT(par1NBTTagCompound);
		RCM.instance.playerBonuses.readFromNBT(par1NBTTagCompound);
		//RCM.instance.dailies.readFromNBT(par1NBTTagCompound);
	}
	
	public boolean isFirstTimeLogon()
	{
		return this.isFirstTimeLogon;
	}
	
	public void setFirstTimeLogon(boolean value) 
	{
		this.isFirstTimeLogon = value;
	}

	public void setLevel(String skill, int level, double xp)
	{	
		for (int i = 0; i < 26; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]))
			{
				this.skillsLvl[i] = level;
				this.skillsXP[i] = xp;
			}
		}
	}

	public int getLevel(String skill)
	{		
		for (int i = 0; i < 26; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]))
			{
				return this.skillsLvl[i];
			}
		}
		return 0;
	}

	public int getLevelB(String skill)
	{
		for (int i = 0; i < 26; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]) && !skill.equalsIgnoreCase(SkillReference.cons))
			{
				return this.skillsBoost[i];
			}
		}
		return 0;
	}

	public void setExperience(String skill, double xp)
	{
		for (int i = 0; i < 26; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]))
			{
				this.skillsXP[i] = xp;
			}
		}
	}

	public double getExperience(String skill)
	{
		for (int i = 0; i < 26; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]))
			{
				return this.skillsXP[i];
			}
		}
		return 0;
	}

	public int getTotalLvl()
	{
		int totalLvl = 0;
		
		for (int i = 0; i < 26; i++)
		{
			totalLvl += this.skillsLvl[i];
		}
		return totalLvl;
	}

	public long getTotalXp()
	{
		double totalXP = 0D;
		
		for (int i = 0; i < 26; i++)
		{
			totalXP += this.skillsXP[i];
		}
		return (long)totalXP;
	}

	public double getCombatLvl()
	{ 
		return this.combatLvl; 
	}

	/**
	 * Gets the amount of experience needed in a skill till the player levels up.
	 */
	public double getXpToNextLevel(String skill)
	{
		int currentLvl = getLevel(skill);
		double currentXp = getExperience(skill);

		return SkillReference.getXpFromLvl(currentLvl + 1) - currentXp;
	}

	/**
	 * Checks every Tick what Calculate Method should be used to determine the Combat Level, and Calculates it.
	 */
	private void checkCombatLevel()
	{
		/**
		 * 0.25 * (1.3 * max[att + str, mage * 2, range * 2] + def + hp + 0.5 * pray + 0.5 * summ)
		 */
	
		int attackLvl = skillsLvl[0];
		int strengthLvl = skillsLvl[3];
		int defenceLvl = skillsLvl[6];
		int rangedLvl = skillsLvl[9];
		int magicLvl = skillsLvl[15];
		int prayerLvl = skillsLvl[12];
		int summoningLvl = skillsLvl[23];
		int constitutionLvl = skillsLvl[1];
		
		if (attackLvl + strengthLvl >= magicLvl * 1.5 && attackLvl + strengthLvl >= rangedLvl * 1.5)
		{
			this.combatLvl = (int) (defenceLvl + constitutionLvl + (prayerLvl / 2) + (summoningLvl / 2) + 1.3 * (attackLvl + strengthLvl)) / 4;
		}
		else if (magicLvl * 1.5 >= attackLvl + strengthLvl && magicLvl * 2 >= rangedLvl * 1.5)
		{
			this.combatLvl = (int) (defenceLvl + constitutionLvl + (prayerLvl / 2) + (summoningLvl / 2) + 1.3 * (magicLvl * 2)) / 4;
		}
		else if (rangedLvl * 1.5 >= magicLvl * 2 && rangedLvl * 1.5 >= attackLvl + strengthLvl)
		{
			this.combatLvl = (int) (defenceLvl + constitutionLvl + (prayerLvl / 2) + (summoningLvl / 2) + 1.3 * (rangedLvl * 2)) / 4;
		}
	}

	/**
	 * Method used instead of doing the set-(get-plus) method.
	 * This also makes sure that the HUD for the skill shows up and that xp earned is displayed on screen.
	 */
	public void addXPToSkill(String skill, double xp)
	{
		if (DoubleXPUtil.daysToDoubleXP() == 0) xp *= 2;
		
		setExperience(skill, getExperience(skill) + xp);

		RCM.instance.skill.showSkillHUD = true; RCM.instance.skill.resetTimer();
		HUDSkills.resetXPToDisplay();
		HUDSkills.addXPToDisplay(skill, xp);

		LogHelper.info(xp + " xp gained in " + skill + "!");
		addXPToSessionSkill(skill, xp);
	}
	
	public void addXPToSkillBugged(String skill, double xp)
	{
		if (DoubleXPUtil.daysToDoubleXP() == 0) xp *= 2;
		
		setExperience(skill, getExperience(skill) + xp);

		RCM.instance.skill.showSkillHUD = true; RCM.instance.skill.resetTimer();
		HUDSkills.resetXPToDisplay();
		HUDSkills.addXPToDisplay(skill, xp*2);

		LogHelper.info(xp*2 + " xp gained in " + skill + "!");
		addXPToSessionSkill(skill, xp);
	}


	public void addXPToCombatSkill(String skill, double xp)
	{
		if (DoubleXPUtil.daysToDoubleXP() == 0) xp *= 2;
		
		setExperience(skill, getExperience(skill) + xp);
		setExperience(SkillReference.cons, getExperience(SkillReference.cons) + xp / 3);

		RCM.instance.skill.showSkillHUD = true; RCM.instance.skill.resetTimer();
		HUDSkills.resetXPToDisplay();
		HUDSkills.addXPToDisplay(skill, xp + (xp / 3));

		LogHelper.info(xp + " xp gained in " + skill + "!");
		LogHelper.info(xp / 3 + " xp gained in " + SkillReference.cons + "!");
		addXPToSessionSkill(skill, xp+xp/3);
	}
	
	public void addXPToSessionSkill(String skill, double xp)
	{
		for (int i = 0; i < 26; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]))
			{
				this.xpEarnedSession[i]+=xp;
			}
		}
	}
	
	public void addLevelToSessionSkill(String skill)
	{
		for (int i = 0; i < 26; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]))
			{
				this.lvlsEarnedSession[i]++;
			}
		}
	}

	/**
	 * Called upon leveling up a skill.
	 */
	public void levelUp(String skill, int level)
	{
		LogHelper.info("You leveled up in " + skill + "! You are now level " + level + "!");
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You leveled up in " + skill + "! You are now level " + level + "!"));
		addLevelToSessionSkill(skill);
	}

	/**
	 * Boosts the player's level temporarily.
	 */
	public void boostLvlBy(String skill, int amount)
	{
		for (int i = 0; i < 26; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]) && !skill.equalsIgnoreCase(SkillReference.cons))
			{
				this.skillsBoost[i] = this.skillsLvl[i] + amount;
			}
		}
	}

	private int ticksPassed = 0;
	private int minuteInTicks = 3600;

	/**
	 * Makes sure that boosted levels decreases over time.
	 */
	private void boostedLvlHandling() 
	{
		ticksPassed++;

		if (ticksPassed >= minuteInTicks)
		{
			decreaseBoostedLvls();
			ticksPassed = 0;
		}
	}

	private void decreaseBoostedLvls()
	{
		for (int i = 0; i < 26; i++)
		{
			if (this.skillsBoost[i] > this.skillsLvl[i])
			{
				this.skillsBoost[i]--;
			}
		}		
	}

	public void updateBoostLvls()
	{
		for (int i = 0; i < 26; i++)
		{
			this.skillsBoost[i] = this.skillsLvl[i];
		}
	}

	public void decreasePrayerLvl()
	{
		this.skillsBoost[12]--;
	}
	
	public double getXpEarnedSession() 
	{
		double xpEarnedSession = 0;
		
		for (int i = 0; i < 26; i++)
		{
			xpEarnedSession+=this.xpEarnedSession[i];
		}
		
		return xpEarnedSession;
	}
	
	public int getLvlsEarnedSession() 
	{
		int lvlsEarnedSession = 0;
		
		for (int i = 0; i < 26; i++)
		{
			lvlsEarnedSession+=this.lvlsEarnedSession[i];
		}
		
		return lvlsEarnedSession;
	}
	
	public double getXpEarnedSessionInSkill(String skill)
	{
		for (int i = 0; i < 26; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]))
			{
				return this.xpEarnedSession[i];
			}
		}
		return 0;
	}
	
	public int getLvlsEarnedSessionInSkill(String skill)
	{
		for (int i = 0; i < 26; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]))
			{
				return this.lvlsEarnedSession[i];
			}
		}
		return 0;
	}

	/**
	 * Resets all xp and Lvl's that the player has earned in his/hers playtime with the mod.
	 * (Use with caution!!!)
	 */
	public void resetPlayer()
	{	
		for (int i = 0; i < 26; i++)
		{
			setLevel(SkillReference.skill[i], 1, 0);
		}
		
		setLevel(SkillReference.cons, 10, 1154D);
	}

	public void setAllLevels99()
	{
		for (int i = 0; i < 26; i++)
		{
			setLevel(SkillReference.skill[i], 99, 13034431);
		}
	}

	public void setAllToMax()
	{
		for (int i = 0; i < 26; i++)
		{
			setLevel(SkillReference.skill[i], 99, 200000000);
		}
		
		setLevel(SkillReference.dung, 120, 200000000);
	}
}