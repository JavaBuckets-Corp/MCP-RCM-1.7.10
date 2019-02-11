package javabuckets.mods.rcm.skills.fishing;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class FishingHandler extends BaseSkill
{
	public static boolean isFishing = false;
	private int fishingResetTimer = 50;

	public void fishing(EntityPlayer player, World world) 
	{
		setLvlFromXPList();
		fishingChecker();
	}

	public void fishingChecker()
	{
		if (isFishing)
		{
			--fishingResetTimer;

			if (fishingResetTimer <= 0)
			{
				isFishing = false;
				fishingResetTimer = 50;
			}
		}
	}
	
	public void resetFishingTimer()
	{
		fishingResetTimer = 0;
	}

	public void setLvlFromXPList()
	{
		if (isFishing)
		{
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}

			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.fish) == RCM.instance.skillHandler.getLevel(SkillReference.fish)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.fish, RCM.instance.skillHandler.getLevel(SkillReference.fish));
				LevelUpUtil.lvlHandling();
			}
		}
	}

	public void setLvlFromXP(double xpMin, double xpMax, int level) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.fish) > xpMin && RCM.instance.skillHandler.getExperience(SkillReference.fish) < xpMax)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.fish, level, RCM.instance.skillHandler.getExperience(SkillReference.fish));
		}
	}

	public void setbackLvlIfTooHigh(int level) 
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.fish) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.fish, level, RCM.instance.skillHandler.getExperience(SkillReference.fish));
		}
	}

	public void setbackXPIfTooHigh(double xp) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.fish) > xp)
		{
			RCM.instance.skillHandler.setExperience(SkillReference.fish, xp);
		}
	}
}