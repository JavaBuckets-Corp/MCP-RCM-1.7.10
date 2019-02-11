package javabuckets.mods.rcm.handlers;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import javabuckets.mods.rcm.blocks.tileentities.TileEntityRSFurnace;
import javabuckets.mods.rcm.guis.GUIRCMMainMenu;
import javabuckets.mods.rcm.huds.HUDSkillsTab;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.player.ExtendedPlayer;
import javabuckets.mods.rcm.skills.fishing.ModFishingItems;
import javabuckets.mods.rcm.skills.magic.GUIMagicSpellSelection;
import javabuckets.mods.rcm.skills.prayer.GUIPrayerSelection;
import javabuckets.mods.rcm.utility.DateUtil;
import javabuckets.mods.rcm.utility.DoubleXPUtil;
import javabuckets.mods.rcm.utility.LevelUpUtil;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import javabuckets.mods.rcm.utility.UtilAPI;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;

public class RCMEventHandler 
{
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
		if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer)event.entity) == null)
		{
			ExtendedPlayer.register((EntityPlayer)event.entity);
		}

		if (event.entity instanceof EntityPlayer && event.entity.getExtendedProperties(ExtendedPlayer.EXT_PROP_NAME) == null)
		{
			event.entity.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer((EntityPlayer)event.entity));
		}
	}

	private boolean skillTabOpened = false;
	private boolean isSkillTabTimerRunning = false;
	private int skillTabOpenCloseTimer = 20;

	public static boolean isKeyDown = false;
	public static boolean canKeyBeDown = true;
	public static int keyDownResetTimer = 5;

	public static boolean hasBeenRun = false;

	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{	
			EntityPlayer player = (EntityPlayer) event.entity;
			ItemStack heldItem = player.inventory.getCurrentItem();
			Minecraft mc = Minecraft.getMinecraft();

			RCM.instance.skillHandler.onUpdate(player, player.worldObj);
			RCM.instance.gpHandler.onUpdate(player, player.worldObj);
			RCM.instance.playerBonuses.onUpdate(player, player.worldObj);

			/**
			 * Random Testing
			 */
			if ((heldItem != null && heldItem.getItem() instanceof javabuckets.mods.rcm.items.mining.ItemPickaxe) || (heldItem != null && heldItem.getItem() instanceof net.minecraft.item.ItemPickaxe))
			{
				checkForSilkTouch(player, heldItem);
			}

			if (Keyboard.isKeyDown(Keyboard.KEY_W) && !hasBeenRun)
			{
				/*if (!(RCM.instance.dailyGiftHandler.getDate().equals(DateUtil.getDateToday())))
				{
					DateUtil.dateHandling();
					RCM.instance.dailies.addPossibleDailiesToList();
					RCM.instance.dailies.setRandomDailyChallenge();
					player.addChatMessage(new ChatComponentText("Your new daily challenge is: " + RCM.instance.dailies.getDailyChallenge()));
					//mc.displayGuiScreen(new GUIDailyGift(player));
				}*/
				
				String currentDate = DateUtil.getDateToday();
				int currentDay = Integer.valueOf(currentDate.substring(0, 2));
				int currentMonth = Integer.valueOf(currentDate.substring(3, 5));
				
				LogHelper.info("Current date: " + currentDate);
				LogHelper.info("Current day: " + currentDay);
				LogHelper.info("Current month: " + currentMonth);
				LogHelper.info("Days till Double XP: " + (DoubleXPUtil.getDaysInMonth(currentMonth) - currentDay));
				
				if (DoubleXPUtil.getDaysInMonth(currentMonth) - currentDay == 0) player.addChatMessage(new ChatComponentText("Today is Double XP! You will yield twice as much experience as normal when training your skills!"));
				
				hasBeenRun = true;
			}

			if (RCM.instance.skillHandler.isFirstTimeLogon())
			{
				handleFirstTimeLogon(player);
			}

			if (Keyboard.isKeyDown(Keyboard.KEY_LCONTROL) && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
			{
				mc.displayGuiScreen(new GUIRCMMainMenu());
			}

			if (Keyboard.isKeyDown(Keyboard.KEY_LCONTROL) && Keyboard.isKeyDown(Keyboard.KEY_G))
			{
				HUDSkillsTab.displaySkillTab = true;
				skillTabOpened = false;
				isSkillTabTimerRunning = true;
				mc.displayGuiScreen(new GUIPrayerSelection());
			}

			if (Keyboard.isKeyDown(Keyboard.KEY_LCONTROL) && Keyboard.isKeyDown(Keyboard.KEY_C))
			{
				HUDSkillsTab.displaySkillTab = true;
				skillTabOpened = false;
				isSkillTabTimerRunning = true;
				mc.displayGuiScreen(new GUIMagicSpellSelection());
			}

			if (Keyboard.isKeyDown(Keyboard.KEY_LCONTROL) && Keyboard.isKeyDown(Keyboard.KEY_F) && skillTabOpened == false && skillTabOpenCloseTimer >= 20)
			{	
				HUDSkillsTab.displaySkillTabMsg = false;
				HUDSkillsTab.displaySkillTab = false;
				skillTabOpened = true;
				isSkillTabTimerRunning = true;
			}
			else if (Keyboard.isKeyDown(Keyboard.KEY_LCONTROL) && Keyboard.isKeyDown(Keyboard.KEY_F) && skillTabOpened == true && skillTabOpenCloseTimer >= 20)
			{
				HUDSkillsTab.displaySkillTab = true;
				skillTabOpened = false;
				isSkillTabTimerRunning = true;
			}
			if (isSkillTabTimerRunning)
			{
				skillTabOpenCloseTimer--;
			}
			if (skillTabOpenCloseTimer <= 0)
			{
				isSkillTabTimerRunning = false;
				skillTabOpenCloseTimer = 20;
			}
		}
	}

	private void checkForSilkTouch(EntityPlayer player, ItemStack itemstack)
	{
		String silkTouchEnchantment = "{id:33s,lvl:1s,}";
		
		if (itemstack.isItemEnchanted()) 
		{
			for (int i = 0; i < itemstack.getEnchantmentTagList().tagCount(); i++)
			{
				if (itemstack.getEnchantmentTagList().getCompoundTagAt(i).toString().equals(silkTouchEnchantment))
				{
					itemstack.getEnchantmentTagList().removeTag(i);
				}
			}
		}
	}

	private void handleFirstTimeLogon(EntityPlayer player) 
	{
		RCM.instance.skillHandler.resetPlayer();
		RCM.instance.prayer.setPrayerPoints(RCM.instance.skillHandler.getLevel(SkillReference.pray) * 10);
		RCM.instance.summoning.setSummoningPoints(RCM.instance.skillHandler.getLevel(SkillReference.summ));

		double amp = RCM.instance.skillHandler.getLevel(SkillReference.cons) / 7;
		player.addPotionEffect(new PotionEffect(Potion.field_76434_w.id, Integer.MAX_VALUE, (int)amp));
		LevelUpUtil.lvlHandling();
		
		RCM.instance.skillHandler.setFirstTimeLogon(false);
	}

	@SubscribeEvent
	public void onPlayerEnterWorld(EntityJoinWorldEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			LevelUpUtil.lvlHandling();
		}
	}
	
	int i = 0;
	int x, y, z, x2, y2, z2;
	
	//@SubscribeEvent
	public void onBlockRightClick(PlayerInteractEvent event) 
	{
		if (event.entityPlayer.getHeldItem() != null && event.entityPlayer.getHeldItem().getItem() == ModFishingItems.fishingNet)
		{
			if (event.action.equals(event.action.RIGHT_CLICK_BLOCK))
			{
				x = event.x+1;
				y = event.y-1;
				z = event.z+1;
				
				if (i == 0) 
				{ 
					i = 1; 
					LogHelper.info("Position 1: " + x + " " + y + " " + z); 
				}
			}
		}
	}
	
	//@SubscribeEvent
	public void onBlockBreak(BlockEvent.BreakEvent event)
	{
		if (event.getPlayer().getHeldItem() != null && event.getPlayer().getHeldItem().getItem() == ModFishingItems.fishingNet)
		{
			x2 = event.x;
			y2 = event.y;
			z2 = event.z;
			
			if (i == 1) 
			{ 
				i = 0; 
				LogHelper.info("Position 2: " + x2 + " " + y2 + " " + z2); 
				UtilAPI.getListOfBlocksInArea(event.world, x, y, z, x2, y2, z2); 
			}
		}
	}
}
