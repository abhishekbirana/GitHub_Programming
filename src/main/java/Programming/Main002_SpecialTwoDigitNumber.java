// WAJP to read integer value from user and print integer is a special two digit number or not.
package Programming;
import java.util.Scanner;
public class Main002_SpecialTwoDigitNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer Value");
		int n=sc.nextInt();	// Let user entered n=59
		int d1=n/10;	// d1=59/10	=5
		int d2=n%10;	// d2=59%10	=9
		int sum=d1+d2+d1*d2;
		if(sum==n)
			System.out.println(n+" is a Special Two Digit Number");
		else
			System.out.println(n+" is not a Special Two Digit Number");
	}

}
