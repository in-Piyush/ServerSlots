package in.piyush.serverSlots.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class serverslotcommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        if (args.length == 0) {
            player.sendMessage("Usage: /serverslots <amount>");
            return true;
        }

        try {

            int slots = Integer.parseInt(args[0]);

            if (slots <= 0) {
                player.sendMessage("Slots must be greater than 0.");
                return true;
            }

            Bukkit.setMaxPlayers(slots);

            player.sendMessage("Server slots changed to " + slots);

        } catch (NumberFormatException e) {

            player.sendMessage("Please enter a valid number.");

        }

        return true;
    }
}