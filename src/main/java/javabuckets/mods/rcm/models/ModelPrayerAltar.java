package javabuckets.mods.rcm.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPrayerAltar extends ModelBase
{
	//fields
	ModelRenderer Main;
	ModelRenderer Bot2;
	ModelRenderer Bot1;
	ModelRenderer R;
	ModelRenderer L;
	ModelRenderer TopCloth;
	ModelRenderer RCloth;
	ModelRenderer LCloth;
	ModelRenderer Fill1;
	ModelRenderer Fill2;
	ModelRenderer Fill3;
	ModelRenderer Fill5;
	ModelRenderer Fill6;
	ModelRenderer CandleR;
	ModelRenderer CandleL;
	ModelRenderer Page2;
	ModelRenderer Page1;
	ModelRenderer Book;
	ModelRenderer Sara1;
	ModelRenderer Sara2;
	ModelRenderer Sara3;
	ModelRenderer Hold1;
	ModelRenderer HoldL;
	ModelRenderer HoldR;
	ModelRenderer HoldT;
	ModelRenderer HoldB;
	ModelRenderer BotHold;

	public ModelPrayerAltar()
	{
		textureWidth = 128;
		textureHeight = 128;

		Main = new ModelRenderer(this, 0, 37);
		Main.addBox(0F, 0F, 0F, 24, 14, 12);
		Main.setRotationPoint(-12F, 8F, -6F);
		Main.setTextureSize(128, 128);
		Main.mirror = true;
		setRotation(Main, 0F, 0F, 0F);
		Bot2 = new ModelRenderer(this, 35, 0);
		Bot2.addBox(0F, 0F, 0F, 31, 1, 15);
		Bot2.setRotationPoint(-15.5F, 22F, -7.5F);
		Bot2.setTextureSize(128, 128);
		Bot2.mirror = true;
		setRotation(Bot2, 0F, 0F, 0F);
		Bot1 = new ModelRenderer(this, 30, 18);
		Bot1.addBox(0F, 0F, 0F, 32, 1, 16);
		Bot1.setRotationPoint(-16F, 23F, -8F);
		Bot1.setTextureSize(128, 128);
		Bot1.mirror = true;
		setRotation(Bot1, 0F, 0F, 0F);
		R = new ModelRenderer(this, 0, 0);
		R.addBox(-1F, 0F, -6F, 1, 15, 12);
		R.setRotationPoint(-15F, 8F, 0F);
		R.setTextureSize(128, 128);
		R.mirror = true;
		setRotation(R, 0F, 0F, -0.2617994F);
		L = new ModelRenderer(this, 0, 0);
		L.addBox(0F, 0F, -6F, 1, 15, 12);
		L.setRotationPoint(15F, 8F, 0F);
		L.setTextureSize(128, 128);
		L.mirror = true;
		setRotation(L, 0F, 0F, 0.2617994F);
		TopCloth = new ModelRenderer(this, 0, 114);
		TopCloth.addBox(-16.5F, 0F, -6.5F, 33, 0, 13);
		TopCloth.setRotationPoint(0F, 7.9F, 0F);
		TopCloth.setTextureSize(128, 128);
		TopCloth.mirror = true;
		setRotation(TopCloth, 0F, 0F, 0F);
		RCloth = new ModelRenderer(this, 0, 88);
		RCloth.addBox(0F, 0F, -6.5F, 0, 13, 13);
		RCloth.setRotationPoint(-16.5F, 7.9F, 0F);
		RCloth.setTextureSize(128, 128);
		RCloth.mirror = true;
		setRotation(RCloth, 0F, 0F, 0F);
		LCloth = new ModelRenderer(this, 0, 88);
		LCloth.addBox(0F, 0F, -6.5F, 0, 13, 13);
		LCloth.setRotationPoint(16.5F, 7.9F, 0F);
		LCloth.setTextureSize(128, 128);
		LCloth.mirror = true;
		setRotation(LCloth, 0F, 0F, 0F);
		Fill1 = new ModelRenderer(this, 40, 70);
		Fill1.addBox(0F, 0F, -6F, 32, 1, 12);
		Fill1.setRotationPoint(-16F, 8F, 0F);
		Fill1.setTextureSize(128, 128);
		Fill1.mirror = true;
		setRotation(Fill1, 0F, 0F, 0F);
		Fill2 = new ModelRenderer(this, 98, 55);
		Fill2.addBox(0F, 0F, 0F, 3, 2, 12);
		Fill2.setRotationPoint(-15F, 9F, -6F);
		Fill2.setTextureSize(128, 128);
		Fill2.mirror = true;
		setRotation(Fill2, 0F, 0F, 0F);
		Fill3 = new ModelRenderer(this, 98, 55);
		Fill3.addBox(0F, 0F, 0F, 3, 2, 12);
		Fill3.setRotationPoint(12F, 9F, -6F);
		Fill3.setTextureSize(128, 128);
		Fill3.mirror = true;
		setRotation(Fill3, 0F, 0F, 0F);
		Fill5 = new ModelRenderer(this, 86, 84);
		Fill5.addBox(0F, 0F, 0F, 9, 3, 12);
		Fill5.setRotationPoint(-12F, 10F, -6F);
		Fill5.setTextureSize(128, 128);
		Fill5.mirror = true;
		setRotation(Fill5, 0F, 0F, 1.308997F);
		Fill6 = new ModelRenderer(this, 86, 84);
		Fill6.addBox(-9F, 0F, 0F, 9, 3, 12);
		Fill6.setRotationPoint(12F, 10F, -6F);
		Fill6.setTextureSize(128, 128);
		Fill6.mirror = true;
		setRotation(Fill6, 0F, 0F, -1.308997F);
		CandleR = new ModelRenderer(this, 80, 85);
		CandleR.addBox(0F, 0F, 0F, 1, 5, 1);
		CandleR.setRotationPoint(-14F, 3F, -5F);
		CandleR.setTextureSize(128, 128);
		CandleR.mirror = true;
		setRotation(CandleR, 0F, 0F, 0F);
		CandleL = new ModelRenderer(this, 80, 85);
		CandleL.addBox(0F, 0F, 0F, 1, 5, 1);
		CandleL.setRotationPoint(13F, 3F, -5F);
		CandleL.setTextureSize(128, 128);
		CandleL.mirror = true;
		setRotation(CandleL, 0F, 0F, 0F);
		Page2 = new ModelRenderer(this, 28, 100);
		Page2.addBox(0F, 0F, 0F, 5, 1, 5);
		Page2.setRotationPoint(-4F, 7F, 0F);
		Page2.setTextureSize(128, 128);
		Page2.mirror = true;
		setRotation(Page2, 0F, 0F, 0.0698132F);
		Page1 = new ModelRenderer(this, 28, 90);
		Page1.addBox(-5F, 0F, 0F, 5, 1, 5);
		Page1.setRotationPoint(4F, 7F, 0F);
		Page1.setTextureSize(128, 128);
		Page1.mirror = true;
		setRotation(Page1, 0F, 0F, -0.0698132F);
		Book = new ModelRenderer(this, 50, 100);
		Book.addBox(0F, 0F, 0F, 9, 1, 6);
		Book.setRotationPoint(-4.5F, 7.4F, -0.5F);
		Book.setTextureSize(128, 128);
		Book.mirror = true;
		setRotation(Book, 0F, 0F, 0F);
		Sara1 = new ModelRenderer(this, 60, 84);
		Sara1.addBox(0F, 0F, 0F, 1, 4, 1);
		Sara1.setRotationPoint(0F, 0F, -5F);
		Sara1.setTextureSize(128, 128);
		Sara1.mirror = true;
		setRotation(Sara1, 0F, 0F, 0F);
		Sara2 = new ModelRenderer(this, 60, 96);
		Sara2.addBox(0F, 0F, 0F, 4, 1, 1);
		Sara2.setRotationPoint(-1.5F, 1.5F, -5F);
		Sara2.setTextureSize(128, 128);
		Sara2.mirror = true;
		setRotation(Sara2, 0F, 0F, 0F);
		Sara3 = new ModelRenderer(this, 66, 86);
		Sara3.addBox(0F, 0F, 0F, 2, 2, 1);
		Sara3.setRotationPoint(-0.5F, 1F, -5F);
		Sara3.setTextureSize(128, 128);
		Sara3.mirror = true;
		setRotation(Sara3, 0F, 0F, 0F);
		Hold1 = new ModelRenderer(this, 50, 86);
		Hold1.addBox(0F, 0F, 0F, 1, 7, 1);
		Hold1.setRotationPoint(0F, 2F, -3F);
		Hold1.setTextureSize(128, 128);
		Hold1.mirror = true;
		setRotation(Hold1, -0.2443461F, 0F, 0F);
		HoldL = new ModelRenderer(this, 55, 92);
		HoldL.addBox(0F, 0F, 0F, 4, 1, 1);
		HoldL.setRotationPoint(0.5F, 2F, -3F);
		HoldL.setTextureSize(128, 128);
		HoldL.mirror = true;
		setRotation(HoldL, 0F, 0.5235988F, 0F);
		HoldR = new ModelRenderer(this, 55, 92);
		HoldR.addBox(-4F, 0F, 0F, 4, 1, 1);
		HoldR.setRotationPoint(0.5F, 2F, -3F);
		HoldR.setTextureSize(128, 128);
		HoldR.mirror = true;
		setRotation(HoldR, 0F, -0.5235988F, 0F);
		HoldT = new ModelRenderer(this, 55, 87);
		HoldT.addBox(0F, 0F, 0F, 1, 3, 1);
		HoldT.setRotationPoint(0F, 0F, -4F);
		HoldT.setTextureSize(128, 128);
		HoldT.mirror = true;
		setRotation(HoldT, 0.2617994F, 0F, 0F);
		HoldB = new ModelRenderer(this, 67, 92);
		HoldB.addBox(0F, 0F, 0F, 1, 1, 1);
		HoldB.setRotationPoint(0F, 2F, -3F);
		HoldB.setTextureSize(128, 128);
		HoldB.mirror = true;
		setRotation(HoldB, 0F, 0F, 0F);
		BotHold = new ModelRenderer(this, 50, 95);
		BotHold.addBox(0F, 0F, 0F, 2, 1, 2);
		BotHold.setRotationPoint(-0.5F, 7.2F, -5F);
		BotHold.setTextureSize(128, 128);
		BotHold.mirror = true;
		setRotation(BotHold, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Main.render(f5);
		Bot2.render(f5);
		Bot1.render(f5);
		R.render(f5);
		L.render(f5);
		TopCloth.render(f5);
		RCloth.render(f5);
		LCloth.render(f5);
		Fill1.render(f5);
		Fill2.render(f5);
		Fill3.render(f5);
		Fill5.render(f5);
		Fill6.render(f5);
		CandleR.render(f5);
		CandleL.render(f5);
		Page2.render(f5);
		Page1.render(f5);
		Book.render(f5);
		Sara1.render(f5);
		Sara2.render(f5);
		Sara3.render(f5);
		Hold1.render(f5);
		HoldL.render(f5);
		HoldR.render(f5);
		HoldT.render(f5);
		HoldB.render(f5);
		BotHold.render(f5);
	}
	
	public void renderModel(float f5)
	{
		Main.render(f5);
		Bot2.render(f5);
		Bot1.render(f5);
		R.render(f5);
		L.render(f5);
		TopCloth.render(f5);
		RCloth.render(f5);
		LCloth.render(f5);
		Fill1.render(f5);
		Fill2.render(f5);
		Fill3.render(f5);
		Fill5.render(f5);
		Fill6.render(f5);
		CandleR.render(f5);
		CandleL.render(f5);
		Page2.render(f5);
		Page1.render(f5);
		Book.render(f5);
		Sara1.render(f5);
		Sara2.render(f5);
		Sara3.render(f5);
		Hold1.render(f5);
		HoldL.render(f5);
		HoldR.render(f5);
		HoldT.render(f5);
		HoldB.render(f5);
		BotHold.render(f5);
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
