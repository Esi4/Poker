import javax.swing.*;
import java.awt.*;

public class Window {
    public static void main(String[] args) {
        Panel panel = new Panel();
        JFrame startFrame = new JFrame("Poker");
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setLocation(0,0);
        startFrame.setSize(1200,700);
        startFrame.setContentPane(panel);
        startFrame.setVisible(true);
    }
}
