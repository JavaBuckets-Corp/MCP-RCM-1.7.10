package javabuckets.mods.rcm.skills.prayer;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.Mod.EventHandler;

public class PrayerEventHandler
{
	@EventHandler
	public void onUpdate(LivingUpdateEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)event.entity;
			
			
		}
	}
}