package javabuckets.mods.rcm.skills.cooking;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CookingHandler extends BaseSkill
{
	public static boolean isCooking = false;
	private int cookingResetTimer = 10;

	public void cooking(EntityPlayer player, World world) 
	{
		setLvlFromXPList();
		cookingChecker();
	}

	public void cookingChecker()
	{
		if (isCooking)
		{
			--cookingResetTimer;

			if (cookingResetTimer <= 0)
			{
				isCooking = false;
				cookingResetTimer = 10;
			}
		}
	}

	public void setLvlFromXPList()
	{
		if (isCooking)
		{
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}

			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.cook) == RCM.instance.skillHandler.getLevel(SkillReference.cook)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.cook, RCM.instance.skillHandler.getLevel(SkillReference.cook));
				LevelUpUtil.lvlHandling();
			}
		}
	}

	public void setLvlFromXP(double xpMin, double xpMax, int level) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.cook) > xpMin && RCM.instance.skillHandler.getExperience(SkillReference.cook) < xpMax)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.cook, level, RCM.instance.skillHandler.getExperience(SkillReference.cook));
		}
	}

	public void setbackLvlIfTooHigh(int level) 
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.cook) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.cook, level, RCM.instance.skillHandler.getExperience(SkillReference.cook));
		}
	}

	public void setbackXPIfTooHigh(double xp) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.cook) > xp)
		{
			RCM.instance.skillHandler.setExperience(SkillReference.cook, xp); 
		}
	}
}