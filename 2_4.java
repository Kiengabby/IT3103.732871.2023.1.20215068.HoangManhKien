
import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;
        String strNotification = "Hoang Manh Kien - 20215068 - You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Hoang Manh Kien - 20215068- Please input the first number: ", "Input the first number", JOptionPane.QUESTION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null, "Hoang Manh Kien - 20215068 - Please input the second number: ", "Input the second number", JOptionPane.QUESTION_MESSAGE);
        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, strNotification, "Hoang Manh Kien - 20215068- Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
