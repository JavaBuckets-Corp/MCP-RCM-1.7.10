package javabuckets.mods.rcm.skills.prayer;

import org.lwjgl.opengl.GL11;

import javabuckets.mods.rcm.guis.GUICustomButtonInv;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.Reference;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class GUIPrayerSelection extends GuiScreen
{
	int prayerLvl = RCM.instance.skillHandler.getLevel(SkillReference.pray);
	
	public GUIPrayerSelection() 
	{
		
	}
	
	int x = 2;
	int y = 38;
	
	public void initGui() 
	{
		buttonList.clear();
		
		buttonList.add(new GUICustomButtonInv(0, x, y - 17, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(1, x + 17, y - 17, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(2, x + 34, y - 17, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(3, x + 51, y - 17, 15, 15, ""));
		
		buttonList.add(new GUICustomButtonInv(4, x, y, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(5, x + 17, y, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(6, x + 34, y, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(7, x + 51, y, 15, 15, ""));
		
		buttonList.add(new GUICustomButtonInv(8, x, y + 17, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(9, x + 17, y + 17, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(10, x + 34, y + 17, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(11, x + 51, y + 17, 15, 15, ""));
		
		buttonList.add(new GUICustomButtonInv(12, x, y + (17 * 2) - 1, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(13, x + 17, y + (17 * 2) - 1, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(14, x + 34, y + (17 * 2) - 1, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(15, x + 51, y + (17 * 2) - 1, 15, 15, ""));
		
		buttonList.add(new GUICustomButtonInv(16, x, y + (17 * 3) - 2, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(17, x + 17, y + (17 * 3) - 2, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(18, x + 34, y + (17 * 3) - 2, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(19, x + 51, y + (17 * 3) - 2, 15, 15, ""));
		
		buttonList.add(new GUICustomButtonInv(20, x, y + (17 * 4) - 2, 15, 15, ""));
		buttonList.add(new GUICustomButtonInv(21, x + 17, y + (17 * 4) - 2, 15, 15, ""));
	}
	
	protected void actionPerformed(GuiButton button) 
	{
		switch (button.id)
		{
			case 0: // Thick, Rock & Steel Skin
			{
				usePrayerBasedOnLvl(1, 10, 28, SkillReference.def, 2, 0F, PrayerReference.isUsingThickSkin, PrayerReference.isUsingRockSkin, PrayerReference.isUsingSteelSkin);
				break;
			}
			case 1: // Burst of, Superhuman & Ultimate Strength
			{
				usePrayerBasedOnLvl(4, 13, 31, SkillReference.att, 0, 2F, PrayerReference.isUsingBurstOfStrength, PrayerReference.isUsingSuperhumanStrength, PrayerReference.isUsingUltimateStrength);
				break;
			}
			case 2: // Clarity of Thought, Improved & Incredible Reflexes
			{
				usePrayerBasedOnLvl(7, 16, 34, SkillReference.att, 2, 0F, PrayerReference.isUsingClarityOfThought, PrayerReference.isUsingImprovedReflexes, PrayerReference.isUsingIncredibleReflexes);
				break;
			}
			case 3: // Sharp, Hawk & Eagle Eye
			{
				usePrayerBasedOnLvl(8, 26, 44, SkillReference.range, 2, 0F, PrayerReference.isUsingSharpEye, PrayerReference.isUsingHawkEye, PrayerReference.isUsingEagleEye);
				break;
			}
			case 4: // Unstoppable, Unrelenting & Overpowering Force
			{
				usePrayerBasedOnLvl(8, 26, 44, SkillReference.range, 0, 2F, PrayerReference.isUsingUnstoppableForce, PrayerReference.isUsingUnrelentingForce, PrayerReference.isUsingOverpoweringForce);
				break;
			}
			case 5: // Mystic Will, Mystic Lore & Mystic Might
			{
				usePrayerBasedOnLvl(9, 27, 45, SkillReference.mage, 2, 0F, PrayerReference.isUsingMysticWill, PrayerReference.isUsingMysticLore, PrayerReference.isUsingMysticMight);
				break;
			}
			case 6: // Charge, Super Charge & Overcharge
			{
				usePrayerBasedOnLvl(9, 27, 45, SkillReference.mage, 0, 2F, PrayerReference.isUsingCharge, PrayerReference.isUsingSuperCharge, PrayerReference.isUsingOvercharge);
				break;
			}
			case 7: // Rapid Restore
			{
				RCM.instance.playerBonuses.skillRestoreRate *= 2;
				PrayerReference.isUsingRapidRestore = true;
				break;
			}
			case 8: // Rapid Heal
			{
				RCM.instance.playerBonuses.hpRestoreRate *= 2;
				PrayerReference.isUsingRapidHeal = true;
				PrayerReference.isUsingRapidRenewal = false;
				break;
			}
			case 9: // Protect Item
			{
				
				PrayerReference.isUsingProtectItem = true;
				break;
			}
			case 10: // Protect from Summoning
			{
				
				PrayerReference.isUsingProtectFromSummoning = true;
				break;
			}
			case 11: // Protect from Magic
			{
				
				PrayerReference.isUsingProtectFromMagic = true;
				break;
			}
			case 12: // Protect from Missiles
			{
				
				PrayerReference.isUsingProtectFromMissiles = true;
				break;
			}
			case 13: // Protect from Melee
			{
				
				PrayerReference.isUsingProtectFromMelee = true;
				break;
			}
			case 14: // Retribution
			{
				
				PrayerReference.isUsingRetribution = true;
				break;
			}
			case 15: // Redemption
			{
				
				PrayerReference.isUsingRedemption = true;
				break;
			}
			case 16: // Smite
			{
				
				PrayerReference.isUsingSmite = true;
				break;
			}
			case 17: // Chivalry
			{
				
				PrayerReference.isUsingChivalry = true;
				break;
			}
			case 18: // Rapid Renewal
			{
				RCM.instance.playerBonuses.hpRestoreRate *= 5;
				PrayerReference.isUsingRapidRenewal = true;
				PrayerReference.isUsingRapidHeal = false;
				break;
			}
			case 19: // Piety
			{
				
				PrayerReference.isUsingPiety = true;
				break;
			}
			case 20: // Rigour
			{
				
				PrayerReference.isUsingRigour = true;
				break;
			}
			case 21: // Augury
			{
				
				PrayerReference.isUsingAugury = true;
				break;
			}
		}
		
		closeGui();
	}
	
	private void usePrayerBasedOnLvl(int low, int med, int high, String skill, int boostLvl, float dmgIncr, boolean b1, boolean b2, boolean b3) 
	{	
		if (prayerLvl >= low && prayerLvl < med) 
		{
			if (boostLvl == 0)
			{
				if (skill == SkillReference.att) { RCM.instance.playerBonuses.additionalMeleeDmg *= dmgIncr; }
				else if (skill == SkillReference.range) { RCM.instance.playerBonuses.additionalRangeDmg *= dmgIncr; }
				else if (skill == SkillReference.mage) { RCM.instance.playerBonuses.additionalMageDmg *= dmgIncr; }
			}
			else
			{
				RCM.instance.skillHandler.boostLvlBy(skill, boostLvl);
			}
			
			b1 = true;
		}
		else if (prayerLvl >= med && prayerLvl < high)
		{
			if (boostLvl == 0)
			{
				if (skill == SkillReference.att) { RCM.instance.playerBonuses.additionalMeleeDmg *= dmgIncr*2; }
				else if (skill == SkillReference.range) { RCM.instance.playerBonuses.additionalRangeDmg *= dmgIncr*2; }
				else if (skill == SkillReference.mage) { RCM.instance.playerBonuses.additionalMageDmg *= dmgIncr*2; }
			}
			else
			{
				RCM.instance.skillHandler.boostLvlBy(skill, boostLvl*2);
			}
			
			b2 = true;
		}
		else if (prayerLvl >= high)
		{
			if (boostLvl == 0)
			{
				if (skill == SkillReference.att) { RCM.instance.playerBonuses.additionalMeleeDmg *= dmgIncr*3; }
				else if (skill == SkillReference.range) { RCM.instance.playerBonuses.additionalRangeDmg *= dmgIncr*3; }
				else if (skill == SkillReference.mage) { RCM.instance.playerBonuses.additionalMageDmg *= dmgIncr*3; }
			}
			else
			{
				RCM.instance.skillHandler.boostLvlBy(skill, boostLvl*3);
			}	
			
			b3 = true;
		}
		
		RCM.instance.prayer.isUsingPrayer();
	}

	public boolean doesGuiPauseGame()
	{
		return false;
	}
	
	public void onGuiClosed()
	{
		
	}
	
	public void closeGui()
	{
		this.mc.displayGuiScreen((GuiScreen)null);
		this.mc.setIngameFocus();
	}
	
	public static final ResourceLocation prayer_selection = new ResourceLocation(Reference.MOD_ID, "textures/gui/prayer/prayer_selection.png");
	public static final ResourceLocation prayers = new ResourceLocation(Reference.MOD_ID, "textures/gui/prayer/prayers.png");
	
	public void drawScreen(int par1, int par2, float par3)
	{
		mc.renderEngine.bindTexture(prayer_selection);
		drawTexturedModalRect(0, 0, 0, 0, 140 / 2, 255 / 2);
		
		mc.renderEngine.bindTexture(prayers);
		
		addPrayerBasedOnLvl(1, 10, 28, 0, 0);
		addPrayerBasedOnLvl(4, 13, 31, 1, 1);
		addPrayerBasedOnLvl(7, 16, 34, 2, 0);
		addPrayerBasedOnLvl(8, 26, 44, 3, 1);
		addPrayerBasedOnLvl(8, 26, 44, 4, 0);
		addPrayerBasedOnLvl(9, 27, 45, 5, 1);
		addPrayerBasedOnLvl(9, 27, 45, 6, 0);
		
		drawString(mc.fontRenderer, "Prayers", 13, 6, 0xD48624);
		
		super.drawScreen(par1, par2, par3);
	}
	
	public void addPrayerBasedOnLvl(int low, int med, int high, int index, int row)
	{
		int size = 30;
		int xPos = size * index;
		int startYPos = 43;
		int startXPos = 4;
		int addX = 4 * index;
		
		if (index > 3) { startYPos += size + 3; xPos = 0; addX = 0; }
		if (index == 0) { addX = 0; }
		if (index == 5) { xPos = size; addX = 4; }
		if (index == 6) { xPos = size*2; addX = 8; }
		
		int x, y;
		x = y = 0;
		
		if (index < 2) { x = 90 * row; y = 0; }
		else if (index < 4) { x = 90 * row; y = 30; }
		else if (index < 6) { x = 90 * row; y = 60; }
		else if (index < 8) { x = 90 * row; y = 90; }
		
		GL11.glScalef(0.5F, 0.5F, 1F);
		drawTexturedModalRect(startXPos + xPos + addX, startYPos, x, y, size, size);
		GL11.glScalef(2F, 2F, 1F);
		
		if (prayerLvl >= med && prayerLvl < high)
		{
			GL11.glScalef(0.5F, 0.5F, 1F);
			drawTexturedModalRect(startXPos + xPos + addX, startYPos, x + 30, y, size, size);
			GL11.glScalef(2F, 2F, 1F);
		}
		else if (prayerLvl >= high)
		{
			GL11.glScalef(0.5F, 0.5F, 1F);
			drawTexturedModalRect(startXPos + xPos + addX, startYPos, x + 60, y, size, size);
			GL11.glScalef(2F, 2F, 1F);
		}
	}
}