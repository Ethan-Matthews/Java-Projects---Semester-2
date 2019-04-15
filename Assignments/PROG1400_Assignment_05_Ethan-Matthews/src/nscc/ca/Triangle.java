package nscc.ca;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Triangle extends Shape {

    public Triangle(Color PrimaryColour, Color SecondaryColour, int width, int height, int xPos, int yPos, Animation ap, int xVel, int yVel) {

        //if shape bounds extend beyond the screen dimensions, will change mouse co-ordinates so
        // shape spawn inside screen.
        if (xPos + width > ap.getWidth()) {
            xPos = ap.getWidth() - (width + 5);
        }

        if (yPos + height > ap.getHeight()) {
            yPos = ap.getHeight() - (height + 5);
        }

        //Sets the bounding box.
        setBoundingBox(new java.awt.Rectangle(xPos - 3, yPos - 3, width + 6, height + 6));

        //Sets properties of shape.
        setPrimaryShapeColor(PrimaryColour);
        setSecondaryShapeColor(SecondaryColour);
        setWidth(width);
        setHeight(height);
        setxPos(xPos);
        setyPos(yPos);
        setxVel(xVel);
        setyVel(yVel);
    }
    //Draws shape.
    @Override
    public void drawShape(Graphics g) {
        //casts graphics to graphics2d.
        Graphics2D g2d = (Graphics2D)g;

        //creates new gradient scheme.
        GradientPaint ShapeGradient = new GradientPaint(getxPos(), getyPos(),
                                                        getPrimaryShapeColor(),getxPos() + getWidth(),
                                                    getyPos() + getHeight(), getSecondaryShapeColor());

        //turns on antialiasing for shape.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);

        //sets gradient to shape.
        g2d.setPaint(ShapeGradient);

        //Arrays of x and y positions for shape.
        int[] xValues = {getxPos() + (getWidth()/2),getxPos() + getWidth(),getxPos()};
        int[] yValues = {getyPos(),getyPos() + getHeight(),getyPos() + getHeight()};

        //general path (pen) for lines.
        GeneralPath pen = new GeneralPath();

        //starts pen.
        pen.moveTo(xValues[0], yValues[0]);

        //moves pen to draw shape.
        pen.lineTo(xValues[1], yValues[1]);
        pen.lineTo(xValues[2], yValues[2]);
        //closes shape.
        pen.closePath();
        //draws shape.
        g2d.fill(pen);
    }

    //Moves shape.
    @Override
    public void moveShape(Animation ap) {
        //updates bounding box location.
        getBoundingBox().setLocation(((getxPos() - 4) + getxVel()), ((getyPos() - 4) + getyVel()));

        //sets new shape position.
        setxPos(getxPos() + getxVel());
        setyPos(getyPos() + getyVel());

        //Checks if the shape is outside of screen dimensions, will reverse velocities if true.
        if ((getxPos() + getWidth()) >= ap.getWidth()) {
            setxVel(getxVel() * -1);

        } else if (getxPos() < 0) {
            setxVel(getxVel() * -1);
        }

        if ((getyPos() + getHeight()) >= ap.getHeight()) {
            setyVel(getyVel() * -1);

        } else if (getyPos() < 0) {
            setyVel(getyVel() * -1);
        }
    }
}
