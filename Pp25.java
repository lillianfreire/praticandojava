//*******************************************************************
// Pp25.java        Author: Lillian Freire
//
// Write an application that reads two floating point numbers and
// prints their sum, difference, and product.
//*******************************************************************

import java.util.Scanner;

public class Pp25
{
	public static void main (String[] args)
	{
		Scanner convertion = new Scanner (System.in);
		float tempFahrenheit;
		float tempCelsius;
		int CONSTANT = 32;
		float FRACTION = 1.8F;
		
		System.out.print("Type the temperature in F: ");
		tempFahrenheit = convertion.nextFloat();
		
		tempCelsius = (tempFahrenheit - CONSTANT) / FRACTION;
		
		System.out.println(tempFahrenheit + " Fahrenheit is " + tempCelsius + " Celsius.");
	}
}
