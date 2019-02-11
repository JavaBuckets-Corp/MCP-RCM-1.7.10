package javabuckets.mods.rcm.blocks;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.farming.ModFarmingBlocks;
import javabuckets.mods.rcm.skills.farming.ModFarmingItems;
import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockHerb extends BlockBush implements IGrowable
{
    @SideOnly(Side.CLIENT)
    private IIcon[] icon;

    private Item herbSeed;

	private Item herbToDrop;
    
    public BlockHerb(Item correspondingHerbSeed)
    {
        this.setTickRandomly(true);
        float f = 0.5F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        this.setCreativeTab((CreativeTabs)null);
        this.setHardness(0.0F);
        this.setStepSound(soundTypeGrass);
        this.disableStats();
        this.herbSeed = correspondingHerbSeed;
    }

    /**
     * is the block grass, dirt or farmland
     */
    protected boolean canPlaceBlockOn(Block block)
    {
        return block == Blocks.farmland;
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        super.updateTick(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_, p_149674_5_);

        if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) >= 9)
        {
            int l = p_149674_1_.getBlockMetadata(p_149674_2_, p_149674_3_, p_149674_4_);

            if (l < 4)
            {
                float f = this.func_149864_n(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_);

                if (p_149674_5_.nextInt((int)(25.0F / f) + 1) == 0)
                {
                    ++l;
                    p_149674_1_.setBlockMetadataWithNotify(p_149674_2_, p_149674_3_, p_149674_4_, l, 2);
                }
            }
        }
    }

    public void func_149863_m(World p_149863_1_, int p_149863_2_, int p_149863_3_, int p_149863_4_)
    {
        int l = p_149863_1_.getBlockMetadata(p_149863_2_, p_149863_3_, p_149863_4_) + MathHelper.getRandomIntegerInRange(p_149863_1_.rand, 2, 5);

        if (l > 4)
        {
            l = 4;
        }

        p_149863_1_.setBlockMetadataWithNotify(p_149863_2_, p_149863_3_, p_149863_4_, l, 2);
    }

    private float func_149864_n(World p_149864_1_, int p_149864_2_, int p_149864_3_, int p_149864_4_)
    {
        float f = 1.0F;
        Block block = p_149864_1_.getBlock(p_149864_2_, p_149864_3_, p_149864_4_ - 1);
        Block block1 = p_149864_1_.getBlock(p_149864_2_, p_149864_3_, p_149864_4_ + 1);
        Block block2 = p_149864_1_.getBlock(p_149864_2_ - 1, p_149864_3_, p_149864_4_);
        Block block3 = p_149864_1_.getBlock(p_149864_2_ + 1, p_149864_3_, p_149864_4_);
        Block block4 = p_149864_1_.getBlock(p_149864_2_ - 1, p_149864_3_, p_149864_4_ - 1);
        boolean flag = block2 == this || block3 == this;
        boolean flag1 = block == this || block1 == this;
        boolean flag2 = block4 == this;

        for (int l = p_149864_2_ - 1; l <= p_149864_2_ + 1; ++l)
        {
            for (int i1 = p_149864_4_ - 1; i1 <= p_149864_4_ + 1; ++i1)
            {
                float f1 = 0.0F;

                if (p_149864_1_.getBlock(l, p_149864_3_ - 1, i1).canSustainPlant(p_149864_1_, l, p_149864_3_ - 1, i1, ForgeDirection.UP, this))
                {
                    f1 = 1.0F;

                    if (p_149864_1_.getBlock(l, p_149864_3_ - 1, i1).isFertile(p_149864_1_, l, p_149864_3_ - 1, i1))
                    {
                        f1 = 3.0F;
                    }
                }

                if (l != p_149864_2_ || i1 != p_149864_4_)
                {
                    f1 /= 4.0F;
                }

                f += f1;
            }
        }

        if (flag2 || flag && flag1)
        {
            f /= 2.0F;
        }

        return f;
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ < 0 || p_149691_2_ > 4)
        {
            p_149691_2_ = 4;
        }

        return this.icon[p_149691_2_];
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 6;
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
    {
        super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, 0);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
    	if (p_149650_1_ == 4)
    	{
    		if (this == ModFarmingBlocks.guam) return ModFarmingItems.grimy_guam;
    		else if (this == ModFarmingBlocks.marrentill) return ModFarmingItems.grimy_marrentill;
    		else if (this == ModFarmingBlocks.tarromin) return ModFarmingItems.grimy_tarromin;
    		else if (this == ModFarmingBlocks.harralander) return ModFarmingItems.grimy_harralander;
    		else if (this == ModFarmingBlocks.ranarr) return ModFarmingItems.grimy_ranarr;
    		else if (this == ModFarmingBlocks.spiritWeed) return ModFarmingItems.grimy_spiritWeed;
    		else if (this == ModFarmingBlocks.toadflax) return ModFarmingItems.grimy_toadflax;
    		else if (this == ModFarmingBlocks.irit) return ModFarmingItems.grimy_irit;
    		else if (this == ModFarmingBlocks.wergali) return ModFarmingItems.grimy_wergali;
    		else if (this == ModFarmingBlocks.avantoe) return ModFarmingItems.grimy_avantoe;
    		else if (this == ModFarmingBlocks.kwuarm) return ModFarmingItems.grimy_kwuarm;
    		else if (this == ModFarmingBlocks.snapdragon) return ModFarmingItems.grimy_snapdragon;
    		else if (this == ModFarmingBlocks.cadantine) return ModFarmingItems.grimy_cadantine;
    		else if (this == ModFarmingBlocks.lantadyme) return ModFarmingItems.grimy_lantadyme;
    		else if (this == ModFarmingBlocks.dwarfWeed) return ModFarmingItems.grimy_dwarfWeed;
    		else if (this == ModFarmingBlocks.torstol) return ModFarmingItems.grimy_torstol;
    		else if (this == ModFarmingBlocks.fellstalk) return ModFarmingItems.grimy_fellstalk;
    		else return null;
    	}
    	else
    	{
    		return null;
    	}
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random rand)
    {
        return 4 + rand.nextInt(7);
    }

    public boolean func_149851_a(World p_149851_1_, int p_149851_2_, int p_149851_3_, int p_149851_4_, boolean p_149851_5_)
    {
        return p_149851_1_.getBlockMetadata(p_149851_2_, p_149851_3_, p_149851_4_) != 4;
    }

    public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_)
    {
        return true;
    }

    /**
     * Gets an item for the block being called on. Args: world, x, y, z
     */
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return herbSeed;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.icon = new IIcon[8];

        for (int i = 0; i < this.icon.length; ++i)
        {
        	if (this == ModFarmingBlocks.guam || this == ModFarmingBlocks.marrentill || this == ModFarmingBlocks.avantoe || this == ModFarmingBlocks.torstol)
        	{
        		this.icon[i] = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + "herb" + "_stage_" + i);
        	}
        	else if (this == ModFarmingBlocks.cadantine || this == ModFarmingBlocks.kwuarm || this == ModFarmingBlocks.snapdragon)
        	{
        		this.icon[i] = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + "snapdragon" + "_stage_" + i);
        	}
        	else 
        	{
        		this.icon[i] = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + this.getTextureName() + "_stage_" + i);
        	}
        }
    }

    public void func_149853_b(World p_149853_1_, Random p_149853_2_, int p_149853_3_, int p_149853_4_, int p_149853_5_)
    {
        this.func_149863_m(p_149853_1_, p_149853_3_, p_149853_4_, p_149853_5_);
    }
}