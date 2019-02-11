package javabuckets.mods.rcm.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFurnace extends ModelBase
{
	//fields
	ModelRenderer FrontBottom;
	ModelRenderer FrontRight;
	ModelRenderer FrontLeft;
	ModelRenderer FrontDeco1;
	ModelRenderer FrontDeco2;
	ModelRenderer FrontDeco3;
	ModelRenderer FrontDeco4;
	ModelRenderer FrontTop;
	ModelRenderer FRCorner;
	ModelRenderer FLCorner;
	ModelRenderer Top1;
	ModelRenderer Top2;
	ModelRenderer Top3;
	ModelRenderer Top4;
	ModelRenderer Heat;
	ModelRenderer Back1;
	ModelRenderer Back2;

	public ModelFurnace()
	{
		textureWidth = 128;
		textureHeight = 128;

		FrontBottom = new ModelRenderer(this, 0, 0);
		FrontBottom.addBox(0F, 0F, 0F, 48, 12, 2);
		FrontBottom.setRotationPoint(-24F, 12F, -7F);
		FrontBottom.setTextureSize(128, 128);
		FrontBottom.mirror = true;
		setRotation(FrontBottom, 0F, 0F, 0F);
		FrontRight = new ModelRenderer(this, 0, 14);
		FrontRight.addBox(0F, 0F, 0F, 16, 16, 2);
		FrontRight.setRotationPoint(-24F, -4F, -7F);
		FrontRight.setTextureSize(128, 128);
		FrontRight.mirror = true;
		setRotation(FrontRight, 0F, 0F, 0F);
		FrontLeft = new ModelRenderer(this, 0, 14);
		FrontLeft.addBox(0F, 0F, 0F, 16, 16, 2);
		FrontLeft.setRotationPoint(8F, -4F, -7F);
		FrontLeft.setTextureSize(128, 128);
		FrontLeft.mirror = true;
		setRotation(FrontLeft, 0F, 0F, 0F);
		FrontDeco1 = new ModelRenderer(this, 124, 0);
		FrontDeco1.addBox(0F, 0F, 0F, 1, 34, 1);
		FrontDeco1.setRotationPoint(-9F, -10F, -7.5F);
		FrontDeco1.setTextureSize(128, 128);
		FrontDeco1.mirror = true;
		setRotation(FrontDeco1, 0F, 0F, 0F);
		FrontDeco2 = new ModelRenderer(this, 124, 0);
		FrontDeco2.addBox(0F, 0F, 0F, 1, 34, 1);
		FrontDeco2.setRotationPoint(8F, -10F, -7.5F);
		FrontDeco2.setTextureSize(128, 128);
		FrontDeco2.mirror = true;
		setRotation(FrontDeco2, 0F, 0F, 0F);
		FrontDeco3 = new ModelRenderer(this, 0, 126);
		FrontDeco3.addBox(0F, 0F, 0F, 48, 1, 1);
		FrontDeco3.setRotationPoint(-24F, 12F, -7.5F);
		FrontDeco3.setTextureSize(128, 128);
		FrontDeco3.mirror = true;
		setRotation(FrontDeco3, 0F, 0F, 0F);
		FrontDeco4 = new ModelRenderer(this, 0, 126);
		FrontDeco4.addBox(0F, 0F, 0F, 48, 1, 1);
		FrontDeco4.setRotationPoint(-24F, -5F, -7.5F);
		FrontDeco4.setTextureSize(128, 128);
		FrontDeco4.mirror = true;
		setRotation(FrontDeco4, 0F, 0F, 0F);
		FrontTop = new ModelRenderer(this, 0, 0);
		FrontTop.addBox(0F, 0F, 0F, 48, 5, 2);
		FrontTop.setRotationPoint(-24F, -9F, -7F);
		FrontTop.setTextureSize(128, 128);
		FrontTop.mirror = true;
		setRotation(FrontTop, 0F, 0F, 0F);
		FRCorner = new ModelRenderer(this, 0, 53);
		FRCorner.addBox(0F, 0F, 0F, 3, 33, 40);
		FRCorner.setRotationPoint(-27F, -9F, -8F);
		FRCorner.setTextureSize(128, 128);
		FRCorner.mirror = true;
		setRotation(FRCorner, 0F, 0F, 0F);
		FLCorner = new ModelRenderer(this, 0, 53);
		FLCorner.addBox(0F, 0F, 0F, 3, 33, 40);
		FLCorner.setRotationPoint(24F, -9F, -8F);
		FLCorner.setTextureSize(128, 128);
		FLCorner.mirror = true;
		setRotation(FLCorner, 0F, 0F, 0F);
		Top1 = new ModelRenderer(this, 0, 40);
		Top1.addBox(0F, 0F, 0F, 54, 3, 10);
		Top1.setRotationPoint(-27F, -12F, -8F);
		Top1.setTextureSize(128, 128);
		Top1.mirror = true;
		setRotation(Top1, 0F, 0F, 0F);
		Top2 = new ModelRenderer(this, 0, 40);
		Top2.addBox(0F, 0F, 0F, 54, 3, 10);
		Top2.setRotationPoint(-27F, -12F, 2F);
		Top2.setTextureSize(128, 128);
		Top2.mirror = true;
		setRotation(Top2, 0F, 0F, 0F);
		Top3 = new ModelRenderer(this, 0, 40);
		Top3.addBox(0F, 0F, 0F, 54, 3, 10);
		Top3.setRotationPoint(-27F, -12F, 12F);
		Top3.setTextureSize(128, 128);
		Top3.mirror = true;
		setRotation(Top3, 0F, 0F, 0F);
		Top4 = new ModelRenderer(this, 0, 40);
		Top4.addBox(0F, 0F, 0F, 54, 3, 10);
		Top4.setRotationPoint(-27F, -12F, 22F);
		Top4.setTextureSize(128, 128);
		Top4.mirror = true;
		setRotation(Top4, 0F, 0F, 0F);
		Heat = new ModelRenderer(this, 51, 19);
		Heat.addBox(0F, 0F, 0F, 16, 16, 1);
		Heat.setRotationPoint(-8F, -4F, -6F);
		Heat.setTextureSize(128, 128);
		Heat.mirror = true;
		setRotation(Heat, 0F, 0F, 0F);
		Back1 = new ModelRenderer(this, 50, 56);
		Back1.addBox(0F, 0F, 0F, 24, 33, 1);
		Back1.setRotationPoint(-24F, -9F, 30.5F);
		Back1.setTextureSize(128, 128);
		Back1.mirror = true;
		setRotation(Back1, 0F, 0F, 0F);
		Back2 = new ModelRenderer(this, 50, 56);
		Back2.addBox(0F, 0F, 0F, 24, 33, 1);
		Back2.setRotationPoint(0F, -9F, 30.5F);
		Back2.setTextureSize(128, 128);
		Back2.mirror = true;
		setRotation(Back2, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		FrontBottom.render(f5);
		FrontRight.render(f5);
		FrontLeft.render(f5);
		FrontDeco1.render(f5);
		FrontDeco2.render(f5);
		FrontDeco3.render(f5);
		FrontDeco4.render(f5);
		FrontTop.render(f5);
		FRCorner.render(f5);
		FLCorner.render(f5);
		Top1.render(f5);
		Top2.render(f5);
		Top3.render(f5);
		Top4.render(f5);
		Heat.render(f5);
		Back1.render(f5);
		Back2.render(f5);
	}
	
	public void renderModel(float f5)
	{
		FrontBottom.render(f5);
		FrontRight.render(f5);
		FrontLeft.render(f5);
		FrontDeco1.render(f5);
		FrontDeco2.render(f5);
		FrontDeco3.render(f5);
		FrontDeco4.render(f5);
		FrontTop.render(f5);
		FRCorner.render(f5);
		FLCorner.render(f5);
		Top1.render(f5);
		Top2.render(f5);
		Top3.render(f5);
		Top4.render(f5);
		Heat.render(f5);
		Back1.render(f5);
		Back2.render(f5);
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