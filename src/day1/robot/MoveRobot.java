package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MoveRobot {
public static void main(String[] args) {
	Robot slime = new Robot("mini");
	slime.sparkle();
	slime.penDown();
	slime.move(100);
	slime.turn(90);
	slime.setSpeed(200);
	slime.move(500);
	slime.setPenColor(Color.MAGENTA);
	slime.turn(90);

}
}
