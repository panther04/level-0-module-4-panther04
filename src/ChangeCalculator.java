//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String level= JOptionPane.showInputDialog("How many nickles do you have");
		// Convert their answer to an int using Integer.parseInt()
		int phone= Integer.parseInt(level);

		// Ask the user how many dimes they have, and convert their answer
String apple= JOptionPane.showInputDialog("How many dimes do you have");
		
		int fruit= Integer.parseInt(apple);
		
		// Ask the user how many quarters they have, and convert their answer
String bottle= JOptionPane.showInputDialog("How many Quarters do you have");

		int sub= Integer.parseInt(bottle);
		// Calculate how much money the user has and save it in a double variable 
		double hhh= phone*.05;
		double ggg= fruit*.10;
		double lll= sub*.25;
		
		// Tell the user how much money they have
		String glass= JOptionPane.showInputDialog("How much money do you have");
			
	}	
}