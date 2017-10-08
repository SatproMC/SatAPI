package satpromc.apis.satapi;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class DependencyManager {


    public static DependencyManager getInstance() {return new DependencyManager();}

    public ArrayList<Plugin> required_plugins = new ArrayList<>();
    public ArrayList<Plugin> soft_depends = new ArrayList<>();


    public boolean MMAGIC_TITLES = false;

    public void check(){
        if (Bukkit.getServer().getPluginManager().getPlugin("MagicTitles") != null){
            this.MMAGIC_TITLES = true;
        } else this.MMAGIC_TITLES = false;
    }






}
