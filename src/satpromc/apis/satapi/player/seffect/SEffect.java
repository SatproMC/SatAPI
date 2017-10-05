package satpromc.apis.satapi.player.seffect;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SEffect {

    public static HashMap<Player, List<SEffectType>> playerEffects = new HashMap<>();

    public static List<SEffectType> getPlayerEffects(Player p){
        return playerEffects.get(p);
    }

    public static void addEffect(Player p, SEffectType e){

    }

    public static void removeEffect(Player p, SEffectType e){
        for (SEffectType e2 : getPlayerEffects(p)) {
            if (e2 != e) {
                List<SEffectType> l = null;
                l.add(e2);
                playerEffects.put(p, l);
                l.clear();
                playerEffects.put(p, l);
            }
        }
    }


}
