package RunJAVA;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String arg[])
	{
		int x,y,z,max;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if(x>y)
		{
					if(x>z)
						max=x;
				
				else
				{
					max=z;
				}
		}
		else
		{
			if(y>z)
			max=y;
			else
			{
				max=z;
			}
		}
		
		System.out.println("max no is" +max);
	}

}
