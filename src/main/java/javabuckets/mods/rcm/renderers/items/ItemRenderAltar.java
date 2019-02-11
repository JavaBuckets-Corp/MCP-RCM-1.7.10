package javabuckets.mods.rcm.renderers.items;

import javabuckets.mods.rcm.blocks.tileentities.TileEntityAltarAir;
import javabuckets.mods.rcm.models.ModelAltar;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderAltar implements IItemRenderer
{
	private ModelAltar model;
	
	public ItemRenderAltar() 
	{
		model = new ModelAltar();
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
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityAltarAir(), 0, 0, 0, 0);
	}
}