package RunJAVA;

import java.util.Scanner;

public class Prime {
	public static void main (String arg[])
	{
		System.out.println("enter max limit value for prime number");
		int x, count=0;
		Scanner sc = new Scanner(System.in);
		
		x=sc.nextInt();
		System.out.println("the prime number :  " );
		
		for(int i=1; i<=x; i++)
		{
			count=0;
			for(int k=1; k<=i; k++)
			{
				if (i%k==0)
					count++;
			}
			
			if(count==2)
			{
				
				System.out.println(i);
			}
		}
		
		
	}

}
