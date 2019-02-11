package javabuckets.mods.rcm.skills.slayer;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class SlayerEventHandler 
{
	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event)
	{
		if (!(event.entity instanceof EntityPlayer))
		{
			if (RCM.instance.slayer.isPlayerAssignedWithSlayerTask())
			{
				if (event.source.getDamageType().equals("player") || event.source.isProjectile())
				{
					checkForKill(event);
				}
			}
			
			if (RCM.instance.slayer.isPlayerAssignedWithSlayerBossTask())
			{
				if (event.source.getDamageType().equals("player") || event.source.isProjectile())
				{
					checkForBossKill(event);
				}
			}
		}
	}
	
	public void checkForKill(LivingDeathEvent event)
	{
		if (event.entity instanceof EntityZombie)
		{
			processSlayerKill("Zombie", 20);
		}
		
		else if (event.entity instanceof EntitySkeleton)
		{
			processSlayerKill("Skeleton", 25);
		}
		
		else if (event.entity instanceof EntityWolf)
		{
			processSlayerKill("Wolf", 17.5);
		}
		
		else if (event.entity instanceof EntityPigZombie)
		{
			processSlayerKill("Pigzombie", 22.5);
		}
		
		else if (event.entity instanceof EntitySpider)
		{
			processSlayerKill("Spider", 20);
		}
		
		else if (event.entity instanceof EntityGhast)
		{
			processSlayerKill("Ghast", 75);
		}
	}
	
	public void processSlayerKill(String monsterName, double xp)
	{
		if (monsterName == RCM.instance.slayer.getSlayerTask())
		{		
			RCM.instance.skillHandler.addXPToSkill(SkillReference.slay, xp);
			
			RCM.instance.slayer.isCombatingAssignedSlayerMonster = true;
			RCM.instance.slayer.setSlayerKills(RCM.instance.slayer.getSlayerKillsTotal() + 1);
			RCM.instance.slayer.setSlayerTaskKillsRemaining(RCM.instance.slayer.getSlayerTaskKillsRemaining() - 1);
		}
	}
	
	public void checkForBossKill(LivingDeathEvent event)
	{
		if (event.entity instanceof EntityWither)
		{
			processBossKill("WitherBoss", 7500);
		}
	}
	
	public void processBossKill(String bossName, double xp)
	{
		if (RCM.instance.slayer.getBossTask() == bossName)
		{
			RCM.instance.skillHandler.addXPToSkill(SkillReference.slay, xp);
			
			RCM.instance.slayer.isCombatingAssignedSlayerMonster = true;
			RCM.instance.slayer.setBossKills(RCM.instance.slayer.getBossKillsTotal() + 1);
			RCM.instance.slayer.setBossTaskKillsRemaining(RCM.instance.slayer.getBossTaskKillsRemaining() - 1);
		}
	}
	
	@SubscribeEvent
	public void onPlayerJoinWorld(EntityJoinWorldEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			RCM.instance.slayer.setSlayerTask(RCM.instance.slayer.getSlayerTask(), RCM.instance.slayer.getSlayerTaskKillsRemaining());
		}
	}
}