package satpromc.apis.satapi.advanced_punishments;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import satpromc.apis.satapi.SatAPI;
import satpromc.apis.satapi.files.Files;

import java.util.Calendar;
import java.util.Date;

public class AdvancedBan {

    // TODO --> Implement Kicks at 'PlayerJoinleave'

    public static void banPlayer(Player p, String reason){
        Date d = Calendar.getInstance().getTime();
        Files.getBansYaml().set(p.getName() + ".time", d.getTime() + "");
        Files.getBansYaml().set(p.getName() + ".time", d.getTime() + "");
        Files.getBansYaml().set(p.getName() + ".reason", reason);
        Files.getBansYaml().set(p.getName() + ".bannedby", "Unknown");
        Files.saveBansYaml();
    }

    public static void banPlayer(Player p, String reason, Date timeLeft){
        Date d = Calendar.getInstance().getTime();
        Files.getBansYaml().set(p.getName() + ".time", d.getTime() + "");
        Files.getBansYaml().set(p.getName() + ".reason", reason);
        Files.getBansYaml().set(p.getName() + ".bannedby", "Unknown");
        Files.saveBansYaml();
    }

    public static void banPlayer(Player p, Player bannedBy, String reason){
        Date d = Calendar.getInstance().getTime();
        Files.getBansYaml().set(p.getName() + ".time", d.getTime() + "");
        Files.getBansYaml().set(p.getName() + ".reason", reason);
        Files.getBansYaml().set(p.getName() + ".bannedby", bannedBy.getName());
        Files.saveBansYaml();
    }

    /*public static void unbanPlayer(Player p){

         Files.getBansYaml().set(p.getName() + ".*", null);
    } */



    public String getBansFormat(Player banned) {
        return ChatColor.translateAlternateColorCodes('&', SatAPI.getInstance().getConfig().getString("bans-format")
                        .replace("%%title%%", SatAPI.getInstance().getConfig().getString("title"))
                        .replace("%%time%%", Files.getBansYaml().getString(banned.getName() + ".time"))
                        .replace("%%nextline%%", SatAPI.getInstance().getConfig().getString("\n"))
                        .replace("%%bannedby%%", Files.getBansYaml().getString(banned.getName() + ".bannedby"))
                        .replace("", "")


                //.replace("%%")
        );
    }


}
