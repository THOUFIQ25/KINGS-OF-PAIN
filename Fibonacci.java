package cal;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[])
	{
		Scanner w=new Scanner(System.in);
		//Fibonacci code
		System.out.println("enter the end number=");
		int num=w.nextInt();
		int nxt_term = 0;
		int a=0,b=1; //as series starts from 0 next 1 ....
		for(int i=1;i<=num;i++)
		{
			nxt_term=a+b;
			a=b;
			b=nxt_term;
			System.out.println("\t"+nxt_term);
		}
		
	}

}
/*..............OUTPUT.............
enter the end number=
25
	1
	2
	3
	5
	8
	13
	21
	34
	55
	89
	144
	233
	377
	610
	987
	1597
	2584
	4181
	6765
	10946
	17711
	28657
	46368
	75025
	121393

*/
