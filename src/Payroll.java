import javax.swing.JOptionPane;

public class Payroll {
    public static void main(String[] args) {

        int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog(null, "Input hours worked: "));
        int basePay = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the base pay: "));

        float pay = 0;
        float overtime = 0;

        if (basePay < 8.00) {
            JOptionPane.showMessageDialog(null, "Error: Base pay must be at least $8.00 an hour.");
            System.exit(0);
        }

        if (hoursWorked > 60) {
            JOptionPane.showMessageDialog(null, "Error: Hours worked cannot exceed 60 hours a week.");
            System.exit(0);
        }

        if (hoursWorked < 40) {
            pay = hoursWorked * basePay;
        } else if (hoursWorked > 40) {
            overtime = hoursWorked - 40;
            pay = (float) ((40 * basePay) + (overtime * (basePay * 1.5)));
        }

        JOptionPane.showMessageDialog(null, "Employee pay is: " + pay);
    }
}
