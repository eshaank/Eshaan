import javax.swing.JOptionPane;


public class remarkable {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog(null, "What's your name");
	if(name.equals("Nic")){
		JOptionPane.showMessageDialog(null, "You help me a lot in class. :D");
	}
	if(name.equals("Jean-Pierre")){
		JOptionPane.showMessageDialog(null, "You are an amazing coder. Hope you do well on your test! (hint: STUDY) You got thiiis!!!");
		}
	if(name.equals("Lucas")){
		JOptionPane.showMessageDialog(null, "Keep up with the vegetable eating! YEA YO :D");
	}
}
}
