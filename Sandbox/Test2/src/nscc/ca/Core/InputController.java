package nscc.ca.Core;

import nscc.ca.Objects.Blaster;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class InputController extends KeyAdapter {

    Handler handler;

    public InputController(Handler handler) {
        this.handler = handler;
    }

//    private ArrayList<GameObject> queue = new ArrayList<>();

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        int key = e.getKeyCode();
        for (int i = 0; i < handler.objectLinkedList.size(); i++) {
            GameObject tempObject = handler.objectLinkedList.get(i);
            if (tempObject.getId() == ObjectId.Player) {
                if (key == KeyEvent.VK_D) tempObject.setVx(8);
                if (key == KeyEvent.VK_A) tempObject.setVx(-8);
                if (key == KeyEvent.VK_SPACE && !tempObject.isJumping()){
                    tempObject.setJumping(true);
                    tempObject.setVy(-10);
                }
                if (key == KeyEvent.VK_Z)
                    if (tempObject.isFacingRight())
                        handler.addObject(new Blaster(tempObject.getX(), tempObject.getY() + 48, ObjectId.Blaster, 15));
//                        queue.add(new Blaster(tempObject.getX(), tempObject.getY() + 48, ObjectId.Blaster, 15));
                    else
                        handler.addObject(new Blaster(tempObject.getX(), tempObject.getY() + 48, ObjectId.Blaster, -15));
//                        queue.add(new Blaster(tempObject.getX(), tempObject.getY() + 48, ObjectId.Blaster, -15));
            }
        }

        if (key == KeyEvent.VK_ESCAPE) {
            System.exit(1);
        }

//        handler.objectLinkedList.addAll(queue);
//        queue.clear();

    }

    @Override
    public void keyReleased(KeyEvent e) {
        super.keyReleased(e);
        int key = e.getKeyCode();

        for (int i = 0; i < handler.objectLinkedList.size(); i++) {
            GameObject tempObject = handler.objectLinkedList.get(i);

            if (tempObject.getId() == ObjectId.Player) {
                if (key == KeyEvent.VK_D) tempObject.setVx(0);
                if (key == KeyEvent.VK_A) tempObject.setVx(0);

            }
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        super.keyTyped(e);
    }
}
