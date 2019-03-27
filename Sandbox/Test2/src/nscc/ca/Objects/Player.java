package nscc.ca.Objects;

import nscc.ca.Animation.Animation;
import nscc.ca.Animation.Textures;
import nscc.ca.Core.Game;
import nscc.ca.Core.GameObject;
import nscc.ca.Core.Handler;
import nscc.ca.Core.ObjectId;

import java.awt.*;
import java.util.LinkedList;

public class Player extends GameObject {

    private float width = 96;
    private float height = 96;
    private float maxSpeed = 10;
    Handler handler;

    Textures texture = Game.getInstance();

    private Animation playerWalkRight;
    private Animation playerWalkLeft;
    private Animation playerJR;
    private Animation playerJL;

    public Player(float x, float y, Handler handler, ObjectId id) {
        super(x, y, id);
        this.handler = handler;

        playerWalkRight = new Animation(2,
                texture.player[1],
                texture.player[2],
                texture.player[3],
                texture.player[4],
                texture.player[5],
                texture.player[6],
                texture.player[7],
                texture.player[8],
                texture.player[9],
                texture.player[10]);

        playerWalkLeft = new Animation(2,
                texture.player[11],
                texture.player[12],
                texture.player[13],
                texture.player[14],
                texture.player[15],
                texture.player[16],
                texture.player[17],
                texture.player[18],
                texture.player[19],
                texture.player[20]);

        playerJR = new Animation(1,
                texture.playerJR[0],
                texture.playerJR[1],
                texture.playerJR[2],
                texture.playerJR[3],
                texture.playerJR[4],
                texture.playerJR[5],
                texture.playerJR[6],
                texture.playerJR[7]);

        playerJL = new Animation(1,
                texture.playerJL[8],
                texture.playerJL[7],
                texture.playerJL[6],
                texture.playerJL[5],
                texture.playerJL[4],
                texture.playerJL[3],
                texture.playerJL[2],
                texture.playerJL[1]);
    }

    @Override
    public void tick(LinkedList<GameObject> object) {
        x += vx;
        y += vy;

        if (vx < 0)
            setFacingRight(false);
        else if (vx > 0)
            setFacingRight(true);

        if (falling || jumping) {
            vy += gravity;
            if (vy > maxSpeed)
                vy = maxSpeed;
        }
        Collision(object);

        playerWalkRight.runAnimation();
        playerWalkLeft.runAnimation();
        playerJR.runAnimation();
        playerJL.runAnimation();
    }

    private void Collision(LinkedList<GameObject> object) {
        for (int i = 0; i < handler.objectLinkedList.size(); i++) {
            GameObject tempObject = handler.objectLinkedList.get(i);
            if (tempObject.getId() == ObjectId.Block) {
                if (getBoundsTop().intersects(tempObject.getBounds())) {
                    y = (float)(tempObject.getY() + tempObject.getBounds().getHeight());
                    vy = 0;
                } else
                    falling = true;

                if (getBounds().intersects(tempObject.getBounds())) {
                    y = tempObject.getY() - height;
                    vy = 0;
                    falling = false;
                    jumping = false;
                } else
                    falling = true;

                if (getBoundsRight().intersects(tempObject.getBounds()))
                    x = tempObject.getX() - 81;


                if (getBoundsLeft().intersects(tempObject.getBounds()))
                    x = tempObject.getX() + 32;

            }
        }
    }

    @Override
    public void render(Graphics g) {
        if (isJumping()) {
            if (isFacingRight())
                playerJR.drawAnimation(g, (int)x, (int)y);
            else
                playerJL.drawAnimation(g, (int)x, (int)y);
        } else {
            if (vx == 0)
                if (isFacingRight())
                    g.drawImage(texture.player[0], (int)x, (int)y, null);
                else
                    g.drawImage(texture.player[21], (int)x, (int)y, null);
            if (vx > 0)
                playerWalkRight.drawAnimation(g, (int)x, (int)y);
            if (vx < 0)
                playerWalkLeft.drawAnimation(g, (int)x, (int)y);
        }
        //Enable for player Collision Bounds.
//        Graphics2D g2d = (Graphics2D)g;
//        g2d.setColor(Color.RED);
//        g2d.draw(getBounds());
//        g2d.draw(getBoundsRight());
//        g2d.draw(getBoundsLeft());
//        g2d.draw(getBoundsTop());

    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle((int) ((int)x + (width/2)-((width-width/2))/2), (int) ((int)y + height/2), (int)width/2, (int)height/2);
    }

    public Rectangle getBoundsTop() {
        return new Rectangle((int) ((int)x + (width/2)-((width-width/2))/2), (int)y, (int)width/2, (int)height/2);
    }

    public Rectangle getBoundsRight() {
        return new Rectangle((int) ((int)x + (width/1.25)), (int)y + 5, 5, (int)height-10);
    }

    public Rectangle getBoundsLeft() {
        return new Rectangle((int) ((int)x + (width/6)), (int)y + 5, 5, (int)height-10);
    }




}

