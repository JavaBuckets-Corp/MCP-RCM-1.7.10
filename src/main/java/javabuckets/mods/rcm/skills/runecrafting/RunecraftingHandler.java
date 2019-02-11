package javabuckets.mods.rcm.skills.runecrafting;

import javabuckets.mods.rcm.dailies.DailyChallengeReference;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class RunecraftingHandler extends BaseSkill
{
	public static boolean isRunecrafting = false;
	private int runecraftingResetTimer = 10;

	public void runecrafting(EntityPlayer player, World world) 
	{
		setLvlFromXPList();
		runecraftingChecker();
	}

	public void runecraftingChecker()
	{
		if (isRunecrafting)
		{
			--runecraftingResetTimer;

			if (runecraftingResetTimer <= 0)
			{
				isRunecrafting = false;
				runecraftingResetTimer = 10;
			}
		}
	}

	public void setLvlFromXPList()
	{
		if (isRunecrafting)
		{
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}

			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.rc) == RCM.instance.skillHandler.getLevel(SkillReference.rc)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.rc, RCM.instance.skillHandler.getLevel(SkillReference.rc));
				LevelUpUtil.lvlHandling();
			}
		}
	}

	public void setLvlFromXP(double xpMin, double xpMax, int level) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.rc) >= xpMin && RCM.instance.skillHandler.getExperience(SkillReference.rc) < xpMax)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.rc, level, RCM.instance.skillHandler.getExperience(SkillReference.rc));
		}
	}

	public void setbackLvlIfTooHigh(int level) 
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.rc) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.rc, level, RCM.instance.skillHandler.getExperience(SkillReference.rc));
		}
	}

	public void setbackXPIfTooHigh(double xp) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.rc) > xp)
		{
			RCM.instance.skillHandler.setExperience(SkillReference.rc, xp);
		}
	}
}