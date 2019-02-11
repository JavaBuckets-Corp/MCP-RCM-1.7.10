package javabuckets.mods.rcm.commands;

import javabuckets.mods.rcm.main.RCM;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandSetGp extends CommandBase
{
	public String getCommandName() 
	{
		return "setgp";
	}

	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "/setgp <value>";
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
					icommandsender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Usage: /setgp <value>"));
					return;
				}
				
				RCM.instance.gpHandler.setGoldPointsInPouch(Long.valueOf(astring[0]));
			}
		}
	}
}