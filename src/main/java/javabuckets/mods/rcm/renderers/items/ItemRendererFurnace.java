package javabuckets.mods.rcm.renderers.items;

import javabuckets.mods.rcm.blocks.tileentities.TileEntityRSFurnace;
import javabuckets.mods.rcm.models.ModelFurnace;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRendererFurnace implements IItemRenderer
{
	private ModelFurnace model;
	
	public ItemRendererFurnace() 
	{
		model = new ModelFurnace();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityRSFurnace(), 0, 0, 0, 0);
	}
}