package ControlStatements;

public class SwitchCaseExample_1
{
	/* Whether enter character is vowel or constant    */
	
	public static void main(String... g)
	{
		char ch ='S';
				
		switch(ch)
		{
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
				System.out.println("Vowel");
				break;
		default:
			System.out.println("Constant");
			break;					
		}
				
	}
}
