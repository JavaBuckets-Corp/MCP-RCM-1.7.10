package javabuckets.mods.rcm.skills.runecrafting;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.magic.ModMagicItems;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class RunecraftingEventHandler 
{
	@SubscribeEvent
	public void onPlayerInteract(PlayerInteractEvent event)
	{
		if (event.action.equals(event.action.RIGHT_CLICK_BLOCK))
		{
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.airAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.airRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.mindAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.mindRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.waterAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.waterRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.earthAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.earthRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.fireAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.fireRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.bodyAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.bodyRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.cosmicAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.cosmicRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.chaosAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.chaosRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.astralAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.astralRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.natureAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.natureRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.lawAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.lawRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.deathAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.deathRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.bloodAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.bloodRune));
			registerAltarWithXPFromRunes(event, ModRunecraftingBlocks.soulAltar, RunecraftingReference.getXPFromCreatingRunes(ModMagicItems.soulRune));
		}
	}
	
	public void registerAltarWithXPFromRunes(PlayerInteractEvent event, Block altar, double xp)
	{
		if (event.entityPlayer.worldObj.getBlock(event.x, event.y, event.z) == altar)
		{
			if (event.entityPlayer.inventory.hasItem(RunecraftingReference.getCorrespondingTalismanFromAltar(altar)) || event.entityPlayer.inventory.hasItem(ModRunecraftingItems.omniTalisman))
			{
				if (event.entityPlayer.inventory.hasItem(ModRunecraftingItems.runeEssence) && !event.entityPlayer.inventory.hasItem(ModRunecraftingItems.pureEssence))
				{
					RCM.instance.runecrafting.isRunecrafting = true;
					
					event.entityPlayer.inventory.consumeInventoryItem(ModRunecraftingItems.runeEssence);
					event.entityPlayer.inventory.addItemStackToInventory(new ItemStack(RunecraftingReference.getCorrespondingRuneFromAltar(altar)));
					RCM.instance.skillHandler.addXPToSkill(SkillReference.rc, xp);
				}
				else if (event.entityPlayer.inventory.hasItem(ModRunecraftingItems.pureEssence))
				{
					RCM.instance.runecrafting.isRunecrafting = true;
					
					event.entityPlayer.inventory.consumeInventoryItem(ModRunecraftingItems.pureEssence);
					event.entityPlayer.inventory.addItemStackToInventory(new ItemStack(RunecraftingReference.getCorrespondingRuneFromAltar(altar)));
					RCM.instance.skillHandler.addXPToSkill(SkillReference.rc, xp);
				}
			}
		}
	}
}