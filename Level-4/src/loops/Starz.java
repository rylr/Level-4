package loops;
import org.teachingextensions.logo.Tortoise;


public class Starz {
	public static void main(String[] args) {

		// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to see the result of this line.
		Tortoise.setX(0);
		Tortoise.show();
		Tortoise.turn(90);
		Tortoise.setSpeed(10);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		while(true) {
			for(int i = 0; i <= 4; i++) {
				Tortoise.move(30);
				Tortoise.turn(144);
			}
			Tortoise.penUp();
			Tortoise.move(80);
			Tortoise.penDown();
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
