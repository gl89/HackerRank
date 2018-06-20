
/*
Gabriel Loterena
7/15/2016
Hackerrank 
Day 2 Simple Meal Calculations
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

	public static double calculate(double mC, int tipPercent, int taxPercent) {
		double tax = mC * ((double) tipPercent / 100);
		double tip = mC * ((double) taxPercent / 100);
		return tax + tip + mC;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		// cast the result of the rounding operation to an int and save it as
		// totalCost
		int totalCost = (int) Math.round(calculate(mealCost, tipPercent, taxPercent));

		System.out.println("The total meal cost is " + totalCost + " dollars.");
		// Print your result
	}
}
