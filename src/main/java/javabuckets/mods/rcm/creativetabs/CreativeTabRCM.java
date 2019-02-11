package javabuckets.mods.rcm.creativetabs;

import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.init.ModTabIcons;
import javabuckets.mods.rcm.skills.firemaking.ModFiremakingItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabRCM extends CreativeTabs
{
	private String tabLabel;
	
	public CreativeTabRCM(String name) 
	{
		super(name.toLowerCase().replace('/', ' '));
		this.tabLabel = name;
	}

	@Override
	public Item getTabIconItem() 
	{
		if (tabLabel.equals(ModCreativeTabs.creativeTabNames[0])) {
			return ModTabIcons.att;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[1])) {
			return ModTabIcons.range;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[2])) {
			return ModTabIcons.mage;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[3])) {
			return ModTabIcons.mine;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[4])) {
			return ModTabIcons.smith;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[5])) {
			return ModTabIcons.herb;	
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[6])) {
			return ModTabIcons.fish;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[7])) {
			return ModTabIcons.cook;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[8])) {
			return ModTabIcons.craft;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[9])) {
			return ModTabIcons.fletch;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[10])) {
			return ModTabIcons.wc;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[11])) {
			return ModTabIcons.rc;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[12])) {
			return ModTabIcons.slay;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[13])) {
			return ModTabIcons.farm;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[14])) {
			return ModTabIcons.con;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[15])) {
			return ModTabIcons.hunt;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[16])) {
			return ModTabIcons.summ;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[17])) {
			return ModTabIcons.dung;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[18])) {
			return ModTabIcons.div;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[19])) {
			return ModTabIcons.loot;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[20])) {
			return ModFiremakingItems.tinderbox;
		}
		else if (tabLabel.equals(ModCreativeTabs.creativeTabNames[21])) {
			return ModTabIcons.quest;
		}
		
		else { return null; }
	}
	
	/*@Override
	public boolean hasSearchBar() 
	{
		return true;
	}*/
	
	@Override
	public String getTranslatedTabLabel()
	{
		return tabLabel;
	}
}