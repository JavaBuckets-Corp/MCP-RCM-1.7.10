package javabuckets.mods.rcm.skills.combat;

import javabuckets.mods.rcm.guis.GUICustomButton;
import javabuckets.mods.rcm.main.RCM;

import org.lwjgl.opengl.GL11;





import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class GUICombatSelection extends GuiScreen
{
	public GUICombatSelection()
	{
		
	}
	
	public void initGui()
	{
		buttonList.clear();
		this.buttonList.add(new GUICustomButton(0, width / 2 - 50, height - 60, 100, 20, StatCollector.translateToLocal("Close Down")));
		
		this.buttonList.add(new GUICustomButton(1, width / 2 - 115, height - 210, 75, 20, StatCollector.translateToLocal("Attack")));
		this.buttonList.add(new GUICustomButton(2, width / 2 - (75 / 2), height - 210, 75, 20, StatCollector.translateToLocal("Strength")));
		this.buttonList.add(new GUICustomButton(3, width / 2 + (75 / 2) + 4, height - 210, 75, 20, StatCollector.translateToLocal("Defence")));
		
		this.buttonList.add(new GUICustomButton(4, width / 2 - 77, height - 160, 75, 20, StatCollector.translateToLocal("Magic")));
		this.buttonList.add(new GUICustomButton(5, width / 2 + 1, height - 160, 75, 20, StatCollector.translateToLocal("Defence")));
		
		this.buttonList.add(new GUICustomButton(6, width / 2 - 115, height - 110, 75, 20, StatCollector.translateToLocal("Ranged")));
		this.buttonList.add(new GUICustomButton(7, width / 2 - (75 / 2), height - 110, 75, 20, StatCollector.translateToLocal("Strength")));
		this.buttonList.add(new GUICustomButton(8, width / 2 + (75 / 2) + 4, height - 110, 75, 20, StatCollector.translateToLocal("Defence")));
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
				RCM.instance.combat.setIsTrainingAttackMelee(true);
				RCM.instance.combat.setIsTrainingStrengthMelee(false);
				RCM.instance.combat.setIsTrainingDefenceMelee(false);
				this.closeGui();
				break;
			}
			
			case 2:
			{
				RCM.instance.combat.setIsTrainingAttackMelee(false);
				RCM.instance.combat.setIsTrainingStrengthMelee(true);
				RCM.instance.combat.setIsTrainingDefenceMelee(false);
				this.closeGui();
				break;
			}
			
			case 3:
			{
				RCM.instance.combat.setIsTrainingAttackMelee(false);
				RCM.instance.combat.setIsTrainingStrengthMelee(false);
				RCM.instance.combat.setIsTrainingDefenceMelee(true);
				this.closeGui();
				break;
			}
			
			case 4:
			{
				RCM.instance.combat.setIsTrainingMagicMaging(true);
				RCM.instance.combat.setIsTrainingDefenceMaging(false);
				this.closeGui();
				break;
			}
			
			case 5:
			{
				RCM.instance.combat.setIsTrainingMagicMaging(false);
				RCM.instance.combat.setIsTrainingDefenceMaging(true);
				this.closeGui();
				break;
			}
			
			case 6:
			{
				RCM.instance.combat.setIsTrainingRangedRanging(true);
				RCM.instance.combat.setIsTrainingStrengthRanging(false);
				RCM.instance.combat.setIsTrainingDefenceRanging(false);
				this.closeGui();
				break;
			}
			
			case 7:
			{
				RCM.instance.combat.setIsTrainingRangedRanging(false);
				RCM.instance.combat.setIsTrainingStrengthRanging(true);
				RCM.instance.combat.setIsTrainingDefenceRanging(false);
				this.closeGui();
				break;
			}
			
			case 8:
			{
				RCM.instance.combat.setIsTrainingRangedRanging(false);
				RCM.instance.combat.setIsTrainingStrengthRanging(false);
				RCM.instance.combat.setIsTrainingDefenceRanging(true);
				this.closeGui();
				break;
			}
		}
	}
	
	public boolean doesGuiPauseGame()
	{
		return false;
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
		
		this.mc.renderEngine.bindTexture(new ResourceLocation("null"));
		GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glColor4f(0F, 0F, 0F, 0.3F);
        this.drawTexturedModalRect(width / 2 - 120, 0, 0, 0, 240, height);
        
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glColor4f(1F, 1F, 1F, 1F);
        
        this.drawCenteredString(mc.fontRenderer, "Combat Training Selection", width / 2,  10, 0xFFFFFF);
        
        this.drawCenteredString(mc.fontRenderer, "Melee Training Selection", width / 2,  height - 228, 0xFFFFFF);
        this.drawCenteredString(mc.fontRenderer, "Magic Training Selection", width / 2,  height - 178, 0xFFFFFF);
        this.drawCenteredString(mc.fontRenderer, "Ranged Training Selection", width / 2,  height - 128, 0xFFFFFF);
		
		super.drawScreen(par1, par2, par3);
	}
}
