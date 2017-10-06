package satpromc.apis.satapi.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.util.Vector;
import satpromc.apis.satapi.files.Files;


public class PlayerDamage implements Listener {

    @EventHandler
    public void onPlayerDamageByEntity(EntityDamageByEntityEvent e){

        if (e.getEntity() instanceof Player){
            Player p = (Player) e.getEntity();

            if (Files.getPlayerDataYaml().getBoolean(p.getName() + ".knockback-enabled")){
                Vector v = (p.getLocation().getDirection().multiply(0));
                p.setVelocity(v);
            }
        }
    }



}
