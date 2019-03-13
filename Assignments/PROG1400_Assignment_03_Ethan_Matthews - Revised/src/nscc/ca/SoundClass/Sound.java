package nscc.ca.SoundClass;
//https://stackoverflow.com/questions/11919009/using-javax-sound-sampled-clip-to-play-loop-and-stop-mutiple-sounds-in-a-game

import java.io.*;
import javax.sound.sampled.*;
//Class Sound for sound effects.
public class Sound {
    //clip of sound.
    private Clip clip;
    //Constructor for Sounds.
    public Sound(String fileName) {
        //Tries to grab file.  If it does exist create sound object, streams into 'clip' file.  Then opens.
        try {
            File file = new File(fileName);
            if (file.exists()) {
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(sound);
            }
        }
        //Catches wrong file format exception, IO file exception, audio line busy exception.
        catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

    }
    //method to play sound clip once.  Resets frame to 0 (beginning of sound.)
    public void playOnce() {
        clip.setFramePosition(0);
        clip.start(); }

    public void reset() {
        clip.setFramePosition(0);
    }

    //method to play sound clip continuously (loop).
    public void loopContinuously(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    //method to stop sounds.
    public void stopSound(){
        clip.stop();
    }
}
