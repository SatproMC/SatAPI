package satpromc.apis.satapi.files;

import org.bukkit.configuration.file.YamlConfiguration;
import satpromc.apis.satapi.SatAPI;

import java.io.File;
import java.io.IOException;

public class Files {


    private static File bans_yml = new File(SatAPI.getInstance().getDataFolder(), "bans.yml");
    private static YamlConfiguration bans = YamlConfiguration.loadConfiguration(bans_yml);

    private static File playerdata_yml = new File(SatAPI.getInstance().getDataFolder(), "player_data.yml");
    private static YamlConfiguration playerdata = YamlConfiguration.loadConfiguration(playerdata_yml);


    public static void saveBansYaml(){
        try {
            bans.save(bans_yml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static File getBansFile() {
        return bans_yml;
    }

    public static YamlConfiguration getBansYaml() {
        return bans;
    }

    public static File getPlayerdataFile(){
        return playerdata_yml;
    }

    public static YamlConfiguration getPlayerDataYaml(){
        return playerdata;
    }


    public static void savePlayerDataYaml() {
        try {
            playerdata.save(playerdata_yml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
