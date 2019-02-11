package javabuckets.mods.rcm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockUnbreakable extends BlockBase
{
	public BlockUnbreakable() 
	{
		super(Material.ground);
		this.setBlockUnbreakable();
	}
	
	public int getRenderBlockPass() { return 0; }
    public boolean isOpaqueCube() { return false; }
    public boolean renderAsNormalBlock() { return false; }
}