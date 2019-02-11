package javabuckets.mods.rcm.commands;

import java.util.List;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandSetMisc extends CommandBase
{

	public String getCommandName()
	{
		return "setmisc";
	}

	public String getCommandUsage(ICommandSender icommandsender)
	{
		return "/setmisc <misc>";
	}

	public void processCommand(ICommandSender icommandsender, String[] astring) 
	{
		if(astring.length == 0)
		{
			icommandsender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Usage: /setmisc <misc>"));
			return;
		}
		
		if (astring.length >= 1)
		{
			if (astring[0].equalsIgnoreCase("maxplayer"))
			{
				RCM.instance.skillHandler.setAllLevels99();
				return;
			}
			
			else if (astring[0].equalsIgnoreCase("ultramaxplayer"))
			{
				RCM.instance.skillHandler.setAllToMax();
				return;
			}
			
			else if (astring[0].equalsIgnoreCase("resetplayer"))
			{
				RCM.instance.skillHandler.resetPlayer();
				RCM.instance.gpHandler.setGoldPointsInPouch(0);
				RCM.instance.skillHandler.setFirstTimeLogon(true);
				RCM.instance.prayer.rechargePrayerPoints();
				RCM.instance.summoning.rechargeSummoningPoints();
				return;
			}
			
			else if (astring[0].equalsIgnoreCase("maxpouchcash"))
			{
				RCM.instance.gpHandler.setGoldPointsInPouch(Integer.MAX_VALUE);
				return;
			}
			
			else if (astring[0].equalsIgnoreCase("resetpouchcash"))
			{
				RCM.instance.gpHandler.setGoldPointsInPouch(0);
				return;
			}
			
			else if (astring[0].equalsIgnoreCase("resetFirstTimeLogon"))
			{
				RCM.instance.skillHandler.setFirstTimeLogon(true);
				return;
			}
		}
	}
	
	public List addTabCompletionOptions(ICommandSender par1iCommandSender, String[] astring) 
	{
		if (astring.length == 1)
		{
			return getListOfStringsMatchingLastWord(astring, new String[] { "maxplayer", "ultramaxplayer", "resetplayer", "maxpouchcash", "resetpouchcash", "resetFirstTimeLogon" });
		}
		return null;
	}
}