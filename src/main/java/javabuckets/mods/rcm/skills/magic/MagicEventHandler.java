package javabuckets.mods.rcm.skills.magic;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;

public class MagicEventHandler 
{
	@SubscribeEvent
	public void onItemRightClick(PlayerUseItemEvent event)
	{
		/*EntityPlayer player = event.entityPlayer;
		World world = player.worldObj;
		ItemStack item = event.item;

		if (item.getItem() instanceof ItemStaff) 
		{
			EntityMagicBolt magicbolt = new EntityMagicBolt(world, player, 5F);
	        
	        if (!world.isRemote)
	        {
	            world.spawnEntityInWorld(magicbolt);
	        }
		}*/
	}
}