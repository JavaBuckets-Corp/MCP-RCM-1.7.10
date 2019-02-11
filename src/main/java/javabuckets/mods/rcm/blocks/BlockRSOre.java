package javabuckets.mods.rcm.blocks;

import java.util.Random;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.skills.mining.ModMiningBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockRSOre extends BlockBase
{
	public BlockRSOre(float hardness)
	{
		super(Material.rock);
		this.setCreativeTab(ModCreativeTabs.rcmMining);
		this.blockHardness = hardness * 2.5F;
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return Item.getItemFromBlock(this);
	}
}