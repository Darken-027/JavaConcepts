package others;

import javax.swing.JOptionPane;

public class GUI_Program {
    public static void main(String[] args) {
        //Graphical, User, Interface

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }
}
