package javabuckets.mods.rcm.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import javabuckets.mods.rcm.dailies.DailyChallengeHandler;
import javabuckets.mods.rcm.generators.WorldGenYewTree;
import javabuckets.mods.rcm.handlers.DailyGiftHandler;
import javabuckets.mods.rcm.handlers.DropTableHandler;
import javabuckets.mods.rcm.handlers.RCMGpHandler;
import javabuckets.mods.rcm.huds.HUDOverlay;
import javabuckets.mods.rcm.init.ModBlocks;
import javabuckets.mods.rcm.init.ModCommands;
import javabuckets.mods.rcm.init.ModCreativeTabs;
import javabuckets.mods.rcm.init.ModEvents;
import javabuckets.mods.rcm.init.ModItems;
import javabuckets.mods.rcm.init.ModRecipes;
import javabuckets.mods.rcm.player.PlayerBonuses;
import javabuckets.mods.rcm.proxies.CommonProxy;
import javabuckets.mods.rcm.recipes.ModSmithingRecipes;
import javabuckets.mods.rcm.recipes.RecipeRemover;
import javabuckets.mods.rcm.skills.BaseSkill;
import javabuckets.mods.rcm.skills.SkillHandler;
import javabuckets.mods.rcm.skills.combat.CombatHandler;
import javabuckets.mods.rcm.skills.cooking.CookingHandler;
import javabuckets.mods.rcm.skills.farming.FarmingHandler;
import javabuckets.mods.rcm.skills.firemaking.FiremakingHandler;
import javabuckets.mods.rcm.skills.fishing.FishingHandler;
import javabuckets.mods.rcm.skills.magic.MagicHandler;
import javabuckets.mods.rcm.skills.mining.MiningHandler;
import javabuckets.mods.rcm.skills.prayer.PrayerHandler;
import javabuckets.mods.rcm.skills.runecrafting.RunecraftingHandler;
import javabuckets.mods.rcm.skills.slayer.SlayerHandler;
import javabuckets.mods.rcm.skills.smithing.SmithingHandler;
import javabuckets.mods.rcm.skills.summoning.SummoningHandler;
import javabuckets.mods.rcm.skills.thieving.ThievingHandler;
import javabuckets.mods.rcm.skills.woodcutting.WoodcuttingHandler;
import javabuckets.mods.rcm.utility.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)

public class RCM
{
	@SidedProxy(clientSide = "javabuckets.mods.rcm.proxies.ClientProxy",
				serverSide = "javabuckets.mods.rcm.proxies.CommonProxy")
	public static CommonProxy proxy;

	@Instance(Reference.MOD_ID)
	public static RCM instance;

	public SkillHandler skillHandler = new SkillHandler();
	public BaseSkill skill = new BaseSkill();
	public RCMGpHandler gpHandler = new RCMGpHandler();

	public CombatHandler combat = new CombatHandler();
	public MiningHandler mining = new MiningHandler();
	public SmithingHandler smithing = new SmithingHandler();
	public FishingHandler fishing = new FishingHandler();
	public ThievingHandler thieving = new ThievingHandler();
	public CookingHandler cooking = new CookingHandler();
	public PrayerHandler prayer = new PrayerHandler();
	public FiremakingHandler firemaking = new FiremakingHandler();
	public WoodcuttingHandler woodcutting = new WoodcuttingHandler();
	public RunecraftingHandler runecrafting = new RunecraftingHandler();
	public MagicHandler magic = new MagicHandler();
	public SlayerHandler slayer = new SlayerHandler();
	public FarmingHandler farming = new FarmingHandler();
	public SummoningHandler summoning = new SummoningHandler();
	
	public DailyGiftHandler dailyGiftHandler = new DailyGiftHandler();
	public PlayerBonuses playerBonuses = new PlayerBonuses();
	public DailyChallengeHandler dailies = new DailyChallengeHandler();
	public RecipeRemover recipeRemover = new RecipeRemover();
	public DropTableHandler droptable = new DropTableHandler();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModCreativeTabs.init();
		ModBlocks.init();
		ModItems.init();
		ModRecipes.init();
		HUDOverlay.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModEvents.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		ModEvents.postInit();
		ModSmithingRecipes.removeRecipes();
		proxy.proxy();
	}

	@EventHandler
	public void onServerStarting(FMLServerStartingEvent event)
	{
		ModCommands.init(event);
	}
}