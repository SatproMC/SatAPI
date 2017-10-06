package satpromc.apis.satapi.player;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;
import satpromc.apis.satapi.SatAPI;
import satpromc.apis.satapi.files.Files;

import java.util.Random;


public class PlayerManipulator {


    public void setInvisible(Player p){
        for (Player all : Bukkit.getOnlinePlayers()){
            all.hidePlayer(p);
        }
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', SatAPI.getInstance().getConfig().getString("set-invisible-message-true")));
    }

    public void setVisible(Player p){
        for (Player all : Bukkit.getOnlinePlayers()){
            all.showPlayer(p);
        }
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', SatAPI.getInstance().getConfig().getString("set-invisible-message-false")));

    }

    public void launchPlayer(Player p, double distance){
        Vector v = new Vector();
        v = p.getLocation().getDirection().multiply(distance);
        p.setVelocity(v.setY(p.getLocation().getY() + 0.75));
    }

    public void launchPlayer(Player p, double distance, double height){
        Vector v = p.getLocation().getDirection().multiply(distance);
        p.setVelocity(v.setY(p.getLocation().getY() + height));
    }




    public void updateKnockback(Player p, Boolean b){
        if (b){
            Files.getPlayerDataYaml().set(p.getName() + ".knockback-enabled", true);
            Files.savePlayerDataYaml();
        } else {
            Files.getPlayerDataYaml().set(p.getName() + ".knockback-enabled", false);
            Files.savePlayerDataYaml();
        }
    }



    public boolean isKnockbackEnabled(Player p){
        if (Files.getPlayerDataYaml().isBoolean(p.getName() + ".knockback-enabled")){
            System.out.println("Note: Data is not available for " + p.getName() + " for usage in PlayerManipulator.getEnabledKnockback(Player p).");
            return true;
        } else
        return Files.getPlayerDataYaml().getBoolean(p.getName() + ".knockback-enabled");
    }


    public void teleport(Player p, double x, double y, double z){
        p.teleport(new Location(p.getWorld(), x, y, z));
    }

    public void teleport(Player p, String world,  double x, double y, double z){
        if (Bukkit.getWorld(world) == null){
            System.out.println("Looks like the used method 'teleport' in SatAPI was handed over a fake world. I know, right?!");
        } else
        p.teleport(new Location(SatAPI.getInstance().getServer().getWorld(world), x, y, z));
    }






}
