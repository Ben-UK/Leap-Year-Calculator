import java.util.Scanner;

public class Main
{

	public static void main(String [] args)
	{
		Scanner scan = new Scanner (System.in);
		int year = scan.nextInt();
				
		//comment		
		calculateLeapYear(year);
	}
	
	static boolean calculateLeapYear(int year)
	{
		if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0))
		{
			System.out.println("It's a Leap Year!");
			return true;
		}
	
		else 
		{
			System.out.println("It's not a Leap Year!");
			return false;
		}		
	}

}
