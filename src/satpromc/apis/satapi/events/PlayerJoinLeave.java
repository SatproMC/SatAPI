package satpromc.apis.satapi.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import satpromc.apis.satapi.files.Files;

import java.util.Calendar;

public class PlayerJoinLeave implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        if (Files.getPlayerDataYaml().get(p.getName()) == null){
            Files.getPlayerDataYaml().set(p.getName() + ".first-login", Calendar.getInstance().getTime() + "");
            Files.getPlayerDataYaml().set(p.getName() + ".knockback-enabled", false);
            Files.getPlayerDataYaml().set(p.getName() + "last-login", "none");
            Files.savePlayerDataYaml();
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        Player p = e.getPlayer();
        Files.getPlayerDataYaml().set(p.getName() + ".last-login", Calendar.getInstance().getTime() + "");
        Files.savePlayerDataYaml();
    }

}
