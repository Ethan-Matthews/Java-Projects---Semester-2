package nscc.ca.Core;


import java.awt.*;
import java.util.LinkedList;

public abstract class GameObject {

    protected float x, y;
    protected float vx = 0, vy = 0;
    protected ObjectId id;
    protected float gravity = 0.2f;
    protected boolean falling = true;
    protected boolean jumping = false;
    private boolean facingRight = true;

    public GameObject(float x, float y, ObjectId id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick(LinkedList<GameObject> object);

    public abstract Rectangle getBounds();

    public abstract void render(Graphics g);

    public float getX() { return x; }

    public float getY() { return y; }

    public float getVx() {
        return vx;
    }

    public float getVy() {
        return vy;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setVx(float vx) {
        this.vx = vx;
    }

    public void setVy(float vy) {
        this.vy = vy;
    }

    public ObjectId getId() { return id; }

    public float getGravity() {
        return gravity;
    }

    public boolean isFalling() {
        return falling;
    }

    public boolean isJumping() {
        return jumping;
    }

    public boolean isFacingRight() { return facingRight; }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public void setFalling(boolean falling) {
        this.falling = falling;
    }

    public void setJumping(boolean jumping) {
        this.jumping = jumping;
    }

    public void setFacingRight(boolean facingRight) { this.facingRight = facingRight; }
}


