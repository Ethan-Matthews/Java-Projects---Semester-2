package nscc.ca.Objects;

import nscc.ca.Animation.Textures;
import nscc.ca.Core.Game;
import nscc.ca.Core.GameObject;
import nscc.ca.Core.ObjectId;

import java.awt.*;
import java.util.LinkedList;

public class Block extends GameObject {

    Textures texture = Game.getInstance();
    private int type;

    public Block(float x, float y, int type, ObjectId id) {
        super(x, y, id);
        this.type = type;
    }

    @Override
    public void tick(LinkedList<GameObject> objects) {

    }

    @Override
    public void render(Graphics g) {
        if (type == 0)
            g.drawImage(texture.block[0], (int)x, (int)y, null);
        if (type == 1)
            g.drawImage(texture.block[1], (int)x, (int)y, null);
        if (type == 2)
            g.drawImage(texture.block[2], (int)x, (int)y, null);
        if (type == 3)
            g.drawImage(texture.block[3], (int)x, (int)y, null);
        if (type == 4)
            g.drawImage(texture.block[4], (int)x, (int)y, null);
        if (type == 5)
            g.drawImage(texture.block[5], (int)x, (int)y, null);
        if (type == 6)
            g.drawImage(texture.block[6], (int)x, (int)y, null);
        if (type == 7)
            g.drawImage(texture.block[7], (int)x, (int)y, null);
        if (type == 8)
            g.drawImage(texture.block[8], (int)x, (int)y, null);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 48, 48);
    }
}
