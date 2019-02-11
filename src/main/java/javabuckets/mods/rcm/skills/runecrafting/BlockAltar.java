package javabuckets.mods.rcm.skills.runecrafting;

import javabuckets.mods.rcm.blocks.tileentities.TileEntityAltarAir;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;


public class BlockAltar extends BlockContainer
{
	public BlockAltar()
	{
		super(Material.rock);
		//this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public int getRenderType() { return -1; }
	public boolean isOpaqueCube() { return false; }
	public boolean renderAsNormalBlock() { return false; }

	@Override
	public TileEntity createNewTileEntity(World world, int i)
	{
		return new TileEntityAltarAir();
	}
}