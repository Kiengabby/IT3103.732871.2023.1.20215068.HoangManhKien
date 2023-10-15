import javax.swing.JOptionPane;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;

        strNum1 = JOptionPane.showInputDialog(null,
                "Hoang Manh Kien - 20215068 Please input a:",
                "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        num1 = Double.parseDouble(strNum1);

        if (num1 == 0) {
            JOptionPane.showMessageDialog(null, "a cannot be zero!");
            System.exit(0);
        }

        strNum2 = JOptionPane.showInputDialog(null,
                "Hoang Manh Kien - 20215068 Please input b:",
                "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        num2 = Double.parseDouble(strNum2);

        double solution = -num2 / num1;

        String resultMessage = "Hoang Manh Kien - 20215068\n" +
                "The solution of the equation " + num1 + "x + " + num2 + " = 0 is:\n" +
                "x = " + solution;

        JOptionPane.showMessageDialog(null, resultMessage, "Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
