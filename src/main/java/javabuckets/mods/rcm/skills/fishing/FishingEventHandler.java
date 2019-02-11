package javabuckets.mods.rcm.skills.fishing;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class FishingEventHandler 
{
	public static boolean didPlayerAccesClassFromFishingEquipment = false;

	@SubscribeEvent
	public void onFishing(LivingUpdateEvent event)
	{	
		if (event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)event.entity;

			ItemStack currentFishingEquipment = player.getHeldItem();

			if (didPlayerAccesClassFromFishingEquipment)
			{
//				fish(player, currentFishingEquipment, new ItemStack(Items.fish, 1, 1), 0.4D, 30, 70);	// Salmon
//				fish(player, currentFishingEquipment, new ItemStack(Items.fish, 1, 3), 0.075D, 10, 20);	// Pufferfish
//				fish(player, currentFishingEquipment, new ItemStack(Items.fish, 1, 2), 0.1D, 5, 15);	// Clownfish
				fish(player, currentFishingEquipment, new ItemStack(Items.fish), 0.5D, 1, 10);			// Normal Fish
			}
		}
	}
	
	public void fish(EntityPlayer player, ItemStack equippedTool, ItemStack fish, double succesChance, int requiredLevel, double xp)
	{	
		double rand = Math.random();
		
		if (RCM.instance.skillHandler.getLevel(SkillReference.fish) >= requiredLevel)
		{
			if (rand <= succesChance)
			{
				RCM.instance.skillHandler.addXPToSkill(SkillReference.fish, xp);
				
				player.inventory.addItemStackToInventory(fish);
				
				updatePlayerInventory(Minecraft.getMinecraft(), player);
			
				RCM.instance.fishing.resetFishingTimer();
			}
			else if (rand > succesChance)
			{
				LogHelper.info("Fishing Failed!");
			}
		}
		else
		{
			LogHelper.info("You need a level of at least " + requiredLevel + " in fishing, to fish this fish!");
		}
		
		didPlayerAccesClassFromFishingEquipment = false;
	}
	
	public void updatePlayerInventory(Minecraft mc, EntityPlayer player)
	{
		mc.displayGuiScreen(new GuiInventory(player));
		mc.displayGuiScreen((GuiScreen)null);
		mc.setIngameFocus();
	}
}