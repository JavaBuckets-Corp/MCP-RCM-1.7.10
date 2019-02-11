package javabuckets.mods.rcm.guis;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.StatCollector;

public class GUIRCMInterfaceSettings extends GuiScreen 
{
	public static int interfaceSetting = 0;
	
	public GUIRCMInterfaceSettings()
	{

	}

	public void initGui()
	{
		buttonList.clear();
		
		buttonList.add(new GUICustomButton(0, width / 2 - 100, 70, 200, 20, StatCollector.translateToLocal("Back to Game")));
		buttonList.add(new GUICustomButton(1, width / 2 - 100, 170, 200, 20, StatCollector.translateToLocal("Return to Runescape Menu")));
		
		buttonList.add(new GUICustomButton(2, width / 2 - 50, 100, 20, 20, StatCollector.translateToLocal("+")));
		buttonList.add(new GUICustomButton(3, width / 2 + 30, 100, 20, 20, StatCollector.translateToLocal("-")));
	}

	protected void actionPerformed(GuiButton button) 
	{
		switch (button.id)
		{
			case 0:
			{
				this.closeGui();
				break;
			}
			
			case 1:
			{
				this.mc.displayGuiScreen(new GUIRCMMainMenu());
				break;
			}
			
			case 2:
			{
				this.interfaceSetting = 0;
				break;
			}
			
			case 3:
			{
				this.interfaceSetting = 1;
				break;
			}
		}
	}
	
	public boolean doesGuiPauseGame() 
	{
		return true;
	}
	
	public void onGuiClosed() 
	{
		
	}
	
	public void closeGui()
	{
		this.mc.displayGuiScreen((GuiScreen)null);
		this.mc.setIngameFocus();
	}
	
	public void drawScreen(int par1, int par2, float par3) 
	{
		this.drawDefaultBackground();
		
		this.drawCenteredString(mc.fontRenderer, "Runescape Interface Settings", width / 2, 40, 0xFFFFFF);
		
		this.drawString(mc.fontRenderer, "setting: " + interfaceSetting, 3, height - 12, 0xFFFFFF);
		
		super.drawScreen(par1, par2, par3);
	}
}
