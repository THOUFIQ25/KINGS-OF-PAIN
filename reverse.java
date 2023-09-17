package cal;

import java.util.Scanner;

public class reverse {

	public static void main(String args[])
	{
		//Reversing a number
		Scanner w=new Scanner(System.in);
		System.out.println("enter the number=");
		int num=w.nextInt();
		String s="";
		//logic
		while(num!=0)
		{
			int last=num%10;
			s+=Integer.toString(last);
			num/=10;
		}
		System.out.println("revered number="+s);
	}
}

/*..............OUTPUT.............
 enter the number=25
revered number=52
 */