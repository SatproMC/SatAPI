package satpromc.apis.satapi.events.custom_events;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class SEvent implements Listener  {

    SEvent(){

    }



    private Player p;
    private boolean cancelled = false;

    public void setCancelled(boolean b){
        this.cancelled = b;
    }

    public boolean isCancelled(){
        return cancelled;
    }


    void setPlayer(Player p){

    }

    public Player getPlayer() {
        return p;
    }



}
