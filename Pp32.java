//*******************************************************************
// Pp32.java        Author: Lillian Freire
//
// Write an application that prints the sum of cubes. Prompt for and
// read two integer values and print the sum of each value raised to
// the third power.
//*******************************************************************

import java.util.Scanner;


public class Pp32
{
	public static void main (String[] args)
	{
		int num1, num2;
		double sum;
		
		Scanner cubes = new Scanner (System.in);
		
		System.out.print("Enter an integer number: ");
		num1 = cubes.nextInt();
		
		System.out.print("Enter another integer number: ");
		num2 = cubes.nextInt();
		
		sum = Math.pow(num1, 3) + Math.pow(num2, 3);
		
		System.out.println("The sum of the cubes is: " + sum);
	}
}