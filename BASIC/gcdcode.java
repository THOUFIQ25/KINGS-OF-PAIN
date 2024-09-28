package cal;
import java.util.Scanner;

public class gcdcode {
	public static void main(String args[])
	{
		//Finding GCD(greatest common divisor) in java
		Scanner w=new Scanner(System.in);
		System.out.println("enter two numbers=\n");
		int a=w.nextInt();
		int b=w.nextInt();
		int gcd=0;
		//logic
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("GCD="+gcd);
		
	}

}
/*..............OUTPUT.............
 *   enter two numbers=
50
60
GCD=10
 */

