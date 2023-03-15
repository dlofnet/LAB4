import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PointGradeValidation {
    public static void main(String[] args) {
        
        String id = JOptionPane.showInputDialog(null, "Input student ID: ");
        String name = JOptionPane.showInputDialog(null, "Input student name: ");
        String department = JOptionPane.showInputDialog(null, "Input department: ");
        String course = JOptionPane.showInputDialog(null, "Input course: ");
        String subject = JOptionPane.showInputDialog(null, "Input subject: ");
        int first = Integer.parseInt(JOptionPane.showInputDialog(null, "First Examination:"));
        int second = Integer.parseInt(JOptionPane.showInputDialog(null, "Second Examination:"));
        int third = Integer.parseInt(JOptionPane.showInputDialog(null, "Third Examination:"));
        int fourth = Integer.parseInt(JOptionPane.showInputDialog(null, "Final Examination:"));

        int average = (first + second + third + fourth) / 4;
        float gpa = (float) ((100 - average) + 10) / 10;

        String remarks = "";

        if (average > 100) {
            remarks = "Out of range or Invalid";
        } else if (average == 100) {
            remarks = "Passed – Excellent";
        } else if (average <= 99 && average >= 90) {
            remarks = "Passed – Very Good";
        } else if (average <= 89 && average >= 85) {
            remarks = "Passed – Average";
        } else if (average <= 84 && average >= 80) {
            remarks = "Passed – Good";
        } else if (average <= 79 && average >= 75) {
            remarks = "Passed – Satisfactory";
        } else if (average <= 74 && average >= 50) {
            remarks = "Failed";
        } else if (average <= 49 && average >= 0) {
            remarks = "Dropped";
        } else if (average < 0) {
            remarks = "No such grade";
        }

        String hold = "********Student Details********\n";
        hold += "Student ID\t\t:" + id + "\n";
        hold += "Name\t\t:" + name + "\n";
        hold += "Department\t\t:" + department + "\n";
        hold += "Course\t\t:" + course + "\n";
        hold += "Subject\t\t:" + subject + "\n";
        hold += "********Grade Details********\n";
        hold += "First\tSecond\tThird\tFourth\n";
        hold += first + "\t" + second + "\t" + third + "\t" + fourth + "\n";
        hold += "Average\t:" + average + "\n";
        hold += "Point Grade\t:" + gpa + "\n";
        hold += "Remarks\t:" + remarks + "\n";

        JOptionPane.showMessageDialog(null, new JTextArea(hold));

    }
}