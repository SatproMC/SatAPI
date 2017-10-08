package satpromc.apis.satapi.mmagic_titles;

import cf.magsoo.magictitles.MagicTitles;
import satpromc.apis.satapi.DependencyManager;

public class MmagicTitleS {


    public static MagicTitles plugin = DependencyManager.getInstance().getMagicTitles();


    public static void execute() {
        if (!DependencyManager.getInstance().MMAGIC_TITLES) {
            System.out.println("MmgicTitleS not found.");
        } else {
            execute();
        }
    }


}
