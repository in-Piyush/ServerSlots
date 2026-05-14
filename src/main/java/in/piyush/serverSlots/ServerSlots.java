package in.piyush.serverSlots;

import in.piyush.serverSlots.commands.serverslotcommand;
import org.bstats.bukkit.Metrics;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ServerSlots extends JavaPlugin  implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Plugin Enabled");
         getCommand("serverslots").setExecutor(new serverslotcommand());
        int pluginId = 31309;
        Metrics metrics = new Metrics(this, pluginId);

    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin Disabled");
    }
}
