//*******************************************************************
// Pp24.java        Author: Lillian Freire
//
// Write an application that reads two floating point numbers and
// prints their sum, difference, and product.
//*******************************************************************

import java.util.Scanner;

public class Pp24
{
	public static void main (String[] args)
	{
		Scanner operation = new Scanner (System.in);
		float number1;
		float number2;
		
		System.out.print("Type a number: ");
		number1 = operation.nextFloat();
		
		System.out.print("Type another number: ");
		number2 = operation.nextFloat();
		
		System.out.println("Sum of the numbers: " + (number1 + number2));
		System.out.println("Difference of the numbers: " + (number1 - number2));
		System.out.println("Product of the numbers: " + (number1 * number2));
	}
}
