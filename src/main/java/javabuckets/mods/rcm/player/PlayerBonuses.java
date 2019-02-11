package javabuckets.mods.rcm.player;

import javabuckets.mods.rcm.main.RCM;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class PlayerBonuses 
{
	public float additionalMeleeDmg, additionalRangeDmg, additionalMageDmg;
	public double skillRestoreRate, hpRestoreRate, prayerRestoreRate, summoningRestoreRate;
	
	public boolean isPlayerUsingPrayer = false;
	public int prayersActive = 0;
	
	public void onUpdate(EntityPlayer player, World world)
	{
		RCM.instance.prayer.handlePrayers();
	}
	
	public void writeToNBT(NBTTagCompound nbt)
	{
		nbt.setFloat("additional_melee_damage", additionalMeleeDmg);
		nbt.setFloat("additional_range_damage", additionalRangeDmg);
		nbt.setFloat("additional_mage_damage", additionalMageDmg);
		
		nbt.setDouble("skill_restore_rate", skillRestoreRate);
		nbt.setDouble("healthpoints_restore_rate", hpRestoreRate);
		nbt.setDouble("prayer_restore_rate", prayerRestoreRate);
		nbt.setDouble("summoning_restore_rate", summoningRestoreRate);
	}
	
	public void readFromNBT(NBTTagCompound nbt)
	{
		additionalMeleeDmg = nbt.getFloat("additional_melee_damage");
		additionalRangeDmg = nbt.getFloat("additional_range_damage");
		additionalMageDmg = nbt.getFloat("additional_mage_damage");
		
		skillRestoreRate = nbt.getDouble("skill_restore_rate");
		hpRestoreRate = nbt.getDouble("healthpoints_restore_rate");
		prayerRestoreRate = nbt.getDouble("prayer_restore_rate");
		summoningRestoreRate = nbt.getDouble("summoning_restore_rate");
	}
	
	public float getAdditionalMeleeDmg() {
		return additionalMeleeDmg;
	}
	
	public float getAdditionalRangeDmg() {
		return additionalRangeDmg;
	}
	
	public float getAdditionalMageDmg() {
		return additionalMageDmg;
	}
	
	public double getSkillRestoreRate() {
		return skillRestoreRate;
	}
	
	public double getHpRestoreRate() {
		return hpRestoreRate;
	}
	
	public double getPrayerRestoreRate() {
		return prayerRestoreRate;
	}
	
	public double getSummoningRestoreRate() {
		return summoningRestoreRate;
	}
	
	public void setAdditionalMeleeDmg(float additionalMeleeDmg) {
		this.additionalMeleeDmg = additionalMeleeDmg;
	}
	
	public void setAdditionalRangeDmg(float additionalRangeDmg) {
		this.additionalRangeDmg = additionalRangeDmg;
	}
	
	public void setAdditionalMageDmg(float additionalMageDmg) {
		this.additionalMageDmg = additionalMageDmg;
	}
	
	public void setSkillRestoreRate(double skillRestoreRate) {
		this.skillRestoreRate = skillRestoreRate;
	}
	
	public void setHpRestoreRate(double hpRestoreRate) {
		this.hpRestoreRate = hpRestoreRate;
	}
	
	public void setPrayerRestoreRate(double prayerRestoreRate) {
		this.prayerRestoreRate = prayerRestoreRate;
	}
	
	public void setSummoningRestoreRate(double summoningRestoreRate) {
		this.summoningRestoreRate = summoningRestoreRate;
	}
}