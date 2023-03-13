import javax.swing.JOptionPane;

public class PositiveNegative {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Give me a number: "));

        String message;

        if (num > 0) {
            message = num + " is a positive integer.";
        } 
        else if (num < 0) {
            message = num + " is a negative integer.";
        }
        else {
            message = num + " is neither positive nor negative.";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
