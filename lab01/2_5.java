import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;

        strNum1 = JOptionPane.showInputDialog(null, "Hoang Manh Kien - 20215068 - Please input the first number:", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Hoang Manh Kien - 20215068 - Please input the second number:", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);

        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "Error: Division by 0");
            System.exit(0);
        }

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        String resultMessage = "Hoang Manh Kien - 20215068\n" +
                "The sum of those two numbers is: " + sum + "\n" +
                "The difference of those two numbers is: " + difference + "\n" +
                "The product of those two numbers is: " + product + "\n" +
                "The quotient of those two numbers is: " + quotient;

        JOptionPane.showMessageDialog(null, resultMessage, "Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
