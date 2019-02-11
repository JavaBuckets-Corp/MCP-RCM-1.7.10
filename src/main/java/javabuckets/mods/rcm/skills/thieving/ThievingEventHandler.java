package javabuckets.mods.rcm.skills.thieving;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ThievingEventHandler 
{
	@SubscribeEvent
	public void onThieving(EntityInteractEvent event)
	{
		ThievingHandler.isThieving = true;
		
		if (!ThievingHandler.isStealing && ThievingHandler.canThieve)
		{
			ThievingHandler.isStealing = true;
			
			if (event.entityPlayer.isSneaking())
			{
				if (event.target instanceof EntityVillager) { thieving(ThievingReference.villager, 0.5D, 1, 3, 8); }
			}	
		}
	}
	
	public void thieving(String target, double succesChance, int requiredLevel, long reward, double xp)
	{
		double rand = Math.random();
		
		if (RCM.instance.skillHandler.getLevel(SkillReference.thiev) >= requiredLevel)
		{
			if (rand < succesChance + (RCM.instance.skillHandler.getLevel(SkillReference.thiev) / 450))
			{
				RCM.instance.skillHandler.addXPToSkill(SkillReference.thiev, xp);
				RCM.instance.gpHandler.addGPToPouch(reward);
			}
			else
			{
				LogHelper.info("Thieving failed!");
			}
		}
		else
		{
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You need a level of at least " + requiredLevel + " in Thieving, to steal from this entity!"));
		}
	}
}