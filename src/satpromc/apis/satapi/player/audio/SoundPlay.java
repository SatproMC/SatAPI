package satpromc.apis.satapi.player.audio;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class SoundPlay {

    public static void playSound(Player p, Sound sound){
        p.playSound(p.getLocation(), "", 1f, 2f);
    }
    public static void playSound(Player p, Sound sound, int volume, int pitch){
        p.playSound(p.getLocation(), "", (float) volume, (float) pitch);
    }





}
