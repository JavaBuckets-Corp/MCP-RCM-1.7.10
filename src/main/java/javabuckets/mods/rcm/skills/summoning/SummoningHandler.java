package javabuckets.mods.rcm.skills.summoning;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class SummoningHandler extends BaseSkill
{
	public static boolean isSummoning = false;
	private int summoningResetTimer = 10;
	
	public double summoningPoints = 0;

	public void summoning(EntityPlayer player, World world) 
	{
		setLvlFromXPList();
		summoningChecker();
	}

	public void summoningChecker()
	{
		if (isSummoning)
		{
			--summoningResetTimer;

			if (summoningResetTimer <= 0)
			{
				isSummoning = false;
				summoningResetTimer = 10;
			}
		}
	}

	public void setLvlFromXPList()
	{
		if (isSummoning)
		{
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}

			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.summ) == RCM.instance.skillHandler.getLevel(SkillReference.summ)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.summ, RCM.instance.skillHandler.getLevel(SkillReference.summ));
				LevelUpUtil.lvlHandling();
				rechargeSummoningPoints();
			}
		}
	}

	public void setLvlFromXP(double xpMin, double xpMax, int level) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.summ) > xpMin && RCM.instance.skillHandler.getExperience(SkillReference.summ) < xpMax)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.summ, level, RCM.instance.skillHandler.getExperience(SkillReference.summ));
		}
	}

	public void setbackLvlIfTooHigh(int level) 
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.summ) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.summ, level, RCM.instance.skillHandler.getExperience(SkillReference.summ));
		}
	}

	public void setbackXPIfTooHigh(double xp) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.summ) > xp)
		{
			RCM.instance.skillHandler.setExperience(SkillReference.summ, xp); 
		}
	}
	
	//--- SUMMONING START ---\\
	
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		par1NBTTagCompound.setDouble("summoningPoints", summoningPoints);
	}
	
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		summoningPoints = par1NBTTagCompound.getDouble("summoningPoints");
	}
	
	public double getSummoningPoints() 
	{
		return summoningPoints;
	}
	
	public void setSummoningPoints(double summoningPoints) 
	{
		this.summoningPoints = summoningPoints;
	}

	public void rechargeSummoningPoints() 
	{
		setSummoningPoints(RCM.instance.skillHandler.getLevel(SkillReference.summ));
	}
}