package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot Froome = new Robot("batman");
		Froome.setSpeed(200);
		Froome.penDown();
		Froome.move(200);
		Froome.turn(90);
		Froome.move(200);
		Froome.turn(90);
		Froome.move(200);
		Froome.turn(90);
		Froome.move(200);
		Froome.penUp();
		Froome.move(200);
Froome.penDown();
		for (int i = 0; i < 4; i++) {
			Froome.move(200);
			Froome.turn(90);
		}

	}
}