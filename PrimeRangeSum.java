import java.util.*;
import java.lang.*;
import java.io.*;

class PrimeRangeSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner w=new Scanner(System.in);
		int m=w.nextInt();
		int n=w.nextInt();
		int s=0;
	  for(int i=m;i<=n;i++)
	  {
	     if(prime(i))
	     s+=i;
	  }
	  System.out.println(s);

	}
	public static boolean prime(int n)
	{
	    if(n<=1)
	    return false;
	    for(int i=2;i<=n/2;i++)
	    {
	        if(n%i==0)
	        return false;
	    }
	    return true;
	}
}


/* 
Sample Input

4 13

Your Output

36
*/
