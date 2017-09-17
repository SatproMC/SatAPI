package satpromc.apis.satapi.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinLeave implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

    }

}
