package javabuckets.mods.rcm.handlers;

import javabuckets.mods.rcm.utility.DateUtil;
import net.minecraft.nbt.NBTTagCompound;

public class DailyGiftHandler 
{
	private String date = DateUtil.getDateToday();
	
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		par1NBTTagCompound.setString("Date", date);
	}
	
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		date = par1NBTTagCompound.getString("Date");
	}
	
	// Last login date
	public String getDate() 
	{
		return date;
	}
	
	public void setDate(String date) 
	{
		this.date = date;
	}
}