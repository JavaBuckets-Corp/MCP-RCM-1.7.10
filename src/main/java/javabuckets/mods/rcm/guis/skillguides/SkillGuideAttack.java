package javabuckets.mods.rcm.guis.skillguides;

import javabuckets.mods.rcm.guis.GUICustomButton;
import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class SkillGuideAttack extends SkillGuideBase
{
	public int page = 1;
	
	public static final ResourceLocation skillGuide = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/rcmskillguide3.png");
	
	public static final ResourceLocation attackGuide_PAGE_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/attackguide_page1.png");
	public static final ResourceLocation attackGuide_PAGE_2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/attackguide_page2.png");
	
	public SkillGuideAttack()
	{
		super(true);
	}
	
	@Override
	public void initGui() 
	{
		super.initGui();
		
		this.buttonList.add(new GUICustomButton(0, 118, 215, 50, 14, "Go Back"));
		
		this.buttonList.add(new GUICustomButton(1, 235, 8, 12, 12, "<"));
		this.buttonList.add(new GUICustomButton(2, 250, 8, 12, 12, ">"));
	}
	
	@Override
	protected void actionPerformed(GuiButton button) 
	{
		super.actionPerformed(button);
		
		switch(button.id)
		{
			case 0:
			{
				mc.displayGuiScreen(new GUISkillGuides());
				break;
			}
		
			case 1:
			{
				page = 1;
				break;
			}
			
			case 2:
			{
				page = 2;
				break;
			}
		}
	}

	public void drawScreen(int par1, int par2, float par3)
	{
		this.drawDefaultBackground();

		GL11.glEnable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1F, 1F, 1F, 1F);
		GL11.glEnable(GL11.GL_TEXTURE_2D);


		GL11.glScalef(2F, 2F, 2F);


		mc.renderEngine.bindTexture(skillGuide);
		drawTexturedModalRect(50, 5, 0, 0, 512, 512);


		GL11.glScalef(0.5F, 0.5F, 0.5F);

		if (page == 1)
		{
			mc.renderEngine.bindTexture(attackGuide_PAGE_1);
			drawTexturedModalRect(0, 0, -100, -10, 256, 256);

			this.drawString(mc.fontRenderer, "Lvl. 1", 205, 57, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Bronze Weaponry", 245, 57, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 5", 205, 80, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Stone Weaponry", 245, 80, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 10", 205, 103, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Iron Weaponry", 245, 103, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 20", 205, 126, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Steel Weaponry", 245, 126, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 25", 205, 149, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Black Weaponry", 245, 149, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 25", 205, 172, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "White Weaponry", 245, 172, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 27", 205, 195, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Diamond Weaponry", 245, 195, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 30", 205, 218, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Mithril Weaponry", 245, 218, 0xFFFFFF);
		}
		else if (page == 2)
		{
			mc.renderEngine.bindTexture(attackGuide_PAGE_2);
			drawTexturedModalRect(0, 0, -100, -10, 256, 256);
			
			this.drawString(mc.fontRenderer, "Lvl. 40", 205, 57, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Adamant Weaponry", 245, 57, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 50", 205, 80, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Rune Weaponry", 245, 80, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 60", 205, 103, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Dragon Weaponry", 245, 103, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 70", 205, 126, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Abyssal Whip", 245, 126, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 75", 205, 149, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "God Swords", 245, 149, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 80", 205, 172, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Chaotic Weaponry", 245, 172, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 90", 205, 195, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Drygore Weaponry", 245, 195, 0xFFFFFF);

			this.drawString(mc.fontRenderer, "Lvl. 99", 205, 218, 0xFFFFFF);
			this.drawString(mc.fontRenderer, "Skill Mastery", 245, 218, 0xFFFFFF);
		}

		this.drawCenteredString(mc.fontRenderer, "Attack Guide", 151, 19, 0xD48624);

		super.drawScreen(par1, par2, par3);
	}
}