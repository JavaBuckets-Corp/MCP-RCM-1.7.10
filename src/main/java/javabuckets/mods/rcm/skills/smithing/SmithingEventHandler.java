package javabuckets.mods.rcm.skills.smithing;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.player.AnvilRepairEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;

public class SmithingEventHandler 
{
	@SubscribeEvent
	public void onItemCrafted(ItemCraftedEvent event)
	{
		RCM.instance.smithing.isSmithing = true;

		//addToolToSmithing(event, Items.iron_sword, 5, 25);
	}

	public void addToolToSmithing(ItemCraftedEvent event, Item tool, int requiredLevel, double xp)
	{
		Minecraft mc = Minecraft.getMinecraft();
		
		if (!RCM.instance.smithing.running)
		{
			RCM.instance.smithing.running = true;
			
			if (event.crafting.getItem() == tool)
			{
				if (RCM.instance.skillHandler.getLevel(SkillReference.smith) >= requiredLevel)
				{
					System.out.println("succes");
					RCM.instance.skillHandler.addXPToSkill(SkillReference.smith, xp);
				}
				else
				{
					event.player.addChatMessage(new ChatComponentText("You need a level of at least " + requiredLevel + " in Smithing, to smith this item!"));
					event.craftMatrix.closeInventory();
					LogHelper.info(event.craftMatrix.getStackInSlotOnClosing(0).getDisplayName());
					updatePlayerInventory(mc, event.player);
				}
			}
		}
	}

	@SubscribeEvent
	public void onItemSmelted(ItemSmeltedEvent event)
	{
		
	}

	@SubscribeEvent
	public void onToolRepaired(AnvilRepairEvent event)
	{

	}
	
	

	public void updatePlayerInventory(Minecraft mc, EntityPlayer player)
	{
		mc.displayGuiScreen(new GuiInventory(player));
		mc.displayGuiScreen((GuiScreen)null);
		mc.setIngameFocus();
	}
}