package satpromc.apis.satapi.files;

import org.bukkit.configuration.file.YamlConfiguration;
import satpromc.apis.satapi.SatAPI;

import java.io.File;
import java.io.IOException;

public class Files {


    private static File bans_yml = new File(SatAPI.getInstance().getDataFolder(), "bans.yml");
    private static YamlConfiguration bans = YamlConfiguration.loadConfiguration(bans_yml);


    public static void saveBansYaml(){
        try {
            bans.save(bans_yml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static File getBansFiles() {
        return bans_yml;
    }

    public static YamlConfiguration getBansYaml() {
        return bans;
    }
}
