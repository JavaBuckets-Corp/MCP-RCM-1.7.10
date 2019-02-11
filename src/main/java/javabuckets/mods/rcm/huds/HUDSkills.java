package javabuckets.mods.rcm.huds;

import org.lwjgl.opengl.GL11;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.DateUtil;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.Reference;
import javabuckets.mods.rcm.utility.SkillHUDUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class HUDSkills extends Gui
{
	private Minecraft mc;
	private RenderItem itemRenderer;
	
	public static final ResourceLocation skillhud = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillhud.png");
	public static final ResourceLocation skills1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skills1.png");
	public static final ResourceLocation skills2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skills2.png");

	public HUDSkills(Minecraft mc)
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
		renderXP(event, width, height);
	}

	public void renderSkills(RenderGameOverlayEvent event, int width, int height)
	{
		if (event.isCancelable() || event.type != ElementType.EXPERIENCE)
		{
			return;
		}
		
		/*this.drawCenteredString(mc.fontRenderer, RCM.instance.dailyGiftHandler.getDate(), width / 2, 15, 0xFFFFFF);
		this.drawCenteredString(mc.fontRenderer, DateUtil.getDateToday(), width / 2, 25, 0xFFFFFF);
		
		if (!(RCM.instance.dailyGiftHandler.getDate().equals(DateUtil.getDateToday())))
		{
			this.drawCenteredString(mc.fontRenderer, "false", width / 2, height / 2, 0xffffff);
		}
		else
		{
			this.drawCenteredString(mc.fontRenderer, "true", width / 2, height / 2, 0xffffff);
		}*/

		if (RCM.instance.skill.showSkillHUD)
		{
			/*this.drawCenteredString(this.mc.fontRenderer, skillToShow + " Level: " + RCM.instance.skillHandler.getLevel(skillToShow), width / 2, 50, 0xFFFFFF);
			this.drawCenteredString(this.mc.fontRenderer, skillToShow + " Experience: " + RCM.instance.skillHandler.getExperience(skillToShow) + "xp", width / 2, 62, 0xFFFFFF);*/
			
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			
			int x = SkillHUDUtil.getXFromSkill(skillToShow);
			int y = SkillHUDUtil.getYFromSkill(skillToShow);
			
		GL11.glScalef(0.25F, 0.25F, 0.25F);	
			mc.renderEngine.bindTexture(skillhud);
			this.drawTexturedModalRect(width*2-(width/15), 10, 0, 0, 80, 80);
		GL11.glScalef(4F, 4F, 4F);
		GL11.glScalef(0.2F, 0.2F, 0.2F);	
			if (SkillHUDUtil.getSkillTextureCategory(skillToShow) == 1) { mc.renderEngine.bindTexture(skills1); }
			else if (SkillHUDUtil.getSkillTextureCategory(skillToShow) == 2) { mc.renderEngine.bindTexture(skills2); }
			else { mc.renderEngine.bindTexture(skills1); }
			this.drawTexturedModalRect(width*2+(width/2)-20, 30, x, y, 64, 64);	
		GL11.glScalef(5F, 5F, 5F);
		}
	}
	
	private static boolean shouldShowXPAdded = false;
	private static int showTimer = 50;
	
	private static double xpToShow;
	private static String skillToShow;
	
	public void renderXP(RenderGameOverlayEvent event, int width, int height)
	{
		if (event.isCancelable() || event.type != ElementType.EXPERIENCE)
		{
			return;
		}
		
		if (shouldShowXPAdded)
		{
			this.drawCenteredString(this.mc.fontRenderer, "+" + (int)xpToShow + "xp", width / 2, 35 + showTimer, 0xFFFFFF);
			
			showTimer--;
			
			if (showTimer < 0)
			{
				resetXPToDisplay();
			}
		}
	}
	
	public static void addXPToDisplay(String skill, double xp)
	{
		shouldShowXPAdded = true;
		xpToShow = xp;
		handleSkillString(skill);
	}
	
	public static void resetXPToDisplay() 
	{
		shouldShowXPAdded = false;
		showTimer = 50;
	}
	
	public static void handleSkillString(String skill)
	{
		String s = skill.toUpperCase().substring(0, 1);
		String s2 = skill.substring(1);
		String s3 = s + s2;
		
		skillToShow = s3;
	}
}