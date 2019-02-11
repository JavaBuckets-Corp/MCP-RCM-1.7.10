package javabuckets.mods.rcm.generators;

import java.util.ArrayList;
import java.util.Random;

import javabuckets.mods.rcm.skills.woodcutting.ModWoodcuttingBlocks;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.UtilAPI;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.util.ForgeDirection;

public class WorldGenMahoganyTree extends WorldGenAbstractTree
{
	private int treeHeight = 8;

	public WorldGenMahoganyTree() 
	{
		super(false);
	}

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z)
	{
		Block base = world.getBlock(x, y, z);

		if (!isBaseSuitable(base))
		{
			return false;
		}
		else
		{
			if (isSurroundingSpaceSuitable(world, x, y, z))
			{
				generateTreeBase(world, x, y, z);
				generateTreeLeaves(world, x, y, z);
				return true;
			}
			else 
			{
				return false;
			}
		}
	}

	public void generateTreeBase(World world, int x, int y, int z)
	{
		for (int i = 0; i < treeHeight; i++)
		{
			buildLogAt(world, x, y + i +1, z);
		}
	}

	public void generateTreeLeaves(World world, int x, int y, int z)
	{
		buildLeavesAt(world, x, y, z);
		buildLeavesAt(world, x, y+1, z);

		buildLeavesAt(world, x+1, y, z);
		buildLeavesAt(world, x-1, y, z);
		buildLeavesAt(world, x, y, z+1);
		buildLeavesAt(world, x, y, z-1);

		buildLeavesAt(world, x+1, y-1, z);
		buildLeavesAt(world, x-1, y-1, z);
		buildLeavesAt(world, x, y-1, z+1);
		buildLeavesAt(world, x, y-1, z-1);
		buildLeavesAt(world, x+1, y-1, z+1);
		buildLeavesAt(world, x-1, y-1, z+1);
		buildLeavesAt(world, x-1, y-1, z-1);
		buildLeavesAt(world, x+1, y-1, z-1);

		buildLeavesAt(world, x+1, y-2, z);
		buildLeavesAt(world, x-1, y-2, z);
		buildLeavesAt(world, x, y-2, z+1);
		buildLeavesAt(world, x, y-2, z-1);
		buildLeavesAt(world, x+1, y-2, z+1);
		buildLeavesAt(world, x-1, y-2, z+1);
		buildLeavesAt(world, x-1, y-2, z-1);
		buildLeavesAt(world, x+1, y-2, z-1);
		buildLeavesAt(world, x+2, y-2, z-1);
		buildLeavesAt(world, x+2, y-2, z);
		buildLeavesAt(world, x+2, y-2, z+1);
		buildLeavesAt(world, x-2, y-2, z-1);
		buildLeavesAt(world, x-2, y-2, z);
		buildLeavesAt(world, x-2, y-2, z+1);
		buildLeavesAt(world, x-1, y-2, z+2);
		buildLeavesAt(world, x, y-2, z+2);
		buildLeavesAt(world, x+1, y-2, z+2);
		buildLeavesAt(world, x-1, y-2, z-2);
		buildLeavesAt(world, x, y-2, z-2);
		buildLeavesAt(world, x+1, y-2, z-2);

		buildLeavesAt(world, x+1, y-3, z);
		buildLeavesAt(world, x-1, y-3, z);
		buildLeavesAt(world, x, y-3, z+1);
		buildLeavesAt(world, x, y-3, z-1);
	}

	public boolean isSurroundingSpaceSuitable(World world, int x, int y, int z)
	{
		if (getBlockAt(world, x, y + 1, z) == Blocks.air && getBlockAt(world, x, y + 2, z) == Blocks.air && getBlockAt(world, x, y + 3, z) == Blocks.air && getBlockAt(world, x, y + 4, z) == Blocks.air && getBlockAt(world, x, y + 5, z) == Blocks.air && getBlockAt(world, x, y + 6, z) == Blocks.air && getBlockAt(world, x, y + 7, z) == Blocks.air && getBlockAt(world, x, y + 8, z) == Blocks.air)
		{
			if (getBlockAt(world, x + 2, y + 1, z) == Blocks.air && getBlockAt(world, x + 2, y + 2, z) == Blocks.air && getBlockAt(world, x + 2, y + 3, z) == Blocks.air && getBlockAt(world, x + 2, y + 4, z) == Blocks.air && getBlockAt(world, x + 2, y + 5, z) == Blocks.air && getBlockAt(world, x + 2, y + 6, z) == Blocks.air && getBlockAt(world, x + 2, y + 7, z) == Blocks.air && getBlockAt(world, x + 2, y + 8, z) == Blocks.air)
			{
				if (getBlockAt(world, x - 2, y + 1, z) == Blocks.air && getBlockAt(world, x - 2, y + 2, z) == Blocks.air && getBlockAt(world, x - 2, y + 3, z) == Blocks.air && getBlockAt(world, x - 2, y + 4, z) == Blocks.air && getBlockAt(world, x - 2, y + 5, z) == Blocks.air && getBlockAt(world, x - 2, y + 6, z) == Blocks.air && getBlockAt(world, x - 2, y + 7, z) == Blocks.air && getBlockAt(world, x - 2, y + 8, z) == Blocks.air)
				{
					if (getBlockAt(world, x, y + 1, z + 2) == Blocks.air && getBlockAt(world, x, y + 2, z + 2) == Blocks.air && getBlockAt(world, x, y + 3, z + 2) == Blocks.air && getBlockAt(world, x, y + 4, z + 2) == Blocks.air && getBlockAt(world, x, y + 5, z + 2) == Blocks.air && getBlockAt(world, x, y + 6, z + 2) == Blocks.air && getBlockAt(world, x, y + 7, z + 2) == Blocks.air && getBlockAt(world, x, y + 8, z + 2) == Blocks.air)
					{
						if (getBlockAt(world, x, y + 1, z - 2) == Blocks.air && getBlockAt(world, x, y + 2, z - 2) == Blocks.air && getBlockAt(world, x, y + 3, z - 2) == Blocks.air && getBlockAt(world, x, y + 4, z - 2) == Blocks.air && getBlockAt(world, x, y + 5, z - 2) == Blocks.air && getBlockAt(world, x, y + 6, z - 2) == Blocks.air && getBlockAt(world, x, y + 7, z - 2) == Blocks.air && getBlockAt(world, x, y + 8, z - 2) == Blocks.air)
						{
							return true;
						}
						else return false;
					}
					else return false;
				}
				else return false;
			}
			else return false;
		}
		else return false;
	}

	public boolean isBaseSuitable(Block block)
	{
		if (block == Blocks.grass || block == Blocks.dirt)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Block getBlockAt(World world, int x, int y, int z)
	{
		return world.getBlock(x, y, z);
	}

	public void buildLogAt(World world, int x, int y, int z)
	{
		world.setBlock(x, y, z, ModWoodcuttingBlocks.mahoganyLog);
	}

	public void buildLeavesAt(World world, int x, int y, int z)
	{
		world.setBlock(x, y + treeHeight, z, ModWoodcuttingBlocks.mahoganyLeaves);
	}
}