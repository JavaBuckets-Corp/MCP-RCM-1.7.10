package javabuckets.mods.rcm.guis;

import javabuckets.mods.rcm.guis.skillguides.GUISkillGuides;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.combat.GUICombatSelection;
import javabuckets.mods.rcm.skills.slayer.GUISlayerMenu;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.stats.StatList;
import net.minecraft.util.StatCollector;

public class GUISkillTabs extends GuiScreen
{
	public GUISkillTabs()
	{
		
	}
	
	public void initGui()
	{
		buttonList.clear();
		
		buttonList.add(new GUICustomButton(0, width / 2 - 100, 70, 200, 20, StatCollector.translateToLocal("Go Back")));
		buttonList.add(new GUICustomButton(1, width / 2 - 100, 95, 97, 20, StatCollector.translateToLocal("Slayer Tab")));
		
		/*buttonList.add(new GUICustomButton(4, width / 2 - 100, 120, 97, 20, StatCollector.translateToLocal("Skill Guides")));
		buttonList.add(new GUICustomButton(5, width / 2 + 3, 120, 97, 20, StatCollector.translateToLocal("Combat Selection")));*/
	}
	
	protected void actionPerformed(GuiButton button) 
	{
		switch (button.id)
		{
			case 0:
			{
				this.mc.displayGuiScreen(new GUIRCMMainMenu());
				break;
			}
			
			case 1:
			{
				this.mc.displayGuiScreen(new GUISlayerMenu());
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
	
	public void drawScreen(int par1, int par2, float par3) 
	{
		this.drawDefaultBackground();
		
		this.drawCenteredString(mc.fontRenderer, "Runescape Skill Tab", width / 2, 40, 0xFFFFFF);
		
		super.drawScreen(par1, par2, par3);
	}
}
