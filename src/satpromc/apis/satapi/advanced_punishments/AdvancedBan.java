package satpromc.apis.satapi.advanced_punishments;

import org.bukkit.entity.Player;
import satpromc.apis.satapi.files.Files;

import java.util.Calendar;
import java.util.Date;

public class AdvancedBan {

    public static void banPlayer(Player p, String reason){
        Date d = Calendar.getInstance().getTime();
        Files.getBansYaml().set(p.getName() + ".time", d.getTime() + "");
        Files.getBansYaml().set(p.getName() + ".reason", reason);
    }





}
