package javabuckets.mods.rcm.commands;

import javabuckets.mods.rcm.main.RCM;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class CommandGetDailyChallenge extends CommandBase
{

	public String getCommandName() 
	{
		return "getdaily";
	}

	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "/getdaily>";
	}

	public void processCommand(ICommandSender icommandsender, String[] astring) 
	{
		if (icommandsender instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)icommandsender;

			icommandsender.addChatMessage(new ChatComponentText(RCM.instance.dailies.getDailyChallenge()));
		}
	}
}