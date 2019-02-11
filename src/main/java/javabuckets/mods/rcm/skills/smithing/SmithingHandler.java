package javabuckets.mods.rcm.skills.smithing;

import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.skills.mining.ModMiningItems;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class SmithingHandler extends BaseSkill
{
	public boolean running = false;
	private int resetTimer = 5;
	
	public boolean isSmithing = false;
	private int smithingResetTimer = 10;

	public void smithing(EntityPlayer player, World world) 
	{
		setLvlFromXPList();
		smithingChecker();
		smithingUpdater();
	}

	public void smithingChecker()
	{
		if (isSmithing)
		{
			--smithingResetTimer;

			if (smithingResetTimer <= 0)
			{
				isSmithing = false;
				smithingResetTimer = 10;
			}
		}
	}
	
	public void smithingUpdater()
	{
		if (running)
		{
			resetTimer--;
		}
		
		if (resetTimer <= 0)
		{
			running = false;
			resetTimer = 5;
		}
	}

	public void setLvlFromXPList()
	{
		if (isSmithing)
		{
			for (int i = 1; i <= 120; i++)
			{
				setLvlFromXP(SkillReference.getXpFromLvl(i), SkillReference.getXpFromLvl(i+1), i);
			}

			setbackXPIfTooHigh(200000000D);
			setbackLvlIfTooHigh(99);
			
			if (!(LevelUpUtil.getLevel(SkillReference.smith) == RCM.instance.skillHandler.getLevel(SkillReference.smith)))
			{
				RCM.instance.skillHandler.levelUp(SkillReference.smith, RCM.instance.skillHandler.getLevel(SkillReference.smith));
				LevelUpUtil.lvlHandling();
			}
		}
	}

	public void setLvlFromXP(double xpMin, double xpMax, int level) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.smith) > xpMin && RCM.instance.skillHandler.getExperience(SkillReference.smith) < xpMax)
		{
			RCM.instance.skillHandler.setLevel(SkillReference.smith, level, RCM.instance.skillHandler.getExperience(SkillReference.smith));
		}
	}

	public void setbackLvlIfTooHigh(int level) 
	{
		if (RCM.instance.skillHandler.getLevel(SkillReference.smith) > level) 
		{
			RCM.instance.skillHandler.setLevel(SkillReference.smith, level, RCM.instance.skillHandler.getExperience(SkillReference.smith));
		}
	}

	public void setbackXPIfTooHigh(double xp) 
	{
		if (RCM.instance.skillHandler.getExperience(SkillReference.smith) > xp)
		{
			RCM.instance.skillHandler.setExperience(SkillReference.smith, xp);
		}
	}

	public void meltBar(String subject, double xp, int requiredLevel, int smithingLvl, int[] amountOfAll, InventoryPlayer inventory, Minecraft mc) 
	{
		RCM.instance.smithing.isSmithing = true;
		
		if (smithingLvl >= requiredLevel)
		{
			if (subject.equals("bronze_bar"))
			{
				if (amountOfAll[1] >= 1 && amountOfAll[2] >= 1)
				{
					inventory.consumeInventoryItem(ModMiningItems.copperOre);
					inventory.consumeInventoryItem(ModMiningItems.tinOre);
					inventory.addItemStackToInventory(new ItemStack(ModSmithingItems.bronzeBar));
					updateInventory(mc, inventory.player);
				}
				else { inventory.player.addChatMessage(new ChatComponentText("You lack the proper resources to make this bar!")); }
			}
			else if (subject.equals("iron_bar"))
			{
				if (amountOfAll[3] >= 1)
				{
					inventory.consumeInventoryItem(ModMiningItems.ironOre);
					inventory.addItemStackToInventory(new ItemStack(Items.iron_ingot));
					updateInventory(mc, inventory.player);
				}
				else { inventory.player.addChatMessage(new ChatComponentText("You lack the proper resources to make this bar!")); }
			}
			else if (subject.equals("silver_bar"))
			{
				if (amountOfAll[4] >= 1)
				{
					inventory.consumeInventoryItem(ModMiningItems.silverOre);
					inventory.addItemStackToInventory(new ItemStack(ModSmithingItems.silverBar));
					updateInventory(mc, inventory.player);
				}
				else { inventory.player.addChatMessage(new ChatComponentText("You lack the proper resources to make this bar!")); }
			}
			else if (subject.equals("steel_bar"))
			{
				if (amountOfAll[3] >= 1 && amountOfAll[0] >= getRequiredCoalFromSubject(subject))
				{
					for (int i = 0; i < getRequiredCoalFromSubject(subject); i++)
					{
						inventory.consumeInventoryItem(Items.coal);
					}
					
					inventory.consumeInventoryItem(ModMiningItems.ironOre);
					inventory.addItemStackToInventory(new ItemStack(ModSmithingItems.steelBar));
					updateInventory(mc, inventory.player);
				}
				else { inventory.player.addChatMessage(new ChatComponentText("You lack the proper resources to make this bar!")); }
			}
			else if (subject.equals("gold_bar"))
			{
				if (amountOfAll[5] >= 1)
				{
					inventory.consumeInventoryItem(ModMiningItems.goldOre);
					inventory.addItemStackToInventory(new ItemStack(Items.gold_ingot));
					updateInventory(mc, inventory.player);
				}
				else { inventory.player.addChatMessage(new ChatComponentText("You lack the proper resources to make this bar!")); }
			}
			else if (subject.equals("mithril_bar"))
			{
				if (amountOfAll[6] >= 1 && amountOfAll[0] >= getRequiredCoalFromSubject(subject))
				{
					for (int i = 0; i < getRequiredCoalFromSubject(subject); i++)
					{
						inventory.consumeInventoryItem(Items.coal);
					}
					
					inventory.consumeInventoryItem(ModMiningItems.mithrilOre);
					inventory.addItemStackToInventory(new ItemStack(ModSmithingItems.mithrilBar));
					updateInventory(mc, inventory.player);
				}
				else { inventory.player.addChatMessage(new ChatComponentText("You lack the proper resources to make this bar!")); }
			}
			else if (subject.equals("adamant_bar"))
			{
				if (amountOfAll[7] >= 1 && amountOfAll[0] >= getRequiredCoalFromSubject(subject))
				{
					for (int i = 0; i < getRequiredCoalFromSubject(subject); i++)
					{
						inventory.consumeInventoryItem(Items.coal);
					}
					
					inventory.consumeInventoryItem(ModMiningItems.adamantiteOre);
					inventory.addItemStackToInventory(new ItemStack(ModSmithingItems.adamantBar));
					updateInventory(mc, inventory.player);
				}
				else { inventory.player.addChatMessage(new ChatComponentText("You lack the proper resources to make this bar!")); }
			}
			else if (subject.equals("rune_bar"))
			{
				if (amountOfAll[8] >= 1 && amountOfAll[0] >= getRequiredCoalFromSubject(subject))
				{
					for (int i = 0; i < getRequiredCoalFromSubject(subject); i++)
					{
						inventory.consumeInventoryItem(Items.coal);
					}
					
					inventory.consumeInventoryItem(ModMiningItems.runiteOre);
					inventory.addItemStackToInventory(new ItemStack(ModSmithingItems.runeBar));
					updateInventory(mc, inventory.player);
				}
				else { inventory.player.addChatMessage(new ChatComponentText("You lack the proper resources to make this bar!")); }
			}
			else
			{
				LogHelper.error("Something went wrong here! ~Smelting Bars");
			}
		}
		else
		{
			inventory.player.addChatMessage(new ChatComponentText("You need a Level of at least: " + requiredLevel + " in Smithing, to make this bar!"));
		}
	}
	
	private void updateInventory(Minecraft mc, EntityPlayer player)
	{
		mc.displayGuiScreen(new GuiInventory(player));
		mc.displayGuiScreen((GuiScreen)null);
		mc.setIngameFocus();
	}
	
	private int getRequiredCoalFromSubject(String ore)
	{
		if (ore.equals("steel_bar")) { return 2; }
		else if (ore.equals("mithril_bar")) { return 4; }
		else if (ore.equals("adamant_bar")) { return 6; }
		else if (ore.equals("rune_bar")) { return 8; }
		else { return 0; }
	}
}