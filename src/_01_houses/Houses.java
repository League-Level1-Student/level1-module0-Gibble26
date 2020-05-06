package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	public void run() {
    	Robot a = new Robot(); 
		a.moveTo(800, 500);
		a.setSpeed(100);
		a.turn(-90);
		a.penDown();
		a.setPenColor(45, 110, 59);
		a.move(35);
		
		a.setPenColor(Color.green);
	
	drawHouse(a);
	
	a.setPenColor(45, 110, 59);
	a.turn(90);
	a.move(35);
	
	
	
	
	
	}
	public void drawHouse(Robot gib) {
		gib.turn(90);
		gib.move(100);
		gib.turn(-90);
		gib.move(45);
		gib.turn(-90);
		gib.move(100);
	}
	
}
