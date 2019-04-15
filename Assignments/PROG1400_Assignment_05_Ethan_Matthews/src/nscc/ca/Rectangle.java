package nscc.ca;

import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle(Color colour, int width, int height, int xPos, int yPos) {

        setShapeColor(colour);
        setWidth(width);
        setHeight(height);
        setxPos(xPos);
        setyPos(yPos);

    }

    @Override
    public void drawShape(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.fillRect(getxPos(), getyPos(), getWidth(), getHeight());

    }

    @Override
    public void moveShape(Animation ap) {
        setxPos(getxPos() + getxVel());
        setyPos(getyPos() + getyVel());

        if ((getxPos() + getWidth()) >= ap.getWidth()) {
            setxVel(getxVel() * -1);

        } else if (getxPos() < 0) {
            setxVel(getxVel() * -1);
        }
    }
}
