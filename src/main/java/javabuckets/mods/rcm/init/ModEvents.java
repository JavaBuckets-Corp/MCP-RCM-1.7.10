package javabuckets.mods.rcm.init;

import javabuckets.mods.rcm.generators.WorldOreGenerator;
import javabuckets.mods.rcm.generators.WorldTreeGenerator;
import javabuckets.mods.rcm.handlers.EntityEventHandler;
import javabuckets.mods.rcm.handlers.GuiHandler;
import javabuckets.mods.rcm.handlers.ItemHandler;
import javabuckets.mods.rcm.handlers.RCMEventHandler;
import javabuckets.mods.rcm.main.RCM;
import javabuckets.mods.rcm.skills.combat.CombatEventHandler;
import javabuckets.mods.rcm.skills.constitution.ConstitutionEventHandler;
import javabuckets.mods.rcm.skills.defence.DefenceEventHandler;
import javabuckets.mods.rcm.skills.farming.FarmingEventHandler;
import javabuckets.mods.rcm.skills.fishing.FishingEventHandler;
import javabuckets.mods.rcm.skills.magic.MagicEventHandler;
import javabuckets.mods.rcm.skills.mining.MiningEventHandler;
import javabuckets.mods.rcm.skills.prayer.PrayerEventHandler;
import javabuckets.mods.rcm.skills.runecrafting.RunecraftingEventHandler;
import javabuckets.mods.rcm.skills.slayer.SlayerEventHandler;
import javabuckets.mods.rcm.skills.smithing.SmithingEventHandler;
import javabuckets.mods.rcm.skills.strength.StrengthEventHandler;
import javabuckets.mods.rcm.skills.thieving.ThievingEventHandler;
import javabuckets.mods.rcm.skills.woodcutting.WoodcuttingEventHandler;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModEvents 
{
	public static void init()
	{
		MinecraftForge.EVENT_BUS.register(new RCMEventHandler());
		MinecraftForge.EVENT_BUS.register(new EntityEventHandler());
		MinecraftForge.EVENT_BUS.register(new ItemHandler());
		
		NetworkRegistry.INSTANCE.registerGuiHandler(RCM.instance, new GuiHandler());

		GameRegistry.registerWorldGenerator(new WorldOreGenerator(), 0);
		GameRegistry.registerWorldGenerator(new WorldTreeGenerator(), 0);
		
		RenderingRegistry.addNewArmourRendererPrefix("5"); // Mithril
	}
	
	public static void postInit()
	{
		MinecraftForge.EVENT_BUS.register(new CombatEventHandler());
		MinecraftForge.EVENT_BUS.register(new ConstitutionEventHandler());
		MinecraftForge.EVENT_BUS.register(new MiningEventHandler());
		MinecraftForge.EVENT_BUS.register(new StrengthEventHandler());
		MinecraftForge.EVENT_BUS.register(new DefenceEventHandler());
		FMLCommonHandler.instance().bus().register(new SmithingEventHandler());
		MinecraftForge.EVENT_BUS.register(new FishingEventHandler());
		MinecraftForge.EVENT_BUS.register(new ThievingEventHandler());
		MinecraftForge.EVENT_BUS.register(new PrayerEventHandler());
		MinecraftForge.EVENT_BUS.register(new MagicEventHandler());
		MinecraftForge.EVENT_BUS.register(new WoodcuttingEventHandler());
		MinecraftForge.EVENT_BUS.register(new RunecraftingEventHandler());
		MinecraftForge.EVENT_BUS.register(new SlayerEventHandler());
		MinecraftForge.EVENT_BUS.register(new FarmingEventHandler());
	}
}