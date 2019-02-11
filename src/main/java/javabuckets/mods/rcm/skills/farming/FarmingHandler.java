package javabuckets.mods.rcm.skills.farming;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class FarmingHandler extends BaseSkill
{
	public static boolean isFarming = false;
	private int farmingResetTimer = 10;

	public void farming(EntityPlayer player, World world) 
	{
		setLvlFromXPList();
		farmingChecker();
	}

	public void farmingChecker()
	{
		if (isFarming)
		{
			--farmingResetTimer;

			if (farmingResetTimer <= 0)
			{
				isFarming = false;
				farmingResetTimer = 10;
			}
		}
	}

	public void setLvlFromXPList()
	{
		if (isFarming)
		{
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}

			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.farm) == RCM.instance.skillHandler.getLevel(SkillReference.farm)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.farm, RCM.instance.skillHandler.getLevel(SkillReference.farm));
				LevelUpUtil.lvlHandling();
			}
		}
	}

	public void setLvlFromXP(double xpMin, double xpMax, int level) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.farm) > xpMin && RCM.instance.skillHandler.getExperience(SkillReference.farm) < xpMax)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.farm, level, RCM.instance.skillHandler.getExperience(SkillReference.farm));
		}
	}

	public void setbackLvlIfTooHigh(int level) 
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.farm) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.farm, level, RCM.instance.skillHandler.getExperience(SkillReference.farm));
		}
	}

	public void setbackXPIfTooHigh(double xp) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.farm) > xp)
		{
			RCM.instance.skillHandler.setExperience(SkillReference.farm, xp); 
		}
	}
}