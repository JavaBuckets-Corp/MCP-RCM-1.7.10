package javabuckets.mods.rcm.skills.defence;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DefenceEventHandler 
{
	@SubscribeEvent
	public void onUpdate(LivingUpdateEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)event.entity;

			addArmorFromLevel(player, Items.iron_helmet, 3, 10);
			addArmorFromLevel(player, Items.iron_chestplate, 2, 10);
			addArmorFromLevel(player, Items.iron_leggings, 1, 10);
			addArmorFromLevel(player, Items.iron_boots, 0, 10);
			
			addArmorFromLevel(player, Items.diamond_helmet, 3, 27);
			addArmorFromLevel(player, Items.diamond_chestplate, 2, 27);
			addArmorFromLevel(player, Items.diamond_leggings, 1, 27);
			addArmorFromLevel(player, Items.diamond_boots, 0, 27);
		}
	}

	public void addArmorFromLevel(EntityPlayer player, Item armorPiece, int armor, int requiredLevel)
	{
		if (player.inventory.armorItemInSlot(armor) != null && player.inventory.armorItemInSlot(armor).getItem() == armorPiece)
		{	
			if (RCM.instance.skillHandler.getLevel(SkillReference.def) >= requiredLevel)
			{
				
			}
			else
			{		
				ItemStack output = new ItemStack(armorPiece, 1, armorPiece.getDamage(player.inventory.armorItemInSlot(armor)));
				
				LogHelper.info("You need a level of at least " + requiredLevel + " in Defence to wield this armor piece!");
				player.inventory.setInventorySlotContents(36, null);
				player.inventory.setInventorySlotContents(37, null);
				player.inventory.setInventorySlotContents(38, null);
				player.inventory.setInventorySlotContents(39, null);
				player.inventory.addItemStackToInventory(output);
			}
		}
	}
}