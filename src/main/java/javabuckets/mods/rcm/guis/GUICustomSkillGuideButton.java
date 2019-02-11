package javabuckets.mods.rcm.guis;
 
import javabuckets.mods.rcm.main.RCM;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GUICustomSkillGuideButton extends GuiButton
{
	private String skill;
	
    public GUICustomSkillGuideButton(int id, int width, int height, String text, String skill)
    {
        this(id, width, height, 200, 20, text, skill);
    }
 
    public GUICustomSkillGuideButton(int id, int width, int height, int buttonWidth, int buttonHeight, String text, String skill)
    {
        super(id, width, height, buttonWidth, buttonHeight, text);
        this.skill = skill;
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
        		//this.drawRect(xPosition -3, yPosition -1, xPosition +3 + width, yPosition + height +1, 0x80000000);
                drawCenteredString(fontrenderer, displayString, xPosition + width / 2, yPosition + (height - 8) / 2, 0x870000);
                
        		this.drawString(fontrenderer, skill + " Experience: " + (long)RCM.instance.skillHandler.getExperience(skill) + " xp", 127, 5, 0xFFFFFF);
        		this.drawString(fontrenderer, skill + " Level: " + RCM.instance.skillHandler.getLevelB(skill) + "/" + RCM.instance.skillHandler.getLevel(skill), 127, 15, 0xFFFFFF);
        		this.drawString(fontrenderer, skill + " Experience to next level: " + (long)RCM.instance.skillHandler.getXpToNextLevel(skill), 127, 25, 0xFFFFFF);
        		this.drawString(fontrenderer, skill + " Levels earned this session: " + (long)RCM.instance.skillHandler.getLvlsEarnedSessionInSkill(skill), 127, 75, 0xFFFFFF);
        		this.drawString(fontrenderer, skill + " Experience earned this session: " + (long)RCM.instance.skillHandler.getXpEarnedSessionInSkill(skill), 127, 85, 0xFFFFFF);
        }
        
        else 
        { // Normal
        		//this.drawRect(xPosition, yPosition, xPosition + width, yPosition + height, 0x60000000);
                drawCenteredString(fontrenderer, displayString, xPosition + width / 2, yPosition + (height - 8) / 2, 0xFFCCCCCC);
        }
    }
}