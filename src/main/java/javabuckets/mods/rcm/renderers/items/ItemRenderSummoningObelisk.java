package javabuckets.mods.rcm.renderers.items;

import javabuckets.mods.rcm.blocks.tileentities.TileEntitySummoningObelisk;
import javabuckets.mods.rcm.models.ModelSummoningObelisk;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderSummoningObelisk implements IItemRenderer
{
	private ModelSummoningObelisk model;
	
	public ItemRenderSummoningObelisk() 
	{
		model = new ModelSummoningObelisk();
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
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntitySummoningObelisk(), 0, 0, 0, 0);
	}
}