package _01_houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class houseTest{

	public void run() {
		
		Robot a = new Robot();
		a.setSpeed(50);
		a.penDown();
		a.moveTo(800,500);
		a.turn(-90);
		for (int i = 0; i < 11; i++) {
			Random rand = new Random(); 
		int intRand = 
		drawHouse(a, 20);
		}
	}
	public void drawHouse(Robot tim, String height) {
		
		
		tim.setPenColor(0, 102, 0);
		tim.move(20);
		tim.turn(90);
		tim.setPenColor(Color.green);
		tim.move(height);
		tim.turn(-90);
		tim.move(35);
		tim.turn(-90);
		tim.move(height);
		tim.turn(90);
		tim.setPenColor(0, 102, 0);
		tim.move(20);
		
	}
	
	
}
