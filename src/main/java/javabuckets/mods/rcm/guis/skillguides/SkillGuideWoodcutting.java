package javabuckets.mods.rcm.guis.skillguides;

import javabuckets.mods.rcm.guis.GUICustomButton;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.Reference;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class SkillGuideWoodcutting extends SkillGuideBase 
{
	private String subject = "Logs";
	private int page = 1;
	
	public static final ResourceLocation skillGuide = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/rcmskillguide3.png");
	
	public static final ResourceLocation woodcuttingGuide_LOGS_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_woodcutting_logs_1.png");
	public static final ResourceLocation woodcuttingGuide_LOGS_2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_woodcutting_logs_2.png");
	
	public static final ResourceLocation woodcuttingGuide_HATCHETS_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_woodcutting_hatchets_1.png");
	public static final ResourceLocation woodcuttingGuide_HATCHETS_2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_woodcutting_hatchets_2.png");

	public SkillGuideWoodcutting()
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

		this.buttonList.add(new GUICustomButton(3, 20, 48, 75, 14, "Everything"));
		this.buttonList.add(new GUICustomButton(4, 20, 64, 75, 14, "Logs"));
		this.buttonList.add(new GUICustomButton(5, 20, 80, 75, 14, "Hatchets"));
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
				if (page > 2) { page--; }
				else { page = 1; }
				break;
			}

			case 2:
			{
				if (page < 2) { page++; }
				else { page = 3; }
				break;
			}
			
			case 3:
			{
				subject = "Everything";
				page = 1;
				break;
			}
			
			case 4:
			{
				subject = "Logs";
				page = 1;
				break;
			}
			
			case 5:
			{
				subject = "Hatchets";
				page = 1;
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

		if (subject == "Everything")
		{
			if (page == 1)
			{
				
			}
			else if (page == 2)
			{
				
			}
			else if (page == 3)
			{
				
			}
		}
		
		else if (subject == "Logs")
		{
			if (page == 1)
			{
				
			}
			else if (page == 2)
			{
				
			}
			else if (page == 3)
			{
				
			}
		}
		
		else if (subject == "Hatchets")
		{
			if (page == 1)
			{
				mc.renderEngine.bindTexture(woodcuttingGuide_HATCHETS_1);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 1", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Wooden Hatchet", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 1", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Gold Hatchet", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 3", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Stone Hatchet", 245, 103, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 5", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Bronze Hatchet", 245, 126, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 10", 205, 149, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Iron Hatchet", 245, 149, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 15", 205, 172, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Steel Hatchet", 245, 172, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 18", 205, 195, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Black Hatchet", 245, 195, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 21", 205, 218, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Diamond Hatchet", 245, 218, 0xFFFFFF);
			}
			else if (page == 2)
			{
				mc.renderEngine.bindTexture(woodcuttingGuide_HATCHETS_2);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 25", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Mithril Hatchet", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 31", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Adamant Hatchet", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 41", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Rune Hatchet", 245, 103, 0xFFFFFF);
				
				this.drawString(mc.fontRenderer, "Lvl. 61", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Dragon Hatchet", 245, 126, 0xFFFFFF);
			}
			else if (page == 3) { }
		}

		this.drawCenteredString(mc.fontRenderer, "Woodcutting Guide", 151, 19, 0xD48624);
				
		super.drawScreen(par1, par2, par3);
	}
}