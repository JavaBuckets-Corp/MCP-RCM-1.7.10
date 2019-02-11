package javabuckets.mods.rcm.guis;

import java.util.Random;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.DateUtil;
import javabuckets.mods.rcm.utility.LogHelper;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class GUIDailyGift extends GuiScreen
{
	private EntityPlayer player;
	
	public GUIDailyGift(EntityPlayer player) 
	{
		this.player = player;
	}
	
	public void initGui() 
	{
		buttonList.clear();
		
		this.buttonList.add(new GUICustomButton(0, width / 2 - 50, height / 2 - 10, 100, 20, "Get Gift!"));
	}
	
	protected void actionPerformed(GuiButton button) 
	{
		Random rand = new Random();
		
		switch (button.id)
		{
			case 0:
			{
				if (RCM.instance.dailyGiftHandler.getDate() == DateUtil.getDate())
				{
					this.player.addChatMessage(new ChatComponentText("You have already been given a daily gift!"));
				}
				else
				{
					processReward();
				}
				
				this.closeGui();
			}
		}
	}
	
	private void processReward() 
	{
		double rand = Math.random();
		
		if (rand > 0.5) {
			giveEnchantingXP();
		}
		else {
			giveCoins();
		}
	}
	
	private void giveEnchantingXP()
	{
		Random rand = new Random();
		int reward = rand.nextInt(300000);
		
		this.player.experienceTotal += reward;
		LogHelper.info(reward + " xp was achieved for the player, " + this.player.getDisplayName() + ", via daily gift.");
		this.player.addChatMessage(new ChatComponentText("You have just been rewarded " + reward + " xp!"));
	}
	
	private void giveCoins()
	{
		Random rand = new Random();
		int coins = rand.nextInt(20000);
		int combatLvl = (int)RCM.instance.skillHandler.getCombatLvl();
		
		long reward = (long)(combatLvl / 3 * coins);
		
		RCM.instance.gpHandler.addGPToPouch(reward);
		LogHelper.info(reward + " gp has been added to the player's (" + this.player.getDisplayName() + ") pouch.");
		this.player.addChatMessage(new ChatComponentText(reward + " gp has been added to your pouch!"));
	}

	public void closeGui()
	{
		this.mc.displayGuiScreen((GuiScreen)null);
		this.mc.setIngameFocus();
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
		
		this.drawCenteredString(mc.fontRenderer, "Daily's Gift's!", width / 2, 15, 0xFFFFFF);
		
		super.drawScreen(par1, par2, par3);
	}
}