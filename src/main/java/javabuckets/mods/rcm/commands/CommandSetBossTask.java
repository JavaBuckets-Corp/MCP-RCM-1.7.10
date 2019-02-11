package javabuckets.mods.rcm.commands;

import java.util.List;

import javabuckets.mods.rcm.main.RCM;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandSetBossTask extends CommandBase
{
	public String getCommandName() 
	{
		return "setbosstask";
	}

	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "/setbosstask <boss> <kills>";
	}

	public void processCommand(ICommandSender icommandsender, String[] astring) 
	{
		if (icommandsender instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)icommandsender;

			if (player.capabilities.isCreativeMode)
			{
				if(astring.length == 0)
				{
					icommandsender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Usage: /setbosstask <boss> <kills>"));
					return;
				}

				addBossToSlayerTask(icommandsender, astring, "WitherBoss");
			}
		}
	}

	public void addBossToSlayerTask(ICommandSender icommandsender, String[] astring, String boss)
	{
		EntityPlayer player = (EntityPlayer)icommandsender;
		
		if (astring[0].equalsIgnoreCase(boss))
		{
			RCM.instance.slayer.setBossTask(boss, Integer.valueOf(astring[1]));
			player.addChatMessage(new ChatComponentText("Boss Task Set: Kill " + Integer.valueOf(astring[1]) + " " + boss + "es"));
		}	
	}

	public List addTabCompletionOptions(ICommandSender par1iCommandSender, String[] astring) 
	{
		if (astring.length == 1)
		{
			return getListOfStringsMatchingLastWord(astring, new String[] { "WitherBoss" });
		}
		return null;
	}
}