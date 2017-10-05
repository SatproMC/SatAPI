package satpromc.apis.satapi.player.audio;


import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class CustomAudio {




    public void playCustomSound(File f){
        if (f == null){
            System.out.println("Inputted File for ..satapi.player.audio.CustomAudio.playCustomSound() was null!");
        } else{
            try {

                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(f));
                clip.start();

                Thread.sleep(clip.getMicrosecondLength() / 1000);



            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }




}
