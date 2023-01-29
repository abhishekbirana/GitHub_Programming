//Define a method to return Good If sum of Even digit is equals to sum of Odd digits in the number.
package Programming;

import java.util.Scanner;

public class EvenOddSum 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean rs=sumEvenOddCheck(n);
		if(rs)
			System.out.println("Good");
		else
			System.out.println("Not Good");

	}

	public static boolean sumEvenOddCheck(int n) 
	{
		int es=0,os=0;
		while(n!=0)
		{
			int d=n%10;
			if(d%2==0)
				es=es+d;
			else
				os=os+d;
			n=n/10;
		}
		return es==os;
		
	}

}
