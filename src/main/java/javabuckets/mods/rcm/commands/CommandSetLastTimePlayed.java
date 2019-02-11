package javabuckets.mods.rcm.commands;

import java.util.List;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.DateUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandSetLastTimePlayed extends CommandBase
{
	public String getCommandName() 
	{
		return "setlasttimeplayed";
	}

	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "/setlasttimeplayed <day> <month> <year>";
	}

	public void processCommand(ICommandSender icommandsender, String[] astring) 
	{
		if (icommandsender instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)icommandsender;

			if(astring.length == 0)
			{
				icommandsender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Usage: " + getCommandUsage(icommandsender)));
				return;
			}
			
			RCM.instance.dailyGiftHandler.setDate(astring[0] + "-" + astring[1] + "-" + astring[2]);
			icommandsender.addChatMessage(new ChatComponentText(astring[0] + "   " + astring[1] + "   " + astring[2]));
		}
	}


	public List addTabCompletionOptions(ICommandSender par1iCommandSender, String[] astring) 
	{
		if (astring.length == 1)
		{
			return getListOfStringsMatchingLastWord(astring, new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" });
			
		}
		else if (astring.length == 2)
		{
			return getListOfStringsMatchingLastWord(astring, new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" });
		}
		else if (astring.length == 3)
		{
			return getListOfStringsMatchingLastWord(astring, new String[] { "2015", "2016" });
		}
		return null;
	}
}