package javabuckets.mods.rcm.renderers.items;

import javabuckets.mods.rcm.blocks.tileentities.TileEntityPrayerAltar;
import javabuckets.mods.rcm.models.ModelPrayerAltar;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderPrayerAltar implements IItemRenderer
{
	private ModelPrayerAltar model;
	
	public ItemRenderPrayerAltar() 
	{
		model = new ModelPrayerAltar();
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
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityPrayerAltar(), 0, 0, 0, 0);
	}
}