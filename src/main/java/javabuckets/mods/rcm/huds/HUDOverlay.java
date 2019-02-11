package javabuckets.mods.rcm.huds;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class HUDOverlay 
{
	public static void init()
	{
		Minecraft mc = Minecraft.getMinecraft();
		
		MinecraftForge.EVENT_BUS.register(new HUDSkills(mc));
		MinecraftForge.EVENT_BUS.register(new HUDSkillsTab(mc));
		MinecraftForge.EVENT_BUS.register(new HUDScreen(mc));
		MinecraftForge.EVENT_BUS.register(new HUDTest(mc));
	}
}