//*******************************************************************
// Pp31.java        Author: Lillian Freire
//
// Write an application that prompts and reads the user's first and
// last name (separately). Then print a string composed of the first
// letter of the user's first name, followed by the first five 
// characters of the user's last name, followed by a random number
// in the range 10 to 99. Assume that the last name is at least five
// letters long. Similar algorithms are sometimes used to generate
// usernames for new computer accounts.
//*******************************************************************

import java.util.Scanner;
import java.util.Random;

public class Pp31
{
	public static void main (String[] args)
	{
		String firstName, lastName;
		int number;
		
		Scanner name = new Scanner (System.in);
		
		System.out.print("Enter your first name: ");
		firstName = name.nextLine();
		
		System.out.print("Enter your last name: ");
		lastName = name.nextLine();
		
		Random generator = new Random();
		
		number = generator.nextInt(90) + 10;
		
		System.out.println(firstName.substring(0, 1) + lastName.substring(0, 5) + number);
	}
}