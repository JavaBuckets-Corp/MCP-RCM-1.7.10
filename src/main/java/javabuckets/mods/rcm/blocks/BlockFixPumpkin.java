package javabuckets.mods.rcm.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockFixPumpkin extends BlockDirectional
{
    @SideOnly(Side.CLIENT)
    private IIcon top;
    @SideOnly(Side.CLIENT)
    private IIcon front;
	
	public BlockFixPumpkin() 
	{
		super(Material.gourd);
		this.setHardness(1.0F);
		this.setStepSound(Block.soundTypeWood);
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
	
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return side == 1 ? this.top : (side == 0 ? this.top : (meta == 2 && side == 2 ? this.front : (meta == 3 && side == 5 ? this.front : (meta == 0 && side == 3 ? this.front : (meta == 1 && side == 4 ? this.front : this.blockIcon)))));
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegistry)
    {
        this.front = iconRegistry.registerIcon(Reference.MOD_ID + ":" + getTextureName() + "_front");
        this.top = iconRegistry.registerIcon(Reference.MOD_ID + ":" + getTextureName() + "_top");
        this.blockIcon = iconRegistry.registerIcon(Reference.MOD_ID + ":" + getTextureName() + "_side");
    }
}