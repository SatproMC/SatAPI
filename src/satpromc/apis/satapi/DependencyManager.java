package satpromc.apis.satapi;

import cf.magsoo.magictitles.MagicTitles;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class DependencyManager {


    public static DependencyManager getInstance() {return new DependencyManager();}

    public ArrayList<Plugin> required_plugins = new ArrayList<>();
    public ArrayList<Plugin> soft_depends = new ArrayList<>();


    private MagicTitles magicTitles = new MagicTitles();

    public MagicTitles getMagicTitles() {
        return magicTitles;
    }

    public boolean MMAGIC_TITLES = false;

    boolean check(){
        if (Bukkit.getServer().getPluginManager().getPlugin("MagicTitles") != null){
            this.MMAGIC_TITLES = true;
            return true;
        } else this.MMAGIC_TITLES = false;
        return false;
    }

    public void execute(){
        soft_depends.add(getMagicTitles());
    }





}
