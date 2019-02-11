package javabuckets.mods.rcm.handlers;

import javabuckets.mods.rcm.init.ModArmor;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.attack.ModWeapons;
import javabuckets.mods.rcm.skills.magic.ModMagicItems;
import javabuckets.mods.rcm.skills.mining.ModMiningItems;
import javabuckets.mods.rcm.skills.prayer.ModPrayerItems;
import javabuckets.mods.rcm.skills.smithing.ModSmithingItems;
import javabuckets.mods.rcm.skills.summoning.ModSummoningItems;
import javabuckets.mods.rcm.skills.woodcutting.ModWoodcuttingItems;
import javabuckets.mods.rcm.utility.DroptableReference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EntityEventHandler 
{
	@SubscribeEvent
	public void entityDrops(LivingDropsEvent event)
	{		
		if (event.entity instanceof EntityAnimal || event.entity instanceof EntityMob) 
		{
			addDropToEntity(event, 1.00, ModPrayerItems.bones, 1); 
			addDropTableToEntity(event, 0.15, DroptableReference.herbSeeds);
			addDropTableToEntity(event, 0.2, DroptableReference.farmingSeeds);
			addDropTableToEntity(event, 0.2, DroptableReference.allotmentSeeds);
			addDropTableToEntity(event, 0.075, DroptableReference.fruitTreeCactiSeeds);
		}

		if (event.entity instanceof EntityZombie)
		{
			addDropToEntity(event, 0.2, ModSummoningItems.goldCharm, 1);
			addDropToEntity(event, 0.2, ModMagicItems.airRune, 20);
			addDropToEntity(event, 0.15, ModMagicItems.mindRune, 40);
		}
		
		if (event.entity instanceof EntitySkeleton)
		{
			addDropToEntity(event, 0.15, ModSummoningItems.greenCharm, 1);
			addDropToEntity(event, 0.2, ModMagicItems.airRune, 20);
			addDropToEntity(event, 0.15, ModMagicItems.earthRune, 30);
			addDropToEntity(event, 0.15, ModMagicItems.waterRune, 30);
		}

		if (event.entity instanceof EntitySpider)
		{
			addDropToEntity(event, 0.1, ModSummoningItems.redCharm, 1);
			addDropToEntity(event, 0.2, ModMagicItems.airRune, 20);
			addDropToEntity(event, 0.15, ModMagicItems.earthRune, 30);
			addDropToEntity(event, 0.15, ModMagicItems.fireRune, 30);
		}

		if (event.entity instanceof EntityWither) 
		{
			for (int i = 0; i < 15; ++i)
			{
				addDropToEntity(event, 1.00, ModPrayerItems.bigBones, 1);	
			} 

			addTwoTwoDropToEntity(event, ModWeapons.runiteSword, ModWeapons.runiteScimitar);
			addDropToEntity(event, 0.25, ModSmithingItems.adamantBar, 15);
			addDropToEntity(event, 0.2, ModWoodcuttingItems.runeHatchet, 1);
			addDropToEntity(event, 0.2, ModMiningItems.runePickaxe, 1);
			addDropToEntity(event, 0.125, ModMagicItems.soulRune, 50);
			addDropToEntity(event, 0.125, ModMagicItems.deathRune, 150);
			addDropToEntity(event, 0.125, ModMagicItems.chaosRune, 300);
			addDropTableToEntity(event, 1, DroptableReference.herbSeeds);

			addDropToEntity(event, 0.5, ModSummoningItems.blueCharm, 3);
		}

		if (event.entity instanceof EntityDragon) 
		{
			for (int i = 0; i < 20; ++i)
			{
				addDropToEntity(event, 1.00D, ModPrayerItems.dragonBones, 1);
			}

			addTwoTwoDropToEntity(event, ModWoodcuttingItems.dragonHatchet, ModMiningItems.dragonPickaxe);
			addDropToEntity(event, 0.125, ModWeapons.dragonLongsword, 1);
			addDropToEntity(event, 0.125, ModArmor.runePlatebody, 1);
			addDropToEntity(event, 0.1, ModArmor.adamantPlatelegs, 1);
			addDropToEntity(event, 0.1, ModMagicItems.chaosRune, 300);
			addDropToEntity(event, 0.1, ModMagicItems.bloodRune, 200);	
			addDropTableToEntity(event, 1, DroptableReference.herbSeeds);

			addDropToEntity(event, 1, ModSummoningItems.blueCharm, 30);
		}
	}

	private void addDropTableToEntity(LivingDropsEvent event, double chance, String droptableName) 
	{
		if (event.source.getDamageType().equals("player") || event.source.isProjectile() || event.source.isMagicDamage() || event.source.isFireDamage())
		{
			double rand = Math.random();

			if (event.entity instanceof Entity)
			{
				if (rand < chance)
				{
					RCM.instance.droptable.dropItemFromDroptable(event, droptableName);
				}
			}
		}
	}

	public void addDropToEntity(LivingDropsEvent event, double chance, Item item, int count)
	{
		if (event.source.getDamageType().equals("player") || event.source.isProjectile() || event.source.isMagicDamage() || event.source.isFireDamage())
		{
			double rand = Math.random();

			if (event.entity instanceof Entity)
			{
				if (rand < chance)
				{
					event.entity.dropItem(item, count);
				}
			}
		}
	}

	public void addTwoTwoDropToEntity(LivingDropsEvent event, Item item1, Item item2) 
	{
		if (event.source.getDamageType().equals("player") || event.source.isProjectile() || event.source.isMagicDamage() || event.source.isFireDamage())
		{
			double rand = Math.random();

			if (event.entity instanceof Entity)
			{
				if (rand > 0.5)
				{
					event.entity.dropItem(item1, 1);
				}
				else
				{
					event.entity.dropItem(item2, 1);
				}
			}
		}
	}

	/**
	 * Money Handling
	 */

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event)
	{
		if (event.source.getDamageType().equals("player") || event.source.isProjectile() || event.source.isMagicDamage())
		{
			if (event.entity instanceof EntityMob) 
			{
				addGpDropWithChance(0.5D, 18);
				addGpDropWithChance(0.2D, 12);
				addGpDropWithChance(0.1D, 33);
				addGpDropWithChance(0.075D, 176);
			}

			if (event.entity instanceof EntityWither) 
			{
				addGpDropWithChance(1D, 15000);
			}

			if (event.entity instanceof EntityDragon) 
			{
				addGpDropWithChance(1D, 250000);
			}
		}
	}

	public void addGpDropWithChance(double chance, long gp) 
	{
		double rand = Math.random();

		if (rand < chance)
		{
			RCM.instance.gpHandler.addGPToPouch(gp);
		}
	}

	public void addRandomGpWithChance(LivingDropsEvent event, double differentDrops, double chance, long gp) 
	{

	}

	public void addRandomGp(LivingDropsEvent event, double differentDrops, long gp)
	{

	}
}
