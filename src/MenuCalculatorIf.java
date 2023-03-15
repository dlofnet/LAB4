import javax.swing.JOptionPane;

public class MenuCalculatorIf {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter frst number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number: "));
        int answer;

        String operation = JOptionPane.showInputDialog(null, 
        "Choose an operation: \n [A]dd [S]ubtract [M]ultiple [D]ivide [Q]uit");
        String message = "";

        if (operation.equalsIgnoreCase("a")) {
            answer = num1 + num2;
            message = "The sum is " + answer;
        } else if (operation.equalsIgnoreCase("s")) {
            answer = num1 - num2;
            message = "The difference is " + answer;
        } else if (operation.equalsIgnoreCase("m")) {
            answer = num1 * num2;
            message = "The product is " + answer;
        } else if (operation.equalsIgnoreCase("d")) {
            answer = num1 / num2;
            message = "The quotient is " + answer;
        } else if (operation.equalsIgnoreCase("q")) {
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, message);

    }
}
