/*def differenceofSum(n. m) 
The function accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to m(both inclusive) 
that are not divisible by n. Return difference between sum of integers not divisible by n with sum of numbers divisible by 
n. 
Assumption: 
• n>0 and m>0 
• Sum lies between integral range*/

import java.util.*;
import java.lang.*;
import java.io.*;

class dsumNdsum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner w=new Scanner(System.in);
		int n=w.nextInt();
		int m=w.nextInt();
		System.out.println(fun(n,m));
	  
	}
	public static int  fun(int n,int m)
	{
	    int dsum=0;
	    int ndsum=0;
	    int res=0;
	   for(int i=1;i<=m;i++)
	   {
	       if(i%n==0)
	       {
	           dsum+=i;
	       }
	       else 
	       {
	           ndsum+=i;
	       }
	    res=dsum-ndsum;
	   }
	   return Math.abs(res);
	}
}
/*Sample Input

3 10

Your Output

19
*/
