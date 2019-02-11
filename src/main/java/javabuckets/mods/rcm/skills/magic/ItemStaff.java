package javabuckets.mods.rcm.skills.magic;

import java.util.ArrayList;
import java.util.Random;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.items.ItemBase;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.utility.LogHelper;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemStaff extends ItemBase
{ 
	public ItemStaff(String unlocalizedName)
	{
		super(unlocalizedName);
		this.setMaxStackSize(1);
		this.setFull3D();
		this.setCreativeTab(ModCreativeTabs.rcmMagic);
	}

	public ItemStaff(String unlocalizedName, String element) 
	{
		this(unlocalizedName);
	}

	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag) 
	{

	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) 
	{	
		ArrowNockEvent event = new ArrowNockEvent(player, itemstack);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
		{
			return event.result;
		}

		if (RCM.instance.magic.getCurrentSelectedSpell() != "")
		{
			if (RCM.instance.magic.getRequiredLevelFromSpell(RCM.instance.magic.getCurrentSelectedSpell()) != 0 && RCM.instance.skillHandler.getLevel(SkillReference.mage) >= RCM.instance.magic.getRequiredLevelFromSpell(RCM.instance.magic.getCurrentSelectedSpell()))
			{
				RCM.instance.magic.checkForEffecientRunesForSpell(player, RCM.instance.magic.getCurrentSelectedSpell());

				if (RCM.instance.magic.hasEffecientRunesForSpell)
				{
					player.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));
				}
				else { }
			}
			else
			{
				player.addChatMessage(new ChatComponentText("You need a Level of at least: " + RCM.instance.magic.getRequiredLevelFromSpell(RCM.instance.magic.getCurrentSelectedSpell()) + " in Magic, utilize this spell!"));
			}
		}
		else
		{
			player.addChatMessage(new ChatComponentText("You need to select a spell!"));
		}

		return itemstack;
	}

	public void onPlayerStoppedUsing(ItemStack itemstack, World world, EntityPlayer player, int itemInUseCount)
	{
		int j = this.getMaxItemUseDuration(itemstack) - itemInUseCount;

		ArrowLooseEvent event = new ArrowLooseEvent(player, itemstack, j);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
		{
			return;
		}
		j = event.charge;

		float f = (float)j / 20.0F;
		f = (f * f + f * 2.0F) / 3.0F;

		if ((double)f < 1D)
		{
			return;
		}

		if (f > 1.0F)
		{
			f = 1.0F;
		}

		useMagicSpell(itemstack, world, player);
	}

	public void useMagicSpell(ItemStack itemstack, World world, EntityPlayer player)
	{

		Random rand = new Random();

		int magicLvl = RCM.instance.skillHandler.getLevel(SkillReference.mage);
		double additionalDmg = magicLvl / 8;
		double spellDmg = RCM.instance.magic.getMaxDamageFromSpell(RCM.instance.magic.getCurrentSelectedSpell());

		if (additionalDmg < 1)
		{
			additionalDmg = 0;
		}
		else 
		{
			additionalDmg = rand.nextInt((int)additionalDmg); 
		}
		double damage = spellDmg + additionalDmg;

		EntityMagicBolt magicbolt = new EntityMagicBolt(world, player, 5F, damage);

		if (!world.isRemote)
		{
			//LogHelper.info("spell damage: " + spellDmg);
			//LogHelper.info("add damage: " + additionalDmg);
			//LogHelper.info("total damage: " + damage);

			world.spawnEntityInWorld(magicbolt);
		}

		/**
		 * Remove Runes From Inventory!
		 */
		for (int i = 0; i < RCM.instance.magic.getRunesFromSpell(RCM.instance.magic.getCurrentSelectedSpell()).size(); i++)
		{
			player.inventory.consumeInventoryItem(RCM.instance.magic.getRunesFromSpell(RCM.instance.magic.getCurrentSelectedSpell()).get(i));
		}
	}

	public int getMaxItemUseDuration(ItemStack itemstack)
	{
		return 72000;
	}

	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player)
	{
		return itemstack;
	}

	public EnumAction getItemUseAction(ItemStack itemstack)
	{
		return EnumAction.bow;
	}
}