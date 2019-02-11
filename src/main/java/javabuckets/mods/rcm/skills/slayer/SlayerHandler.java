package javabuckets.mods.rcm.skills.slayer;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class SlayerHandler extends BaseSkill
{
	public boolean isCombatingAssignedSlayerMonster = false;
	private int combatingResetTimer = 10;
	
	public void slayer(EntityPlayer player, World world)
	{
		
		setLvlFromXPList();
		combatingChecker(player);
	}
	
	public void combatingChecker(EntityPlayer player)
	{
		if (isCombatingAssignedSlayerMonster)
		{
			--combatingResetTimer;
			
			if (combatingResetTimer <= 0)
			{
				LogHelper.info("isPlayerAssignedWithSlayerTask: " + isPlayerAssignedWithSlayerTask);
				LogHelper.info("isPlayerAssignedWithSlayerBossTask: " + isPlayerAssignedWithSlayerBossTask);
				
				isCombatingAssignedSlayerMonster = false;
				combatingResetTimer = 10;
				
				if (getSlayerTaskKillsRemaining() <= 0 && isPlayerAssignedWithSlayerTask)
				{
					player.addChatMessage(new ChatComponentText("Your slayer task is complete. Return to a slayer master and get a new task."));
					slayerTasksInARow += 1;
					slayerTasksCompleted += 1;
					resetSlayerTask();
				}
				
				if (getBossTaskKillsRemaining() <= 0 && isPlayerAssignedWithSlayerBossTask)
				{
					player.addChatMessage(new ChatComponentText("Your boss task is complete. Return to a slayer master and get a new boss task."));
					bossTasksInARow += 1;
					bossTasksCompleted += 1;
					resetBossTask();
				}
			}	
		}
	}
	
	public void setLvlFromXPList()
	{
		if (isCombatingAssignedSlayerMonster)
		{	
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}

			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.slay) == RCM.instance.skillHandler.getLevel(SkillReference.slay)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.slay, RCM.instance.skillHandler.getLevel(SkillReference.slay));
				LevelUpUtil.lvlHandling();
			}
		}
	} 
	
	public void setLvlFromXP(double xpMin, double xpMax, int level) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.slay) > xpMin && RCM.instance.skillHandler.getExperience(SkillReference.slay) < xpMax)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.slay, level, RCM.instance.skillHandler.getExperience(SkillReference.slay));
		}
	}

	public void setbackLvlIfTooHigh(int level) 
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.slay) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.slay, level, RCM.instance.skillHandler.getExperience(SkillReference.slay));
		}
	}

	public void setbackXPIfTooHigh(double xp) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.slay) > xp)
		{
			RCM.instance.skillHandler.setExperience(SkillReference.slay, xp);
		}
	}
	
	private boolean isPlayerAssignedWithSlayerTask = false;
	private String assignedSlayerTask = "null";
	private int assignedSlayerTaskAmount = 0;
	private int slayerTasksInARow = 0;
	private int slayerTasksCompleted = 0;
	private int slayerKillsTotal = 0;
	
	private boolean isPlayerAssignedWithSlayerBossTask = false;
	private String assignedBossTask = "null";
	private int assignedBossTaskAmount = 0;
	private int bossTasksInARow = 0;
	private int bossTasksCompleted = 0;
	private int bossKillsTotal = 0;
	
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		par1NBTTagCompound.setBoolean("hasPlayerSlayerTaskAssigned", isPlayerAssignedWithSlayerTask);
		par1NBTTagCompound.setString("slayerTask", assignedSlayerTask);
		par1NBTTagCompound.setInteger("slayerTaskKillsLeft", assignedSlayerTaskAmount);
		
		par1NBTTagCompound.setInteger("slayerTasksCompletedInARow", slayerTasksInARow);
		par1NBTTagCompound.setInteger("slayerTasksCompleted", slayerTasksCompleted);
		par1NBTTagCompound.setInteger("slayerKills", slayerKillsTotal);
		
		par1NBTTagCompound.setBoolean("hasPlayerBossTaskAssigned", isPlayerAssignedWithSlayerBossTask);
		par1NBTTagCompound.setString("bossTask", assignedBossTask);
		par1NBTTagCompound.setInteger("bossTaskKillsLeft", assignedBossTaskAmount);
		
		par1NBTTagCompound.setInteger("bossTasksCompletedInARow", bossTasksInARow);
		par1NBTTagCompound.setInteger("bossTasksCompleted", bossTasksCompleted);
		par1NBTTagCompound.setInteger("bossKills", bossKillsTotal);
	}
	
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		isPlayerAssignedWithSlayerTask = par1NBTTagCompound.getBoolean("hasPlayerSlayerTaskAssigned");
		assignedSlayerTask = par1NBTTagCompound.getString("slayerTask");
		assignedSlayerTaskAmount = par1NBTTagCompound.getInteger("slayerTaskKillsLeft");
		
		slayerTasksInARow = par1NBTTagCompound.getInteger("slayerTasksCompletedInARow");
		slayerTasksCompleted = par1NBTTagCompound.getInteger("slayerTasksCompleted");
		slayerKillsTotal = par1NBTTagCompound.getInteger("slayerKills");
		
		isPlayerAssignedWithSlayerBossTask = par1NBTTagCompound.getBoolean("hasPlayerBossTaskAssigned");
		assignedBossTask = par1NBTTagCompound.getString("bossTask");
		assignedBossTaskAmount = par1NBTTagCompound.getInteger("bossTaskKillsLeft");
		
		bossTasksInARow = par1NBTTagCompound.getInteger("bossTasksCompletedInARow");
		bossTasksCompleted = par1NBTTagCompound.getInteger("bossTasksCompleted");
		bossKillsTotal = par1NBTTagCompound.getInteger("bossKills");
	}
	
	public boolean isPlayerAssignedWithSlayerTask()
	{
		return isPlayerAssignedWithSlayerTask;
	}
	
	public void setSlayerTask(String monsterName, int kills)
	{
		assignedSlayerTask = monsterName;
		assignedSlayerTaskAmount = kills;
		isPlayerAssignedWithSlayerTask = true;
	}
	
	public String getSlayerTask()
	{
		return assignedSlayerTask;
	}
	
	public void setSlayerTaskKillsRemaining(int kills)
	{
		assignedSlayerTaskAmount = kills;
	}
	
	public int getSlayerTaskKillsRemaining()
	{
		return assignedSlayerTaskAmount;
	}
	
	public int getSlayerTasksCompleted() 
	{
		return slayerTasksCompleted;
	}
	
	public int getSlayerTasksInARow() 
	{
		return slayerTasksInARow;
	}
	
	public void setSlayerKills(int kills) 
	{
		this.slayerKillsTotal = kills;
	}
	
	public int getSlayerKillsTotal() 
	{
		return slayerKillsTotal;
	}
	
	public void resetSlayerTask()
	{
		assignedSlayerTask = "null";
		assignedSlayerTaskAmount = 0;
		isPlayerAssignedWithSlayerTask = false;
	}
	
	/*public void assignOtherSlayerTask()
	{
		slayerTasksInARow = 0;
		setSlayerTask("Pig", 15);
	}*/
	
	public boolean isPlayerAssignedWithSlayerBossTask()
	{
		return isPlayerAssignedWithSlayerBossTask;
	}
	
	public void setBossTask(String bossName, int kills)
	{
		assignedBossTask = bossName;
		assignedBossTaskAmount = kills;
		isPlayerAssignedWithSlayerBossTask = true;
	}
	
	public String getBossTask()
	{
		return assignedBossTask;
	}
	
	public void setBossTaskKillsRemaining(int kills)
	{
		assignedBossTaskAmount = kills;
	}
	
	public int getBossTaskKillsRemaining()
	{
		return assignedBossTaskAmount;
	}
	
	public int getBossTasksCompleted() 
	{
		return bossTasksCompleted;
	}
	
	public int getBossTasksInARow() 
	{
		return bossTasksInARow;
	}
	
	public void setBossKills(int kills) 
	{
		this.bossKillsTotal = kills;
	}
	
	public int getBossKillsTotal() 
	{
		return bossKillsTotal;
	}
	
	public void resetBossTask()
	{
		assignedBossTask = "null";
		assignedBossTaskAmount = 0;
		isPlayerAssignedWithSlayerBossTask = false;
	}
}