package nscc.ca;

import java.awt.geom.GeneralPath;

public class HourGlass extends Shape {

    private int x, y = 0;

    public HourGlass(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public GeneralPath drawShape() {
        GeneralPath pen = new GeneralPath();

        int[] xValues = {0, 200, 0, 200};
        int[] yValues = {0, 200, 200, 0};

        pen.moveTo(xValues[0], yValues[0]);
        pen.lineTo(xValues[1], yValues[1]);
        pen.lineTo(xValues[2], yValues[2]);
        pen.lineTo(xValues[3], yValues[3]);

        pen.closePath();
        return pen;
    }
}
