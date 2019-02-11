package javabuckets.mods.rcm.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class RCMGpHandler 
{
	private long goldPointsInPouch = 0L;
	private String gpUnit;
	private String gpToDisplay;
	
	private long gpEarnedSession = 0;
	
	public void onUpdate(EntityPlayer player, World world)
	{
		gpUpdater(player);
	}
	
	public void gpUpdater(EntityPlayer player)
	{	
		String s = gpToDisplay = getGoldPointsInPouch() + "";
		
		if (s.length() >= 6 && s.length() < 7)
		{
			gpToDisplay = gpToDisplay.substring(0, 3);
			gpUnit = "K";
			setEnumChatFormatting(EnumChatFormatting.WHITE);
		}
		else if (s.length() >= 7 && s.length() < 8)
		{
			gpToDisplay = gpToDisplay.substring(0, 4);
			gpUnit = "K";
			setEnumChatFormatting(EnumChatFormatting.WHITE);
		}
		else if (s.length() >= 8 && s.length() < 9)
		{
			gpToDisplay = gpToDisplay.substring(0, 2);
			gpUnit = "M";
			setEnumChatFormatting(EnumChatFormatting.GREEN);
		}
		else if (s.length() >= 9 && s.length() < 10)
		{
			gpToDisplay = gpToDisplay.substring(0, 3);
			gpUnit = "M";
			setEnumChatFormatting(EnumChatFormatting.GREEN);
		}
		else if (s.length() >= 10 && s.length() < 11)
		{
			gpToDisplay = gpToDisplay.substring(0, 4);
			gpUnit = "M";
			setEnumChatFormatting(EnumChatFormatting.GREEN);
		}
		else
		{
			gpUnit = "";
			setEnumChatFormatting(EnumChatFormatting.YELLOW);
		}
		
		if (getGoldPointsInPouch() > Integer.MAX_VALUE)
		{
			setGoldPointsInPouch((long)Integer.MAX_VALUE);
			player.addChatMessage(new ChatComponentText("You have reached a" + EnumChatFormatting.BOLD + EnumChatFormatting.RED + " Max Stack " + EnumChatFormatting.RESET + "in Cash!"));
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Invest" + EnumChatFormatting.RESET + ", " + EnumChatFormatting.GREEN + "Bank " + EnumChatFormatting.RESET + "or " + EnumChatFormatting.RED + "Drop " + EnumChatFormatting.RESET + "your money to start a new Stack of Cash!"));
		}
	}
	
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		par1NBTTagCompound.setLong("GPInPouch", goldPointsInPouch);
	}
	
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		goldPointsInPouch = par1NBTTagCompound.getLong("GPInPouch");
	}
	
	public void addGPToPouch(long gp)
	{
		setGoldPointsInPouch(getGoldPointsInPouch() + gp);
		gpEarnedSession+=gp;
	}
	
	public void setGoldPointsInPouch(long gp)
	{
		goldPointsInPouch = gp;
	}
	
	public Long getGoldPointsInPouch()
	{
		return goldPointsInPouch;
	}
	
	public void resetGoldPointsInPouch()
	{
		setGoldPointsInPouch(0L);
	}
	
	public String getGoldPointsInPouchUnit()
	{
		return gpUnit;
	}
	
	public String getGoldPointsDisplay()
	{
		return gpToDisplay + gpUnit;
	}
	
	public long getGpEarnedSession() 
	{
		return gpEarnedSession;
	}
	
	private EnumChatFormatting enumChatFormatting;
	
	public void setEnumChatFormatting(EnumChatFormatting enumChatFormatting)
	{
		this.enumChatFormatting = enumChatFormatting;
	}
	
	public EnumChatFormatting getEnumChatFormatting()
	{
		return this.enumChatFormatting;
	}

	public void removeGoldPointsFromPouch(long priceOfItem) 
	{
		this.setGoldPointsInPouch(this.getGoldPointsInPouch() - priceOfItem);
	}
}