package satpromc.apis.satapi.advanced_punishments;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import satpromc.apis.satapi.SatAPI;
import satpromc.apis.satapi.files.Files;

import java.util.Calendar;
import java.util.Date;

public class AdvancedBan {

    public static void banPlayer(Player p, String reason){
        Date d = Calendar.getInstance().getTime();
        Files.getBansYaml().set(p.getName() + ".time", d.getTime() + "");
        Files.getBansYaml().set(p.getName() + ".reason", reason);
        Files.saveBansYaml();
    }

    /*public static void unbanPlayer(Player p){

         Files.getBansYaml().set(p.getName(), null);
    } */



    public String getBansFormat() {
        return ChatColor.translateAlternateColorCodes('&', SatAPI.getInstance().getConfig().getString("bans-format")
                        .replace("%%title%%", SatAPI.getInstance().getConfig().getString("title"))
                        .replace("%%_%%", SatAPI.getInstance().getConfig().getString(""))
                        .replace("", SatAPI.getInstance().getConfig().getString(""))
                        .replace("", "")

                //.replace("%%")
        );
    }


}
