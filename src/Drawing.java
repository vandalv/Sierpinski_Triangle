import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Drawing extends JPanel implements ActionListener {
    ArrayList<Point> points = new ArrayList<>();
    Point pointA = new Point(new Random().nextInt(GUI.width),new Random().nextInt(GUI.height));
    Point pointB = new Point(new Random().nextInt(GUI.width),new Random().nextInt(GUI.height));
    Point pointC = new Point(new Random().nextInt(GUI.width),new Random().nextInt(GUI.height));
    Point pointX = new Point(new Random().nextInt(GUI.width),new Random().nextInt(GUI.height));
    Graphics2D g2;
    Random rand = new Random();
    int randomNum;
    Timer timer = new Timer(1000,this);

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.setColor(java.awt.Color.black);
        g2.setStroke(new BasicStroke(1f));
        for(int i = 0; i < 100000; i++) {
            randomNum = rand.nextInt((3) + 1);
            if (randomNum == 1) {
                g2.setColor(java.awt.Color.green);
                pointX.setX(lerp(pointX.getX(), pointA.getX(), 0.5));
                pointX.setY(lerp(pointX.getY(), pointA.getY(), 0.5));
                g2.drawLine(pointX.getX(), pointX.getY(), pointX.getX(), pointX.getY());
            } else if (randomNum == 2) {
                g2.setColor(java.awt.Color.red);
                pointX.setX(lerp(pointX.getX(), pointB.getX(), 0.5));
                pointX.setY(lerp(pointX.getY(), pointB.getY(), 0.5));
                g2.drawLine(pointX.getX(), pointX.getY(), pointX.getX(), pointX.getY());
            } else if (randomNum == 3) {
                g2.setColor(java.awt.Color.white);
                pointX.setX(lerp(pointX.getX(), pointC.getX(), 0.5));
                pointX.setY(lerp(pointX.getY(), pointC.getY(), 0.5));
                g2.drawLine(pointX.getX(), pointX.getY(), pointX.getX(), pointX.getY());
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        repaint();

    }

    int lerp(int a, int b, double f)
    {
        return (int) (a + f * (b - a));
    }
}
