package nscc.ca;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;

public class Animation extends JPanel {

    private Timer timer = new Timer(20, new TimerAction());

    private ArrayList<Shape> runningObjectList;

    public Animation() {

        runningObjectList = new ArrayList<>();

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                runningObjectList.add(randomShape());

            }
        });
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape currentShape : runningObjectList) {
            currentShape.drawShape(g);
        }

        timer.start();
    }


    private class TimerAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Animation.this.repaint();
        }
    }

    private Shape randomShape() {
        Shape newShape = null;
//        int randomShape = (int) (Math.random() * 3);
        int randomShape = 0;

        if (randomShape == 0) {
            newShape = new Rectangle(Color.blue, 100, 100, 100, 100);
        }

//        else if (randomShape == 1) {
//
//        }
//
//        else if (randomShape == 2) {
//
//        }
//
//        else if (randomShape == 3) {
//
//        }
        return newShape;

    }

}


