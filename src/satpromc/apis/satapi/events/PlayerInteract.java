package satpromc.apis.satapi.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import satpromc.apis.satapi.events.custom_events.TNTIgniteEvent;

public class PlayerInteract implements Listener {


    @EventHandler
    public void playerInteract(PlayerInteractEvent e){
        if (e.getClickedBlock().getType() == Material.TNT && e.getPlayer().getItemInHand().getType() == Material.FLINT_AND_STEEL ||
                e.getPlayer().getItemInHand().getType() == Material.FIREBALL){
            Bukkit.getServer().getPluginManager().callEvent(new TNTIgniteEvent(e.getPlayer(), e.getClickedBlock()));
            // TODO
        }
    }


}
