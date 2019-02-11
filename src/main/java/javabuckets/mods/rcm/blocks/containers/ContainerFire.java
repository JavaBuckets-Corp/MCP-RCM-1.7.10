package javabuckets.mods.rcm.blocks.containers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import javabuckets.mods.rcm.blocks.slots.SlotFire;
import javabuckets.mods.rcm.blocks.tileentities.TileEntityFire;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.cooking.CookingRecipes;
import javabuckets.mods.rcm.utility.SkillReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;

public class ContainerFire extends Container
{
    private TileEntityFire tileFire;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;

    public ContainerFire(InventoryPlayer p_i1812_1_, TileEntityFire p_i1812_2_)
    {
        this.tileFire = p_i1812_2_;
        this.addSlotToContainer(new Slot(p_i1812_2_, 0, 56, 17));
        this.addSlotToContainer(new Slot(p_i1812_2_, 1, 56, 53));
        this.addSlotToContainer(new SlotFire(p_i1812_1_.player, p_i1812_2_, 2, 116, 35));
        int i;

        for (i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(p_i1812_1_, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(p_i1812_1_, i, 8 + i * 18, 142));
        }
    }

    public void addCraftingToCrafters(ICrafting p_75132_1_)
    {
        super.addCraftingToCrafters(p_75132_1_);
        p_75132_1_.sendProgressBarUpdate(this, 0, this.tileFire.fireCookTime);
        p_75132_1_.sendProgressBarUpdate(this, 1, this.tileFire.furnaceBurnTime);
        p_75132_1_.sendProgressBarUpdate(this, 2, this.tileFire.currentItemBurnTime);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i)
        {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.lastCookTime != this.tileFire.fireCookTime)
            {
                icrafting.sendProgressBarUpdate(this, 0, this.tileFire.fireCookTime);
            }

            if (this.lastBurnTime != this.tileFire.furnaceBurnTime)
            {
                icrafting.sendProgressBarUpdate(this, 1, this.tileFire.furnaceBurnTime);
            }

            if (this.lastItemBurnTime != this.tileFire.currentItemBurnTime)
            {
                icrafting.sendProgressBarUpdate(this, 2, this.tileFire.currentItemBurnTime);
            }
        }

        this.lastCookTime = this.tileFire.fireCookTime;
        this.lastBurnTime = this.tileFire.furnaceBurnTime;
        this.lastItemBurnTime = this.tileFire.currentItemBurnTime;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int p_75137_1_, int p_75137_2_)
    {
        if (p_75137_1_ == 0)
        {
            this.tileFire.fireCookTime = p_75137_2_;
        }

        if (p_75137_1_ == 1)
        {
            this.tileFire.furnaceBurnTime = p_75137_2_;
        }

        if (p_75137_1_ == 2)
        {
            this.tileFire.currentItemBurnTime = p_75137_2_;
        }
    }

    public boolean canInteractWith(EntityPlayer p_75145_1_)
    {
        return this.tileFire.isUseableByPlayer(p_75145_1_);
    }

    /**
     * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
     */
    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
    {
//        ItemStack itemstack = null;
//        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);
//
//        if (slot != null && slot.getHasStack())
//        {
//            ItemStack itemstack1 = slot.getStack();
//            itemstack = itemstack1.copy();
//
//            if (p_82846_2_ == 2)
//            {
//                if (!this.mergeItemStack(itemstack1, 3, 39, true))
//                {
//                    return null;
//                }
//
//                RCM.instance.skillHandler.addXPToSkill(SkillReference.cook, 10 * itemstack1.stackSize);
//                slot.onSlotChange(itemstack1, itemstack);
//            }
//            else if (p_82846_2_ != 1 && p_82846_2_ != 0)
//            {
//                if (CookingRecipes.cooking().getCookingResult(itemstack1) != null)
//                {
//                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
//                    {
//                        return null;
//                    }
//                }
//                else if (TileEntityFire.isItemFuel(itemstack1))
//                {
//                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
//                    {
//                        return null;
//                    }
//                }
//                else if (p_82846_2_ >= 3 && p_82846_2_ < 30)
//                {
//                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
//                    {
//                        return null;
//                    }
//                }
//                else if (p_82846_2_ >= 30 && p_82846_2_ < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
//                {
//                    return null;
//                }
//            }
//            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
//            {
//                return null;
//            }
//
//            if (itemstack1.stackSize == 0)
//            {
//                slot.putStack((ItemStack)null);
//            }
//            else
//            {
//                slot.onSlotChanged();
//            }
//
//            if (itemstack1.stackSize == itemstack.stackSize)
//            {
//                return null;
//            }
//
//            slot.onPickupFromSlot(p_82846_1_, itemstack1);
//        }

        return null;
    }
}