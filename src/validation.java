import java.util.Random;

import javax.swing.JOptionPane;

public class validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int randomNumber = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);
for (int i = 0; i < 10; i++) {
	 randomNumber = new Random().nextInt(10);

		// 3. Use the randomNumber to give the user a random compliment.
if (randomNumber== 0) {
	JOptionPane.showMessageDialog(null, "You look nice");
}
if (randomNumber== 1) {
	JOptionPane.showMessageDialog(null, "I love your cheekbones");
}
if (randomNumber== 2) {
	JOptionPane.showMessageDialog(null, "I like you");
}
if (randomNumber== 3) {
	JOptionPane.showMessageDialog(null, "Nice suit");
}
	if (randomNumber== 4) {
		JOptionPane.showMessageDialog(null, "Cool phone");
	}
	if (randomNumber== 5) {
		JOptionPane.showMessageDialog(null, "I hate you");
	}
	if (randomNumber== 6) {
		JOptionPane.showMessageDialog(null, "your mean!");
	}
	if (randomNumber== 7) {
		JOptionPane.showMessageDialog(null, "GO away!");
	}
	if (randomNumber== 8) {
		JOptionPane.showMessageDialog(null, "hi");
	}
		if (randomNumber== 9) {
			JOptionPane.showMessageDialog(null, "im weird");
		}
}

		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}


