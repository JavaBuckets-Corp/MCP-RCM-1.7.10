package javabuckets.mods.rcm.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFire extends ModelBase
{
	//fields
	ModelRenderer Log1;
	ModelRenderer Log2;
	ModelRenderer Log3;
	ModelRenderer Log4;
	ModelRenderer Log5;
	ModelRenderer Fire1;
	ModelRenderer Fire2;

	public ModelFire()
	{
		textureWidth = 64;
		textureHeight = 64;

		Log1 = new ModelRenderer(this, 0, 0);
		Log1.addBox(-7F, 0F, -1F, 7, 2, 2);
		Log1.setRotationPoint(-1F, 22F, 1F);
		Log1.setTextureSize(64, 64);
		Log1.mirror = true;
		setRotation(Log1, 0F, 0.5235988F, -0.0872665F);
		Log2 = new ModelRenderer(this, 0, 0);
		Log2.addBox(0F, 0F, -1F, 7, 2, 2);
		Log2.setRotationPoint(0F, 22F, -1F);
		Log2.setTextureSize(64, 64);
		Log2.mirror = true;
		setRotation(Log2, 0F, 1.256637F, 0.0872665F);
		Log3 = new ModelRenderer(this, 0, 0);
		Log3.addBox(0F, 0F, -1F, 7, 2, 2);
		Log3.setRotationPoint(1F, 22F, 0F);
		Log3.setTextureSize(64, 64);
		Log3.mirror = true;
		setRotation(Log3, 0F, 0F, 0.0872665F);
		Log4 = new ModelRenderer(this, 18, 0);
		Log4.addBox(-1F, 0F, 0F, 2, 2, 7);
		Log4.setRotationPoint(0F, 22F, 1F);
		Log4.setTextureSize(64, 64);
		Log4.mirror = true;
		setRotation(Log4, -0.0872665F, 0.3141593F, 0F);
		Log5 = new ModelRenderer(this, 0, 0);
		Log5.addBox(0F, 0F, -1F, 7, 2, 2);
		Log5.setRotationPoint(-1F, 22F, -1F);
		Log5.setTextureSize(64, 64);
		Log5.mirror = true;
		setRotation(Log5, 0F, 2.617994F, 0.0872665F);
		Fire1 = new ModelRenderer(this, 0, 11);
		Fire1.addBox(0F, 0F, 0F, 10, 10, 0);
		Fire1.setRotationPoint(-5F, 13F, 0F);
		Fire1.setTextureSize(64, 64);
		Fire1.mirror = true;
		setRotation(Fire1, 0F, 0F, 0F);
		Fire2 = new ModelRenderer(this, 0, 11);
		Fire2.addBox(0F, 0F, 0F, 10, 10, 0);
		Fire2.setRotationPoint(0F, 13F, 5F);
		Fire2.setTextureSize(64, 64);
		Fire2.mirror = true;
		setRotation(Fire2, 0F, 1.570796F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Log1.render(f5);
		Log2.render(f5);
		Log3.render(f5);
		Log4.render(f5);
		Log5.render(f5);
		Fire1.render(f5);
		Fire2.render(f5);
	}
	
	public void renderModel(float f5)
	{
		Log1.render(f5);
		Log2.render(f5);
		Log3.render(f5);
		Log4.render(f5);
		Log5.render(f5);
		Fire1.render(f5);
		Fire2.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

}
