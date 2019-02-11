package javabuckets.mods.rcm.huds;

import javabuckets.mods.rcm.guis.GUIRCMInterfaceSettings;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.Reference;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class HUDSkillsTab extends Gui
{
	private Minecraft mc;
	private RenderItem itemRenderer;

	public static final ResourceLocation RSicons = new ResourceLocation(Reference.MOD_ID, "textures/gui/runescape_icons.png");

	public static final ResourceLocation HDSkillsGui = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skillsuhd.png");
	public static final ResourceLocation Skills1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skills1.png");
	public static final ResourceLocation Skills2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skills2.png");
	
	public static boolean displaySkillTabMsg = true;
	public static boolean displaySkillTab = true;
	public static boolean displaySpellTabMsg = true;
	public static boolean displaySpellTab = true;

	public static boolean displayNormalSpellBook = true;
	public static boolean displayAncientSpellBook = false;
	public static boolean displayMiscSpellBook = false;
	public static boolean displayTeleportSpellBook = false;
	
	public HUDSkillsTab(Minecraft mc)
	{
		super();
		this.mc = mc;
		this.itemRenderer = new RenderItem();
	}

	@SubscribeEvent
	public void onRender(RenderGameOverlayEvent event)
	{
		int width = event.resolution.getScaledWidth();
		int height = event.resolution.getScaledHeight();
		renderSkills(event, width, height);
	}

	public void renderSkills(RenderGameOverlayEvent event, int width, int height)
	{
		FontRenderer fontrenderer = this.mc.fontRenderer;

		if (event.isCancelable() || event.type != ElementType.EXPERIENCE)
		{
			return;
		}
				
		if (GUIRCMInterfaceSettings.interfaceSetting == 0)
		{	
			mc.renderEngine.bindTexture(new ResourceLocation("null"));
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glColor4f(0F, 0F, 0F, 0.5F);

			//drawTexturedModalRect(2, 2, 0, 0, 16, 16);

			GL11.glEnable(GL11.GL_TEXTURE_2D);

			mc.renderEngine.bindTexture(RSicons);
			GL11.glColor4f(1F, 1F, 1F, 1F);
			if (displaySkillTab) 
			{ 
				drawTexturedModalRect(2, 2, 0, 0, 16, 16); 
			}
			else 
			{
				/*mc.renderEngine.bindTexture(SkillsGui);
				drawTexturedModalRect(0, 0, 0, 0, 109, 208);*/
				//GL11.glScalef(0.5F, 0.5F, 0.5F);
				mc.renderEngine.bindTexture(HDSkillsGui);
				drawTexturedModalRect(0, 0, 0, 0, 240 / 2, 450 / 2);
				//GL11.glScalef(2F, 2F, 2F);

				drawString(fontrenderer, "Skills", 22, 6, 0xD48624);		
				int xPos1 = 23;
				int xPos2 = 26;
				int xPos3 = 29;
				int yPos = 26;

				// Attack 
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.att), xPos1, yPos, 0xFFFFFF);
				// Constitution
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.cons), xPos2 + 35, yPos, 0xFFFFFF);
				// Mining
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.mine), xPos3 + 71, yPos, 0xFFFFFF);
				// Strength
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.str), xPos1, yPos + 19, 0xFFFFFF);
				// Agility
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.agi), xPos2 + 35, yPos + 19, 0xFFFFFF);
				// Smithing
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.smith), xPos3 + 71, yPos + 19, 0xFFFFFF);
				// Defence
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.def), xPos1, yPos + 38, 0xFFFFFF);
				// Herblore
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.herb), xPos2 + 35, yPos + 38, 0xFFFFFF);
				// Fishing
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.fish), xPos3 + 71, yPos + 38, 0xFFFFFF);
				// Ranged
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.range), xPos1, yPos + 57, 0xFFFFFF);
				// Thieving
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.thiev), xPos2 + 35, yPos + 57, 0xFFFFFF);
				// Cooking
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.cook), xPos3 + 71, yPos + 57, 0xFFFFFF);
				// Prayer
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.pray), xPos1, yPos + 76, 0xFFFFFF);
				// Crafting
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.craft), xPos2 + 35, yPos + 76, 0xFFFFFF);
				// Firemaking
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.fm), xPos3 + 71, yPos + 76, 0xFFFFFF);
				// Magic
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.mage), xPos1, yPos + 95, 0xFFFFFF);
				// Fletching
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.fletch), xPos2 + 35, yPos + 95, 0xFFFFFF);
				// Woodcutting
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.wc), xPos3 + 71, yPos + 95, 0xFFFFFF);
				// Runecrafting
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.rc), xPos1, yPos + 114, 0xFFFFFF);
				// Slayer
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.slay), xPos2 + 35, yPos + 114, 0xFFFFFF);
				// Farming
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.farm), xPos3 + 71, yPos + 114, 0xFFFFFF);
				// Construction
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.con), xPos1, yPos + 133, 0xFFFFFF);
				// Hunter
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.hunt), xPos2 + 35, yPos + 133, 0xFFFFFF);
				// Summoning
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.summ), xPos3 + 71, yPos + 133, 0xFFFFFF);
				// Dungeoneering
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.dung), xPos1, yPos + 152, 0xFFFFFF);
				// Divination
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.div), xPos2 + 35, yPos + 152, 0xFFFFFF);

				// Total Level
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getTotalLvl(), xPos1 + 4, yPos + 187, 0xFFFFFF);
				
				// Combat Level
				drawString(fontrenderer, "" + (int)RCM.instance.skillHandler.getCombatLvl(), xPos1 + 65, yPos + 187, 0xFFFFFF);

				// Goldpoints in Pouch
				String gpInPouch = "gp in pouch: " + RCM.instance.gpHandler.getEnumChatFormatting() + RCM.instance.gpHandler.getGoldPointsDisplay() + EnumChatFormatting.RESET;
				drawString(fontrenderer, gpInPouch, 5, 194, 0xFFFFFF);
				
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
			}	
			if (displaySkillTabMsg) 
			{
				drawString(fontrenderer, "press ctrl + 'F' to open", 19, 1, 0xFFFFFF);
				drawString(fontrenderer, "the Skills Tab.", 19, 10, 0xFFFFFF);
			}
		}
		
		else if (GUIRCMInterfaceSettings.interfaceSetting == 1)
		{
			GL11.glScalef(0.5F, 0.5F, 0.5F);
			
			mc.renderEngine.bindTexture(new ResourceLocation("null"));
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glColor4f(0F, 0F, 0F, 0.5F);

			//drawTexturedModalRect(2, 2, 0, 0, 16, 16);

			GL11.glEnable(GL11.GL_TEXTURE_2D);

			mc.renderEngine.bindTexture(RSicons);
			GL11.glColor4f(1F, 1F, 1F, 1F);
			if (displaySkillTab) 
			{ 
				drawTexturedModalRect(2, 2, 0, 0, 16, 16); 
			}
			else 
			{
//				mc.renderEngine.bindTexture(SkillsGui);
//				drawTexturedModalRect(0, 0, 0, 0, 109, 208);
				//GL11.glScalef(0.5F, 0.5F, 0.5F);
				mc.renderEngine.bindTexture(HDSkillsGui);
				drawTexturedModalRect(0, 0, 0, 0, 240 / 2, 450 / 2);
				//GL11.glScalef(2F, 2F, 2F);
				
				drawString(fontrenderer, "Skills", 22, 6, 0xD48624);			
				int xPos1 = 23;
				int xPos2 = 26;
				int xPos3 = 29;
				int yPos = 26;

				// Attack 
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.att), xPos1, yPos, 0xFFFFFF);
				// Constitution
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.cons), xPos2 + 35, yPos, 0xFFFFFF);
				// Mining
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.mine), xPos3 + 71, yPos, 0xFFFFFF);
				// Strength
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.str), xPos1, yPos + 19, 0xFFFFFF);
				// Agility
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.agi), xPos2 + 35, yPos + 19, 0xFFFFFF);
				// Smithing
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.smith), xPos3 + 71, yPos + 19, 0xFFFFFF);
				// Defence
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.def), xPos1, yPos + 38, 0xFFFFFF);
				// Herblore
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.herb), xPos2 + 35, yPos + 38, 0xFFFFFF);
				// Fishing
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.fish), xPos3 + 71, yPos + 38, 0xFFFFFF);
				// Ranged
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.range), xPos1, yPos + 57, 0xFFFFFF);
				// Thieving
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.thiev), xPos2 + 35, yPos + 57, 0xFFFFFF);
				// Cooking
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.cook), xPos3 + 71, yPos + 57, 0xFFFFFF);
				// Prayer
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.pray), xPos1, yPos + 76, 0xFFFFFF);
				// Crafting
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.craft), xPos2 + 35, yPos + 76, 0xFFFFFF);
				// Firemaking
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.fm), xPos3 + 71, yPos + 76, 0xFFFFFF);
				// Magic
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.mage), xPos1, yPos + 95, 0xFFFFFF);
				// Fletching
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.fletch), xPos2 + 35, yPos + 95, 0xFFFFFF);
				// Woodcutting
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.wc), xPos3 + 71, yPos + 95, 0xFFFFFF);
				// Runecrafting
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.rc), xPos1, yPos + 114, 0xFFFFFF);
				// Slayer
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.slay), xPos2 + 35, yPos + 114, 0xFFFFFF);
				// Farming
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.farm), xPos3 + 71, yPos + 114, 0xFFFFFF);
				// Construction
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.con), xPos1, yPos + 133, 0xFFFFFF);
				// Hunter
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.hunt), xPos2 + 35, yPos + 133, 0xFFFFFF);
				// Summoning
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.summ), xPos3 + 71, yPos + 133, 0xFFFFFF);
				// Dungeoneering
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.dung), xPos1, yPos + 152, 0xFFFFFF);
				// Divination
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.div), xPos2 + 35, yPos + 152, 0xFFFFFF);
				
				// Total Level
				drawString(fontrenderer, "" + RCM.instance.skillHandler.getTotalLvl(), xPos1 + 4, yPos + 187, 0xFFFFFF);
				
				// Combat Level
				drawString(fontrenderer, "" + (int)RCM.instance.skillHandler.getCombatLvl(), xPos1 + 65, yPos + 187, 0xFFFFFF);
				
				// Goldpoints in Pouch
				String gpInPouch = "gp in pouch: " + RCM.instance.gpHandler.getEnumChatFormatting() + RCM.instance.gpHandler.getGoldPointsDisplay() + EnumChatFormatting.RESET;
				drawString(fontrenderer, gpInPouch, 5, 194, 0xFFFFFF);
				
				GL11.glScalef(0.25F, 0.25F, 0.25F);
				
				mc.renderEngine.bindTexture(Skills1);
				drawTexturedModalRect(xPos1, yPos + 60, 0, 0, 64, 64);
				drawTexturedModalRect(xPos1 + 155, yPos + 60, 64, 0, 64, 64);
				drawTexturedModalRect(xPos1 + 310, yPos + 60, 128, 0, 64, 64);
				drawTexturedModalRect(xPos1 - 15, yPos + 135, 192, 0, 64, 64);
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
			}	
			if (displaySkillTabMsg) 
			{
				drawString(fontrenderer, "press ctrl + 'F' to open", 19, 1, 0xFFFFFF);
				drawString(fontrenderer, "the Skills Tab.", 19, 10, 0xFFFFFF);
			}
			
			GL11.glScalef(2F, 2F, 2F);
		}
	}
}