package nscc.ca.Core;

import nscc.ca.Animation.BufferedImageLoader;
import nscc.ca.Animation.Textures;
import nscc.ca.Objects.Block;
import nscc.ca.Objects.Player;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game extends Canvas implements Runnable  {

    private boolean running = false;
    private Thread thread;
    Handler handler;
    Camera cam;
    static Textures texture;

    public static int height;
    public static int width;

    private BufferedImage level = null;
    private BufferedImage backTest;
//    private BufferedImage backTexture;

    private void init() {

        width = getWidth();
        height = getHeight();

        texture = new Textures();

        BufferedImageLoader loader = new BufferedImageLoader();
        level = loader.loadImage("/Terrain/PixelMap.png");
        backTest = loader.loadImage("/Terrain/TestBack.png");
//        backTexture = loader.loadImage("/Terrain/BackTexture.png");

        handler = new Handler();
        cam = new Camera(0, 0);

        loadImageLevel(level);

        this.addKeyListener(new InputController(handler));

    }

    public synchronized void start() {
        if (running)
            return;

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        init();
        this.requestFocus();

        long time = System.nanoTime();
        long timer = System.currentTimeMillis();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int updates = 0;
        int frames = 0;

        while (running) {
            long now = System.nanoTime();
            delta += (now - time) / ns;
            time = now;
            while (delta >= 1) {
                tick();
                updates++;
                delta--;
            }
            render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                frames = 0;
                updates = 0;
            }
        }
    }

    private void tick() {
        handler.tick();
        for (int i = 0; i < handler.objectLinkedList.size(); i++) {
            if (handler.objectLinkedList.get(i).getId() == ObjectId.Player) {
                cam.tick(handler.objectLinkedList.get(i));
            }
        }
    }

    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs==null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        Graphics2D g2d = (Graphics2D) g;

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.drawImage(backTest, 0, 0, null);
        ///////////////////////////////////
        g2d.translate(cam.getX(), cam.getY());

        handler.render(g);

        g2d.translate(-cam.getX(), -cam.getY());
        ///////////////////////////////////
        g.dispose();
        bs.show();
    }

    public static Textures getInstance() {
        return texture;
    }

    private void loadImageLevel(BufferedImage image) {
        int w = image.getWidth();
        int h = image.getHeight();

        for (int i = 0; i < w; i++) {
            for (int ii = 0; ii < h; ii++) {
                int pixel = image.getRGB(i, ii);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;

                //Yellow Player start.
                if (red == 255 && green == 255 && blue == 0)
                    handler.addObject(new Player(i*48, ii*48, handler, ObjectId.Player));

                //Blue Top left Corner.
                if (red == 0 && green == 0 && blue == 255)
                    handler.addObject(new Block(i*48, ii*48, 0, ObjectId.Block));

                //White Top Center.
                if (red == 255 && green == 255 && blue == 255)
                    handler.addObject(new Block(i*48, ii*48, 1, ObjectId.Block));

                //Green Top Right Corner.
                if (red == 0 && green == 255 && blue == 0)
                    handler.addObject(new Block(i*48, ii*48, 2, ObjectId.Block));

                //Purple left side.
                if (red == 255 && green == 0 && blue == 255)
                    handler.addObject(new Block(i*48, ii*48, 3, ObjectId.Block));

                //Red Center Fill.
                if (red == 255 && green == 0 && blue == 0)
                    handler.addObject(new Block(i*48, ii*48, 4, ObjectId.Block));

                //Teal Right side.
                if (red == 0 && green == 255 && blue == 255)
                    handler.addObject(new Block(i*48, ii*48, 5, ObjectId.Block));

                //Blue/2 bottom left corner.
                if (red == 0 && green == 0 && blue == 128)
                    handler.addObject(new Block(i*48, ii*48, 6, ObjectId.Block));

                //White/2 bottom Center.
                if (red == 128 && green == 128 && blue == 128)
                    handler.addObject(new Block(i*48, ii*48, 7, ObjectId.Block));

                //Green/2 bottom right corner.
                if (red == 0 && green == 128 && blue == 0)
                    handler.addObject(new Block(i*48, ii*48, 8, ObjectId.Block));
            }
        }
    }
}
