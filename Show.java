import javax.swing.JOptionPane;
public class Show {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Whats is you name?");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Your are old the "+age);
	}
}
