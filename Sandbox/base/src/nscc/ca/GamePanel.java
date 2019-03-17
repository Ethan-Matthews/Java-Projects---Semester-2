package nscc.ca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static nscc.ca.Main.*;

public class GamePanel extends JPanel implements Runnable {

    private Image dBImg;
    private Graphics dBGphc;

    private Thread gameThread;

    private volatile boolean running = false;

    public GamePanel() {
        setPreferredSize(getGamedim());
        setFocusable(true);
        requestFocus();

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


    }

    public void run() {
        while (running) {
            gameUpdate();
            gameRender();
            paintScreen();
        }
    }

    private void gameUpdate() {
        if (running && gameThread != null) {
            //update game state.
        }
    }

    private void gameRender() {
        if (dBImg == null) { // Creates the buffer.
            dBImg = createImage(getGWIDTH(), getGHEIGHT());
            if (dBImg == null) {
                System.err.println("Double Buffer Image is still null!");
                return;
            } else {
                dBGphc = dBImg.getGraphics();
            }
        }
        //Clear screen with White.
        dBGphc.setColor(Color.WHITE);
        dBGphc.fillRect(0, 0, getGWIDTH(), getGHEIGHT());

        //Draw game elements.
        draw(dBGphc);
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("Hello World", 100, 100);
    }

    private void paintScreen() {
        Graphics g;
        try {
            g = this.getGraphics();
            if (dBImg != null && g != null) {
                g.drawImage(dBImg, 0, 0, null);
            }
            Toolkit.getDefaultToolkit().sync();
            g.dispose();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("paintScreen Get Graphics Error.");
        }
    }

    public void addNotify() {
        super.addNotify();
        startGame();
    }

    private void startGame() {
        if (gameThread == null || !running) {
            gameThread = new Thread(this);
            gameThread.start();
            running = true;
        }
    }

    public void stopGame() {
        if (running) {
            running = false;
        }
    }


    public Image getDoubleBufferImg() {
        return dBImg;
    }

    public Graphics getDoubleBufferGphc() {
        return dBGphc;
    }

    public Thread getGameThread1() {
        return gameThread;
    }

    public boolean isRunning() {
        return running;
    }
}
