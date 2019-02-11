package javabuckets.mods.rcm.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.dungeoneering.ModDungeoneeringItems;
import javabuckets.mods.rcm.skills.prayer.ModPrayerItems;
import javabuckets.mods.rcm.utility.SkillReference;
import javabuckets.mods.rcm.utility.UtilAPI;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class ItemHandler 
{
	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entity;

			if (player.inventory.hasItem(ModDungeoneeringItems.boneCrusher))
			{
				if (UtilAPI.getAmountOfItemInInventory(player.inventory, "Bones") >= 1)
				{
					RCM.instance.prayer.isPraying = true;
					player.inventory.consumeInventoryItem(ModPrayerItems.bones);
					RCM.instance.skillHandler.addXPToSkillBugged(SkillReference.pray, 2.25);
				}
			}
		}
	}
}
