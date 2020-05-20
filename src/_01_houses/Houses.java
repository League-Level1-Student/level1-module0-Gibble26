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
		
		
		for (int i = 0; i < 11; i++) {
			String height = JOptionPane.showInputDialog("What do you want the height of the houses to be?" );
			int intHeight = Integer.parseInt(height);
			if (intHeight <= 230) {
				drawPointyHouse(a);
			}
			else {
				drawFlatHouse(a);
			}
			
		}
	

	
	

	
	
	
	
	
	
	}
	public void drawFlatHouse(Robot gib) {
		
		
		
		String color = JOptionPane.showInputDialog("What color do you want the houses to be? Red, Blue, or Pink?");
		if (color.equalsIgnoreCase("Red")) {
			gib.setPenColor(Color.red);
		}
		if (color.equalsIgnoreCase("Blue")) {
			gib.setPenColor(Color.blue);
		}
		if (color.equalsIgnoreCase("Pink")) {
			gib.setPenColor(Color.pink);
		}

		gib.move(intHeight);
		gib.turn(-90);
		gib.move(45);
		gib.turn(-90);
		gib.move(intHeight);
		gib.turn(90);
		

		gib.move(35);

		
		gib.turn(90);
	}
	public void drawPointyHouse(Robot gib) {
		
		
		String color = JOptionPane.showInputDialog("What color do you want the houses to be? Red, Blue, or Pink?");
		if (color.equalsIgnoreCase("Red")) {
			gib.setPenColor(Color.red);
		}
		if (color.equalsIgnoreCase("Blue")) {
			gib.setPenColor(Color.blue);
		}
		if (color.equalsIgnoreCase("Pink")) {
			gib.setPenColor(Color.pink);
		}

		gib.move(intHeight);
		gib.turn(-45);
			gib.move(45);
		gib.turn(-90);
		gib.move(45);
		gib.turn(-45);
		
		gib.move(intHeight);

		
		gib.turn(90);
	}
	
}
