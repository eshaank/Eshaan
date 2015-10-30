import javax.swing.JOptionPane;


public class leve0teamproject {
public static void main(String[] args) {
	String option = JOptionPane.showInputDialog(null, "Choose one number. 1, 2, 3, 4");
	int hi = Integer.parseInt(option);
	if(hi == 1){
String one = JOptionPane.showInputDialog(null, "Give me a number");
int lol = Integer.parseInt(one);
String two = JOptionPane.showInputDialog(null, "Give me another number");
int hai = Integer.parseInt(two);
	JOptionPane.showMessageDialog(null, (lol + hai) + " ");
	}
	if(hi == 2){
	String troll = JOptionPane.showInputDialog(null, "How much was the last thing you bought?");
	int kai = Integer.parseInt(troll);
	String bae = JOptionPane.showInputDialog(null, "How much did you pay?");
	int lolz = Integer.parseInt(bae);
	JOptionPane.showMessageDialog(null, "Your change is " + (lolz - kai) + ".");
	}
	if(hi == 3){
		String die = JOptionPane.showInputDialog(null, "Type something");
		JOptionPane.showMessageDialog(null, die + ".");
	}
	if(hi == 4){
		System.exit(0);
	}
}
}
