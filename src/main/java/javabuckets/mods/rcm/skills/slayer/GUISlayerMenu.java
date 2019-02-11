package javabuckets.mods.rcm.skills.slayer;

import javabuckets.mods.rcm.main.RCM;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class GUISlayerMenu extends GuiScreen
{
	public GUISlayerMenu() 
	{
		
	}
	
	public void initGui() 
	{
		buttonList.clear();
		
		/*this.buttonList.add(new GuiCustomButton(0, width / 2 - 16, height - 16, 15, 15, "1"));
		this.buttonList.add(new GuiCustomButton(1, width / 2, height - 16, 15, 15, "2"));
		this.buttonList.add(new GuiCustomButton(2, width / 2 + 16, height - 16, 15, 15, "3"));*/
	}
	
	protected void actionPerformed(GuiButton button) 
	{
		EntityPlayer player = (EntityPlayer)Minecraft.getMinecraft().thePlayer;
		
		switch (button.id)
		{
			/*case 0:
			{
				RCM.instance.assignmentHandler.assignRandomSlayerTask(player , 1);
				break;
			}
			case 1:
			{
				RCM.instance.assignmentHandler.assignRandomSlayerTask(player , 2);
				break;
			}
			case 2:
			{
				RCM.instance.assignmentHandler.assignRandomSlayerTask(player , 3);
				break;
			}*/
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
		this.drawDefaultBackground();
		
		this.mc.renderEngine.bindTexture(new ResourceLocation("null"));
		GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glColor4f(0F, 0F, 0F, 0.3F);
        this.drawTexturedModalRect(width / 2 - 120, 0, 0, 0, 240, height);
        
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glColor4f(1F, 1F, 1F, 1F);
        
        this.drawCenteredString(mc.fontRenderer, "Slayer Menu", width / 2, 7, 0xFFFFFF);
        this.drawCenteredString(mc.fontRenderer, "----------------------------------", width / 2, 18, 0xFFFFFF);
        
        
        this.drawCenteredString(mc.fontRenderer, "Current Slayer Task", width / 2, 40, 0xFFFFFF);
        if (!RCM.instance.slayer.isPlayerAssignedWithSlayerTask()) { } else {
        this.drawCenteredString(mc.fontRenderer, "Kill " + RCM.instance.slayer.getSlayerTaskKillsRemaining() + " " + EnumChatFormatting.DARK_RED + RCM.instance.slayer.getSlayerTask() + "s", width / 2, 54, 0xFFFFFF); }
		
        this.drawCenteredString(mc.fontRenderer, "Current Boss Task", width / 2, 80, 0xFFFFFF);
        if (!RCM.instance.slayer.isPlayerAssignedWithSlayerBossTask()) { } else {
        this.drawCenteredString(mc.fontRenderer, "Kill " + RCM.instance.slayer.getBossTaskKillsRemaining() + " " + EnumChatFormatting.DARK_RED + RCM.instance.slayer.getBossTask() + "es", width / 2, 94, 0xFFFFFF); }
        
        
        this.drawCenteredString(mc.fontRenderer, "----------------------------------", width / 2, 120, 0xFFFFFF);
        
        
        this.drawString(mc.fontRenderer, "Total Slayer Tasks Completed: " + RCM.instance.slayer.getSlayerTasksCompleted(), width / 4 + 20, 142, 0xFFFFFF);
        this.drawString(mc.fontRenderer, "Total Slayer Tasks Completed In a Row: " + RCM.instance.slayer.getSlayerTasksInARow(), width / 4 + 20, 152, 0xFFFFFF);
        this.drawString(mc.fontRenderer, "Total Slayer Kills: " + RCM.instance.slayer.getSlayerKillsTotal(), width / 4 + 20, 162, 0xFFFFFF);
        
        this.drawString(mc.fontRenderer, "Total Boss Tasks Completed: " + RCM.instance.slayer.getBossTasksCompleted(), width / 4 + 20, 200, 0xFFFFFF);
        this.drawString(mc.fontRenderer, "Total Boss Tasks Completed In a Row: " + RCM.instance.slayer.getBossTasksInARow(), width / 4 + 20, 210, 0xFFFFFF);
        this.drawString(mc.fontRenderer, "Total Slayer Boss Kills: " + RCM.instance.slayer.getBossKillsTotal(), width / 4 + 20, 220, 0xFFFFFF);
        
        //this.drawCenteredString(mc.fontRenderer, "Assign Random Slayer Task from Tier", width / 2, height - 20, 0xFFFFFF);
        
		super.drawScreen(par1, par2, par3);
	}
}