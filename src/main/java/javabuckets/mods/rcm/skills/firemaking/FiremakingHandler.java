package javabuckets.mods.rcm.skills.firemaking;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class FiremakingHandler extends BaseSkill
{
	public static boolean isFiremaking = false;
	private int firemakingResetTimer = 10;

	public void firemaking(EntityPlayer player, World world) 
	{
		setLvlFromXPList();
		firemakingChecker();
	}

	public void firemakingChecker()
	{
		if (isFiremaking)
		{
			--firemakingResetTimer;

			if (firemakingResetTimer <= 0)
			{
				isFiremaking = false;
				firemakingResetTimer = 10;
			}
		}
	}

	public void setLvlFromXPList()
	{
		if (isFiremaking)
		{
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}

			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.fm) == RCM.instance.skillHandler.getLevel(SkillReference.fm)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.fm, RCM.instance.skillHandler.getLevel(SkillReference.fm));
				LevelUpUtil.lvlHandling();
			}
		}
	}

	public void setLvlFromXP(double xpMin, double xpMax, int level) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.fm) > xpMin && RCM.instance.skillHandler.getExperience(SkillReference.fm) < xpMax)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.fm, level, RCM.instance.skillHandler.getExperience(SkillReference.fm));
		}
	}

	public void setbackLvlIfTooHigh(int level) 
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.fm) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.fm, level, RCM.instance.skillHandler.getExperience(SkillReference.fm));
		}
	}

	public void setbackXPIfTooHigh(double xp) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.fm) > xp)
		{
			RCM.instance.skillHandler.setExperience(SkillReference.fm, xp); 
		}
	}
}