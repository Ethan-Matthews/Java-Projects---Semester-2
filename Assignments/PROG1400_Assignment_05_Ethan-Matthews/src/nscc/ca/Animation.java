package nscc.ca;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Animation extends JPanel {

    private int xPosMouse, yPosMouse;
    //Action Timer. Initiates startMovement() every 20 milliseconds.
    private Timer timer = new Timer(16, new TimerAction());
    //ArrayList for Shape objects.
    private ArrayList<Shape> runningObjectList = new ArrayList<>();

    //Creates Animation panel.
    public Animation() {

        //Mouse Adapter. adds objects every time mouse button is pressed.
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mouseClicked(e);
                //gets mouse Co-ordinates for shape spawn.
                xPosMouse = getMousePosition().x;
                yPosMouse = getMousePosition().y;
                //adds random shape to array.
                runningObjectList.add(randomShape(xPosMouse, yPosMouse));
                //Starts the timer again.
                startTimer();
            }
        });
    }

    //paints shapes in array.
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape currentShape : runningObjectList) {
            currentShape.drawShape(g);
            Collision(currentShape);
        }
    }

    //Updates shape co-ordinates in array.
    public void startMovement() {
        for (Shape currentShape : runningObjectList) {
            currentShape.moveShape(this);
        }
        //Repaints shapes with updated co-ordinates.
        Animation.this.repaint();
    }

    //Starts the timer.
    public void startTimer() {
            timer.start();
    }

    //Called every time the timer resets. starts update process.
    private class TimerAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startMovement();
        }
    }

    //Collision Detection between objects.
    private void Collision(Shape currentShape) {
        for (Shape shape : runningObjectList) {

            //current shape will not check itself in the loop.
            if (currentShape != shape) {
                //Checks X axis collision (with velocities) against shape.
                if (currentShape.getxPos() + currentShape.getWidth() + currentShape.getxVel() > shape.getxPos() &&
                        currentShape.getxPos() + currentShape.getxVel() < shape.getxPos() + shape.getWidth() &&
                        currentShape.getyPos() + currentShape.getHeight() > shape.getyPos() &&
                        currentShape.getyPos() < shape.getyPos() + shape.getHeight()) {

                    //if collision is detected reverse x velocity on both affected shapes.
                    currentShape.setxVel(currentShape.getxVel() * -1);
                    shape.setxVel(shape.getxVel() * -1);

                    //Changes gradient colours on both objects.
                    shape.setPrimaryShapeColor(randomColour());
                    currentShape.setSecondaryShapeColor(randomColour());
                }

                //Checks Y axis collision (with velocities) against shape.
                if (currentShape.getxPos() + currentShape.getWidth() > shape.getxPos() &&
                        currentShape.getxPos() < shape.getxPos() + shape.getWidth() &&
                        currentShape.getyPos() + currentShape.getHeight() + currentShape.getyVel() > shape.getyPos() &&
                        currentShape.getyPos() + currentShape.getyVel() < shape.getyPos() + shape.getHeight()) {

                    //if collision is detected reverse y velocity on both affected shapes.
                    currentShape.setyVel(currentShape.getyVel() * -1);
                    shape.setyVel(shape.getyVel() * -1);

                    //Changes gradient colours on both objects.
                    currentShape.setPrimaryShapeColor(randomColour());
                    shape.setSecondaryShapeColor(randomColour());
                }
            }
        }
    }

    //Creates random shapes when mouse button is pressed.
    private Shape randomShape(int xPosMouse, int yPosMouse) {
        Shape newShape = null;
        //number range between 0 and 3.
        int randomShape = (int) (Math.random() * 4);

        //Creates new rectangle.
        if (randomShape == 0) {
            newShape = new Rectangle(randomColour(), randomColour(), randomSize(), randomSize(), xPosMouse, yPosMouse, this, randomVelocity(), randomVelocity());
        }

        //Creates new Ellipse.
        else if (randomShape == 1) {
            newShape = new Ellipse(randomColour(), randomColour(), randomSize(), randomSize(), xPosMouse, yPosMouse, this, randomVelocity(), randomVelocity());
        }

        //Creates new HourGlass.
        else if (randomShape == 2) {
            newShape = new HourGlass(randomColour(), randomColour(), randomSize(), randomSize(), xPosMouse, yPosMouse, this, randomVelocity(), randomVelocity());
        }

        //Creates new Triangle.
        else if (randomShape == 3) {
            newShape = new Triangle(randomColour(), randomColour(), randomSize(), randomSize(), xPosMouse, yPosMouse, this, randomVelocity(), randomVelocity());
        }
        return newShape;

    }

    //randomColour generator.
    private Color randomColour() {
        Random randomColour = new Random();
        int r = randomColour.nextInt(255);
        int g = randomColour.nextInt(255);
        int b = randomColour.nextInt(255);
        return new Color(r, g, b);
    }

    //randomSize generator.
    private int randomSize() {
        Random randomSize = new Random();
        return randomSize.nextInt(145 + 5);
    }

    //Random Velocity generator.
    private int randomVelocity() {
        Random randomVelocity = new Random();
        int num = randomVelocity.nextInt(5 + 1 + 5) - 5;
        if (num == 0) {
            randomVelocity();
        }
        return num;
    }

}


