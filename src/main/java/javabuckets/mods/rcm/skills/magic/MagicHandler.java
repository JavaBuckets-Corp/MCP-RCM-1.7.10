package javabuckets.mods.rcm.skills.magic;

import java.util.ArrayList;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;

public class MagicHandler 
{
	public String currentSelectedSpell = "";
	
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		par1NBTTagCompound.setString("currentSelectedSpell", currentSelectedSpell);
	}
	
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		currentSelectedSpell = par1NBTTagCompound.getString("currentSelectedSpell");
	}
	
	public String getCurrentSelectedSpell() {
		return currentSelectedSpell;
	}
	
	public void setCurrentSelectedSpell(String currentSelectedSpell) {
		this.currentSelectedSpell = currentSelectedSpell;
	}

	public double getMaxDamageFromSpell(String spell) 
	{
		if (spell.equalsIgnoreCase(MagicReference.airStrike)) { return 2; }
		else if (spell.equalsIgnoreCase(MagicReference.waterStrike)) { return 3; }
		else if (spell.equalsIgnoreCase(MagicReference.earthStrike)) { return 4; }
		else if (spell.equalsIgnoreCase(MagicReference.fireStrike)) { return 5; }
		else if (spell.equalsIgnoreCase(MagicReference.airBolt)) { return 5; }
		else if (spell.equalsIgnoreCase(MagicReference.waterBolt)) { return 6; }
		else if (spell.equalsIgnoreCase(MagicReference.earthBolt)) { return 7; }
		else if (spell.equalsIgnoreCase(MagicReference.fireBolt)) { return 7; }
		else if (spell.equalsIgnoreCase(MagicReference.airBlast)) { return 8; }
		else if (spell.equalsIgnoreCase(MagicReference.waterBlast)) { return 9; }
		else if (spell.equalsIgnoreCase(MagicReference.earthBlast)) { return 10; }
		else if (spell.equalsIgnoreCase(MagicReference.fireBlast)) { return 10; }
		else if (spell.equalsIgnoreCase(MagicReference.airWave)) { return 11; }
		else if (spell.equalsIgnoreCase(MagicReference.waterWave)) { return 12; }
		else if (spell.equalsIgnoreCase(MagicReference.earthWave)) { return 13; }
		else if (spell.equalsIgnoreCase(MagicReference.fireWave)) { return 15; }
		else if (spell.equalsIgnoreCase(MagicReference.airSurge)) { return 17; }
		else if (spell.equalsIgnoreCase(MagicReference.waterSurge)) { return 18; }
		else if (spell.equalsIgnoreCase(MagicReference.earthSurge)) { return 20; }
		else if (spell.equalsIgnoreCase(MagicReference.fireSurge)) { return 23; }
		return 0;
	}
	
	public int getRequiredLevelFromSpell(String spell)
	{
		if (spell.equalsIgnoreCase(MagicReference.airStrike)) { return 1; }
		else if (spell.equalsIgnoreCase(MagicReference.confuse)) { return 3; }
		else if (spell.equalsIgnoreCase(MagicReference.waterStrike)) { return 5; }
		else if (spell.equalsIgnoreCase(MagicReference.earthStrike)) { return 9; }
		else if (spell.equalsIgnoreCase(MagicReference.weaken)) { return 11; }
		else if (spell.equalsIgnoreCase(MagicReference.fireStrike)) { return 13; }
		else if (spell.equalsIgnoreCase(MagicReference.airBolt)) { return 17; }
		else if (spell.equalsIgnoreCase(MagicReference.curse)) { return 19; }
		else if (spell.equalsIgnoreCase(MagicReference.bind)) { return 20; }
		else if (spell.equalsIgnoreCase(MagicReference.waterBolt)) { return 23; }
		else if (spell.equalsIgnoreCase(MagicReference.earthBolt)) { return 29; }
		else if (spell.equalsIgnoreCase(MagicReference.fireBolt)) { return 35; }
		else if (spell.equalsIgnoreCase(MagicReference.airBlast)) { return 41; }
		else if (spell.equalsIgnoreCase(MagicReference.waterBlast)) { return 47; }
		else if (spell.equalsIgnoreCase(MagicReference.snare)) { return 50; }
		else if (spell.equalsIgnoreCase(MagicReference.slayerDart)) { return 50; }
		else if (spell.equalsIgnoreCase(MagicReference.earthBlast)) { return 53; }
		else if (spell.equalsIgnoreCase(MagicReference.fireBlast)) { return 59; }
		else if (spell.equalsIgnoreCase(MagicReference.divineStorm)) { return 60; }
		else if (spell.equalsIgnoreCase(MagicReference.airWave)) { return 62; }
		else if (spell.equalsIgnoreCase(MagicReference.waterWave)) { return 65; }
		else if (spell.equalsIgnoreCase(MagicReference.vulnerability)) { return 66; }
		else if (spell.equalsIgnoreCase(MagicReference.earthWave)) { return 70; }
		else if (spell.equalsIgnoreCase(MagicReference.fireWave)) { return 75; }
		else if (spell.equalsIgnoreCase(MagicReference.stormOfArmadyl)) { return 77; }
		else if (spell.equalsIgnoreCase(MagicReference.entangle)) { return 79; }
		else if (spell.equalsIgnoreCase(MagicReference.polyporeStrike)) { return 80; }
		else if (spell.equalsIgnoreCase(MagicReference.stagger)) { return 80; }
		else if (spell.equalsIgnoreCase(MagicReference.airSurge)) { return 81; }
		else if (spell.equalsIgnoreCase(MagicReference.waterSurge)) { return 85; }
		else if (spell.equalsIgnoreCase(MagicReference.teleBlock)) { return 85; }
		else if (spell.equalsIgnoreCase(MagicReference.earthSurge)) { return 90; }
		else if (spell.equalsIgnoreCase(MagicReference.fireSurge)) { return 95; }
		return 0;
	}

	public boolean hasEffecientRunesForSpell;
	
	public void checkForEffecientRunesForSpell(EntityPlayer player, String spell)
	{
		boolean flag = true;
		
		for (int i = 0; i < getRunesFromSpell(spell).size(); i++)
		{
			if (player.inventory.hasItem(getRunesFromSpell(spell).get(i)))
			{
				if (flag) {
				flag = true; }
			}
			else
			{
				LogHelper.info("You need " + getRunesFromSpell(RCM.instance.magic.getCurrentSelectedSpell()).get(i).getUnlocalizedName().substring(5).replace('_', ' ') + "s in order to use this spell!");
				flag = false;
			}
		}
		
		hasEffecientRunesForSpell = flag;
	}
	
	public ArrayList<Item> getRunesFromSpell(String spell)
	{
		if (spell.equals(MagicReference.airStrike))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.mindRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.confuse))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.bodyRune);
			arrayList.add(ModMagicItems.earthRune);
			arrayList.add(ModMagicItems.waterRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.waterStrike))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.mindRune);
			arrayList.add(ModMagicItems.waterRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.earthStrike))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.mindRune);
			arrayList.add(ModMagicItems.earthRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.weaken))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.bodyRune);
			arrayList.add(ModMagicItems.earthRune);
			arrayList.add(ModMagicItems.waterRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.fireStrike))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.mindRune);
			arrayList.add(ModMagicItems.fireRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.airBolt))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.chaosRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.curse))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.bodyRune);
			arrayList.add(ModMagicItems.earthRune);
			arrayList.add(ModMagicItems.waterRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.bind))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.natureRune);
			arrayList.add(ModMagicItems.earthRune);
			arrayList.add(ModMagicItems.waterRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.waterBolt))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.chaosRune);
			arrayList.add(ModMagicItems.waterRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.earthBolt))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.chaosRune);
			arrayList.add(ModMagicItems.earthRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.fireBolt))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.chaosRune);
			arrayList.add(ModMagicItems.fireRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.airBlast))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.deathRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.waterBlast))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.deathRune);
			arrayList.add(ModMagicItems.waterRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.snare))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.natureRune);
			arrayList.add(ModMagicItems.earthRune);
			arrayList.add(ModMagicItems.waterRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.slayerDart))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.deathRune);
			// + Slayer Staff To Use
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.earthBlast))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.deathRune);
			arrayList.add(ModMagicItems.earthRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.fireBlast))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.deathRune);
			arrayList.add(ModMagicItems.fireRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.divineStorm))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.bloodRune);
			arrayList.add(ModMagicItems.fireRune);
			arrayList.add(ModMagicItems.airRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.airWave))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.bloodRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.airWave))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.bloodRune);
			arrayList.add(ModMagicItems.waterRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.waterWave))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.bloodRune);
			arrayList.add(ModMagicItems.waterRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.vulnerability))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.soulRune);
			arrayList.add(ModMagicItems.earthRune);
			arrayList.add(ModMagicItems.waterRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.earthWave))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.bloodRune);
			arrayList.add(ModMagicItems.earthRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.fireWave))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.bloodRune);
			arrayList.add(ModMagicItems.fireRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.stormOfArmadyl))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.armadylRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.entangle))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.soulRune);
			arrayList.add(ModMagicItems.earthRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.polyporeStrike))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			// + Polypore Staff To Use
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.stagger))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.soulRune);
			arrayList.add(ModMagicItems.mindRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.airSurge))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.deathRune);
			arrayList.add(ModMagicItems.bloodRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.waterSurge))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.deathRune);
			arrayList.add(ModMagicItems.bloodRune);
			arrayList.add(ModMagicItems.waterRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.teleBlock))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.lawRune);
			arrayList.add(ModMagicItems.deathRune);
			arrayList.add(ModMagicItems.chaosRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.earthSurge))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.deathRune);
			arrayList.add(ModMagicItems.bloodRune);
			arrayList.add(ModMagicItems.earthRune);
			
			return arrayList;
		}
		else if (spell.equals(MagicReference.fireSurge))
		{
			ArrayList<Item> arrayList = new ArrayList<Item>();
			arrayList.add(ModMagicItems.airRune);
			arrayList.add(ModMagicItems.deathRune);
			arrayList.add(ModMagicItems.bloodRune);
			arrayList.add(ModMagicItems.fireRune);
			
			return arrayList;
		}
		else
		{
			return null;
		}
	}
}