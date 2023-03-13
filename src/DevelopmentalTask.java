import javax.swing.JOptionPane;

public class DevelopmentalTask {
    public static void main(String[] args) {

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age: "));

        String devTask;
      
        if (age >= 0 && age <= 5) {
            devTask = "Infancy and Early Childhood";
        } else if (age >= 6 && age <= 12) {
            devTask = "Middle Childhood";
        } else if (age >= 13 && age <= 17) {
            devTask = "Adolescence";
        } else if (age >= 18 && age <= 35) {
            devTask = "Early Adulthood";
        } else if (age >= 36 && age <= 60) {
            devTask = "Middle Age";
        } else {
            devTask = "Later Maturity";
        }

        JOptionPane.showMessageDialog(null, "You are in the stage of \"" + devTask + "\".");
    }
}
