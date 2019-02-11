package javabuckets.mods.rcm.blocks;

import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockBase extends Block
{
	public BlockBase(Material material)
	{
		super(material);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegistry) 
	{
		blockIcon = iconRegistry.registerIcon(Reference.MOD_ID + ":" + this.getTextureName());
	}
}