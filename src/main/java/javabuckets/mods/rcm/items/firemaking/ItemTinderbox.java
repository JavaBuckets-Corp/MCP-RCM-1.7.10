package javabuckets.mods.rcm.items.firemaking;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.init.ModFixBlocks;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.firemaking.ModFiremakingBlocks;
import javabuckets.mods.rcm.utility.SkillReference;
import javabuckets.mods.rcm.utility.UtilAPI;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTinderbox extends ItemBase 
{
	public ItemTinderbox(String unlocalizedName) 
	{
		super(unlocalizedName);
		this.setCreativeTab(ModCreativeTabs.rcmItems);
		this.setMaxStackSize(1);
	}
	
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int meta, float f1, float f2, float f3)
    {
        if (meta == 0)
        {
            --y;
        }

        if (meta == 1)
        {
            ++y;
        }

        if (meta == 2)
        {
            --z;
        }

        if (meta == 3)
        {
            ++z;
        }

        if (meta == 4)
        {
            --x;
        }

        if (meta == 5)
        {
            ++x;
        }

        if (!player.canPlayerEdit(x, y, z, meta, itemstack))
        {
            return false;
        }
        else
        {
            if (world.isAirBlock(x, y, z))
            {
                if (UtilAPI.getAmountOfItemInInventory(player.inventory, "Oak Wood") >= 1 || UtilAPI.getAmountOfItemInInventory(player.inventory, "Birch Wood") >= 1 || UtilAPI.getAmountOfItemInInventory(player.inventory, "Jungle Wood") >= 1 || UtilAPI.getAmountOfItemInInventory(player.inventory, "Spruce Wood") >= 1)
                {
                	world.setBlock(x, y, z, ModFiremakingBlocks.fire);
                	player.inventory.consumeInventoryItem(Item.getItemFromBlock(Blocks.log));
                	RCM.instance.firemaking.isFiremaking = true;
                	RCM.instance.skillHandler.addXPToSkillBugged(SkillReference.fm, 20);
                }
                else if (UtilAPI.getAmountOfItemInInventory(player.inventory, "Oak Logs") >= 1)
                {
                	world.setBlock(x, y, z, ModFiremakingBlocks.fire);
                	player.inventory.consumeInventoryItem(Item.getItemFromBlock(ModFixBlocks.oakLog));
                	RCM.instance.firemaking.isFiremaking = true;
                	RCM.instance.skillHandler.addXPToSkillBugged(SkillReference.fm, 20);
                }
                else if (UtilAPI.getAmountOfItemInInventory(player.inventory, "Birch Logs") >= 1)
                {
                	world.setBlock(x, y, z, ModFiremakingBlocks.fire);
                	player.inventory.consumeInventoryItem(Item.getItemFromBlock(ModFixBlocks.birchLog));
                	RCM.instance.firemaking.isFiremaking = true;
                	RCM.instance.skillHandler.addXPToSkillBugged(SkillReference.fm, 20);
                }
                else if (UtilAPI.getAmountOfItemInInventory(player.inventory, "Spruce Logs") >= 1)
                {
                	world.setBlock(x, y, z, ModFiremakingBlocks.fire);
                	player.inventory.consumeInventoryItem(Item.getItemFromBlock(ModFixBlocks.spruceLog));
                	RCM.instance.firemaking.isFiremaking = true;
                	RCM.instance.skillHandler.addXPToSkillBugged(SkillReference.fm, 20);
                }
                else if (UtilAPI.getAmountOfItemInInventory(player.inventory, "Jungle Logs") >= 1)
                {
                	world.setBlock(x, y, z, ModFiremakingBlocks.fire);
                	player.inventory.consumeInventoryItem(Item.getItemFromBlock(ModFixBlocks.jungleLog));
                	RCM.instance.firemaking.isFiremaking = true;
                	RCM.instance.skillHandler.addXPToSkillBugged(SkillReference.fm, 20);
                }
            }
            return true;
        }
    }
}