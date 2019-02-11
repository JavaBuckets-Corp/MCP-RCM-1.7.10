package javabuckets.mods.rcm.skills.combat;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.attack.ModWeapons;
import javabuckets.mods.rcm.skills.mining.ModMiningItems;
import javabuckets.mods.rcm.skills.woodcutting.ModWoodcuttingItems;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class CombatEventHandler 
{
	@SubscribeEvent
	public void onEntityHitBeforeDmgIsApplied(LivingAttackEvent event)
	{
		/*if (event.entity instanceof EntitySlayerMaster)
		{
			event.setCanceled(true);
		}*/
		
		if (event.source.getDamageType().equals("player"))
		{
			addSwordFromLevel(event, Items.stone_sword, 5);
			addSwordFromLevel(event, Items.stone_axe, 5);
			addSwordFromLevel(event, Items.stone_pickaxe, 5);
			addSwordFromLevel(event, Items.stone_shovel, 5);

			addSwordFromLevel(event, Items.iron_sword, 10);
			addSwordFromLevel(event, Items.iron_axe, 10);
			addSwordFromLevel(event, Items.iron_pickaxe, 10);
			addSwordFromLevel(event, Items.iron_shovel, 10);

			addSwordFromLevel(event, ModWeapons.steelLongsword, 20);
			addSwordFromLevel(event, ModWoodcuttingItems.steelHatchet, 20);
			addSwordFromLevel(event, ModMiningItems.steelPickaxe, 20);

			//addSwordFromLevel(event, ModWeapons.blackLongsword, 25);
			//addSwordFromLevel(event, ModWoodcuttingItems.blackHatchet, 25);

			//addSwordFromLevel(event, ModWeapons.whiteLongsword, 25);

			addSwordFromLevel(event, Items.diamond_sword, 27);
			addSwordFromLevel(event, Items.diamond_axe, 27);
			addSwordFromLevel(event, Items.diamond_pickaxe, 27);
			addSwordFromLevel(event, Items.diamond_shovel, 27);

			addSwordFromLevel(event, ModWeapons.mithrilLongsword, 30);
			addSwordFromLevel(event, ModWoodcuttingItems.mithrilHatchet, 30);
			addSwordFromLevel(event, ModMiningItems.mithrilPickaxe, 30);

			addSwordFromLevel(event, ModWeapons.adamantiteLongsword, 40);
			addSwordFromLevel(event, ModWoodcuttingItems.adamantHatchet, 40);
			addSwordFromLevel(event, ModMiningItems.adamantPickaxe, 40);

			addSwordFromLevel(event, ModWeapons.runiteLongsword, 50);
			addSwordFromLevel(event, ModWoodcuttingItems.runeHatchet, 50);
			addSwordFromLevel(event, ModMiningItems.runePickaxe, 50);

			//addSwordFromLevel(event, ModWeapons.dragonLongsword, 60);
			addSwordFromLevel(event, ModWoodcuttingItems.dragonHatchet, 60);
			addSwordFromLevel(event, ModMiningItems.dragonPickaxe, 60);
		}
	}

	public void addSwordFromLevel(LivingAttackEvent event, Item sword, int attackLevelRequired)
	{
		EntityPlayer player = (EntityPlayer)Minecraft.getMinecraft().thePlayer;
		ItemStack heldItem = player.getHeldItem();
		int attackLevel = RCM.instance.skillHandler.getLevel(SkillReference.att);

		if (event.source.getDamageType().equals("player"))
		{
			if (heldItem != null && heldItem.getItem() == sword && attackLevel < attackLevelRequired && !player.capabilities.isCreativeMode)
			{
				event.setCanceled(true);
				player.addChatMessage(new ChatComponentText("You need a level of atleast " + attackLevelRequired + " in Attack to use this weapon!"));
			}
		}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event)
	{	
		if (!(event.entity instanceof EntityPlayer))
		{

			EntityLiving entity = (EntityLiving)event.entity;

			double xp = 0;

			if (event.entity instanceof EntityBat || event.entity instanceof EntitySquid) { xp = 10D; }
			else if (event.entity instanceof EntityChicken) { xp = 15D; }
			else if (event.entity instanceof EntityCow || event.entity instanceof EntityMooshroom) { xp = 20D; }
			else if (event.entity instanceof EntityOcelot) { xp = 15D; }
			else if (event.entity instanceof EntityPig) { xp = 15D; }
			else if (event.entity instanceof EntitySheep) { xp = 15D; }
			else if (event.entity instanceof EntityHorse) { xp = 25D; }
			else if (event.entity instanceof EntityWolf) { xp = 20D; }
			else if (event.entity instanceof EntityBlaze) { xp = 50D; }
			else if (event.entity instanceof EntityCaveSpider) { xp = 33D; }
			else if (event.entity instanceof EntityCreeper) { xp = 50D; }
			else if (event.entity instanceof EntityEnderman) { xp = 75D; }
			else if (event.entity instanceof EntityGhast) { xp = 100D; }
			else if (event.entity instanceof EntityGiantZombie) { xp = 1000D; }
			else if (event.entity instanceof EntityIronGolem) { xp = 100D; }
			else if (event.entity instanceof EntityMagmaCube) { xp = 75D; }
			else if (event.entity instanceof EntityPigZombie) { xp = 60D; }
			else if (event.entity instanceof EntitySilverfish) { xp = 45D; }
			else if (event.entity instanceof EntitySkeleton) { xp = 70D; }
			else if (event.entity instanceof EntitySlime) { xp = 33D; }
			else if (event.entity instanceof EntitySpider) { xp = 65D; }
			else if (event.entity instanceof EntityWitch) { xp = 75D; }
			else if (event.entity instanceof EntityZombie) { xp = 60D; }
			else if (event.entity instanceof EntityDragon) { xp = 100000D; }
			else if (event.entity instanceof EntityWither) { xp = 15000D; }
			else { xp = 0D; }

			// Attack, Strength & Defence
			if (event.source.getDamageType().equals("player") && !event.source.isMagicDamage() && !event.source.isProjectile())
			{
				CombatHandler.isCombating = true;
				
				if (event.entity instanceof EntityLiving) 
				{				
					if (RCM.instance.combat.getIsTrainingAttackMelee())
					{
						RCM.instance.skillHandler.addXPToCombatSkill("attack", xp);
					}
					if (RCM.instance.combat.getIsTrainingStrengthMelee())
					{
						RCM.instance.skillHandler.addXPToCombatSkill("strength", xp);
					}
					if (RCM.instance.combat.getIsTrainingDefenceMelee())
					{
						RCM.instance.skillHandler.addXPToCombatSkill("defence", xp);
					}
				}
			}

			// Magic
			else if (event.source.isMagicDamage())
			{
				CombatHandler.isCombating = true;
				
				if (event.entity instanceof EntityLiving) 
				{
					if (RCM.instance.combat.getIsTrainingMagicMaging())
					{
						RCM.instance.skillHandler.addXPToCombatSkill("magic", xp);
					}
					if (RCM.instance.combat.getIsTrainingDefenceMaging())
					{
						RCM.instance.skillHandler.addXPToCombatSkill("defence", xp);
					}
				}
			}

			// Ranged
			else if (event.source.isProjectile())
			{
				CombatHandler.isCombating = true;
				
				if (event.entity instanceof EntityLiving) 
				{
					
					
					if (RCM.instance.combat.getIsTrainingRangedRanging())
					{
						RCM.instance.skillHandler.addXPToCombatSkill("ranged", xp);
					}
					
					if (RCM.instance.combat.getIsTrainingStrengthRanging())
					{
						RCM.instance.skillHandler.addXPToCombatSkill("strength", xp);
					}
					
					if (RCM.instance.combat.getIsTrainingDefenceRanging())
					{
						RCM.instance.skillHandler.addXPToCombatSkill("defence", xp);
					}
				}
			}
		}
	}
}