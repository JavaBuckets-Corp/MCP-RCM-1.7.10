package javabuckets.mods.rcm.skills.summoning;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import javabuckets.mods.rcm.blocks.tileentities.TileEntitySummoningObelisk;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockSummoningObelisk extends BlockContainer
{
	public BlockSummoningObelisk() 
	{
		super(Material.rock);
		this.setBlockUnbreakable();
		//this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockBounds(0, 0, 0, 1, 2.2F, 1);
		this.setLightLevel(0.5F);
	}

	public TileEntity createNewTileEntity(World world, int i) 
	{
		return new TileEntitySummoningObelisk();
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
	
	public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return world.getBlock(x, y, z).isReplaceable(world, x, y, z) && World.doesBlockHaveSolidTopSurface(world, x, y - 1, z);
    }
	
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack)
    {
        int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        world.setBlockMetadataWithNotify(x, y, z, l, 2);
    }

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f1, float f2, float f3) 
	{
		if (RCM.instance.summoning.getSummoningPoints() < RCM.instance.skillHandler.getLevel(SkillReference.summ))
		{
			RCM.instance.summoning.rechargeSummoningPoints();
		}
		else
		{
			player.addChatMessage(new ChatComponentText("Can't recharge points as you already have full summoning points."));
		}

		return true;
	}

	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random) 
	{
		world.spawnParticle("fireworksSpark", x+0.5, y +2.4, z+0.5, 0, 0, 0);
		world.spawnParticle("fireworksSpark", x+0.5, y +2.4, z+0.5, 0, 0, 0);
	}
}