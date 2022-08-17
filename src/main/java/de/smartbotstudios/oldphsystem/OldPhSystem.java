package de.smartbotstudios.oldphsystem;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class OldPhSystem extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    @EventHandler
    public void onCMD(PlayerCommandPreprocessEvent e) {
        Player p = e.getPlayer();

        String[] cmd = e.getMessage().substring(1).split(" ");

        if (cmd[0].equalsIgnoreCase("2") || (cmd[0].equalsIgnoreCase("p") || (cmd[0].equalsIgnoreCase("p2")
                || (cmd[0].toLowerCase().startsWith("plot") || (cmd[0].toLowerCase().startsWith("plotme") || (cmd[0]
                .toLowerCase().startsWith("plots")
                || (cmd[0].toLowerCase().startsWith("plotsquared")
                || (cmd[0].toLowerCase().startsWith("plotsquared:2") || (cmd[0].toLowerCase()
                .startsWith("plotsquared:p")
                || (cmd[0].toLowerCase().startsWith("plotsquared:p2") || (cmd[0].toLowerCase()
                .startsWith("plotsquared:plot")
                || (cmd[0].toLowerCase().startsWith("plotsquared:plotme") || (cmd[0]
                .toLowerCase().startsWith("plotsquared:plots")
                || (cmd[0].toLowerCase().startsWith("plotsquared:plotsquared")
                || (cmd[0].toLowerCase()
                .startsWith("plotsquared:ps")))))))))))))))) {
            if (cmd.length >= 3) {
                if (cmd[1].equalsIgnoreCase("h") || cmd[1].equalsIgnoreCase("home")) {
                    if (cmd[2].matches("\\d")) {
                        return;
                    } else {
                        e.setCancelled(true);
                        cmd[1] = "visit";
                        cmd[2] = Bukkit.getOfflinePlayer(cmd[2]).getName();
                        StringBuilder stringBuilder = new StringBuilder();
                        for (String s : cmd) {
                            stringBuilder.append(s);
                            stringBuilder.append(" ");
                        }
                        String command = stringBuilder.toString();

                        p.performCommand(command);
                    }

                }
            }
        }
    }


}
