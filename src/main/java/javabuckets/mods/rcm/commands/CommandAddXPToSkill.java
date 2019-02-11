package javabuckets.mods.rcm.commands;

import java.util.List;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandAddXPToSkill extends CommandBase
{

	public String getCommandName() 
	{
		return "addxp";
	}

	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "/addxp <skill> <value>";
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
					icommandsender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Usage: /addxp <skill> <value>"));
					return;
				}

				addXPToSkill(icommandsender, astring, SkillReference.att);
				addXPToSkill(icommandsender, astring, SkillReference.cons);
				addXPToSkill(icommandsender, astring, SkillReference.mine);
				addXPToSkill(icommandsender, astring, SkillReference.str);
				addXPToSkill(icommandsender, astring, SkillReference.agi);
				addXPToSkill(icommandsender, astring, SkillReference.smith);
				addXPToSkill(icommandsender, astring, SkillReference.def);
				addXPToSkill(icommandsender, astring, SkillReference.herb);
				addXPToSkill(icommandsender, astring, SkillReference.fish);
				addXPToSkill(icommandsender, astring, SkillReference.range);
				addXPToSkill(icommandsender, astring, SkillReference.thiev);
				addXPToSkill(icommandsender, astring, SkillReference.cook);
				addXPToSkill(icommandsender, astring, SkillReference.pray);
				addXPToSkill(icommandsender, astring, SkillReference.craft);
				addXPToSkill(icommandsender, astring, SkillReference.fm);
				addXPToSkill(icommandsender, astring, SkillReference.mage);
				addXPToSkill(icommandsender, astring, SkillReference.fletch);
				addXPToSkill(icommandsender, astring, SkillReference.wc);
				addXPToSkill(icommandsender, astring, SkillReference.rc);
				addXPToSkill(icommandsender, astring, SkillReference.slay);
				addXPToSkill(icommandsender, astring, SkillReference.farm);
				addXPToSkill(icommandsender, astring, SkillReference.con);
				addXPToSkill(icommandsender, astring, SkillReference.hunt);
				addXPToSkill(icommandsender, astring, SkillReference.summ);
				addXPToSkill(icommandsender, astring, SkillReference.dung);
				addXPToSkill(icommandsender, astring, SkillReference.div);
			}
		}
	}

	public void addXPToSkill(ICommandSender icommandsender, String[] astring, String skill)
	{
		if (astring[0].equalsIgnoreCase(skill))
		{
			if (Integer.valueOf(astring[1]) + RCM.instance.skillHandler.getExperience(skill) > 200000000)
			{
				icommandsender.addChatMessage(new ChatComponentText("The Experience you have entered is too high!"));
			}
			else if (Integer.valueOf(astring[1]) < 0)
			{
				icommandsender.addChatMessage(new ChatComponentText("The Experience you have entered is too small!"));
			}
			else
			{
				RCM.instance.skillHandler.addXPToSkill(skill, Integer.valueOf(astring[1]));
				LevelUpUtil.updateLvls();
			}
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