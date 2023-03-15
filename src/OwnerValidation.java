import javax.swing.JOptionPane;

public class OwnerValidation {
    public static void main(String[] args) {

        String owner1 = "Mart";
        String owner2 = "Anne";

        String name = JOptionPane.showInputDialog(null, "Enter a name: ");
        
        if (name.equalsIgnoreCase(owner1) || name.equalsIgnoreCase(owner2)) {
            JOptionPane.showMessageDialog(null, name + " is the owner.");
        } else {
            JOptionPane.showMessageDialog(null, name + " is the owner of nothing.");
        }

    }
}
