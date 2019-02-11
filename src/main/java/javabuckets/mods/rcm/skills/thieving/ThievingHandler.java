package javabuckets.mods.rcm.skills.thieving;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ThievingHandler extends BaseSkill
{
	public static int thievingTimer = 60;
	public static boolean isStealing = false;
	public static boolean canThieve = true;

	public static boolean isThieving = false;
	private int thievingResetTimer = 10;

	public void thieving(EntityPlayer player, World world) 
	{
		thievingSkill();
		setLvlFromXPList();
		thievingChecker();
	}

	public void thievingChecker()
	{
		if (isThieving)
		{
			--thievingResetTimer;

			if (thievingResetTimer <= 0)
			{
				isThieving = false;
				thievingResetTimer = 10;
			}
		}
	}
	
	public void thievingSkill()
	{	
		if (isStealing)
		{
			thievingTimer--;
			canThieve = false;
		}

		if (thievingTimer <= 20) {
			canThieve = true;
		}

		if (thievingTimer <= 0)
		{
			isStealing = false;
			thievingTimer = 60;
		}
	}

	public void setLvlFromXPList()
	{
		if (isThieving)
		{
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}

			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.thiev) == RCM.instance.skillHandler.getLevel(SkillReference.thiev)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.thiev, RCM.instance.skillHandler.getLevel(SkillReference.thiev));
				LevelUpUtil.lvlHandling();
			}
		}
	}

	public void setLvlFromXP(double xpMin, double xpMax, int level) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.thiev) > xpMin && RCM.instance.skillHandler.getExperience(SkillReference.thiev) < xpMax)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.thiev, level, RCM.instance.skillHandler.getExperience(SkillReference.thiev));
		}
	}

	public void setbackLvlIfTooHigh(int level) 
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.thiev) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.thiev, level, RCM.instance.skillHandler.getExperience(SkillReference.thiev));
		}
	}

	public void setbackXPIfTooHigh(double xp) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.thiev) > xp)
		{
			RCM.instance.skillHandler.setExperience(SkillReference.thiev, xp);
		}
	}
}