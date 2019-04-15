package ca.nscc;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class DrawingBoard extends JPanel {



    @Override
    public void paintComponent(Graphics g) {
        Color red = new Color(255, 0, 0);
        Color black = new Color(0,0,0);
        g.setColor(red);

        g.fillRect(175, 300, 250, 60);
        g.drawRect(225,250,150, 50);

        g.setColor(black);
        g.fillOval(200, 330, 50, 50);
        g.fillOval(350, 330, 50, 50);
        g.drawLine(300,250,300, 300);

        drawBowTie(g);

    }


    private void drawRectangle(Graphics g,int xPos,int yPos,int width,int height) {
        g.drawRect(xPos, yPos, width, height);
    }

    private void drawBowTie(Graphics g) {

        int[] xCoords = {0,200,200,0};
        int[] yCoords = {0,200,0,200};

        GeneralPath pen = new GeneralPath();
        pen.moveTo(xCoords[0], yCoords[0]);
        pen.lineTo(xCoords[1], yCoords[1]);
        pen.lineTo(xCoords[2], yCoords[2]);
        pen.lineTo(xCoords[3], yCoords[3]);
        pen.closePath();

        Graphics2D g2d = (Graphics2D)g;
        g2d.fill(pen);

    }

}
