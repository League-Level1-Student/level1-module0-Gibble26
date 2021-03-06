package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
String bingus = "https://screenshots.gamebanana.com/img/ico/sprays/5f7012dc9ae06.png";
		// 2. create a variable of type "Component" that will hold your image
Component image1 = createImage(bingus);
		// 3. use the "createImage()" method below to initialize your Component
		// 4. add the image to the quiz window
quizWindow.add(image1);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer1 = JOptionPane.showInputDialog("Is bingus beautiful? Yes or no?");
		// 7. print "CORRECT" if the user gave the right answer
if(answer1.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "good, I would have killed you if you answered wrong.");
}
		// 8. print "INCORRECT" if the answer is wrong
if(answer1.equalsIgnoreCase("no")) {
	JOptionPane.showMessageDialog(null, "You have answered incorrect, prepare to die.");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(image1);
		// 10. find another image and create it (might take more than one line
		// of code)
String bongus = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHgWRmFARIAHdcC6GcurDf8frthBvvsu5wgw&usqp=CAU";
Component image2 = createImage(bongus);
		// 11. add the second image to the quiz window
quizWindow.add(image2); 
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String question2 = JOptionPane.showInputDialog("Are you immune to potato chip?");
		// 14+ check answer, say if correct or incorrect, etc.
if(question2.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "potato chip will test that.");
}
if(question2.equalsIgnoreCase("no")) {
	JOptionPane.showMessageDialog(null, "A fool thinks he is safe, but a wise man knows he is never safe. Good job.");
}
quizWindow.pack();
String shongus = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQGUp42PDpAwjJwpnsOIATaG_8uGJnUpnaohw&usqp=CAU";
Component image3 = createImage(shongus);
quizWindow.add(image3);
quizWindow.pack();
String question3 = JOptionPane.showInputDialog("Is this Gabriel, Yes or No?");
if(question2.equalsIgnoreCase("Yes")) {
JOptionPane.showMessageDialog(null, "You are smart, unlike Gabriel.");
}	
if(question2.equalsIgnoreCase("no")) {
 JOptionPane.showMessageDialog(null, "You are very dumb. Do you see the ham hocks on this Sammy Hammy???!?!?!?");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
