package nscc.ca;

import java.awt.*;

public abstract class Shape {

    private Rectangle boundingBox;

    private Color shapeColor;

    private int height;
    private int width;

    private int xPos;
    private int yPos;

    private int xVel;
    private int yVel;

    public abstract void drawShape(Graphics g);

    public abstract void moveShape(Animation ap);

    public Rectangle getBoundingBox() {
        return boundingBox;
    }

    public Color getShapeColorr() {
        return shapeColor;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int getxVel() {
        return xVel;
    }

    public int getyVel() {
        return yVel;
    }

    public void setBoundingBox(Rectangle boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setShapeColor(Color vehicleColor) {
        this.shapeColor = vehicleColor;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setxVel(int xVel) {
        this.xVel = xVel;
    }

    public void setyVel(int yVel) {
        this.yVel = yVel;
    }
}
