package satpromc.apis.satapi.events.custom_events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TNTIgniteEvent extends Event {


    private Player p;
    private Block tnt;
    private boolean cancelled = false;


    public TNTIgniteEvent(Player p, Block tnt){
        if (tnt.getType() != Material.TNT){
            System.out.println("You have not inputted TNT");
            return;
        }
        this.p = p;
        this.tnt = tnt;
    }



    public Boolean isCancelled(){
        return this.cancelled;
    }

    public void setCancelled(boolean newCancellation){
        this.cancelled = newCancellation;
    }

    private static final HandlerList handlers = new HandlerList();

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getPlayer() {
        return this.p;
    }

    public Block getTNT() {
        return this.tnt;
    }


}
