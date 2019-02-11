package javabuckets.mods.rcm.blocks;

import javabuckets.mods.rcm.blocks.tileentities.TileEntityRSAnvil;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockRSAnvil extends BlockContainer 
{
	public BlockRSAnvil() 
	{
		super(Material.iron);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int i) 
	{
		return new TileEntityRSAnvil();
	}
}