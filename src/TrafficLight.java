import java.lang.Math;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class TrafficLight {
    public static void main(String[] args) {
        
        ImageIcon red = new ImageIcon("red.png");
        ImageIcon green = new ImageIcon("green.png");
        ImageIcon yellow = new ImageIcon("yellow.png");

        double rand = Math.random();

        if (rand <= 1 && rand >= 0.66) {
            JOptionPane.showMessageDialog(null, "The vehicle is set to go", "Program by Stacey Andrew Gonzaga", JOptionPane.INFORMATION_MESSAGE, green);
        } else if (rand <= 0.66 && rand >= 0.33) {
            JOptionPane.showMessageDialog(null, "The vehicle is set to ready", "Program by Stacey Andrew Gonzaga", JOptionPane.INFORMATION_MESSAGE, yellow);
        } else if (rand <= 0.33 && rand >= 0) {
            JOptionPane.showMessageDialog(null, "The vehicle is set to stop", "Program by Stacey Andrew Gonzaga", JOptionPane.INFORMATION_MESSAGE, red);
        }
    }
}