package javabuckets.mods.rcm.guis.skillguides;

import javabuckets.mods.rcm.guis.GUICustomButton;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.Reference;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class SkillGuideFarming extends SkillGuideBase 
{
	private String subject = "Allotments";
	private int page = 1;
	
	public static final ResourceLocation skillGuide = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/rcmskillguide3.png");
	
	public static final ResourceLocation farmingGuide_ALLOTMENTS_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/farmingguide_allotment_page1.png");
	public static final ResourceLocation farmingGuide_ALLOTMENTS_2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/farmingguide_allotment_page2.png");
	
	public static final ResourceLocation farmingGuide_FLOWERS_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/farmingguide_flower_page1.png");
	
	public static final ResourceLocation farmingGuide_HERBS_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/farmingguide_herb_page1.png");
	public static final ResourceLocation farmingGuide_HERBS_2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/farmingguide_herb_page2.png");
	public static final ResourceLocation farmingGuide_HERBS_3 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/farmingguide_herb_page3.png");
	
	public static final ResourceLocation farmingGuide_BUSHES_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/farmingguide_berry_page1.png");
	
	public static final ResourceLocation farmingGuide_TREES_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/farmingguide_tree_page1.png");
	
	public static final ResourceLocation farmingGuide_FRUITTREES_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/farmingguide_fruittree_page1.png");
	
	public static final ResourceLocation farmingGuide_CACTI_1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/skillguides/farmingguide_cacti_page1.png");

	public SkillGuideFarming()
	{
		super(true);
	}

	@Override
	public void initGui() 
	{
		super.initGui();

		this.buttonList.add(new GUICustomButton(0, 118, 215, 50, 14, "Go Back"));

		this.buttonList.add(new GUICustomButton(1, 235, 8, 12, 12, "<"));
		this.buttonList.add(new GUICustomButton(2, 250, 8, 12, 12, ">"));

		this.buttonList.add(new GUICustomButton(3, 20, 48+(16*0), 75, 14, "Everything"));
		this.buttonList.add(new GUICustomButton(4, 20, 48+(16*1), 75, 14, "Allotments"));
		this.buttonList.add(new GUICustomButton(5, 20, 48+(16*2), 75, 14, "Flowers"));
		this.buttonList.add(new GUICustomButton(6, 20, 48+(16*3), 75, 14, "Herbs"));
		this.buttonList.add(new GUICustomButton(7, 20, 48+(16*4), 75, 14, "Bushes"));
		this.buttonList.add(new GUICustomButton(8, 20, 48+(16*5), 75, 14, "Trees"));
		this.buttonList.add(new GUICustomButton(9, 20, 48+(16*6), 75, 14, "Fruit Trees"));
		this.buttonList.add(new GUICustomButton(10, 20, 48+(16*7), 75, 14, "Cacti"));
	}

	@Override
	protected void actionPerformed(GuiButton button) 
	{
		super.actionPerformed(button);

		switch(button.id)
		{
			case 0:
			{
				mc.displayGuiScreen(new GUISkillGuides());
				break;
			}

			case 1:
			{
				if (page > 2) { page--; }
				else { page = 1; }
				break;
			}

			case 2:
			{
				if (page < 2) { page++; }
				else { page = 3; }
				break;
			}
			
			case 3:
			{
				subject = "Everything";
				page = 1;
				break;
			}
			
			case 4:
			{
				subject = "Allotments";
				page = 1;
				break;
			}
			
			case 5:
			{
				subject = "Flowers";
				page = 1;
				break;
			}
			
			case 6:
			{
				subject = "Herbs";
				page = 1;
				break;
			}
			
			case 7:
			{
				subject = "Bushes";
				page = 1;
				break;
			}
			
			case 8:
			{
				subject = "Trees";
				page = 1;
				break;
			}
			
			case 9:
			{
				subject = "Fruit Trees";
				page = 1;
				break;
			}
			
			case 10:
			{
				subject = "Cacti";
				page = 1;
				break;
			}
		}
	}

	public void drawScreen(int par1, int par2, float par3)
	{
		this.drawDefaultBackground();

		GL11.glEnable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1F, 1F, 1F, 1F);
		GL11.glEnable(GL11.GL_TEXTURE_2D);


		GL11.glScalef(2F, 2F, 2F);


		mc.renderEngine.bindTexture(skillGuide);
		drawTexturedModalRect(50, 5, 0, 0, 512, 512);


		GL11.glScalef(0.5F, 0.5F, 0.5F);

		if (subject == "Everything")
		{
			if (page == 1)
			{
				
			}
			else if (page == 2)
			{
				
			}
			else if (page == 3)
			{
				
			}
		}
		
		else if (subject == "Allotments")
		{
			if (page == 1)
			{
				mc.renderEngine.bindTexture(farmingGuide_ALLOTMENTS_1);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 1", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Potatoes", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 1", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Carrots", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 5", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Onions", 245, 103, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 7", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Cabbages", 245, 126, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 12", 205, 149, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Tomatoes", 245, 149, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 20", 205, 172, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Sweetcorn", 245, 172, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 31", 205, 195, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Strawberries", 245, 195, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 47", 205, 218, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Watermelons", 245, 218, 0xFFFFFF);
			}
			else if (page == 2)
			{
				mc.renderEngine.bindTexture(farmingGuide_ALLOTMENTS_2);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 53", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Snape Grass", 245, 57, 0xFFFFFF);
			}
			else if (page == 3)
			{
				
			}
		}
		
		else if (subject == "Flowers")
		{
			if (page == 1)
			{
				mc.renderEngine.bindTexture(farmingGuide_FLOWERS_1);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 2", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Marigolds", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 11", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Rosemary", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 19", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Nasturtiums", 245, 103, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 25", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Woad Leaves", 245, 126, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 29", 205, 149, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Limpwurt Roots", 245, 149, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 35", 205, 172, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "White Lily", 245, 172, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 64", 205, 195, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Butterfly Flower", 245, 195, 0xFFFFFF);
			}
			else if (page == 2)
			{
				
			}
			else if (page == 3)
			{
				
			}
		}
		
		else if (subject == "Herbs")
		{
			if (page == 1)
			{
				mc.renderEngine.bindTexture(farmingGuide_HERBS_1);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 9", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Guam", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 14", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Marrentill", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 19", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Tarromin", 245, 103, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 26", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Harralander", 245, 126, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 32", 205, 149, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Ranarr", 245, 149, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 36", 205, 172, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Spirit Weed", 245, 172, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 38", 205, 195, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Toadflax", 245, 195, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 44", 205, 218, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Irit", 245, 218, 0xFFFFFF);
			}
			else if (page == 2)
			{
				mc.renderEngine.bindTexture(farmingGuide_HERBS_2);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 46", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Wergali", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 50", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Avantoe", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 56", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Kwuarm", 245, 103, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 62", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Snapdragon", 245, 126, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 67", 205, 149, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Cadantine", 245, 149, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 73", 205, 172, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Lantadyme", 245, 172, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 79", 205, 195, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Dwarf Weed", 245, 195, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 85", 205, 218, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Torstol", 245, 218, 0xFFFFFF);
			}
			else if (page == 3) 
			{ 
				mc.renderEngine.bindTexture(farmingGuide_HERBS_3);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 91", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Fellstalk", 245, 57, 0xFFFFFF);
			}
		}
		
		else if (subject == "Bushes")
		{
			if (page == 1)
			{
				mc.renderEngine.bindTexture(farmingGuide_BUSHES_1);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 10", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Redberries", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 22", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Cadava berries", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 36", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Dwellberries", 245, 103, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 48", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Jangerberries", 245, 126, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 59", 205, 149, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "White berries", 245, 149, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 70", 205, 172, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Poison ivy berries", 245, 172, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 77", 205, 195, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Barberry Seeds", 245, 195, 0xFFFFFF);
			}
			else if (page == 2)
			{
				
			}
			else if (page == 3)
			{
				
			}
		}
		
		else if (subject == "Trees")
		{
			if (page == 1)
			{
				mc.renderEngine.bindTexture(farmingGuide_TREES_1);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 15", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Oak Tree", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 30", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Willow Tree", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 45", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Maple Tree", 245, 103, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 60", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Yew Tree", 245, 126, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 75", 205, 149, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Magic Tree", 245, 149, 0xFFFFFF);
			}
			else if (page == 2)
			{
				
			}
			else if (page == 3)
			{
				
			}
		}
		
		else if (subject == "Fruit Trees")
		{
			if (page == 1)
			{
				mc.renderEngine.bindTexture(farmingGuide_FRUITTREES_1);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 27", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Apple Tree", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 33", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Banana Tree", 245, 80, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 39", 205, 103, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Orange Tree", 245, 103, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 42", 205, 126, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Curry Tree", 245, 126, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 51", 205, 149, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Pineapple Plant", 245, 149, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 57", 205, 172, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Papaya Tree", 245, 172, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 68", 205, 195, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Palm Tree", 245, 195, 0xFFFFFF);
			}
			else if (page == 2)
			{
				
			}
			else if (page == 3)
			{
				
			}
		}
		
		else if (subject == "Cacti")
		{
			if (page == 1)
			{
				mc.renderEngine.bindTexture(farmingGuide_CACTI_1);
				drawTexturedModalRect(0, 0, -100, -10, 256, 256);
				
				this.drawString(mc.fontRenderer, "Lvl. 55", 205, 57, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Cactus", 245, 57, 0xFFFFFF);

				this.drawString(mc.fontRenderer, "Lvl. 86", 205, 80, 0xFFFFFF);
				this.drawString(mc.fontRenderer, "Potato Cactus", 245, 80, 0xFFFFFF);
			}
			else if (page == 2)
			{
				
			}
			else if (page == 3)
			{
				
			}
		}

		this.drawCenteredString(mc.fontRenderer, "Farming Guide", 151, 19, 0xD48624);
				
		super.drawScreen(par1, par2, par3);
	}
}