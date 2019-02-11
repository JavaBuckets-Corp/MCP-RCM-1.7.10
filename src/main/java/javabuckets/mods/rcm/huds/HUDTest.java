package javabuckets.mods.rcm.huds;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.prayer.PrayerReference;
import javabuckets.mods.rcm.utility.Reference;
import javabuckets.mods.rcm.utility.SkillReference;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class HUDTest extends Gui
{
	private Minecraft mc;
	private RenderItem itemRenderer;
	
	public HUDTest(Minecraft mc)
	{
		super();
		this.mc = mc;
		this.itemRenderer = new RenderItem();
	}
	
	@SubscribeEvent
	public void render(RenderGameOverlayEvent event)
	{
		int width = event.resolution.getScaledWidth();
		int height = event.resolution.getScaledHeight();
		renderOverlay(event, width, height);
	}
		
	public void renderOverlay(RenderGameOverlayEvent event, int width, int height)
	{
		FontRenderer fontrenderer = this.mc.fontRenderer;

		if (event.isCancelable() || event.type != ElementType.EXPERIENCE)
		{
			return;
		}
		
//		drawCenteredString(fontrenderer, "" + RCM.instance.skillHandler.getLevelB(SkillReference.def), width / 2, height / 3, 0xFFFFFF);
//		drawCenteredString(fontrenderer, "" + RCM.instance.playerBonuses.hpRestoreRate, width / 2, height / 3 - 12, 0xFFFFFF);
//		drawCenteredString(fontrenderer, "" + RCM.instance.skillHandler.getLevel(SkillReference.str) * 5 / (double)100, width / 2, height / 3, 0xFFFFFF);
		
		
	}
}