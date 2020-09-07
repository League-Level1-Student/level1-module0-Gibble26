package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses{

	public void run() {
		
		Robot a = new Robot();
		a.setSpeed(50);
		a.penDown();
		a.moveTo(800,500);
		a.turn(-90);
		for (int i = 0; i < 11; i++) {
		String timHeight = JOptionPane.showInputDialog("How tall should this house be; Small, Medium, or Large?");
		int timInt = Integer.parseInt(timHeight);
		drawHouse(a, timInt);
		}
	}
	public void drawHouse(Robot tim, int timInt) {
		
		
		tim.setPenColor(0, 102, 0);
		tim.move(20);
		tim.turn(90);
		tim.setPenColor(Color.green);
		tim.move(timInt);
		tim.turn(-90);
		tim.move(35);
		tim.turn(-90);
		tim.move(timInt);
		tim.turn(90);
		tim.setPenColor(0, 102, 0);
		tim.move(20);
		
	}
	
	
}
