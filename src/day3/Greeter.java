package day3;
import javax.swing.JOptionPane;
public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Name");
	System.out.println(name);
	JOptionPane.showMessageDialog(null, "Well, hello there " + name);
}
}
