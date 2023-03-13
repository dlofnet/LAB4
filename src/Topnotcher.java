import javax.swing.JOptionPane;

public class Topnotcher {
    public static void main(String[] args) {
        
        int score1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a score: "));
        int score2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a score: "));
        int score3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a score: "));
        int score4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a score: "));
        int score5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a score: "));
        int score6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a score: "));
        int score7 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a score: "));
        int score8 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a score: "));
        int score9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a score: "));
        int score10 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a score: "));

        int maxScore = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(score1, score2), score3), score4), score5), score6), score7), score8), score9), score10);

        JOptionPane.showMessageDialog(null, "The highest score is: " + maxScore);

    }
}
