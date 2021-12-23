package ControlStatements;

public class TypeCastingExample 
{
	public static void main(String... g)
	{
		char ch ='Z';
		/* ASCII values
		 	A-Z  -> 65 to 90
		 	a-z -> 97 to 122
		 		  
		 		  (A)65+32 = 97(a)
		 		  (B)66+32 = 98(b)
		  		  
		 */
		
		
		System.out.println(ch); // Z
		
		System.out.println((int)ch); // 90 - typecasting implies here
		
		float pie=3.14f;
		
		System.out.println((int)pie);
		
		int s=150;
		
		System.out.println((float)s);
		
		System.out.println((char)s);
		
		
		
		
	}
}
