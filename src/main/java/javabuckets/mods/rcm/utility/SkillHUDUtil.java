package javabuckets.mods.rcm.utility;

public class SkillHUDUtil 
{
	public static int getXFromSkill(String skill)
	{
		if (skill.equalsIgnoreCase(SkillReference.att)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.cons)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.mine)) { return 128; }
		else if (skill.equalsIgnoreCase(SkillReference.str)) { return 192; }
		else if (skill.equalsIgnoreCase(SkillReference.agi)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.smith)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.def)) { return 128; }
		else if (skill.equalsIgnoreCase(SkillReference.herb)) { return 192; }
		else if (skill.equalsIgnoreCase(SkillReference.fish)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.range)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.thiev)) { return 128; }
		else if (skill.equalsIgnoreCase(SkillReference.cook)) { return 192; }
		else if (skill.equalsIgnoreCase(SkillReference.pray)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.craft)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.fm)) { return 128; }
		else if (skill.equalsIgnoreCase(SkillReference.mage)) { return 192; }
		else if (skill.equalsIgnoreCase(SkillReference.fletch)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.wc)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.rc)) { return 128; }
		else if (skill.equalsIgnoreCase(SkillReference.slay)) { return 192; }
		else if (skill.equalsIgnoreCase(SkillReference.farm)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.con)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.hunt)) { return 128; }
		else if (skill.equalsIgnoreCase(SkillReference.summ)) { return 192; }
		else if (skill.equalsIgnoreCase(SkillReference.dung)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.div)) { return 64; }
		
		else
		{
			return 0;
		}
	}

	public static int getYFromSkill(String skill)
	{
		if (skill.equalsIgnoreCase(SkillReference.att)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.cons)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.mine)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.str)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.agi)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.smith)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.def)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.herb)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.fish)) { return 128; }
		else if (skill.equalsIgnoreCase(SkillReference.range)) { return 128; }
		else if (skill.equalsIgnoreCase(SkillReference.thiev)) { return 128; }
		else if (skill.equalsIgnoreCase(SkillReference.cook)) { return 128; }
		else if (skill.equalsIgnoreCase(SkillReference.pray)) { return 192; }
		else if (skill.equalsIgnoreCase(SkillReference.craft)) { return 192; }
		else if (skill.equalsIgnoreCase(SkillReference.fm)) { return 192; }
		else if (skill.equalsIgnoreCase(SkillReference.mage)) { return 192; }
		else if (skill.equalsIgnoreCase(SkillReference.fletch)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.wc)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.rc)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.slay)) { return 0; }
		else if (skill.equalsIgnoreCase(SkillReference.farm)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.con)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.hunt)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.summ)) { return 64; }
		else if (skill.equalsIgnoreCase(SkillReference.dung)) { return 128; }
		else if (skill.equalsIgnoreCase(SkillReference.div)) { return 128; }
		
		else
		{
			return 0;
		}
	}
	
	public static int getSkillTextureCategory(String skill)
	{
		if (skill.equalsIgnoreCase(SkillReference.att)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.cons)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.mine)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.str)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.agi)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.smith)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.def)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.herb)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.fish)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.range)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.thiev)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.cook)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.pray)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.craft)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.fm)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.mage)) { return 1; }
		else if (skill.equalsIgnoreCase(SkillReference.fletch)) { return 2; }
		else if (skill.equalsIgnoreCase(SkillReference.wc)) { return 2; }
		else if (skill.equalsIgnoreCase(SkillReference.rc)) { return 2; }
		else if (skill.equalsIgnoreCase(SkillReference.slay)) { return 2; }
		else if (skill.equalsIgnoreCase(SkillReference.farm)) { return 2; }
		else if (skill.equalsIgnoreCase(SkillReference.con)) { return 2; }
		else if (skill.equalsIgnoreCase(SkillReference.hunt)) { return 2; }
		else if (skill.equalsIgnoreCase(SkillReference.summ)) { return 2; }
		else if (skill.equalsIgnoreCase(SkillReference.dung)) { return 2; }
		else if (skill.equalsIgnoreCase(SkillReference.div)) { return 2; }
		
		else
		{
			return 0;
		}
	}
}