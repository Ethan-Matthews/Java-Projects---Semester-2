package nscc.ca;

import java.awt.*;
import java.awt.Rectangle;

public abstract class Shape {

    //New Bounding box for shape.
    private Rectangle boundingBox;
    //Colours for shape.
    private Color primaryShapeColor;
    private Color secondaryShapeColor;
    //Dimensions.
    private int height;
    private int width;
    //Co-ordinates.
    private int xPos;
    private int yPos;
    //Velocities.
    private int xVel;
    private int yVel;

    //Abstract methods.
    public abstract void drawShape(Graphics g);
    public abstract void moveShape(Animation ap);

    //getters.
    public Rectangle getBoundingBox() {
        return boundingBox;
    }

    public Color getPrimaryShapeColor() {
        return primaryShapeColor;
    }

    public Color getSecondaryShapeColor() {
        return secondaryShapeColor;
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

    //Setters.
    public void setBoundingBox(Rectangle boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setPrimaryShapeColor(Color primaryShapeColor) {
        this.primaryShapeColor = primaryShapeColor;
    }

    public void setSecondaryShapeColor(Color secondaryShapeColor) {
        this.secondaryShapeColor = secondaryShapeColor;
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
