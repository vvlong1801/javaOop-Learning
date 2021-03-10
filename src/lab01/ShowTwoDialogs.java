package lab01;

import javax.swing.JOptionPane;

public class ShowTwoDialogs {
	public static void main(String[] args) {
		String s1, s2;
		String sNotification="You've just enterd: ";
		s1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		sNotification += s1 + " and";
		s2 = JOptionPane.showInputDialog(null, "Please input the second number: ","Input the second number", JOptionPane.INFORMATION_MESSAGE);
		sNotification += s2;
		
		JOptionPane.showMessageDialog(null, sNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}

