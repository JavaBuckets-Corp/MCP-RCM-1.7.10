package javabuckets.mods.rcm.renderers.items;

import javabuckets.mods.rcm.blocks.tileentities.TileEntityFire;
import javabuckets.mods.rcm.models.ModelFire;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderFire implements IItemRenderer
{
	private ModelFire model;
	
	public ItemRenderFire() 
	{
		model = new ModelFire();
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
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityFire(), 0, 0, 0, 0);
	}
}