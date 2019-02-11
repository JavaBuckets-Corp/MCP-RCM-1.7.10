package javabuckets.mods.rcm.guis.skillguides;

import javabuckets.mods.rcm.guis.GUICustomSkillGuideButton;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.Reference;
import javabuckets.mods.rcm.utility.SkillReference;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class GUISkillGuides extends GuiScreen
{	
	public static final ResourceLocation HDSkillsGui = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skillsuhd.png");
	public static final ResourceLocation Skills1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skills1.png");
	public static final ResourceLocation Skills2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skills2.png");

	public GUISkillGuides()
	{

	}

	public void initGui()
	{
		buttonList.clear();
		
		buttonList.add(new GUICustomSkillGuideButton(1, 6, 22, 31, 15, "", SkillReference.att));
		buttonList.add(new GUICustomSkillGuideButton(2, 44, 22, 31, 15, "", SkillReference.cons));
		buttonList.add(new GUICustomSkillGuideButton(3, 83, 22, 31, 15, "", SkillReference.mine));
		
		buttonList.add(new GUICustomSkillGuideButton(4, 6, 41, 31, 15, "", SkillReference.str));
		buttonList.add(new GUICustomSkillGuideButton(5, 44, 41, 31, 15, "", SkillReference.agi));
		buttonList.add(new GUICustomSkillGuideButton(6, 83, 41, 31, 15, "", SkillReference.smith));
		
		buttonList.add(new GUICustomSkillGuideButton(7, 6, 60, 31, 15, "", SkillReference.def));
		buttonList.add(new GUICustomSkillGuideButton(8, 44, 60, 31, 15, "", SkillReference.herb));
		buttonList.add(new GUICustomSkillGuideButton(9, 83, 60, 31, 15, "", SkillReference.fish));
		
		buttonList.add(new GUICustomSkillGuideButton(10, 6, 79, 31, 15, "", SkillReference.range));
		buttonList.add(new GUICustomSkillGuideButton(11, 44, 79, 31, 15, "", SkillReference.thiev));
		buttonList.add(new GUICustomSkillGuideButton(12, 83, 79, 31, 15, "", SkillReference.cook));
		
		buttonList.add(new GUICustomSkillGuideButton(13, 6, 98, 31, 15, "", SkillReference.pray));
		buttonList.add(new GUICustomSkillGuideButton(14, 44, 98, 31, 15, "", SkillReference.craft));
		buttonList.add(new GUICustomSkillGuideButton(15, 83, 98, 31, 15, "", SkillReference.fm));
		
		buttonList.add(new GUICustomSkillGuideButton(16, 6, 117, 31, 15, "", SkillReference.mage));
		buttonList.add(new GUICustomSkillGuideButton(17, 44, 117, 31, 15, "", SkillReference.fletch));
		buttonList.add(new GUICustomSkillGuideButton(18, 83, 117, 31, 15, "", SkillReference.wc));
		
		buttonList.add(new GUICustomSkillGuideButton(19, 6, 136, 31, 15, "", SkillReference.rc));
		buttonList.add(new GUICustomSkillGuideButton(20, 44, 136, 31, 15, "", SkillReference.slay));
		buttonList.add(new GUICustomSkillGuideButton(21, 83, 136, 31, 15, "", SkillReference.farm));
		
		buttonList.add(new GUICustomSkillGuideButton(22, 6, 155, 31, 15, "", SkillReference.con));
		buttonList.add(new GUICustomSkillGuideButton(23, 44, 155, 31, 15, "", SkillReference.hunt));
		buttonList.add(new GUICustomSkillGuideButton(24, 83, 155, 31, 15, "", SkillReference.summ));
		
		buttonList.add(new GUICustomSkillGuideButton(25, 6, 174, 31, 15, "", SkillReference.dung));
		buttonList.add(new GUICustomSkillGuideButton(26, 44, 174, 31, 15, "", SkillReference.div));
	}

	protected void actionPerformed(GuiButton button)
	{
		switch (button.id)
		{
			case 0:
			{
				
				break;
			}
			
			case 1: { mc.displayGuiScreen(new SkillGuideAttack()); break; }
			case 2: { mc.displayGuiScreen(new SkillGuideConstitution()); break; }
			case 3: { mc.displayGuiScreen(new SkillGuideMining()); break; }
//			case 4: { mc.displayGuiScreen(new SkillGuideStrength()); break; }
//			case 5: { mc.displayGuiScreen(new SkillGuideAgility()); break; }
//			case 6: { mc.displayGuiScreen(new SkillGuideSmithing()); break; }
			case 7: { mc.displayGuiScreen(new SkillGuideDefence()); break; }
//			case 8: { mc.displayGuiScreen(new SkillGuideHerblore()); break; }
//			case 9: { mc.displayGuiScreen(new SkillGuideFishing()); break; }
//			case 10: { mc.displayGuiScreen(new SkillGuideRanged()); break; }
//			case 11: { mc.displayGuiScreen(new SkillGuideThieving()); break; }
//			case 12: { mc.displayGuiScreen(new SkillGuideCooking()); break; }
//			case 13: { mc.displayGuiScreen(new SkillGuidePrayer()); break; }
//			case 14: { mc.displayGuiScreen(new SkillGuideCrafting()); break; }
//			case 15: { mc.displayGuiScreen(new SkillGuideFiremaking()); break; }
//			case 16: { mc.displayGuiScreen(new SkillGuideMagic()); break; }
//			case 17: { mc.displayGuiScreen(new SkillGuideFletching()); break; }
			case 18: { mc.displayGuiScreen(new SkillGuideWoodcutting()); break; }
//			case 19: { mc.displayGuiScreen(new SkillGuideRunecrafting()); break; }
//			case 20: { mc.displayGuiScreen(new SkillGuideSlayer()); break; }
			case 21: { mc.displayGuiScreen(new SkillGuideFarming()); break; }
//			case 22: { mc.displayGuiScreen(new SkillGuideContruction()); break; }
//			case 23: { mc.displayGuiScreen(new SkillGuideHunter()); break; }
//			case 24: { mc.displayGuiScreen(new SkillGuideSummoning()); break; }
//			case 25: { mc.displayGuiScreen(new SkillGuideDungeoneering()); break; }
//			case 26: { mc.displayGuiScreen(new SkillGuideDivination()); break; }
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
		//this.drawDefaultBackground();

		GL11.glEnable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(0F, 0F, 0F, 0.5F);

		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glColor4f(1F, 1F, 1F, 1F);

		mc.renderEngine.bindTexture(HDSkillsGui);
		drawTexturedModalRect(0, 0, 0, 0, 240 / 2, 450 / 2);

		drawString(mc.fontRenderer, "Skills", 22, 6, 0xD48624);		
		int xPos1 = 23;
		int xPos2 = 26;
		int xPos3 = 29;
		int yPos = 26;

		// Attack 
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.att), xPos1, yPos, 0xFFFFFF);
		// Constitution
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.cons), xPos2 + 35, yPos, 0xFFFFFF);
		// Mining
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.mine), xPos3 + 71, yPos, 0xFFFFFF);
		// Strength
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.str), xPos1, yPos + 19, 0xFFFFFF);
		// Agility
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.agi), xPos2 + 35, yPos + 19, 0xFFFFFF);
		// Smithing
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.smith), xPos3 + 71, yPos + 19, 0xFFFFFF);
		// Defence
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.def), xPos1, yPos + 38, 0xFFFFFF);
		// Herblore
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.herb), xPos2 + 35, yPos + 38, 0xFFFFFF);
		// Fishing
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.fish), xPos3 + 71, yPos + 38, 0xFFFFFF);
		// Ranged
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.range), xPos1, yPos + 57, 0xFFFFFF);
		// Thieving
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.thiev), xPos2 + 35, yPos + 57, 0xFFFFFF);
		// Cooking
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.cook), xPos3 + 71, yPos + 57, 0xFFFFFF);
		// Prayer
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.pray), xPos1, yPos + 76, 0xFFFFFF);
		// Crafting
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.craft), xPos2 + 35, yPos + 76, 0xFFFFFF);
		// Firemaking
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.fm), xPos3 + 71, yPos + 76, 0xFFFFFF);
		// Magic
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.mage), xPos1, yPos + 95, 0xFFFFFF);
		// Fletching
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.fletch), xPos2 + 35, yPos + 95, 0xFFFFFF);
		// Woodcutting
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.wc), xPos3 + 71, yPos + 95, 0xFFFFFF);
		// Runecrafting
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.rc), xPos1, yPos + 114, 0xFFFFFF);
		// Slayer
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.slay), xPos2 + 35, yPos + 114, 0xFFFFFF);
		// Farming
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.farm), xPos3 + 71, yPos + 114, 0xFFFFFF);
		// Construction
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.con), xPos1, yPos + 133, 0xFFFFFF);
		// Hunter
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.hunt), xPos2 + 35, yPos + 133, 0xFFFFFF);
		// Summoning
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.summ), xPos3 + 71, yPos + 133, 0xFFFFFF);
		// Dungeoneering
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.dung), xPos1, yPos + 152, 0xFFFFFF);
		// Divination
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.div), xPos2 + 35, yPos + 152, 0xFFFFFF);

		// Total Level
		drawString(mc.fontRenderer, "" + RCM.instance.skillHandler.getTotalLvl(), xPos1 + 4, yPos + 187, 0xFFFFFF);
		
		// Total XP
		this.drawString(mc.fontRenderer, "Total Experience: " + RCM.instance.skillHandler.getTotalXp() + " xp", 127, 55, 0xFFFFFF);

		// Combat Level
		drawString(mc.fontRenderer, "" + (int)RCM.instance.skillHandler.getCombatLvl(), xPos1 + 65, yPos + 187, 0xFFFFFF);

		// Goldpoints in Pouch
		String gpInPouch = "gp in pouch: " + RCM.instance.gpHandler.getEnumChatFormatting() + RCM.instance.gpHandler.getGoldPointsDisplay() + EnumChatFormatting.RESET;
		drawString(mc.fontRenderer, gpInPouch, 5, 194, 0xFFFFFF);
		
		// Last Login Date
		drawCenteredString(mc.fontRenderer, RCM.instance.dailyGiftHandler.getDate(), width /2, height - 40, 0xFFFFFF);

		GL11.glScalef(0.25F, 0.25F, 0.25F);
		mc.renderEngine.bindTexture(Skills1);
		drawTexturedModalRect(xPos1, yPos + 60, 0, 0, 64, 64);
		drawTexturedModalRect(xPos1 + 155, yPos + 60, 64, 0, 64, 64);
		drawTexturedModalRect(xPos1 + 310, yPos + 60, 128, 0, 64, 64);
		drawTexturedModalRect(xPos1 - 5, yPos + 135, 192, 0, 64, 64);
		drawTexturedModalRect(xPos1 + 155, yPos + 137, 0, 64, 64, 64);
		drawTexturedModalRect(xPos1 + 307, yPos + 135, 64, 64, 64, 64);
		drawTexturedModalRect(xPos1, yPos + 213, 128, 64, 64, 64);
		drawTexturedModalRect(xPos1 + 155, yPos + 213, 192, 64, 64, 64);
		drawTexturedModalRect(xPos1 + 310, yPos + 215, 0, 128, 64, 64);
		drawTexturedModalRect(xPos1, yPos + 290, 64, 128, 64, 64);
		drawTexturedModalRect(xPos1 + 155, yPos + 290, 128, 128, 64, 64);
		drawTexturedModalRect(xPos1 + 310, yPos + 290, 192, 128, 64, 64);
		drawTexturedModalRect(xPos1, yPos + 365, 0, 192, 64, 64);
		drawTexturedModalRect(xPos1 + 155, yPos + 365, 64, 192, 64, 64);
		drawTexturedModalRect(xPos1 + 310, yPos + 365, 128, 192, 64, 64);
		drawTexturedModalRect(xPos1, yPos + 443, 192, 192, 64, 64);
		mc.renderEngine.bindTexture(Skills2);
		drawTexturedModalRect(xPos1 + 155, yPos + 443, 0, 0, 64, 64);
		drawTexturedModalRect(xPos1 + 310, yPos + 442, 64, 0, 64, 64);
		drawTexturedModalRect(xPos1, yPos + 517, 128, 0, 64, 64);
		drawTexturedModalRect(xPos1 + 155, yPos + 517, 192, 0, 64, 64);
		drawTexturedModalRect(xPos1 + 310, yPos + 519, 0, 64, 64, 64);
		drawTexturedModalRect(xPos1, yPos + 594, 64, 64, 64, 64);
		drawTexturedModalRect(xPos1 + 155, yPos + 594, 128, 64, 64, 64);
		drawTexturedModalRect(xPos1 + 310, yPos + 594, 192, 64, 64, 64);
		drawTexturedModalRect(xPos1, yPos + 669, 0, 128, 64, 64);
		drawTexturedModalRect(xPos1 + 155, yPos + 669, 64, 128, 64, 64);

		GL11.glScalef(4F, 4F, 4F);

		super.drawScreen(par1, par2, par3);
	}
}
