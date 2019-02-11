package javabuckets.mods.rcm.skills;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BaseSkill 
{	
	public static boolean showSkillHUD = false;
	private int resetTimer = 360;
	
	public void skill(EntityPlayer player, World world)
	{
		// Combat
		RCM.instance.combat.combat(player, world);
		// Mining
		RCM.instance.mining.mining(player, world);
		// Smithing
		RCM.instance.smithing.smithing(player, world);
		// Fishing
		RCM.instance.fishing.fishing(player, world);
		// Thieving
		RCM.instance.thieving.thieving(player, world);
		// Cooking
		RCM.instance.cooking.cooking(player, world);
		// Prayer
		RCM.instance.prayer.prayer(player, world);
		// Firemaking
		RCM.instance.firemaking.firemaking(player, world);
		// Woodcutting
		RCM.instance.woodcutting.woodcutting(player, world);
		// Runecrafting
		RCM.instance.runecrafting.runecrafting(player, world);
		// Slayer
		RCM.instance.slayer.slayer(player, world);
		// Farming
		RCM.instance.farming.farming(player, world);
		// Summoning
		RCM.instance.summoning.summoning(player, world);
		
		setLvlFromXPList();
		
		if (showSkillHUD)
		{
			resetTimer--;
			
			if (resetTimer <= 0)
			{
				showSkillHUD = false;
				resetTimer = 360;
			}
		}
	}
	
	public void setLvlFromXPList()
	{
		for (int i = 1; i <= 120; i++)
		{
			setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
		}

		setbackXPIfTooHigh(200000000D);
		setbackLvlIfTooHigh(99);	
	}
	
	public void setLvlFromXP(double xpMin, double xpMax, int level)
	{
		
	}
	
	public void setbackLvlIfTooHigh(int level)
	{
		
	}
	
	public void setbackXPIfTooHigh(double xp)
	{
		
	}
	
	public void resetTimer()
	{
		this.resetTimer = 360;
	}
}
