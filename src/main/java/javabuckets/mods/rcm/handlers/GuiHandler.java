package javabuckets.mods.rcm.handlers;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import javabuckets.mods.rcm.blocks.containers.ContainerFire;
import javabuckets.mods.rcm.blocks.containers.ContainerRSFurnace;
import javabuckets.mods.rcm.blocks.tileentities.TileEntityFire;
import javabuckets.mods.rcm.blocks.tileentities.TileEntityRSFurnace;
import javabuckets.mods.rcm.guis.GUISeedBag;
import javabuckets.mods.rcm.items.containers.ContainerSeedBag;
import javabuckets.mods.rcm.items.inventories.InventorySeedBag;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.firemaking.GuiFire;
import javabuckets.mods.rcm.skills.smithing.GUIRSFurnace;
import javabuckets.mods.rcm.skills.smithing.ModSmithingBlocks;
import javabuckets.mods.rcm.utility.GuiHandlerReference;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		switch (ID)
		{
		case GuiHandlerReference.furnaceGuiID:
			if (entity != null && entity instanceof TileEntityRSFurnace) return new ContainerRSFurnace(player.inventory, (TileEntityRSFurnace) entity);
			else return null;
		case GuiHandlerReference.fireGuiID:
			if (entity != null && entity instanceof TileEntityFire) return new ContainerFire(player.inventory, (TileEntityFire) entity);
			else return null;
		case GuiHandlerReference.seedBagGuiID:
			return new ContainerSeedBag(player, player.inventory, new InventorySeedBag(player.getHeldItem()));
		default:
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		switch (ID)
		{
		case GuiHandlerReference.furnaceGuiID:
			if (entity != null && entity instanceof TileEntityRSFurnace) return new GUIRSFurnace(player.inventory, (TileEntityRSFurnace) entity);
			else return null;
		case GuiHandlerReference.fireGuiID:
			if (entity != null && entity instanceof TileEntityFire) return new GuiFire(player.inventory, (TileEntityFire) entity);
			else return null;
		case GuiHandlerReference.seedBagGuiID:
			return new GUISeedBag((ContainerSeedBag) new ContainerSeedBag(player, player.inventory, new InventorySeedBag(player.getHeldItem())));
		default:
			return null;
		}
	}
}