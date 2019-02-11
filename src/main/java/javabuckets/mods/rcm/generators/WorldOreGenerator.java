package javabuckets.mods.rcm.generators;

import java.util.Calendar;
import java.util.Random;

import javabuckets.mods.rcm.skills.mining.ModMiningBlocks;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenDeadBush;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldOreGenerator implements IWorldGenerator 
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId)
		{
			case 0:
				generateOverworld(world, random, chunkX * 16, chunkZ * 16);
				break;
			case -1:
				generateNether(world, random, chunkX * 16, chunkZ * 16);
				break;
		}
	}

	public void generateOverworld(World world, Random random, int chunkX, int chunkZ)
	{
		generateOre(world, random, chunkX, chunkZ, 17, 16, 16, 85, ModMiningBlocks.copperOre, 8);
		generateOre(world, random, chunkX, chunkZ, 17, 16, 16, 85, ModMiningBlocks.tinOre, 8);
		generateOre(world, random, chunkX, chunkZ, 10, 16, 16, 64, ModMiningBlocks.silverOre, 6);
		generateOre(world, random, chunkX, chunkZ, 13, 16, 16, 40, ModMiningBlocks.mithrilOre, 4);
		generateOre(world, random, chunkX, chunkZ, 13, 16, 16, 28, ModMiningBlocks.adamantiteOre, 3);
		generateOre(world, random, chunkX, chunkZ, 11, 16, 16, 14, ModMiningBlocks.runiteOre, 3);
	}
	
	public void generateNether(World world, Random random, int chunkX, int chunkZ)
	{
		Random randomGenerator = random;
		
	}
	
	public void generateOre(World world, Random random, int chunkX, int chunkZ, int forLoopTry, int chunksizeX, int chunksizeZ, int YstartPos, Block block, int veinSize)
	{
		Random randomGenerator = random;
		
		for (int i = 0; i < forLoopTry; i++)
		{
			int randPosX = chunkX + randomGenerator.nextInt(chunksizeX);
			int randPosY = random.nextInt(YstartPos);
			int randPosZ = chunkZ + randomGenerator.nextInt(chunksizeZ);
			(new WorldGenMinable(block, veinSize)).generate(world, random, randPosX, randPosY, randPosZ);
		}
	}
}