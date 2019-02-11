package javabuckets.mods.rcm.player;

import javabuckets.mods.rcm.main.RCM;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties
{
	public final static String EXT_PROP_NAME = "ExtendedPlayer";
	private final EntityPlayer player;

	public ExtendedPlayer(EntityPlayer player)
	{
		this.player = player;
	}

	/**
	 * Used to register these extended properties for the player during EntityConstructing event
	 */
	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer(player));
	}

	/**
	 * Returns ExtendedPlayer properties for player
	 */
	public static final ExtendedPlayer get(EntityPlayer player)
	{
		return (ExtendedPlayer)player.getExtendedProperties(EXT_PROP_NAME);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound)
	{
		NBTTagCompound properties = new NBTTagCompound();
		RCM.instance.skillHandler.writeToNBT(properties);
		/*RCM.instance.gpHandler.writeToNBT(properties);
		RCM.instance.combat.writeToNBT(properties);
		RCM.instance.magic.writeToNBT(properties);
		RCM.instance.slayer.writeToNBT(properties);
		RCM.instance.prayer.writeToNBT(properties);
		RCM.instance.summoning.writeToNBT(properties);
		
		RCM.instance.dailyGiftHandler.writeToNBT(properties);
		RCM.instance.playerBonuses.writeToNBT(properties);
		RCM.instance.dailies.writeToNBT(properties);*/

		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound)
	{
		NBTTagCompound properties = (NBTTagCompound)compound.getTag(EXT_PROP_NAME);	
		RCM.instance.skillHandler.readFromNBT(properties);
		/*RCM.instance.gpHandler.readFromNBT(properties);
		RCM.instance.combat.readFromNBT(properties);
		RCM.instance.magic.readFromNBT(properties);
		RCM.instance.slayer.readFromNBT(properties);
		RCM.instance.prayer.readFromNBT(properties);
		RCM.instance.summoning.readFromNBT(properties);
		
		RCM.instance.dailyGiftHandler.readFromNBT(properties);
		RCM.instance.playerBonuses.readFromNBT(properties);
		RCM.instance.dailies.readFromNBT(properties);*/
	}
	
	@Override
	public void init(Entity entity, World world)
	{

	}	
}