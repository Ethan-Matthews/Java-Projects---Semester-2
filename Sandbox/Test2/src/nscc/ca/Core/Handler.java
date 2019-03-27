package nscc.ca.Core;

import java.awt.*;
import java.util.LinkedList;

public class Handler {

    public LinkedList<GameObject> objectLinkedList = new LinkedList<>();
    private GameObject tempObject;

    public void tick() {
        for (int i = 0; i < objectLinkedList.size(); i++) {
            tempObject = objectLinkedList.get(i);
            tempObject.tick(objectLinkedList);
        }
    }

    public void render(Graphics g) {
        for (GameObject gameObject : objectLinkedList) {
            tempObject = gameObject;
            tempObject.render(g);
        }
    }

    public void addObject(GameObject object) {
        this.objectLinkedList.add(object);
    }

    public void removeObject(GameObject object) {
        this.objectLinkedList.remove(object);
    }
}