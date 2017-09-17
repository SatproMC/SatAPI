package satpromc.apis.satapi.player;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;
import satpromc.apis.satapi.SatAPI;



public class PlayerManipulator {


    public void setInvisible(Player p){
        for (Player all : Bukkit.getOnlinePlayers()){
            all.hidePlayer(p);
            p.sendMessage(SatAPI.getInstance().getConfig().getString("set-invisible-message-true"));
        }
    }

    public void setVisible(Player p){
        for (Player all : Bukkit.getOnlinePlayers()){
            all.showPlayer(p);
            p.sendMessage(SatAPI.getInstance().getConfig().getString("set-invisible-message-false"));
        }
    }

    public void launchPlayer(Player p, double distance){
        Vector v = new Vector();
        v = p.getLocation().getDirection().multiply(distance);
        p.setVelocity(v.setY(p.getLocation().getY() + 0.75));
    }





}
