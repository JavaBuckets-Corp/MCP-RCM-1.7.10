//package javabuckets.mods.rcm.recipes;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
//
//import javabuckets.mods.rcm.skills.mining.ModMiningItems;
//import net.minecraft.block.Block;
//import net.minecraft.init.Items;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//
//public class RSFurnaceRecipes 
//{
//	private static final RSFurnaceRecipes smeltingBase = new RSFurnaceRecipes();
//	/** The list of smelting results. */
//	private Map smeltingList = new HashMap();
//	private Map experienceList = new HashMap();
//
//	public static RSFurnaceRecipes smelting()
//	{
//		return smeltingBase;
//	}
//
//	private RSFurnaceRecipes()
//	{
//		this.addItemEntry(ModMiningItems.ironOre, new ItemStack(Items.iron_ingot), 0.7F);
//	}
//
//	public void addBlockEntry(Block input, ItemStack output, float xp)
//	{
//		this.addItemEntry(Item.getItemFromBlock(input), output, xp);
//	}
//
//	public void addItemEntry(Item input, ItemStack output, float xp)
//	{
//		this.addItemStackEntry(new ItemStack(input, 1, 32767), output, xp);
//	}
//
//	public void addItemStackEntry(ItemStack input, ItemStack output, float xp)
//	{
//		this.smeltingList.put(input, output);
//		this.experienceList.put(output, Float.valueOf(xp));
//	}
//	
//	/**
//     * Returns the smelting result of an item.
//     */
//    public ItemStack getSmeltingResult(ItemStack itemstack)
//    {
//        Iterator iterator = this.smeltingList.entrySet().iterator();
//        Entry entry;
//
//        do
//        {
//            if (!iterator.hasNext())
//            {
//                return null;
//            }
//
//            entry = (Entry)iterator.next();
//        }
//        while (!this.func_151397_a(itemstack, (ItemStack)entry.getKey()));
//
//        return (ItemStack)entry.getValue();
//    }
//
//    private boolean func_151397_a(ItemStack input, ItemStack output)
//    {
//        return output.getItem() == input.getItem() && (output.getItemDamage() == 32767 || output.getItemDamage() == input.getItemDamage());
//    }
//
//    public Map getSmeltingList()
//    {
//        return this.smeltingList;
//    }
//
//    public float getXPFromOutput(ItemStack itemstack)
//    {
//        float ret = itemstack.getItem().getSmeltingExperience(itemstack);
//        if (ret != -1) return ret;
//
//        Iterator iterator = this.experienceList.entrySet().iterator();
//        Entry entry;
//
//        do
//        {
//            if (!iterator.hasNext())
//            {
//                return 0.0F;
//            }
//
//            entry = (Entry)iterator.next();
//        }
//        while (!this.func_151397_a(itemstack, (ItemStack)entry.getKey()));
//
//        return ((Float)entry.getValue()).floatValue();
//    }
//}
