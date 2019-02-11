package javabuckets.mods.rcm.skills.woodcutting;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class WoodcuttingHandler extends BaseSkill
{
	public static boolean isWoodcutting = false;
	private int woodcuttingResetTimer = 10;

	public void woodcutting(EntityPlayer player, World world) 
	{
		setLvlFromXPList();
		woodcuttingChecker();
	}

	public void woodcuttingChecker()
	{
		if (isWoodcutting)
		{
			--woodcuttingResetTimer;

			if (woodcuttingResetTimer <= 0)
			{
				isWoodcutting = false;
				woodcuttingResetTimer = 10;
			}
		}
	}

	public void setLvlFromXPList()
	{
		if (isWoodcutting)
		{
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}

			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.wc) == RCM.instance.skillHandler.getLevel(SkillReference.wc)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.wc, RCM.instance.skillHandler.getLevel(SkillReference.wc));
				LevelUpUtil.lvlHandling();
			}
		}
	}

	public void setLvlFromXP(double xpMin, double xpMax, int level) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.wc) > xpMin && RCM.instance.skillHandler.getExperience(SkillReference.wc) < xpMax)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.wc, level, RCM.instance.skillHandler.getExperience(SkillReference.wc));
		}
	}

	public void setbackLvlIfTooHigh(int level) 
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.wc) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.wc, level, RCM.instance.skillHandler.getExperience(SkillReference.wc));
		}
	}

	public void setbackXPIfTooHigh(double xp) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.wc) > xp)
		{
			RCM.instance.skillHandler.setExperience(SkillReference.wc, xp); 
		}
	}
}