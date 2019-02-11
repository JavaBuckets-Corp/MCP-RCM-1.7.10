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

public class SkillGuideDefence extends SkillGuideBase 
{
	private String subject = "Armors";
	private int page = 1;
	
	public static final ResourceLocation skillGuide = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/rcmskillguide3.png");
	
	public static final ResourceLocation defenceGuide_EVERYTHING_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_defence_everything_1.png");
	public static final ResourceLocation defenceGuide_EVERYTHING_2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_defence_everything_2.png");
	
	public static final ResourceLocation defenceGuide_MILESTONE_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_defence_milestone_1.png");
	public static final ResourceLocation defenceGuide_MILESTONE_2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_defence_milestone_2.png");
	
	public static final ResourceLocation defenceGuide_ARMORS_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_defence_armors_1.png");
	public static final ResourceLocation defenceGuide_ARMORS_2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_defence_armors_2.png");
	public static final ResourceLocation defenceGuide_ARMORS_3 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_defence_armors_3.png");
	public static final ResourceLocation defenceGuide_ARMORS_4 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_defence_armors_4.png");
	public static final ResourceLocation defenceGuide_ARMORS_5 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/skillguide_defence_armors_5.png");

	public SkillGuideDefence()
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
		this.buttonList.add(new GUICustomButton(4, 20, 64, 75, 14, "Milestone"));
		this.buttonList.add(new GUICustomButton(5, 20, 80, 75, 14, "Armors"));
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
				// Back
				if (page > 2) { page--; }
				else { page = 1; }
				break;
			}

			case 2:
			{
				// Forward
				if (page < 4) { page++; }
				else { page = 5; }
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
				subject = "Milestone";
				page = 1;
				break;
			}
			
			case 5:
			{
				subject = "Armors";
				page = 1;
				break;
			}
		}
	}

	public void drawScreen(int par1, int par2, float par3)
	{
		this.drawDefaultBackground();

		GL11.glEnable(GL11.GL_BLEND);
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
			else if (page == 4)
			{
				
			}
			else if (page == 5)
			{
				
			}
		}
		
		else if (subject == "Milestone")
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
			else if (page == 4)
			{
				
			}
			else if (page == 5)
			{
				
			}
		}
		
		else if (subject == "Armors")
		{
			if (page == 1)
			{
				mc.renderEngine.bindTexture(defenceGuide_ARMORS_1);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 1", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Bronze Armor", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 1", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Leather Armor", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 1", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Wizard Robes", 245, 103, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 10", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Iron Armor", 245, 126, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 10", 205, 149, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Hard lr. Armor", 245, 149, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 10", 205, 172, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Imphide Robes", 245, 172, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 20", 205, 195, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Steel Armor", 245, 195, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 20", 205, 218, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Studded lr. Armor", 245, 218, 0xFFFFFF);
			}
			else if (page == 2)
			{
				mc.renderEngine.bindTexture(defenceGuide_ARMORS_2);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 20", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Spider Silk Robes", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 25", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Black Armor", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 25", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "White Armor", 245, 103, 0xFFFFFF);
				
				this.drawString(mc.fontRenderer, "Lvl. 30", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Mithril Armor", 245, 126, 0xFFFFFF);
				
				this.drawString(mc.fontRenderer, "Lvl. 30", 205, 149, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Carapace Armor", 245, 149, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 30", 205, 172, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Mystic Robes", 245, 172, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 40", 205, 195, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Adamantite Armor", 245, 195, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 40", 205, 218, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Green Dragonhide", 245, 218, 0xFFFFFF);
			}
			else if (page == 3) 
			{
				mc.renderEngine.bindTexture(defenceGuide_ARMORS_3);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 40", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Splitbark Armor", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 50", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Runite Armor", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 50", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Blue Dragonhide", 245, 103, 0xFFFFFF);
				
				this.drawString(mc.fontRenderer, "Lvl. 50", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Batwing Robes", 245, 126, 0xFFFFFF);
				
				this.drawString(mc.fontRenderer, "Lvl. 55", 205, 149, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Granite Armor", 245, 149, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 55", 205, 172, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Red Dragonhide", 245, 172, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 55", 205, 195, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Infinity Robes", 245, 195, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 60", 205, 218, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Dragon Armor", 245, 218, 0xFFFFFF);
			}
			else if (page == 4) 
			{
				mc.renderEngine.bindTexture(defenceGuide_ARMORS_4);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 60", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Black Dragonhide", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 60", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Grifolic Armor", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 70", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Bandos Armor", 245, 103, 0xFFFFFF);
				
				this.drawString(mc.fontRenderer, "Lvl. 70", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Armadyl Armor", 245, 126, 0xFFFFFF);
				
				this.drawString(mc.fontRenderer, "Lvl. 70", 205, 149, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Robes of Subj.", 245, 149, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 80", 205, 172, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Torva Armor", 245, 172, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 80", 205, 195, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Pernix Armor", 245, 195, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 80", 205, 218, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Virtus Armor", 245, 218, 0xFFFFFF);
			}
		}
		else if (page == 5)
		{
			
		}

		this.drawCenteredString(mc.fontRenderer, "Defence Guide", 151, 19, 0xD48624);
				
		super.drawScreen(par1, par2, par3);
	}
}