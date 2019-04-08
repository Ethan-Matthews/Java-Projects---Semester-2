package nscc.ca;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;

public class Animation extends JPanel implements MouseListener {

    private Timer timer = new Timer(20, new TimerAction());
    private static ArrayList<Shape> activeObjectList = new ArrayList<>();
    private int x, y = 0;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);
//        activeObjectList.add(new HourGlass(x,y));
        for (Shape shape : activeObjectList) {
            g2d.draw(shape.drawShape());
        }

        timer.start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        activeObjectList.add(new HourGlass(0, 0));
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    private class TimerAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            x += 2;
            y += 2;
            Animation.this.repaint();
        }
    }

    public static ArrayList<Shape> getActiveObjectList() {
        return activeObjectList;
    }

}


