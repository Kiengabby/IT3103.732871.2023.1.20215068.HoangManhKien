import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Hoang Manh Kien - 20215068 - Please enter your name:");
        JOptionPane.showMessageDialog(null, "Toi la Hoang Manh Kien - 20215068. Hi " + result + "!");
        System.exit(0);
    }
}
