package javabuckets.mods.rcm.blocks;

import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFixLog extends BlockRotatedPillar
{
	@SideOnly(Side.CLIENT)
	private IIcon topAndBottom;
	@SideOnly(Side.CLIENT)
	private IIcon sides;
	
	public BlockFixLog() 
	{
		super(Material.wood);
		this.setHardness(2F);
		this.setStepSound(soundTypeWood);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegistry) 
	{
		blockIcon = iconRegistry.registerIcon(Reference.MOD_ID + ":" + getTextureName() + "_top_and_bottom");
		sides = iconRegistry.registerIcon(Reference.MOD_ID + ":" + getTextureName() + "_sides");
		topAndBottom = iconRegistry.registerIcon(Reference.MOD_ID + ":" + getTextureName() + "_top_and_bottom");
	}

	@Override
	protected IIcon getSideIcon(int side) 
	{
		return sides;
	}
	
	@Override
	protected IIcon getTopIcon(int top)
	{
		return topAndBottom;
	}
}