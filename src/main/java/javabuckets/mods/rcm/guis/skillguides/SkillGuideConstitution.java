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

public class SkillGuideConstitution extends SkillGuideBase 
{
	private String subject = "Everything";
	public int page = 1;
	
	public static final ResourceLocation skillGuide = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/rcmskillguide3.png");
	
	public SkillGuideConstitution()
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
			
		}
		else if (page == 2)
		{
			
		}
		else if (page == 3)
		{
			
		}

		this.drawCenteredString(mc.fontRenderer, "Constitution Guide", 151, 19, 0xD48624);
		
		super.drawScreen(par1, par2, par3);
	}
}