package javabuckets.mods.rcm.guis;
 
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GUICustomButtonInv extends GuiButton
{
    public GUICustomButtonInv(int id, int width, int height, String text)
    {
        this(id, width, height, 200, 20, text);
    }
 
    public GUICustomButtonInv(int id, int width, int height, int buttonWidth, int buttonHeight, String text)
    {
        super(id, width, height, buttonWidth, buttonHeight, text);
    }

    public int getHoverState(boolean flag)
    {
        byte byte0 = 1;
        if (!enabled)
        {
        	byte0 = 0;
        }
        else if (flag)
        {
        	byte0 = 2;
        }
        
        return byte0;
    }
 
    public void drawButton(Minecraft mc, int mx, int my)
    {
        FontRenderer fontrenderer = mc.fontRenderer;
        boolean flag = mx >= xPosition && my >= yPosition && mx < xPosition + width && my < yPosition + height;  //Flag, tells if your mouse is hovering the button
        
        if (flag)
        { // Hover Action
                drawCenteredString(fontrenderer, displayString, xPosition + width / 2, yPosition + (height - 8) / 2, 0x870000);
        }
        
        else 
        { // Normal
                drawCenteredString(fontrenderer, displayString, xPosition + width / 2, yPosition + (height - 8) / 2, 0xFFCCCCCC);
        }
    }
}