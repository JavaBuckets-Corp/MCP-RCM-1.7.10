package javabuckets.mods.rcm.guis.skillguides;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class SkillGuideBase extends GuiScreen
{
	private boolean x;
	
	public SkillGuideBase(boolean doesGuiPauseGame)
	{
		x = doesGuiPauseGame;
	}
	
	public void initGui()
	{
		buttonList.clear();
	}
	
	protected void actionPerformed(GuiButton button)
	{
		
	}
	
	public boolean doesGuiPauseGame()
	{
		return x;
	}

	public void onGuiClosed()
	{

	}
	
	public void drawScreen(int par1, int par2, float par3)
	{
		
		super.drawScreen(par1, par2, par3);
	}
}