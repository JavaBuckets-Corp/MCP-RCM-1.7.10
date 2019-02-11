package javabuckets.mods.rcm.items.farming;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.farming.ModFarmingItems;
import javabuckets.mods.rcm.utility.DroptableReference;
import javabuckets.mods.rcm.utility.Reference;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemAllotmentSeed extends ItemFarmingItem implements IPlantable
{
	private Block plant;
	private Block soil = Blocks.farmland;

	public ItemAllotmentSeed(String unlocalizedName, Block outcome) 
	{
		super(unlocalizedName);
		this.plant = outcome;
	}

	/**
	 * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
	 * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
	 */
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int i, float f1, float f2, float f3)
	{
		if (i != 1)
		{
			return false;
		}
		else if (player.canPlayerEdit(x, y, z, i, itemstack) && player.canPlayerEdit(x, y + 1, z, i, itemstack))
		{
			if (world.getBlock(x, y, z).canSustainPlant(world, x, y, z, ForgeDirection.UP, this) && world.isAirBlock(x, y + 1, z))
			{
				if (RCM.instance.skillHandler.getLevel(SkillReference.farm) >= getRequiredLevelFromSeed(this)) 
				{
					world.setBlock(x, y + 1, z, this.plant);
					--itemstack.stackSize;
					return true;
				}
				else
				{
					player.addChatMessage(new ChatComponentText("You need a Level of at least: " + getRequiredLevelFromSeed(this) + " in Farming, to plant " + this.getUnlocalizedName().substring(5) + "!"));
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	public int getRequiredLevelFromSeed(Item seed)
	{
		if (seed == ModFarmingItems.allotmentseed_onion) return 5;
		else if (seed == ModFarmingItems.allotmentseed_cabbage) return 7;
		else if (seed == ModFarmingItems.allotmentseed_tomato) return 12;
		else if (seed == ModFarmingItems.allotmentseed_sweetcorn) return 20;
		else if (seed == ModFarmingItems.allotmentseed_strawberry) return 31;
		else if (seed == ModFarmingItems.allotmentseed_snapeGrass) return 80;
		else return 0;
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
	{
		return EnumPlantType.Crop;
	}

	@Override
	public Block getPlant(IBlockAccess world, int x, int y, int z)
	{
		return this.plant;
	}

	@Override
	public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
	{
		return 0;
	}
}