import javax.swing.JOptionPane;


public class rollercoaster {
public static void main(String[] args) {
String feet = JOptionPane.showInputDialog("How tall are you???");
int tall = Integer.parseInt(feet);

if (tall <= 4) {
	JOptionPane.showMessageDialog(null,"Go home and grow some more");
}
else
{
	JOptionPane.showMessageDialog(null, "HI :D");
}
}}

