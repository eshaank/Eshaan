import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class coolness {
	public static void main(String[] args) {

	}


	public void sup(int num) {
		int hi = 0;
		Tortoise.setSpeed(num);
		Tortoise.show();
		Tortoise.setX(hi);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		for (int i = 0; i < 1000; i += 50) {
			Tortoise.setX(i);
			Tortoise.setY(i);
			for (int j = 0; j < 5; j++) {
				//Tortoise.setSpeed(10);
				Tortoise.move(30);
				Tortoise.turn(144);

			}
		}

	}

	public void hai(int num) {
		int hi = 0;
		Tortoise.setSpeed(num);
		Tortoise.show();
		Tortoise.setX(hi);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		for (int i = 0; i < 1000; i += 50) {
			Tortoise.setX(i);
			Tortoise.setY(i);
			for (int j = 0; j < 5; j++) {
				//Tortoise.setSpeed(10);
				Tortoise.move(30);
				Tortoise.turn(90);

			}
		}
	}
	public void lolz(int num){
		int hi = 0;
		Tortoise.setSpeed(num);
		Tortoise.show();
		Tortoise.setX(hi);
				// 2. Make the Tortoise draw a star shape. Hint: 144.
		for (int i = 0; i < 1000; i+=50) {
			Tortoise.setX(i);
			Tortoise.setY(i);
		for (int j = 0; j < 5; j++) {
			//Tortoise.setSpeed(10);
			Tortoise.move(30);
		    Tortoise.turn(120);
		 
		}
		}
	}
}

