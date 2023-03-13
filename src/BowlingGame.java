import javax.swing.JOptionPane;

public class BowlingGame {
    public static void main(String[] args) {
        int score1 = 0;
        int score2 = 0;

        for (int i = 1; i <= 3; i++) {
            
            int p1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Player 1, attempt " + i + ":"));
            score1 += p1;

            int p2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Player 2, attempt " + i + ":"));
            score2 += p2;
        }

        if (score1 > score2) {
            JOptionPane.showMessageDialog(null, "Congratulations, Player 1. You won.");
        } else if (score1 < score2) {
            JOptionPane.showMessageDialog(null, "Congratulations, Player 2. You won.");
        } else {
            JOptionPane.showMessageDialog(null, "It's a tie.");
        }

    }
}
