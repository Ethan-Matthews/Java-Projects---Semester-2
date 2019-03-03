package nscc.ca;
//https://stackoverflow.com/questions/11919009/using-javax-sound-sampled-clip-to-play-loop-and-stop-mutiple-sounds-in-a-game

import java.io.*;
import javax.sound.sampled.*;

public class Sound {

    private Clip clip;

    public Sound(String fileName) {

        try {
            File file = new File(fileName);
            if (file.exists()) {
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(sound);
            }
        }

        catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (LineUnavailableException e) {
            e.printStackTrace();
        }

    }
    public void playOnce(){
        clip.setFramePosition(0);
        clip.start();
    }
    public void loopContinuously(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stopSound(){
        clip.stop();
    }
}
