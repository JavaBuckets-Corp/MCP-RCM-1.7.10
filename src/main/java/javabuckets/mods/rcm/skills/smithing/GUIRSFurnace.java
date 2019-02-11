package javabuckets.mods.rcm.skills.smithing;

import org.lwjgl.opengl.GL11;

import javabuckets.mods.rcm.blocks.containers.ContainerRSFurnace;
import javabuckets.mods.rcm.blocks.tileentities.TileEntityRSFurnace;
import javabuckets.mods.rcm.guis.GUICustomButton;
import javabuckets.mods.rcm.utility.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GUIRSFurnace extends GuiContainer
{
	private TileEntityRSFurnace furnace;
	
    public GUIRSFurnace(InventoryPlayer playerInventory, TileEntityRSFurnace tile)
    {
    	super(new ContainerRSFurnace(playerInventory, tile));
    	this.furnace = tile;
    	this.xSize = 176;
    	this.ySize = 166;
    }
    
    public static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/gui/smithing/rcmfurnace.png");
    public static final ResourceLocation textureActive = new ResourceLocation(Reference.MOD_ID, "textures/gui/smithing/rcmfurnaceactive.png");
    
    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int j, int i) 
    {
    	GL11.glColor4f(1F, 1F, 1F, 1F);
    	if (furnace.isActive) {
    		Minecraft.getMinecraft().renderEngine.bindTexture(textureActive); }
    	else {
    	 	Minecraft.getMinecraft().renderEngine.bindTexture(texture); }
    	drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}