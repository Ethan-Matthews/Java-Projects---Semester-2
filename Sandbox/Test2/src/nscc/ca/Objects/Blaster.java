package nscc.ca.Objects;

import nscc.ca.Core.GameObject;
import nscc.ca.Core.ObjectId;

import java.awt.*;
import java.util.LinkedList;

public class Blaster extends GameObject {

    private int vx;

    public Blaster(float x, float y, ObjectId id, int vx) {
        super(x, y, id);
        this.vx = vx;
    }

    @Override
    public void tick(LinkedList<GameObject> object) {
        x += vx;
    }
    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect((int)x, (int)y, 12, 12);
    }
    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 12,12);
    }
}
