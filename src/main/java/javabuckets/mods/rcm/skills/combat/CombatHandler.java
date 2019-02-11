package javabuckets.mods.rcm.skills.combat;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CombatHandler extends BaseSkill
{
	public static boolean isCombating = false;
	private int combatingResetTimer = 10;
	
	private boolean isTrainingAttackMelee = true;
	private boolean isTrainingStrengthMelee = false;
	private boolean isTrainingDefenceMelee = false;
	
	private boolean isTrainingMagicMaging = true;
	private boolean isTrainingDefenceMaging = false;
	
	private boolean isTrainingRangedRanging = true;
	private boolean isTrainingStrengthRanging = false;
	private boolean isTrainingDefenceRanging = false;
	
	public void combat(EntityPlayer player, World world)
	{
		setLvlFromXPList(player);
		combatingChecker();
	}
	
	public void combatingChecker()
	{
		if (isCombating)
		{
			--combatingResetTimer;
			
			if (combatingResetTimer <= 0)
			{
				isCombating = false;
				combatingResetTimer = 10;
			}
		}
	}
	
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		par1NBTTagCompound.setBoolean("AttackFromMelee", isTrainingAttackMelee);
		par1NBTTagCompound.setBoolean("StrengthFromMelee", isTrainingStrengthMelee);
		par1NBTTagCompound.setBoolean("DefenceFromMelee", isTrainingDefenceMelee);
		
		par1NBTTagCompound.setBoolean("MagicFromMaging", isTrainingMagicMaging);
		par1NBTTagCompound.setBoolean("DefenceFromMaging", isTrainingDefenceMaging);
		
		par1NBTTagCompound.setBoolean("RangedFromRanging", isTrainingRangedRanging);
		par1NBTTagCompound.setBoolean("StrengthFromRanging", isTrainingStrengthRanging);
		par1NBTTagCompound.setBoolean("DefenceFromRanging", isTrainingDefenceRanging);
	}
	
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		isTrainingAttackMelee = par1NBTTagCompound.getBoolean("AttackFromMelee");
		isTrainingStrengthMelee = par1NBTTagCompound.getBoolean("StrengthFromMelee");
		isTrainingDefenceMelee = par1NBTTagCompound.getBoolean("DefenceFromMelee");
		
		isTrainingMagicMaging = par1NBTTagCompound.getBoolean("MagicFromMaging");
		isTrainingDefenceMaging = par1NBTTagCompound.getBoolean("DefenceFromMaging");
		
		isTrainingRangedRanging = par1NBTTagCompound.getBoolean("RangedFromRanging");
		isTrainingStrengthRanging = par1NBTTagCompound.getBoolean("StrengthFromRanging");
		isTrainingDefenceRanging = par1NBTTagCompound.getBoolean("DefenceFromRanging");
	}
	
	public boolean getIsTrainingAttackMelee() { return isTrainingAttackMelee; } public void setIsTrainingAttackMelee(boolean value) { isTrainingAttackMelee = value; }
	public boolean getIsTrainingStrengthMelee() { return isTrainingStrengthMelee; } public void setIsTrainingStrengthMelee(boolean value) { isTrainingStrengthMelee = value; }
	public boolean getIsTrainingDefenceMelee() { return isTrainingDefenceMelee; } public void setIsTrainingDefenceMelee(boolean value) { isTrainingDefenceMelee = value; }
	
	public boolean getIsTrainingMagicMaging() { return isTrainingMagicMaging; } public void setIsTrainingMagicMaging(boolean value) { isTrainingMagicMaging = value; }
	public boolean getIsTrainingDefenceMaging() { return isTrainingDefenceMaging; } public void setIsTrainingDefenceMaging(boolean value) { isTrainingDefenceMaging = value; }
	
	public boolean getIsTrainingRangedRanging() { return isTrainingRangedRanging; } public void setIsTrainingRangedRanging(boolean value) { isTrainingRangedRanging = value; }
	public boolean getIsTrainingStrengthRanging() { return isTrainingStrengthRanging; } public void setIsTrainingStrengthRanging(boolean value) { isTrainingStrengthRanging = value; }
	public boolean getIsTrainingDefenceRanging() { return isTrainingDefenceRanging; } public void setIsTrainingDefenceRanging(boolean value) { isTrainingDefenceRanging = value; }
	
	
	public void setLvlFromXPList(EntityPlayer player)
	{
		if (isCombating)
		{	
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}
			
			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.att) == RCM.instance.skillHandler.getLevel(SkillReference.att)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.att, RCM.instance.skillHandler.getLevel(SkillReference.att));
				LevelUpUtil.lvlHandling();
			}
			if (!(LevelUpUtil.getLevel(SkillReference.str) == RCM.instance.skillHandler.getLevel(SkillReference.str)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.str, RCM.instance.skillHandler.getLevel(SkillReference.str));
				LevelUpUtil.lvlHandling();
			}
			if (!(LevelUpUtil.getLevel(SkillReference.def) == RCM.instance.skillHandler.getLevel(SkillReference.def)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.def, RCM.instance.skillHandler.getLevel(SkillReference.def));
				LevelUpUtil.lvlHandling();
			}
			if (!(LevelUpUtil.getLevel(SkillReference.mage) == RCM.instance.skillHandler.getLevel(SkillReference.mage)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.mage, RCM.instance.skillHandler.getLevel(SkillReference.mage));
				LevelUpUtil.lvlHandling();
			}
			if (!(LevelUpUtil.getLevel(SkillReference.range) == RCM.instance.skillHandler.getLevel(SkillReference.range)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.range, RCM.instance.skillHandler.getLevel(SkillReference.range));
				LevelUpUtil.lvlHandling();
			}
			if (!(LevelUpUtil.getLevel(SkillReference.cons) == RCM.instance.skillHandler.getLevel(SkillReference.cons)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.cons, RCM.instance.skillHandler.getLevel(SkillReference.cons));
				LevelUpUtil.lvlHandling();
				
				
				player.removePotionEffect(Potion.field_76434_w.id);
				double amp = RCM.instance.skillHandler.getLevel(SkillReference.cons) / 7;
				player.addPotionEffect(new PotionEffect(Potion.field_76434_w.id, Integer.MAX_VALUE, (int)amp));
				player.addPotionEffect(new PotionEffect(Potion.heal.id, 10, 4));
			}
		}
	} 
	
	public void setLvlFromXP(double xp1, double xp2, int level)
	{	
		if (RCM.instance.skillHandler.getExperience(SkillReference.att) >= xp1 && RCM.instance.skillHandler.getExperience(SkillReference.att) < xp2)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.att, level, RCM.instance.skillHandler.getExperience(SkillReference.att));
		}
		if (RCM.instance.skillHandler.getExperience(SkillReference.str) >= xp1 && RCM.instance.skillHandler.getExperience(SkillReference.str) < xp2)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.str, level, RCM.instance.skillHandler.getExperience(SkillReference.str));
		}
		if (RCM.instance.skillHandler.getExperience(SkillReference.def) >= xp1 && RCM.instance.skillHandler.getExperience(SkillReference.def) < xp2)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.def, level, RCM.instance.skillHandler.getExperience(SkillReference.def));
		}
		if (RCM.instance.skillHandler.getExperience(SkillReference.mage) >= xp1 && RCM.instance.skillHandler.getExperience(SkillReference.mage) < xp2)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.mage, level, RCM.instance.skillHandler.getExperience(SkillReference.mage));
		}
		if (RCM.instance.skillHandler.getExperience(SkillReference.range) >= xp1 && RCM.instance.skillHandler.getExperience(SkillReference.range) < xp2)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.range, level, RCM.instance.skillHandler.getExperience(SkillReference.range));
		}
		if (RCM.instance.skillHandler.getExperience(SkillReference.cons) >= xp1 && RCM.instance.skillHandler.getExperience(SkillReference.cons) < xp2)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.cons, level, RCM.instance.skillHandler.getExperience(SkillReference.cons));
		}
	}
	
	public void setbackLvlIfTooHigh(int level)
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.att) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.att, level, RCM.instance.skillHandler.getExperience(SkillReference.att)); 
		}
		if (RCM.instance.skillHandler.getLevel(SkillReference.str) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.str, level, RCM.instance.skillHandler.getExperience(SkillReference.str)); 
		}
		if (RCM.instance.skillHandler.getLevel(SkillReference.def) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.def, level, RCM.instance.skillHandler.getExperience(SkillReference.def)); 
		}
		if (RCM.instance.skillHandler.getLevel(SkillReference.mage) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.mage, level, RCM.instance.skillHandler.getExperience(SkillReference.mage)); 
		}
		if (RCM.instance.skillHandler.getLevel(SkillReference.range) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.range, level, RCM.instance.skillHandler.getExperience(SkillReference.range)); 
		}
		if (RCM.instance.skillHandler.getLevel(SkillReference.cons) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.cons, level, RCM.instance.skillHandler.getExperience(SkillReference.cons)); 
		}
	}
	
	public void setbackXPIfTooHigh(double xp)
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.att) > xp) 
		{
			RCM.instance.skillHandler.setExperience(SkillReference.att, xp); 
		}
		if (RCM.instance.skillHandler.getExperience(SkillReference.str) > xp) 
		{
			RCM.instance.skillHandler.setExperience(SkillReference.str, xp); 
		}
		if (RCM.instance.skillHandler.getExperience(SkillReference.def) > xp) 
		{
			RCM.instance.skillHandler.setExperience(SkillReference.def, xp); 
		}
		if (RCM.instance.skillHandler.getExperience(SkillReference.mage) > xp) 
		{
			RCM.instance.skillHandler.setExperience(SkillReference.mage, xp); 
		}
		if (RCM.instance.skillHandler.getExperience(SkillReference.range) > xp) 
		{
			RCM.instance.skillHandler.setExperience(SkillReference.range, xp); 
		}
		if (RCM.instance.skillHandler.getExperience(SkillReference.cons) > xp) 
		{
			RCM.instance.skillHandler.setExperience(SkillReference.cons, xp); 
		}
	}
}