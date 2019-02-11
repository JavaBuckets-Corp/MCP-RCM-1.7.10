package javabuckets.mods.rcm.blocks;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRSWood extends BlockRotatedPillar
{
	@SideOnly(Side.CLIENT)
	private IIcon topAndBottom;
	@SideOnly(Side.CLIENT)
	private IIcon sides;
	
	public BlockRSWood() 
	{
		super(Material.wood);
		this.setStepSound(soundTypeWood);
		this.setCreativeTab(ModCreativeTabs.rcmWoodcutting);
	}
	
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random) 
    {
    	if (this.getTextureName() == "magic_log")
    	{
        	world.spawnParticle("fireworksSpark", x, y + 1, z, 0, 0, 0);
        	world.spawnParticle("fireworksSpark", x+0.5, y + 1, z, 0, 0, 0);
        	world.spawnParticle("fireworksSpark", x + 1, y + 1, z, 0, 0, 0);
        	world.spawnParticle("fireworksSpark", x + 1, y + 1, z + 0.5, 0, 0, 0);
        	world.spawnParticle("fireworksSpark", x, y + 1, z + 1, 0, 0, 0);
        	world.spawnParticle("fireworksSpark", x+0.5, y + 1, z + 1, 0, 0, 0);
        	world.spawnParticle("fireworksSpark", x + 1, y + 1, z + 1, 0, 0, 0);
        	world.spawnParticle("fireworksSpark", x, y + 1, z + 0.5, 0, 0, 0);
    	}
    }

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister) 
	{
		blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + getTextureName() + "_top_and_bottom");
		sides = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + getTextureName() + "_sides");
		topAndBottom = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + getTextureName() + "_top_and_bottom");
	}

	@Override
	protected IIcon getSideIcon(int p_150163_1_) 
	{
		return sides;
	}
	
	@Override
	protected IIcon getTopIcon(int p_150161_1_)
	{
		return topAndBottom;
	}
}