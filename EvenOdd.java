package ControlStatements;

import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[] args)
	{
		int a;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter value : ");
		a = obj.nextInt();
		
		if (a % 2 == 0)
		{
				System.out.println("Even");						
		}
		else
		{
				System.out.println("Odd");			
		}
				
	}					
}
