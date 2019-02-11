package javabuckets.mods.rcm.skills.farming;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import javabuckets.mods.rcm.init.ModFixBlocks;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

public class FarmingEventHandler 
{
	@SubscribeEvent
	public void onHarvest(HarvestDropsEvent event)
	{
		addXPOnHarvest(event, Blocks.wheat, 7, 1, 8.5);
		addXPOnHarvest(event, Blocks.potatoes, 7, 1, 9.2);
		addXPOnHarvest(event, Blocks.carrots, 7, 1, 9.2);
		addXPOnHarvest(event, ModFarmingBlocks.onions, 3, 5, 10.8);
		addXPOnHarvest(event, ModFarmingBlocks.cabbage, 3, 7, 12.5);
		addXPOnHarvest(event, ModFarmingBlocks.tomatoes, 3, 12, 15);
		addXPOnHarvest(event, ModFarmingBlocks.sweetcorn, 3, 20, 23.3);
		addXPOnHarvest(event, ModFarmingBlocks.strawberries, 3, 31, 33.6);
		addXPOnHarvest(event, ModFarmingBlocks.onions, 3, 5, 10.8);
		addXPOnHarvest(event, Blocks.melon_block, 47, 71.1);
		addXPOnHarvest(event, ModFarmingBlocks.snapegrass, 3, 80, 97.7);
		
		addXPOnHarvest(event, Blocks.pumpkin, 1, 14.5);
		addXPOnHarvest(event, Blocks.cocoa, 1, 2, 10.4);
		
		addXPOnHarvest(event, ModFarmingBlocks.guam, 4, 9, 25);
		addXPOnHarvest(event, ModFarmingBlocks.marrentill, 4, 14, 32);
		addXPOnHarvest(event, ModFarmingBlocks.tarromin, 4, 19, 40);
		addXPOnHarvest(event, ModFarmingBlocks.harralander, 4, 26, 65);
		addXPOnHarvest(event, ModFarmingBlocks.ranarr, 4, 32, 86);
		addXPOnHarvest(event, ModFarmingBlocks.spiritWeed, 4, 36, 99);
		addXPOnHarvest(event, ModFarmingBlocks.toadflax, 4, 38, 112);
		addXPOnHarvest(event, ModFarmingBlocks.irit, 4, 44, 129);
		addXPOnHarvest(event, ModFarmingBlocks.wergali, 4, 46, 138);
		addXPOnHarvest(event, ModFarmingBlocks.avantoe, 4, 50, 150);
		addXPOnHarvest(event, ModFarmingBlocks.kwuarm, 4, 56, 177);
		addXPOnHarvest(event, ModFarmingBlocks.snapdragon, 4, 62, 202);
		addXPOnHarvest(event, ModFarmingBlocks.cadantine, 4, 67, 245);
		addXPOnHarvest(event, ModFarmingBlocks.lantadyme, 4, 73, 277);
		addXPOnHarvest(event, ModFarmingBlocks.dwarfWeed, 4, 79, 346);
		addXPOnHarvest(event, ModFarmingBlocks.torstol, 4, 85, 467);
		addXPOnHarvest(event, ModFarmingBlocks.fellstalk, 4, 91, 577);
		
		replaceFarmingDrops(event, Blocks.pumpkin, ModFixBlocks.pumpkin);
	}

	public void addXPOnHarvest(HarvestDropsEvent event, Block block, int requiredLvl, double xp)
	{
		addXPOnHarvest(event, block, 0, requiredLvl, xp);
	}
	
	public void addXPOnHarvest(HarvestDropsEvent event, Block block, int metadata, int requiredLvl, double xp)
	{
		if (event.harvester instanceof EntityPlayer)
		{
			RCM.instance.farming.isFarming = true;
			
			if (event.block == block && event.blockMetadata >= metadata && RCM.instance.skillHandler.getLevel(SkillReference.farm) >= requiredLvl)
			{
				RCM.instance.skillHandler.addXPToSkill(SkillReference.farm, xp);
			}
			else if (event.block == block && event.blockMetadata >= metadata && RCM.instance.skillHandler.getLevel(SkillReference.farm) < requiredLvl)
			{
				event.dropChance = 0.00F;
				Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You need a level of at least: " + requiredLvl + " in Farming, to harvest this crop!"));
				event.world.setBlock(event.x, event.y, event.z, event.block, event.blockMetadata, 2);
			}
		}
	}
	
	public void replaceFarmingDrops(HarvestDropsEvent event, Block block, Block newBlock)
	{
		if (event.block == block)
		{
			event.drops.clear();
			event.drops.add(new ItemStack(newBlock));
		}
	}
	
	public void replaceFarmingDrops(HarvestDropsEvent event, Block block, Item item)
	{
		if (event.block == block)
		{
			event.drops.clear();
			event.drops.add(new ItemStack(item));
		}
	}
}