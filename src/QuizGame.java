import javax.swing.JOptionPane;

public class QuizGame {
public static void main(String[] args) {
	
	
	String dino= JOptionPane.showInputDialog("What dinosaur has horns in Jurassic World Fallen Kingdom");
	
	
	if(dino.equals("Carnotaurus")) {
		JOptionPane.showMessageDialog(null,"You got it right!");
	}
	else {
		JOptionPane.showMessageDialog(null,"Try again!");
	}
	
	String kill= JOptionPane.showInputDialog("Which dino killed the Carnotaurus");
	
	
	if(kill.equals("Trex")) {
		JOptionPane.showMessageDialog(null,"Nice job!!");
	}
	else {
		JOptionPane.showMessageDialog(null,"Study More!!");
	}
	
	String dig= JOptionPane.showInputDialog("How is Owen Gradys Dino in Fallen Kingdom");
	
	if(dig.equals("Blue")) {
		JOptionPane.showMessageDialog(null,"Nice dino Facts");
	}
	else {
		JOptionPane.showMessageDialog(null,"Reaserch dino Facts");
	}
	
	String grade= JOptionPane.showInputDialog("Which dino did they find in the sewers");
	
	if(grade.equals("Baeyonyx")) {
		JOptionPane.showMessageDialog(null,"Again you are really GOOD!!!!");
	}
	else {
		JOptionPane.showMessageDialog(null,"Again your are not good. BOO");
	}
	
	String last= JOptionPane.showInputDialog("Which dino is the bad one in the Movie");
	
	if(last.equals("Indoraptor")) {
		JOptionPane.showMessageDialog(null,"You are a master of Dino");
	}
	else {
		JOptionPane.showMessageDialog(null,"You are so horrible watch the Movie Right now");
	}
}
}
