package ControlStatements;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) 
	{
		float pie=3.14f;
		float rad,a,c;
		int ch;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Main Menu");
		System.out.println("1: Area of a circle ");
		System.out.println("2: Circumference of a circle ");
		System.out.println("3: Exit ");
		
		System.out.println("Enter your choice[1-3]: ");		
		ch = obj.nextInt();
						
		System.out.println("\nEnter Radius: ");
		rad = obj.nextFloat();
		
		switch(ch)
		{
			case 1:
					
					a = pie * rad * rad;
					System.out.println("Areas: "+a);
					break;
			case 2:
					
					c = 2 * pie *rad;
					System.out.println("Circumference: "+c);
					break;
			case 3:
					System.exit(0);  // it will terminate the program 
					break;
			
			default:
					System.out.println("Invalid choice");
					break;
		}
												
	}

}

/*    switch(variable)
 * 			{
 * 				case val1:
 * 							break;
 * 				case val2:
 * 							break;
 * 				case val3:
 * 							break;
 * 				case val4:
 * 							break;
 * 
 * 				default:
 * 						break; 
 * 
 * 			}

 */


