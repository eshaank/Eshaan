import javax.swing.JOptionPane;


public class votingbooth {
public static void main(String[] args) {
 String hi = JOptionPane.showInputDialog(null,"How old are you bruh????");
int lelz = Integer.parseInt(hi);
if(lelz >= 18){
	JOptionPane.showInputDialog(null, "Who should be the next president??");
}
else {
	JOptionPane.showMessageDialog(null, "You're too young girlfriend!!!!");
}
}
}
