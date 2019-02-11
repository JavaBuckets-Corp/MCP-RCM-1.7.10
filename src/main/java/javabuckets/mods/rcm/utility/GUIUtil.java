package javabuckets.mods.rcm.utility;

import net.minecraft.client.gui.GuiScreen;

public class GUIUtil 
{
	public static void drawSkillIcon(GuiScreen guiScreen, int x, int y, int u, int v)
	{
		guiScreen.drawTexturedModalRect(x, y, u, v, 64, 64);
	}
}