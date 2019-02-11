package javabuckets.mods.rcm.init;

import javabuckets.mods.rcm.commands.*;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class ModCommands 
{
	public static void init(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandSetLevel());
		event.registerServerCommand(new CommandAddXPToSkill());
		event.registerServerCommand(new CommandMaxSkill());
		event.registerServerCommand(new CommandSetGp());
		event.registerServerCommand(new CommandSetMisc());

		event.registerServerCommand(new CommandFixErrors());
		event.registerServerCommand(new CommandSetLastTimePlayed());
		event.registerServerCommand(new CommandGetDailyChallenge());

		event.registerServerCommand(new CommandSetSlayerTask());
		event.registerServerCommand(new CommandSetBossTask());
		
		event.registerServerCommand(new AdminCommandBuy());
	}
}