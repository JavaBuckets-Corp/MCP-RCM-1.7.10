package javabuckets.mods.rcm.skills.strength;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class StrengthEventHandler 
{
	@SubscribeEvent
	public void onPlayerAttackEntity(AttackEntityEvent event)
	{
		if (event.entityPlayer.getHeldItem() != null && event.entityPlayer.getHeldItem().getItem() instanceof ItemSword)
		{
			float damage = RCM.instance.skillHandler.getLevel(SkillReference.str) / 8;
			
			event.target.attackEntityFrom(DamageSource.causePlayerDamage(event.entityPlayer), damage);
		}
		else
		{
			
		}
	}
	
	@SubscribeEvent
	public void onEntityHitBeforeDmgIsApplied(LivingAttackEvent event)
	{
		if (event.source.getDamageType().equals("player") || event.source.isMagicDamage() || event.source.isProjectile())
		{
			LogHelper.info("Damage: " + event.ammount);
		}
	}
}