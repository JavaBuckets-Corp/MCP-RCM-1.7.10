package javabuckets.mods.rcm.generators;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldTreeGenerator implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId)
		{
			case 0:
				generateOverworld(world, random, chunkX * 16, chunkZ * 16);
				break;
			case -1:
				
				break;
		}
	}

	public void generateOverworld(World world, Random random, int chunkX, int chunkZ) 
	{
		generateTree(world, random, chunkX, chunkZ, "WillowTree");
		generateTree(world, random, chunkX, chunkZ, "TeakTree");
		generateTree(world, random, chunkX, chunkZ, "MapleTree");
		generateTree(world, random, chunkX, chunkZ, "MahoganyTree");
		generateTree(world, random, chunkX, chunkZ, "YewTree");
		generateTree(world, random, chunkX, chunkZ, "MagicTree");
		generateTree(world, random, chunkX, chunkZ, "ElderTree");
	}
	
	public void generateTree(World world, Random random, int chunkX, int chunkZ, String treeName)
	{
		if (treeName.equals("WillowTree"))
		{
			for (int i = 0; i < 82; i++)
			{
				int randPosX = chunkX + random.nextInt(16);
				int randPosY = random.nextInt(256);
				int randPosZ = chunkZ + random.nextInt(16);
				new WorldGenWillowTree().generate(world, random, randPosX, randPosY, randPosZ);
			}
		}
		
		if (treeName.equals("TeakTree"))
		{
			for (int i = 0; i < 45; i++)
			{
				int randPosX = chunkX + random.nextInt(16);
				int randPosY = random.nextInt(256);
				int randPosZ = chunkZ + random.nextInt(16);
				new WorldGenTeakTree().generate(world, random, randPosX, randPosY, randPosZ);
			}
		}
		
		if (treeName.equals("MapleTree"))
		{
			for (int i = 0; i < 65; i++)
			{
				int randPosX = chunkX + random.nextInt(16);
				int randPosY = random.nextInt(256);
				int randPosZ = chunkZ + random.nextInt(16);
				new WorldGenMapleTree().generate(world, random, randPosX, randPosY, randPosZ);
			}
		}
		
		if (treeName.equals("MahoganyTree"))
		{
			for (int i = 0; i < 43; i++)
			{
				int randPosX = chunkX + random.nextInt(16);
				int randPosY = random.nextInt(256);
				int randPosZ = chunkZ + random.nextInt(16);
				new WorldGenMahoganyTree().generate(world, random, randPosX, randPosY, randPosZ);
			}
		}
		
		if (treeName.equals("YewTree"))
		{
			for (int i = 0; i < 50; i++)
			{
				int randPosX = chunkX + random.nextInt(16);
				int randPosY = random.nextInt(256);
				int randPosZ = chunkZ + random.nextInt(16);
				new WorldGenYewTree().generate(world, random, randPosX, randPosY, randPosZ);
			}
		}
		
		if (treeName.equals("MagicTree"))
		{
			for (int i = 0; i < 25; i++)
			{
				int randPosX = chunkX + random.nextInt(16);
				int randPosY = random.nextInt(256);
				int randPosZ = chunkZ + random.nextInt(16);
				new WorldGenMagicTree().generate(world, random, randPosX, randPosY, randPosZ);
			}
		}
		
		if (treeName.equals("ElderTree"))
		{
			for (int i = 0; i < 18; i++)
			{
				int randPosX = chunkX + random.nextInt(16);
				int randPosY = random.nextInt(256);
				int randPosZ = chunkZ + random.nextInt(16);
				new WorldGenElderTree().generate(world, random, randPosX, randPosY, randPosZ);
			}
		}
	}
}
