package javabuckets.mods.rcm.commands;

import java.util.List;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandMaxSkill extends CommandBase
{

	public String getCommandName() 
	{
		return "maxskill";
	}

	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "/maxskill <skill>";
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
					icommandsender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Usage: /maxskill <skill>"));
					return;
				}
				
				maxSkill(icommandsender, astring, SkillReference.att);
				maxSkill(icommandsender, astring, SkillReference.cons);
				maxSkill(icommandsender, astring, SkillReference.mine);
				maxSkill(icommandsender, astring, SkillReference.str);
				maxSkill(icommandsender, astring, SkillReference.agi);
				maxSkill(icommandsender, astring, SkillReference.smith);
				maxSkill(icommandsender, astring, SkillReference.def);
				maxSkill(icommandsender, astring, SkillReference.herb);
				maxSkill(icommandsender, astring, SkillReference.fish);
				maxSkill(icommandsender, astring, SkillReference.range);
				maxSkill(icommandsender, astring, SkillReference.thiev);
				maxSkill(icommandsender, astring, SkillReference.cook);
				maxSkill(icommandsender, astring, SkillReference.pray);
				maxSkill(icommandsender, astring, SkillReference.craft);
				maxSkill(icommandsender, astring, SkillReference.fm);
				maxSkill(icommandsender, astring, SkillReference.mage);
				maxSkill(icommandsender, astring, SkillReference.fletch);
				maxSkill(icommandsender, astring, SkillReference.wc);
				maxSkill(icommandsender, astring, SkillReference.rc);
				maxSkill(icommandsender, astring, SkillReference.slay);
				maxSkill(icommandsender, astring, SkillReference.farm);
				maxSkill(icommandsender, astring, SkillReference.con);
				maxSkill(icommandsender, astring, SkillReference.hunt);
				maxSkill(icommandsender, astring, SkillReference.summ);
				maxSkill(icommandsender, astring, SkillReference.dung);
				maxSkill(icommandsender, astring, SkillReference.div);
			}
		}
	}
	
	public void maxSkill(ICommandSender icommandsender, String[] astring, String skill)
	{
		if (astring[0].equalsIgnoreCase(skill))
		{
			RCM.instance.skillHandler.setLevel(skill, 99, 200000000);
		}
	}
	
	public List addTabCompletionOptions(ICommandSender par1iCommandSender, String[] astring) 
	{
		if (astring.length == 1)
		{
			return getListOfStringsMatchingLastWord(astring, new String[] { SkillReference.att, SkillReference.cons, SkillReference.mine, SkillReference.str, SkillReference.agi, SkillReference.smith, SkillReference.def, SkillReference.herb, SkillReference.fish, SkillReference.range, SkillReference.thiev, SkillReference.cook, SkillReference.pray, SkillReference.craft, SkillReference.fm, SkillReference.mage, SkillReference.fletch, SkillReference.wc, SkillReference.rc, SkillReference.slay, SkillReference.farm, SkillReference.con, SkillReference.hunt, SkillReference.summ, SkillReference.dung, SkillReference.div });
		}
		return null;
	}
}