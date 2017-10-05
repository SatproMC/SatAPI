package satpromc.apis.satapi.events.custom_events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class TNTIgnitionEvent extends SEvent implements Listener {

    @EventHandler
    public void onTNTIgnite(PlayerInteractEvent e){
        if (e.getAction() == Action.RIGHT_CLICK_AIR){
            if (e.getClickedBlock().getType() == Material.TNT &&
                    (e.getPlayer().getItemInHand().getType() == Material.FLINT_AND_STEEL || e.getPlayer().getItemInHand().getType() == Material.FLINT_AND_STEEL)){
                if (this.isCancelled()){
                    e.setCancelled(true);
                }
                this.setPlayer(e.getPlayer());
            }
        }
    }

    public void TNTIgniteEvent(){

    }



}
