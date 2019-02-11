package javabuckets.mods.rcm.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAltar extends ModelBase
{
	//fields
	ModelRenderer BottomStone;
	ModelRenderer BottomStone2;
	ModelRenderer BottomStone3;
	ModelRenderer BottomStone4;
	ModelRenderer MiddleStone;
	ModelRenderer TopStone;
	ModelRenderer TopStone2;
	ModelRenderer TopStone3;
	ModelRenderer TopStone4;
	ModelRenderer TopStone5;

	public ModelAltar()
	{
		textureWidth = 128;
		textureHeight = 64;

		BottomStone = new ModelRenderer(this, 0, 28);
		BottomStone.addBox(0F, 0F, 0F, 18, 1, 18);
		BottomStone.setRotationPoint(-9F, 23F, -9F);
		BottomStone.setTextureSize(128, 64);
		BottomStone.mirror = true;
		setRotation(BottomStone, 0F, 0F, 0F);
		BottomStone2 = new ModelRenderer(this, 0, 30);
		BottomStone2.addBox(0F, 0F, 0F, 16, 1, 16);
		BottomStone2.setRotationPoint(-8F, 22F, -8F);
		BottomStone2.setTextureSize(128, 64);
		BottomStone2.mirror = true;
		setRotation(BottomStone2, 0F, 0F, 0F);
		BottomStone3 = new ModelRenderer(this, 0, 32);
		BottomStone3.addBox(0F, 0F, 0F, 14, 1, 14);
		BottomStone3.setRotationPoint(-7F, 21F, -7F);
		BottomStone3.setTextureSize(128, 64);
		BottomStone3.mirror = true;
		setRotation(BottomStone3, 0F, 0F, 0F);
		BottomStone4 = new ModelRenderer(this, 64, 50);
		BottomStone4.addBox(0F, 0F, 0F, 12, 2, 12);
		BottomStone4.setRotationPoint(-6F, 19F, -6F);
		BottomStone4.setTextureSize(128, 64);
		BottomStone4.mirror = true;
		setRotation(BottomStone4, 0F, 0F, 0F);
		MiddleStone = new ModelRenderer(this, 88, 36);
		MiddleStone.addBox(0F, 0F, 0F, 10, 4, 10);
		MiddleStone.setRotationPoint(-5F, 15F, -5F);
		MiddleStone.setTextureSize(128, 64);
		MiddleStone.mirror = true;
		setRotation(MiddleStone, 0F, 0F, 0F);
		TopStone = new ModelRenderer(this, 0, 47);
		TopStone.addBox(0F, 0F, 0F, 16, 1, 16);
		TopStone.setRotationPoint(-8F, 9F, -8F);
		TopStone.setTextureSize(128, 64);
		TopStone.mirror = true;
		setRotation(TopStone, 0F, 0F, 0F);
		TopStone2 = new ModelRenderer(this, 60, 0);
		TopStone2.addBox(0F, 0F, 0F, 17, 1, 17);
		TopStone2.setRotationPoint(-8.5F, 9.5F, -8.5F);
		TopStone2.setTextureSize(128, 64);
		TopStone2.mirror = true;
		setRotation(TopStone2, 0F, 0F, 0F);
		TopStone3 = new ModelRenderer(this, 0, 18);
		TopStone3.addBox(0F, 0F, 0F, 16, 1, 16);
		TopStone3.setRotationPoint(-8F, 10F, -8F);
		TopStone3.setTextureSize(128, 64);
		TopStone3.mirror = true;
		setRotation(TopStone3, 0F, 0F, 0F);
		TopStone4 = new ModelRenderer(this, 64, 50);
		TopStone4.addBox(0F, 0F, 0F, 12, 2, 12);
		TopStone4.setRotationPoint(-6F, 13F, -6F);
		TopStone4.setTextureSize(128, 64);
		TopStone4.mirror = true;
		setRotation(TopStone4, 0F, 0F, 0F);
		TopStone5 = new ModelRenderer(this, 36, 32);
		TopStone5.addBox(0F, 0F, 0F, 13, 2, 13);
		TopStone5.setRotationPoint(-6.5F, 11F, -6.5F);
		TopStone5.setTextureSize(128, 64);
		TopStone5.mirror = true;
		setRotation(TopStone5, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		BottomStone.render(f5);
		BottomStone2.render(f5);
		BottomStone3.render(f5);
		BottomStone4.render(f5);
		MiddleStone.render(f5);
		TopStone.render(f5);
		TopStone2.render(f5);
		TopStone3.render(f5);
		TopStone4.render(f5);
		TopStone5.render(f5);
	}

	public void renderModel(float f5)
	{
		BottomStone.render(f5);
		BottomStone2.render(f5);
		BottomStone3.render(f5);
		BottomStone4.render(f5);
		MiddleStone.render(f5);
		TopStone.render(f5);
		TopStone2.render(f5);
		TopStone3.render(f5);
		TopStone4.render(f5);
		TopStone5.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
