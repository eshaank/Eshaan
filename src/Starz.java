// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge. A solution
 * is printed in the red curriculum folder.
 */

public class Starz {

	public static void main(String[] args) {
		Starz starz = new Starz();
		String shape = JOptionPane.showInputDialog("Do you want a square, triangle, or star?");
		String num = JOptionPane.showInputDialog("How fast do you want the turtle to go? Choose a speed from 1 to 10.");
		int hi = Integer.parseInt(num);
		if (shape.equals("square")) {
			starz.hai(hi);
		}
		if (shape.equals("star")) {
			starz.sup(hi);
		}
		if (shape.equals("triangle")) {
			starz.lolz(hi);
		}
		
		
		
		

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
