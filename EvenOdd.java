package RunJAVA;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String arg[])
	{
		
		System.out.println("Enter your no.");
		int x;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		
		if(x%2==0)
		{
			System.out.println(x + " is even");
			
		}
		else
		{
			System.out.println(x + " is odd");
		}
		
		
	}

}
