package javabuckets.mods.rcm.commands;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandFixErrors extends CommandBase
{

	public String getCommandName() 
	{
		return "fixerrors";
	}

	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "/fixerrors";
	}
	
	@Override
	public int getRequiredPermissionLevel() 
	{
		return 0;
	}

	public void processCommand(ICommandSender icommandsender, String[] astring) 
	{
		if (icommandsender instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)icommandsender;

			player.removePotionEffect(Potion.field_76434_w.id);
			double amp = RCM.instance.skillHandler.getLevel(SkillReference.cons) / 7;
			player.addPotionEffect(new PotionEffect(Potion.field_76434_w.id, Integer.MAX_VALUE, (int)amp));
			LevelUpUtil.lvlHandling();
		}
	}
}