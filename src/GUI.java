import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{
    static int width = 800;
    static int height = 800;

    GUI(){
        this.setTitle("The Sierpinski Triangle");
        this.setDefaultCloseOperation(3);
        this.getContentPane().setBackground(new Color(0x123456));
        this.setResizable(false);
        this.setSize(width, height);
        this.setVisible(true);
    }
}
