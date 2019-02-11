package javabuckets.mods.rcm.handlers;

import java.util.ArrayList;
import java.util.Random;

import javabuckets.mods.rcm.skills.farming.ModFarmingItems;
import javabuckets.mods.rcm.utility.DroptableReference;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class DropTableHandler 
{
	public ArrayList<Item> herb_seeds = new ArrayList<Item>();
	public ArrayList<Item> farming_seeds = new ArrayList<Item>();
	public ArrayList<Item> allotment_seeds = new ArrayList<Item>();
	public ArrayList<Item> fruitTree_cacti_seeds = new ArrayList<Item>();
	
	public void dropItemFromDroptable(LivingDropsEvent event, String droptableName)
	{
		Random rand = new Random();
		
		if (droptableName == DroptableReference.herbSeeds)
		{
			herb_seeds.add(ModFarmingItems.herbseed_guam); 
			herb_seeds.add(ModFarmingItems.herbseed_marrentill);
			herb_seeds.add(ModFarmingItems.herbseed_harralander);
			herb_seeds.add(ModFarmingItems.herbseed_ranarr);
			herb_seeds.add(ModFarmingItems.herbseed_spiritWeed);
			herb_seeds.add(ModFarmingItems.herbseed_toadflax);
			herb_seeds.add(ModFarmingItems.herbseed_irit);
			herb_seeds.add(ModFarmingItems.herbseed_wergali);
			herb_seeds.add(ModFarmingItems.herbseed_avantoe);
			herb_seeds.add(ModFarmingItems.herbseed_kwuarm);
			herb_seeds.add(ModFarmingItems.herbseed_snapdragon);
			herb_seeds.add(ModFarmingItems.herbseed_cadantine);
			herb_seeds.add(ModFarmingItems.herbseed_lantadyme);
			herb_seeds.add(ModFarmingItems.herbseed_dwarfWeed);
			herb_seeds.add(ModFarmingItems.herbseed_torstol);
			herb_seeds.add(ModFarmingItems.herbseed_fellstalk);
			
			event.entity.dropItem(herb_seeds.get(rand.nextInt(herb_seeds.size())), 1 + rand.nextInt(1) + rand.nextInt(1));
		}
		
		if (droptableName == DroptableReference.farmingSeeds)
		{
			farming_seeds.add(ModFarmingItems.allotmentseed_onion);
			farming_seeds.add(ModFarmingItems.allotmentseed_cabbage);
			farming_seeds.add(ModFarmingItems.allotmentseed_tomato);
			farming_seeds.add(ModFarmingItems.allotmentseed_sweetcorn);
			farming_seeds.add(ModFarmingItems.allotmentseed_strawberry);
			farming_seeds.add(ModFarmingItems.allotmentseed_snapeGrass);
			
			farming_seeds.add(ModFarmingItems.flowerseed_marigold);
			farming_seeds.add(ModFarmingItems.flowerseed_rosemary);
			farming_seeds.add(ModFarmingItems.flowerseed_nasturtium);
			farming_seeds.add(ModFarmingItems.flowerseed_woad);
			farming_seeds.add(ModFarmingItems.flowerseed_limpwurt);
			farming_seeds.add(ModFarmingItems.flowerseed_whiteLily);
			farming_seeds.add(ModFarmingItems.flowerseed_butterflyFlower);
			
			farming_seeds.add(ModFarmingItems.bushseed_redberry);
			farming_seeds.add(ModFarmingItems.bushseed_cadavaberry);
			farming_seeds.add(ModFarmingItems.bushseed_dwellberry);
			farming_seeds.add(ModFarmingItems.bushseed_jangerberry);
			farming_seeds.add(ModFarmingItems.bushseed_whiteberry);
			farming_seeds.add(ModFarmingItems.bushseed_poisonIvy);
			farming_seeds.add(ModFarmingItems.bushseed_barberry);
			
			event.entity.dropItem(farming_seeds.get(rand.nextInt(farming_seeds.size())), 3 + rand.nextInt(3));
		}
		
		if (droptableName == DroptableReference.allotmentSeeds)
		{
			allotment_seeds.add(ModFarmingItems.allotmentseed_onion);
			allotment_seeds.add(ModFarmingItems.allotmentseed_cabbage);
			allotment_seeds.add(ModFarmingItems.allotmentseed_tomato);
			allotment_seeds.add(ModFarmingItems.allotmentseed_sweetcorn);
			allotment_seeds.add(ModFarmingItems.allotmentseed_strawberry);
			
			event.entity.dropItem(allotment_seeds.get(rand.nextInt(allotment_seeds.size())), 3 + rand.nextInt(3));
		}
		
		if (droptableName == DroptableReference.fruitTreeCactiSeeds)
		{
			fruitTree_cacti_seeds.add(ModFarmingItems.fruittreeseed_apple);
			fruitTree_cacti_seeds.add(ModFarmingItems.fruittreeseed_banana);
			fruitTree_cacti_seeds.add(ModFarmingItems.fruittreeseed_orange);
			fruitTree_cacti_seeds.add(ModFarmingItems.fruittreeseed_curry);
			fruitTree_cacti_seeds.add(ModFarmingItems.fruittreeseed_pineapple);
			fruitTree_cacti_seeds.add(ModFarmingItems.fruittreeseed_papaya);
			fruitTree_cacti_seeds.add(ModFarmingItems.fruittreeseed_palm);
			
			fruitTree_cacti_seeds.add(ModFarmingItems.cacti_cactus);
			fruitTree_cacti_seeds.add(ModFarmingItems.cacti_potatoCactus);
			
			event.entity.dropItem(fruitTree_cacti_seeds.get(rand.nextInt(fruitTree_cacti_seeds.size())), 1);
		}
	}
}