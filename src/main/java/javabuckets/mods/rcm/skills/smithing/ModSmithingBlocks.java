package javabuckets.mods.rcm.skills.smithing;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.rcm.blocks.tileentities.TileEntityRSFurnace;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class ModSmithingBlocks 
{
	public static Block rsFurnace;
	
	public static void init()
	{
		rsFurnace = new BlockRSFurnace().setBlockName("furnace").setBlockTextureName("furnace")/*.setCreativeTab(CreativeTabs.tabBlock)*/;
		GameRegistry.registerBlock(rsFurnace, "furnace"); GameRegistry.registerTileEntity(TileEntityRSFurnace.class, "rsfurnace");
	}
}
