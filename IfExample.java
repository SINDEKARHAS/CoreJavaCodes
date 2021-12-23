package ControlStatements;


import java.util.Scanner;

// find out which number is greater or equal


public class IfExample {

	public static void main(String[] args)
	{
		int a,b;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter value 1: ");
		a = obj.nextInt();
		
		System.out.println("Enter value 2: ");
		b = obj.nextInt();	
		
		//nested if condition
		
		if( a== b)
		{
			System.out.println("Equals");
		}
		else
		{			
				if(a > b)
					{
					System.out.println("A is greater");			
					}
				else
					{
					System.out.println("B is greater");				
					}
		}
						
	}

}
/*
	syntax: 
				
			if(condition+logical opeartors(&& || !))
				{
					true logical
				}
			else
				{
					false logical 
				}
			
*/