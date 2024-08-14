import java.util.*;
import java.lang.*;
import java.io.*;
/* CALCULATE AND RETURN THE ABSOLUTE DIFFERENCE BETWEEN THE SUM OF DIGITS OF NUMBERES DIVISIBLE BY 4 AND THE SUM OF DIGITS OF NUMBERS DIVISIBLE BY 7,IN THE RANGE FROM M TO N*/
class DiffdivSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner w=new Scanner(System.in);
	    int m=w.nextInt();
	    int n=w.nextInt();
	    System.out.println(fun(m,n));
	    

	}
	public static int fun(int m,int n)
	{ int d4sum=0;
	  int d7sum=0;
	    for(int i=m;i<=n;i++)
	    {
	        if(i%4==0)
	        {
	            int num=i;
	            while(num>0)
	            {
	                d4sum+=num%10;
	                num/=10;
	            }
	        }
	        else if(i%7==0)
	        {
	            int num=i;
	            while(num>0)
	            {
	                d7sum+=num%10;
	                num/=10;
	            }
	        }
	    }
	    return Math.abs(d4sum-d7sum);
	}
}
/*
Sample Input

1 20

Your Output

12
*/
