import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Created by Joshua on 12/24/2015.
 */
public class SoundMaker {
    File file;
    Clip clip;
    public SoundMaker(){
        file = new File("test.wav");
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void play(){
        clip.start();
    }
    public void pauseMe(){
        clip.stop();
    }
}
