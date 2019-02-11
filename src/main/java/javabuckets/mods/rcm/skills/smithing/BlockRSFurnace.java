package javabuckets.mods.rcm.skills.smithing;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import javabuckets.mods.rcm.blocks.tileentities.TileEntityRSFurnace;
import javabuckets.mods.rcm.init.ModFixBlocks;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.GuiHandlerReference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockRSFurnace extends BlockContainer
{
	public BlockRSFurnace()
	{
		super(Material.rock);
		this.setHardness(5F);
		this.setResistance(1000F);
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	{
		if (!world.isRemote)
		{
			FMLNetworkHandler.openGui(player, RCM.instance, GuiHandlerReference.furnaceGuiID, world, x, y, z);
		}
		return true;
	}

	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		return new TileEntityRSFurnace();
	}
	
	public int getRenderType() 
	{ 
		return -1; 
	}

	public boolean isOpaqueCube()
	{ 
		return false;
	}

	public boolean renderAsNormalBlock()
	{ 
		return false;
	}
	
	/**
	 * Called whenever the block is added into the world. Args: world, x, y, z
	 */
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
	{
		super.onBlockAdded(par1World, par2, par3, par4);
		this.func_149930_e(par1World, par2, par3, par4);
	}
	
	private void func_149930_e(World p_149930_1_, int p_149930_2_, int p_149930_3_, int p_149930_4_)
   {
       if (!p_149930_1_.isRemote)
       {
           Block block = p_149930_1_.getBlock(p_149930_2_, p_149930_3_, p_149930_4_ - 1);
           Block block1 = p_149930_1_.getBlock(p_149930_2_, p_149930_3_, p_149930_4_ + 1);
           Block block2 = p_149930_1_.getBlock(p_149930_2_ - 1, p_149930_3_, p_149930_4_);
           Block block3 = p_149930_1_.getBlock(p_149930_2_ + 1, p_149930_3_, p_149930_4_);
           byte b0 = 3;

           if (block.func_149730_j() && !block1.func_149730_j())
           {
               b0 = 3;
           }

           if (block1.func_149730_j() && !block.func_149730_j())
           {
               b0 = 2;
           }

           if (block2.func_149730_j() && !block3.func_149730_j())
           {
               b0 = 5;
           }

           if (block3.func_149730_j() && !block2.func_149730_j())
           {
               b0 = 4;
           }

           p_149930_1_.setBlockMetadataWithNotify(p_149930_2_, p_149930_3_, p_149930_4_, b0, 2);
       }
   }
	
	/**
	 * Called when the block is placed in the world.
	 */
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	{
		int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

		if (l == 0)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
			par1World.setBlock(par2, par3+1, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3+1, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3+1, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3+1, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3+1, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3+1, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3, par4+2, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3+1, par4+2, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3, par4+2, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3+1, par4+2, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3+1, par4+2, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3, par4+2, ModFixBlocks.unbreakable);
		}

		if (l == 1)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
			par1World.setBlock(par2, par3+1, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3+1, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3+1, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3+1, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3+1, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3+1, par4-1, ModFixBlocks.unbreakable);	
			par1World.setBlock(par2-2, par3+1, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-2, par3+1, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-2, par3, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-2, par3, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-2, par3, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-2, par3+1, par4-1, ModFixBlocks.unbreakable);
		}

		if (l == 2)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
			par1World.setBlock(par2, par3+1, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3+1, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3+1, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3+1, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3+1, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3+1, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3, par4-2, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3+1, par4-2, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3, par4-2, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3+1, par4-2, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3, par4-2, ModFixBlocks.unbreakable);
			par1World.setBlock(par2-1, par3+1, par4-2, ModFixBlocks.unbreakable);
		}

		if (l == 3)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
			par1World.setBlock(par2, par3, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3+1, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3+1, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2, par3+1, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3+1, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3+1, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+1, par3+1, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+2, par3, par4, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+2, par3, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+2, par3, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+2, par3+1, par4+1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+2, par3+1, par4-1, ModFixBlocks.unbreakable);
			par1World.setBlock(par2+2, par3+1, par4, ModFixBlocks.unbreakable);
		}
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5) 
	{
		int l = MathHelper.floor_double((double)(Minecraft.getMinecraft().thePlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		
		if (l == 0)
		{
			par1World.setBlock(par2, par3+1, par4, Blocks.air);
			par1World.setBlock(par2+1, par3, par4, Blocks.air);
			par1World.setBlock(par2+1, par3+1, par4, Blocks.air);
			par1World.setBlock(par2-1, par3, par4, Blocks.air);
			par1World.setBlock(par2-1, par3+1, par4, Blocks.air);
			par1World.setBlock(par2+1, par3, par4+1, Blocks.air);
			par1World.setBlock(par2+1, par3+1, par4+1, Blocks.air);
			par1World.setBlock(par2-1, par3, par4+1, Blocks.air);
			par1World.setBlock(par2-1, par3+1, par4+1, Blocks.air);
			par1World.setBlock(par2, par3+1, par4+1, Blocks.air);
			par1World.setBlock(par2, par3, par4+1, Blocks.air);
			par1World.setBlock(par2+1, par3, par4+2, Blocks.air);
			par1World.setBlock(par2+1, par3+1, par4+2, Blocks.air);
			par1World.setBlock(par2-1, par3, par4+2, Blocks.air);
			par1World.setBlock(par2-1, par3+1, par4+2, Blocks.air);
			par1World.setBlock(par2, par3+1, par4+2, Blocks.air);
			par1World.setBlock(par2, par3, par4+2, Blocks.air);
		}

		if (l == 1)
		{
			par1World.setBlock(par2, par3+1, par4, Blocks.air);
			par1World.setBlock(par2, par3+1, par4+1, Blocks.air);
			par1World.setBlock(par2, par3, par4+1, Blocks.air);
			par1World.setBlock(par2, par3+1, par4-1, Blocks.air);
			par1World.setBlock(par2, par3, par4-1, Blocks.air);
			par1World.setBlock(par2-1, par3+1, par4, Blocks.air);
			par1World.setBlock(par2-1, par3+1, par4+1, Blocks.air);
			par1World.setBlock(par2-1, par3, par4+1, Blocks.air);
			par1World.setBlock(par2-1, par3, par4, Blocks.air);
			par1World.setBlock(par2-1, par3, par4-1, Blocks.air);
			par1World.setBlock(par2-1, par3+1, par4-1, Blocks.air);	
			par1World.setBlock(par2-2, par3+1, par4, Blocks.air);
			par1World.setBlock(par2-2, par3+1, par4+1, Blocks.air);
			par1World.setBlock(par2-2, par3, par4+1, Blocks.air);
			par1World.setBlock(par2-2, par3, par4, Blocks.air);
			par1World.setBlock(par2-2, par3, par4-1, Blocks.air);
			par1World.setBlock(par2-2, par3+1, par4-1, Blocks.air);
		}

		if (l == 2)
		{
			par1World.setBlock(par2, par3+1, par4, Blocks.air);
			par1World.setBlock(par2+1, par3, par4, Blocks.air);
			par1World.setBlock(par2+1, par3+1, par4, Blocks.air);
			par1World.setBlock(par2-1, par3, par4, Blocks.air);
			par1World.setBlock(par2-1, par3+1, par4, Blocks.air);
			par1World.setBlock(par2, par3, par4-1, Blocks.air);
			par1World.setBlock(par2, par3+1, par4-1, Blocks.air);
			par1World.setBlock(par2+1, par3, par4-1, Blocks.air);
			par1World.setBlock(par2+1, par3+1, par4-1, Blocks.air);
			par1World.setBlock(par2-1, par3, par4-1, Blocks.air);
			par1World.setBlock(par2-1, par3+1, par4-1, Blocks.air);
			par1World.setBlock(par2, par3, par4-2, Blocks.air);
			par1World.setBlock(par2, par3+1, par4-2, Blocks.air);
			par1World.setBlock(par2+1, par3, par4-2, Blocks.air);
			par1World.setBlock(par2+1, par3+1, par4-2, Blocks.air);
			par1World.setBlock(par2-1, par3, par4-2, Blocks.air);
			par1World.setBlock(par2-1, par3+1, par4-2, Blocks.air);
		}

		if (l == 3)
		{
			par1World.setBlock(par2, par3, par4+1, Blocks.air);
			par1World.setBlock(par2, par3, par4-1, Blocks.air);
			par1World.setBlock(par2, par3+1, par4+1, Blocks.air);
			par1World.setBlock(par2, par3+1, par4-1, Blocks.air);
			par1World.setBlock(par2, par3+1, par4, Blocks.air);
			par1World.setBlock(par2+1, par3, par4, Blocks.air);
			par1World.setBlock(par2+1, par3, par4+1, Blocks.air);
			par1World.setBlock(par2+1, par3, par4-1, Blocks.air);
			par1World.setBlock(par2+1, par3+1, par4+1, Blocks.air);
			par1World.setBlock(par2+1, par3+1, par4-1, Blocks.air);
			par1World.setBlock(par2+1, par3+1, par4, Blocks.air);
			par1World.setBlock(par2+2, par3, par4, Blocks.air);
			par1World.setBlock(par2+2, par3, par4+1, Blocks.air);
			par1World.setBlock(par2+2, par3, par4-1, Blocks.air);
			par1World.setBlock(par2+2, par3+1, par4+1, Blocks.air);
			par1World.setBlock(par2+2, par3+1, par4-1, Blocks.air);
			par1World.setBlock(par2+2, par3+1, par4, Blocks.air);
		}
		
		super.onBlockDestroyedByPlayer(par1World, par2, par3, par4, par5);
	}
}