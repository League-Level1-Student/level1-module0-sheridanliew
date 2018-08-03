
import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rbt = new Robot();
	static Random random = new Random();
	static String small = ("60");
	static String medium = ("120");
	static String large = ("250");

	public static void main(String[] args) {
		// 1. Have a robot start on the left side of the window near the bottom.
		rbt.setSpeed(25);
		rbt.moveTo(100, 500);
		// 2. Draw a flat-topped house of height 100 with grass after it (see picture).
		rbt.penDown();
		rbt.setPenColor(Color.BLACK);
		rbt.move(100);
		rbt.turn(90);
		rbt.move(30);
		rbt.turn(90);
		rbt.move(100);
		rbt.turn(270);
		rbt.setPenColor(30, 500, 0);
		rbt.move(15);
		rbt.turn(270);
		// 3. Extract the piece of code that draws the house into a method. Draw 10
		// houses.

		// for (int i = 0; i < 9; i++) {
		// flatHouse(100);
		// }

		// 4. Change the method to take (int height) as a parameter. Draw 9 houses of
		// different heights

		// 5. Make the method take a String instead of an int.
		// “small” 60
		// “medium” 120
		// “large” 250

		for (int i = 0; i < 9; i++) {
			int r = random.nextInt(3);
			if (r == 0) {
				drawPointyRoof(60, Color.BLUE);
			} else if (r == 1) {
				drawFlatRoof(120, Color.BLACK);
			} else {
				drawFlatRoof(250, Color.GRAY);
			}
		}

		// 6. Make the method take a color as well as a height. The houses are drawn in
		// that color.

		// [optional] Set the scene to night by setting the background to black

		// 7. Give the houses peaked roofs

		// 8. Extract that roof code into a method “drawPointyRoof” and create a new
		// method: “drawFlatRoof”.

		// 9. Make large houses have flat roofs

	}

	public static void drawFlatRoof(int height, Color color) {
		rbt.setPenColor(color);
		rbt.move(height);
		rbt.turn(90);
		rbt.move(30);
		rbt.turn(90);
		rbt.move(height);
		rbt.turn(270);
		rbt.setPenColor(30, 500, 0);
		rbt.move(15);
		rbt.turn(270);
	}

	public static void drawPointyRoof(int height, Color color) {
		rbt.setPenColor(color);
		rbt.move(height);
		rbt.turn(45);
		rbt.move(20);
		rbt.turn(90);
		rbt.move(20);
		rbt.turn(45);
		rbt.move(height);
		rbt.turn(270);
		rbt.setPenColor(30, 500, 0);
		rbt.move(15);
		rbt.turn(270);
	}

}
