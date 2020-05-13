package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	public void run() {
		
    	Robot a = new Robot(); 
		a.moveTo(850, 500);
		a.setSpeed(100);
		
		a.penDown();
		a.setPenColor(45, 110, 59);
		
		a.setPenColor(Color.green);
		
	a.setPenColor(45, 110, 59);

	
	for (int i = 0; i < 11; i++) {
		drawHouse(a);
		
	}

	
	
	
	
	
	
	}
	public void drawHouse(Robot gib) {
		gib.setPenColor(Color.green);
		String height = JOptionPane.showInputDialog("What do you want the height of the houses to be?" );
		int intHeight = Integer.parseInt(height);
		gib.move(intHeight);
		gib.turn(-90);
		gib.move(45);
		gib.turn(-90);
		gib.move(intHeight);
		gib.turn(90);
		gib.setPenColor(45, 110, 59);

		gib.move(35);

		gib.setPenColor(Color.green);
		gib.turn(90);
	}
	
}
