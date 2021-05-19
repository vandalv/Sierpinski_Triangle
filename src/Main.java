import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        Drawing rect = new Drawing();
        rect.setBackground(new Color(0x123456));
        gui.add(rect);
    }
}
