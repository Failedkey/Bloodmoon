package antibiotic.me;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Startup extends JavaPlugin{

	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new OnEntitySpawnEvent(), this);
		super.onEnable();
	}
	
	public void onDisable() {
		super.onDisable();
	}
	
}
