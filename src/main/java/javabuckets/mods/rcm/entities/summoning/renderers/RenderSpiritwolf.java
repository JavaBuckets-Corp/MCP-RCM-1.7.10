package javabuckets.mods.rcm.entities.summoning.renderers;

import javabuckets.mods.rcm.entities.summoning.FamiliarSpiritwolf;
import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSpiritwolf extends RenderLiving
{

	private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MOD_ID, "textures/entities/spirit_wolf.png");

	public RenderSpiritwolf(ModelBase par1ModelBase, float par2) 
	{
		super(par1ModelBase, par2);
	}

	protected ResourceLocation getEntityTexture(FamiliarSpiritwolf entity)
	{
		return mobTextures;
	}

	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return this.getEntityTexture((FamiliarSpiritwolf)entity);
	}
}