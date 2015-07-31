import javax.swing.JOptionPane;

import org.teachingextensions.logo.*;

public class ObedientTortosie {
	public static void main(String[] args) {
		ObedientTortosie ot = new ObedientTortosie();
		String hi = JOptionPane.showInputDialog(null, "Do you want a circle, triangle, or square.");
		if (hi.equals("square")) {
			ot.drawSquare();
		}
		if (hi.equals("Circle")) {
			ot.drawCircle();
		}
		if (hi.equals("triangle")) {
			ot.drawTriangle();
		}
		
		Tortoise.show();
		Tortoise.setSpeed(10);
		ot.drawCircle();
	}

	void drawSquare()
{
	for (int i = 0; i < 4; i++) {
		Tortoise.move(100);
		Tortoise.turn(90);
	}
	}

	void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(100);
			Tortoise.turn(180);
		}}
void drawCircle(){
for (int i = 0; i < 100; i++) {
	Tortoise.move(10);
	Tortoise.turn(30);
}	
}
}
