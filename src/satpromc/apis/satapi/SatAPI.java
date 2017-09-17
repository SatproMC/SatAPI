package satpromc.apis.satapi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import satpromc.apis.satapi.advanced_punishments.AdvancedBan;
import satpromc.apis.satapi.player.PlayerManipulator;

public class SatAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(cc(
             "&7------------[ &aSatAPI &7]------------\n" +
                "&8Version: &dBETA &90.1\n" +
                "\n&8Made by: &7SatproMC"));
    }

    public static SatAPI getInstance() {
        return new SatAPI();
    }

    private String cc(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public PlayerManipulator getPlayerManipulator() {
        return new PlayerManipulator();
    }

    public AdvancedBan getAdvancedBan() {
        return new AdvancedBan();
    }


    public String getBansFormat() {
        return ChatColor.translateAlternateColorCodes('&', getConfig().getString("bans-format")
                        .replace("%%title%%", getConfig().getString("title"))
                //.replace("%%")
        );
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("satapi")) {
            if (sender.isOp()) {
                sender.sendMessage(cc("&7------------[ &aSatAPI &7]------------\n" +
                        "&8Version: &dBETA &90.1\n" +
                        "\n&8Made by: &7SatproMC"));
            } else sender.sendMessage(ChatColor.RED + "You cannot use this command!");
        }
        return true;
    }
}