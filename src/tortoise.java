import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class tortoise {
public static void main(String[] args) {
String lol = JOptionPane.showInputDialog(null, "How many pixels do you want the tortoise to move?");
int far = Integer.parseInt(lol);
if (far <= 0) {
	Tortoise.explode();
}


}
}
