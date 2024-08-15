/*The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:

    Return -1 if the array is null
    Return 0 if the total amount of food from all houses is not sufficient for all the rats.
    Computed values lie within the integer range.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class RatFood
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner w=new Scanner(System.in);
	  int r=w.nextInt();
	  int u=w.nextInt();
	  int n=w.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
	      a[i]=w.nextInt();
	  }
	  System.out.println(fun(r,u,a));
	  

	}
  static int fun(int r,int u,int []a)
	{
	    if(a==null)return -1;
	    int f=r*u;
	    int s=0;
	    int c=0;
	    for(int i=0;i<a.length;i++)
	    {
	      s+=a[i];
	      c++;
	      if(s>=f)
	      break;
	      
	    }
	    if(s<f)
	    return 0;
	    return c;
	}
}
/*Sample Input

7

2

8

2 8 3 5 7 4 1 2

Your Output

4
*/
