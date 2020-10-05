package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	public void run() {

		Robot tim = new Robot();
		tim.setSpeed(50);
		tim.penDown();
		tim.moveTo(800, 500);
		tim.turn(-90);
		for (int i = 0; i < 11; i++) {
			String timHeight = JOptionPane.showInputDialog("How tall should this house be; Small, Medium, or Large?");
			String timColor = JOptionPane.showInputDialog("What color should this house be? Red, Green, or Blue?");

			drawBuild(tim, timHeight, timColor);
		}
	}

	public void drawHouse(Robot tim, int timTall, String timColor) {

		tim.setPenColor(0, 102, 0);
		tim.move(20);
		tim.turn(90);
		chooseColor(tim, timColor);
		tim.move(timTall);
		tim.turn(-90);
		tim.move(35);
		tim.turn(-90);
		tim.move(timTall);
		tim.turn(90);
		tim.setPenColor(0, 102, 0);
		tim.move(20);

	}

	public void drawBuild(Robot tim, String timHeight, String timColor) {
		timHeight = timHeight.trim();
		if (timHeight.equalsIgnoreCase("small")) {
			drawHouse(tim, 60, timColor);
		} else if (timHeight.equalsIgnoreCase("medium")) {
			drawHouse(tim, 120, timColor);
		} else if (timHeight.equalsIgnoreCase("large")) {
			drawHouse(tim, 250, timColor);
		}

	}

	public void chooseColor(Robot tim, String timColor) {
		timColor = timColor.trim();
		if (timColor.equalsIgnoreCase("Blue")) {
			tim.setPenColor(Color.blue);
		} else if (timColor.equalsIgnoreCase("Red")) {
			tim.setPenColor(Color.red);
		} else if (timColor.equalsIgnoreCase("Green")) {
			tim.setPenColor(Color.green);
		}

	}

}
