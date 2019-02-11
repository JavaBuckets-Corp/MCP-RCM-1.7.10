package javabuckets.mods.rcm.skills.prayer;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

public class PrayerHandler extends BaseSkill
{
	public boolean isPraying = false;
	private int prayerResetTimer = 10;
	public boolean canPlayerBuryBone = true;
	
	public boolean isUsingPrayers = false;
	
	public double prayerPoints = 0;

	public void prayer(EntityPlayer player, World world) 
	{		
		setLvlFromXPList();
		prayerChecker();
	}

	public void prayerChecker()
	{
		if (isPraying)
		{
			--prayerResetTimer;
			canPlayerBuryBone = false;
			
			if (prayerResetTimer <= 0)
			{
				isPraying = false;
				prayerResetTimer = 10;
				canPlayerBuryBone = true;
			}
		}
	}
	
	public void setLvlFromXPList()
	{
		if (isPraying)
		{
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}

			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.pray) == RCM.instance.skillHandler.getLevel(SkillReference.pray)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.pray, RCM.instance.skillHandler.getLevel(SkillReference.pray));
				LevelUpUtil.lvlHandling();
				rechargePrayerPoints();
			}
		}
	}

	public void setLvlFromXP(double xpMin, double xpMax, int level) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.pray) > xpMin && RCM.instance.skillHandler.getExperience(SkillReference.pray) < xpMax)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.pray, level, RCM.instance.skillHandler.getExperience(SkillReference.pray));
		}
	}

	public void setbackLvlIfTooHigh(int level) 
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.pray) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.pray, level, RCM.instance.skillHandler.getExperience(SkillReference.pray));
		}
	}

	public void setbackXPIfTooHigh(double xp) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.pray) > xp)
		{
			RCM.instance.skillHandler.setExperience(SkillReference.pray, xp);
		}
	}
	
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		par1NBTTagCompound.setBoolean("thick_skin", PrayerReference.isUsingThickSkin);
		par1NBTTagCompound.setBoolean("burst_of_strength", PrayerReference.isUsingBurstOfStrength);
		par1NBTTagCompound.setBoolean("clarity_of_thought", PrayerReference.isUsingClarityOfThought);
		par1NBTTagCompound.setBoolean("sharp_eye", PrayerReference.isUsingSharpEye);
		par1NBTTagCompound.setBoolean("unstoppable_force", PrayerReference.isUsingUnstoppableForce);
		par1NBTTagCompound.setBoolean("mystic_will", PrayerReference.isUsingMysticWill);
		par1NBTTagCompound.setBoolean("charge", PrayerReference.isUsingCharge);
		par1NBTTagCompound.setBoolean("rock_skin", PrayerReference.isUsingRockSkin);
		par1NBTTagCompound.setBoolean("superhuman_strength", PrayerReference.isUsingSuperhumanStrength);
		par1NBTTagCompound.setBoolean("improved_reflexes", PrayerReference.isUsingImprovedReflexes);
		par1NBTTagCompound.setBoolean("rapid_restore", PrayerReference.isUsingRapidRestore);
		par1NBTTagCompound.setBoolean("rapid_heal", PrayerReference.isUsingRapidHeal);
		par1NBTTagCompound.setBoolean("protect_item", PrayerReference.isUsingProtectItem);
		par1NBTTagCompound.setBoolean("hawk_eye", PrayerReference.isUsingHawkEye);
		par1NBTTagCompound.setBoolean("unrelenting_force", PrayerReference.isUsingUnrelentingForce);
		par1NBTTagCompound.setBoolean("mystic_lore", PrayerReference.isUsingMysticLore);
		par1NBTTagCompound.setBoolean("super_charge", PrayerReference.isUsingSuperCharge);
		par1NBTTagCompound.setBoolean("steel_skin", PrayerReference.isUsingSteelSkin);
		par1NBTTagCompound.setBoolean("ultimate_strength", PrayerReference.isUsingUltimateStrength);
		par1NBTTagCompound.setBoolean("incredible_reflexes", PrayerReference.isUsingIncredibleReflexes);
		par1NBTTagCompound.setBoolean("protect_from_summoning", PrayerReference.isUsingProtectFromSummoning);
		par1NBTTagCompound.setBoolean("protect_from_magic", PrayerReference.isUsingProtectFromMagic);
		par1NBTTagCompound.setBoolean("protect_from_missiles", PrayerReference.isUsingProtectFromMissiles);
		par1NBTTagCompound.setBoolean("protect_from_melee", PrayerReference.isUsingProtectFromMelee);
		par1NBTTagCompound.setBoolean("eagle_eye", PrayerReference.isUsingEagleEye);
		par1NBTTagCompound.setBoolean("overpowering_force", PrayerReference.isUsingOverpoweringForce);
		par1NBTTagCompound.setBoolean("mystic_might", PrayerReference.isUsingMysticMight);
		par1NBTTagCompound.setBoolean("overcharge", PrayerReference.isUsingOvercharge);
		par1NBTTagCompound.setBoolean("retribution", PrayerReference.isUsingRetribution);
		par1NBTTagCompound.setBoolean("redemption", PrayerReference.isUsingRedemption);
		par1NBTTagCompound.setBoolean("smite", PrayerReference.isUsingSmite);
		par1NBTTagCompound.setBoolean("chivalvry", PrayerReference.isUsingChivalry);
		par1NBTTagCompound.setBoolean("rapid_renewal", PrayerReference.isUsingRapidRenewal);
		par1NBTTagCompound.setBoolean("piety", PrayerReference.isUsingPiety);
		par1NBTTagCompound.setBoolean("rigour", PrayerReference.isUsingRigour);
		par1NBTTagCompound.setBoolean("augury", PrayerReference.isUsingAugury);
		
		par1NBTTagCompound.setDouble("prayerPoints", prayerPoints);
	}
	
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		PrayerReference.isUsingThickSkin = par1NBTTagCompound.getBoolean("thick_skin");
		PrayerReference.isUsingBurstOfStrength = par1NBTTagCompound.getBoolean("burst_of_strength");
		PrayerReference.isUsingClarityOfThought = par1NBTTagCompound.getBoolean("clarity_of_thought");
		PrayerReference.isUsingSharpEye = par1NBTTagCompound.getBoolean("sharp_eye");
		PrayerReference.isUsingUnstoppableForce = par1NBTTagCompound.getBoolean("unstoppable_force");
		PrayerReference.isUsingMysticWill = par1NBTTagCompound.getBoolean("mystic_will");
		PrayerReference.isUsingCharge = par1NBTTagCompound.getBoolean("charge");
		PrayerReference.isUsingRockSkin = par1NBTTagCompound.getBoolean("rock_skin");
		PrayerReference.isUsingSuperhumanStrength = par1NBTTagCompound.getBoolean("superhuman_strength");
		PrayerReference.isUsingImprovedReflexes = par1NBTTagCompound.getBoolean("improved_reflexes");
		PrayerReference.isUsingRapidRestore = par1NBTTagCompound.getBoolean("rapid_restore");
		PrayerReference.isUsingRapidHeal = par1NBTTagCompound.getBoolean("rapid_heal");
		PrayerReference.isUsingProtectItem = par1NBTTagCompound.getBoolean("protect_item");
		PrayerReference.isUsingHawkEye = par1NBTTagCompound.getBoolean("hawk_eye");
		PrayerReference.isUsingUnrelentingForce = par1NBTTagCompound.getBoolean("unrelenting_force");
		PrayerReference.isUsingMysticLore = par1NBTTagCompound.getBoolean("mystic_lore");
		PrayerReference.isUsingSuperCharge = par1NBTTagCompound.getBoolean("super_charge");
		PrayerReference.isUsingSteelSkin = par1NBTTagCompound.getBoolean("steel_skin");
		PrayerReference.isUsingUltimateStrength = par1NBTTagCompound.getBoolean("ultimate_strength");
		PrayerReference.isUsingIncredibleReflexes = par1NBTTagCompound.getBoolean("incredible_reflexes");
		PrayerReference.isUsingProtectFromSummoning = par1NBTTagCompound.getBoolean("protect_from_summoning");
		PrayerReference.isUsingProtectFromMagic = par1NBTTagCompound.getBoolean("protect_from_magic");
		PrayerReference.isUsingProtectFromMissiles = par1NBTTagCompound.getBoolean("protect_from_missiles");
		PrayerReference.isUsingProtectFromMelee = par1NBTTagCompound.getBoolean("protect_from_melee");
		PrayerReference.isUsingEagleEye = par1NBTTagCompound.getBoolean("eagle_eye");
		PrayerReference.isUsingOverpoweringForce = par1NBTTagCompound.getBoolean("overpowering_force");
		PrayerReference.isUsingMysticMight = par1NBTTagCompound.getBoolean("mystic_might");
		PrayerReference.isUsingOvercharge = par1NBTTagCompound.getBoolean("overcharge");
		PrayerReference.isUsingRetribution = par1NBTTagCompound.getBoolean("retribution");
		PrayerReference.isUsingRedemption = par1NBTTagCompound.getBoolean("redemption");
		PrayerReference.isUsingSmite = par1NBTTagCompound.getBoolean("smite");
		PrayerReference.isUsingChivalry = par1NBTTagCompound.getBoolean("chivalvry");
		PrayerReference.isUsingRapidRenewal = par1NBTTagCompound.getBoolean("rapid_renewal");
		PrayerReference.isUsingPiety = par1NBTTagCompound.getBoolean("piety");
		PrayerReference.isUsingRigour = par1NBTTagCompound.getBoolean("rigour");
		PrayerReference.isUsingAugury = par1NBTTagCompound.getBoolean("augury");
		
		prayerPoints = par1NBTTagCompound.getDouble("prayerPoints");
	}

	private int ticksPassed = 0;
	private int minuteInTicks = 3600;
	
	public void handlePrayers() 
	{
		if (RCM.instance.playerBonuses.isPlayerUsingPrayer)
		{	
			ticksPassed += RCM.instance.playerBonuses.prayersActive;

			if (ticksPassed >= minuteInTicks)
			{
				RCM.instance.skillHandler.decreasePrayerLvl();
				ticksPassed = 0;
			}
		}
	}
	
	//--- PRAYER START ---\\
	
	public double getPrayerPoints() 
	{
		return prayerPoints;
	}
	
	public void setPrayerPoints(double prayerPoints) 
	{
		this.prayerPoints = prayerPoints;
	}

	public void rechargePrayerPoints() 
	{
		setPrayerPoints(RCM.instance.skillHandler.getLevel(SkillReference.pray) * 10);
	}

	public void isUsingPrayer() 
	{
		isUsingPrayers = true;
	}
}