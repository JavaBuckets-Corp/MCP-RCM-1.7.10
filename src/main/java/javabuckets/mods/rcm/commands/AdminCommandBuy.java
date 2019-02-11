package javabuckets.mods.rcm.commands;

import java.util.List;

import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.BuyCommandUtil;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;

public class AdminCommandBuy extends CommandBase
{

	public String getCommandName() 
	{
		return "buy";
	}

	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "/buy <player> <item.name> <amount>";
	}

	public void processCommand(ICommandSender icommandsender, String[] astring) 
	{
		if (astring.length < 3)
        {
            throw new WrongUsageException("Usage: /buy <player> <item.name> <amount>", new Object[0]);
        }
        else
        {
            EntityPlayerMP entityplayermp = getPlayer(icommandsender, astring[0]);
            Item item = getItemByText(icommandsender, astring[1]);
            int i = 1;

            // Amount
            if (astring.length >= 3)
            {
                i = parseIntBounded(icommandsender, astring[2], 1, 64);
            }
            
            ItemStack itemstack = new ItemStack(item, i, 0);

            if (doesPlayerHaveRequiredGPForItem(item, Integer.valueOf(astring[2])))
            {
            	EntityItem entityitem = entityplayermp.dropPlayerItemWithRandomChoice(itemstack, false);
                entityitem.delayBeforeCanPickup = 0;
                entityitem.func_145797_a(entityplayermp.getCommandSenderName());
                func_152373_a(icommandsender, this, "Succesfully bought you your item(s)!", new Object[] {itemstack.func_151000_E(), Integer.valueOf(i), entityplayermp.getCommandSenderName()});
                RCM.instance.gpHandler.removeGoldPointsFromPouch(BuyCommandUtil.getPriceOfItem(item) * Integer.valueOf(astring[2]));

            }
            else
            {
            	func_152373_a(icommandsender, this, "You don't have enough gp to buy these items!", new Object[] {itemstack.func_151000_E(), Integer.valueOf(i), entityplayermp.getCommandSenderName()});
            }
        }
	}
	
	public boolean doesPlayerHaveRequiredGPForItem(Item item, int amount)
	{
		if (RCM.instance.gpHandler.getGoldPointsInPouch() >= BuyCommandUtil.getPriceOfItem(item) * amount)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public List addTabCompletionOptions(ICommandSender par1iCommandSender, String[] astring) 
	{
		if (astring.length == 1)
		{
			return getListOfStringsMatchingLastWord(astring, this.getPlayers());
		}
		if (astring.length == 2)
		{
			return getListOfStringsMatchingLastWord(astring, BuyCommandUtil.itemBuyableList.toArray(new String[BuyCommandUtil.itemBuyableList.size()]));
		}
		return null;
	}
	
    protected String[] getPlayers()
    {
        return MinecraftServer.getServer().getAllUsernames();
    }
    
    public boolean isUsernameIndex(String[] astring, int i)
    {
        return i == 0;
    }
}