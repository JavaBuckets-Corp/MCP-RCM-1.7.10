package javabuckets.mods.rcm.commands;

import java.util.List;

import javabuckets.mods.rcm.main.RCM;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandSetSlayerTask extends CommandBase
{
	public String getCommandName() 
	{
		return "setslayertask";
	}

	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "/setslayertask <monster> <kills>";
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
					icommandsender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Usage: /setslayertask <monster> <kills>"));
					return;
				}

				addMonsterToSlayerTask(icommandsender, astring, "Zombie");
				addMonsterToSlayerTask(icommandsender, astring, "Skeleton");
				addMonsterToSlayerTask(icommandsender, astring, "Pigzombie");
				addMonsterToSlayerTask(icommandsender, astring, "Wolf");
				addMonsterToSlayerTask(icommandsender, astring, "Spider");
				addMonsterToSlayerTask(icommandsender, astring, "Ghast");
			}
		}
	}

	public void addMonsterToSlayerTask(ICommandSender icommandsender, String[] astring, String monster)
	{
		EntityPlayer player = (EntityPlayer)icommandsender;
		
		if (astring[0].equalsIgnoreCase(monster))
		{
			RCM.instance.slayer.setSlayerTask(monster, Integer.valueOf(astring[1]));
			player.addChatMessage(new ChatComponentText("Slayer Task Set: Kill " + Integer.valueOf(astring[1]) + " " + monster + "s"));
		}	
	}

	public List addTabCompletionOptions(ICommandSender par1iCommandSender, String[] astring) 
	{
		if (astring.length == 1)
		{
			return getListOfStringsMatchingLastWord(astring, new String[] { "Zombie", "Skeleton", "Pigzombie", "Wolf", "Spider", "Ghast" });
		}
		return null;
	}
}