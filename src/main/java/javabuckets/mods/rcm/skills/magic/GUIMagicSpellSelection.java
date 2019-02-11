package javabuckets.mods.rcm.skills.magic;

import org.lwjgl.opengl.GL11;

import javabuckets.mods.rcm.guis.GUICustomButtonInv;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.prayer.PrayerReference;
import javabuckets.mods.rcm.utility.Reference;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class GUIMagicSpellSelection extends GuiScreen
{
	int magicLvl = RCM.instance.skillHandler.getLevel(SkillReference.mage);
	
	public static final ResourceLocation magic = new ResourceLocation(Reference.MOD_ID, "textures/gui/magic/magics.png");
	public static final ResourceLocation spells = new ResourceLocation(Reference.MOD_ID, "textures/gui/magic/normal_spellbook.png");
	public static final ResourceLocation magicHat = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skills1.png");
	
	public GUIMagicSpellSelection() 
	{
		
	}
	
	public void initGui() 
	{
		int x = 2;
		int y = 19;
		
		buttonList.clear();
		
		buttonList.add(new GUICustomButtonInv(0, x, y + (14*0)-1, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(5, x, y + (14*1), 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(10, x, y + (14*2)+2, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(15, x, y + (14*3)+4, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(20, x, y + (14*4)+6, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(25, x, y + (14*5)+8, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(30, x, y + (14*6)+10, 13, 13, ""));
		
		buttonList.add(new GUICustomButtonInv(1, x + 15, y + (14*0)-1, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(6, x + 15, y + (14*1), 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(11, x + 15, y + (14*2)+2, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(16, x + 15, y + (14*3)+4, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(21, x + 15, y + (14*4)+6, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(26, x + 15, y + (14*5)+8, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(31, x + 15, y + (14*6)+10, 13, 13, ""));
		
		buttonList.add(new GUICustomButtonInv(2, x + 31, y + (14*0)-1, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(7, x + 31, y + (14*1), 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(12, x + 31, y + (14*2)+2, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(17, x + 31, y + (14*3)+4, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(22, x + 31, y + (14*4)+6, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(27, x + 31, y + (14*5)+8, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(32, x + 31, y + (14*6)+10, 13, 13, ""));
		
		buttonList.add(new GUICustomButtonInv(3, x + 47, y + (14*0)-1, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(8, x + 47, y + (14*1), 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(13, x + 47, y + (14*2)+2, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(18, x + 47, y + (14*3)+4, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(23, x + 47, y + (14*4)+6, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(28, x + 47, y + (14*5)+8, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(33, x + 47, y + (14*6)+10, 13, 13, ""));
		
		buttonList.add(new GUICustomButtonInv(4, x + 63, y + (14*0)-1, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(9, x + 63, y + (14*1), 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(14, x + 63, y + (14*2)+2, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(19, x + 63, y + (14*3)+4, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(24, x + 63, y + (14*4)+6, 13, 13, ""));
		buttonList.add(new GUICustomButtonInv(29, x + 63, y + (14*5)+8, 13, 13, ""));
	}
	
	protected void actionPerformed(GuiButton button) 
	{
		switch (button.id)
		{
			case 0:
			{
				MagicReference.isUsingAirStrike = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.airStrike);
				break;
			}
			
			case 1:
			{
				MagicReference.isUsingConfuse = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.confuse);
				break;
			}
			
			case 2:
			{
				MagicReference.isUsingWaterStrike = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.waterStrike);
				break;
			}
			
			case 3:
			{
				MagicReference.isUsingEarthStrike = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.earthStrike);
				break;
			}
			
			case 4:
			{
				MagicReference.isUsingWeaken = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.weaken);
				break;
			}
			
			case 5:
			{
				MagicReference.isUsingFireStrike = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.fireStrike);
				break;
			}
			
			case 6:
			{
				MagicReference.isUsingAirBolt = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.airBolt);
				break;
			}
			
			case 7:
			{
				RCM.instance.magic.setCurrentSelectedSpell("");
				break;
			}
			
			case 8:
			{
				RCM.instance.magic.setCurrentSelectedSpell("");
				break;
			}
			
			case 9:
			{
				MagicReference.isUsingWaterBolt = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.waterBolt);
				break;
			}
			
			case 10:
			{
				MagicReference.isUsingEarthBolt = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.earthBolt);
				break;
			}
			
			case 11:
			{
				MagicReference.isUsingFireBolt = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.fireBolt);
				break;
			}
			
			case 12:
			{
				MagicReference.isUsingAirBlast = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.airBlast);
				break;
			}
			
			case 13:
			{
				MagicReference.isUsingWaterBlast = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.waterBlast);
				break;
			}
			
			case 14:
			{
				RCM.instance.magic.setCurrentSelectedSpell("");
				break;
			}
			
			case 15:
			{
				RCM.instance.magic.setCurrentSelectedSpell("");
				break;
			}
			
			case 16:
			{
				MagicReference.isUsingEarthBlast = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.earthBlast);
				break;
			}
			
			case 17:
			{
				MagicReference.isUsingFireBlast = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.fireBlast);
				break;
			}
			
			case 18:
			{
				RCM.instance.magic.setCurrentSelectedSpell("");
				break;
			}
			
			case 19:
			{
				MagicReference.isUsingAirWave = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.airWave);
				break;
			}
			
			case 20:
			{
				MagicReference.isUsingWaterWave = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.waterWave);
				break;
			}
			
			case 21:
			{
				RCM.instance.magic.setCurrentSelectedSpell("");
				break;
			}
			
			case 22:
			{
				MagicReference.isUsingEarthWave = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.earthWave);
				break;
			}
			
			case 23:
			{
				RCM.instance.magic.setCurrentSelectedSpell("");
				break;
			}
			
			case 24:
			{
				MagicReference.isUsingFireWave = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.fireWave);
				break;
			}
			
			case 25:
			{
				RCM.instance.magic.setCurrentSelectedSpell("");
				break;
			}
			
			case 26:
			{
				RCM.instance.magic.setCurrentSelectedSpell("");
				break;
			}
			
			case 27:
			{
				RCM.instance.magic.setCurrentSelectedSpell("");
				break;
			}
			
			case 28:
			{
				MagicReference.isUsingStagger = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.stagger);
				break;
			}
			
			case 29:
			{
				MagicReference.isUsingAirSurge = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.airSurge);
				break;
			}
			
			case 30:
			{
				MagicReference.isUsingWaterSurge = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.waterSurge);
				break;
			}
			
			case 31:
			{
				RCM.instance.magic.setCurrentSelectedSpell("");
				break;
			}
			
			case 32:
			{
				MagicReference.isUsingEarthSurge = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.earthSurge);
				break;
			}
			
			case 33:
			{
				MagicReference.isUsingFireSurge = true;
				RCM.instance.magic.setCurrentSelectedSpell(MagicReference.fireSurge);
				break;
			}
		}
		
		closeGui();
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
		GL11.glScalef(0.8F, 0.8F, 0.8F);
		
		mc.renderEngine.bindTexture(magic);
		drawTexturedModalRect(0, 0, 0, 0, 100, 160); 

		mc.renderEngine.bindTexture(spells);
		drawTexturedModalRect(0, 20, 0, 0, 100, 140);
		
		GL11.glScalef(0.28F, 0.28F, 0.28F);
		
		mc.renderEngine.bindTexture(magicHat);
		drawTexturedModalRect(15, 4, 192, 192, 64, 64);	
		
		GL11.glScalef(3.57F, 3.57F, 3.57F);
		
		drawString(mc.fontRenderer, "Magic Spells", 25, 6, 0xD48624);
		
		GL11.glScalef(1.25F, 1.25F, 1.25F);
		
		this.drawString(mc.fontRenderer, "Spell: " + RCM.instance.magic.getCurrentSelectedSpell().replace('_', ' '), 3, height - 12, 0xFFFFFF);
		
		super.drawScreen(par1, par2, par3);
	}
}