//*******************************************************************
// Pp23.java        Author: Lillian Freire
//
// Write an application that prompts for and reads a person's name,
// age, college, and pet's name. Then print the following paragraph,
// inserting the appropriate data:
// 
// Hello, my name is NAME and I am AGE years
// old. I'm enjoying my time at COLLEGE, though
// I miss my pet PETNAME very much!
//*******************************************************************

import java.util.Scanner;

public class Pp23
{
	public static void main (String[] args)
	{
		Scanner info = new Scanner (System.in);
		String name;
		int age;
		String college;
		String petname;
		
		System.out.println("What's your name? ");
		name = info.nextLine();
		
		System.out.println("What's your age? ");
		age = info.nextInt();
		
		System.out.println("Where are you studying? ");
		college = info.nextLine();
		
		System.out.println("What's your pet's name? ");
		petname = info.nextLine();
		
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I'm enjoying my time at " + college + ", though I miss my pet " + petname + " very much!");
	}
}

