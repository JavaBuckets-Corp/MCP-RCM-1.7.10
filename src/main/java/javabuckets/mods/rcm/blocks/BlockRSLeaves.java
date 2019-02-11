package javabuckets.mods.rcm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRSLeaves extends BlockBase
{
	public BlockRSLeaves() 
	{
		super(Material.leaves);
		this.setHardness(0.2F);
        this.setLightOpacity(1);
        this.setStepSound(soundTypeGrass);
	}
	
	public boolean isOpaqueCube() 
	{
		return false;
	}
	
	public boolean renderAsNormalBlock() 
	{
		return false;
	}
}
