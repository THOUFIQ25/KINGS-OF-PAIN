/*int findCount(int arr[], int length, int num, int diff); 
The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this function 
to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’. 
Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class AbsoDiff
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner w=new Scanner(System.in);
		int n=w.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=w.nextInt();
		}
		int num=w.nextInt();
		int diff=w.nextInt();
		System.out.println(fun(a,num,diff));
	  
	}
	public static int  fun(int []a,int num,int diff)
	{
	    int res=0;
		int c=0;
		for(int i=0;i<a.length;i++)
		{   int t=num-a[i];
		    res=Math.abs(t);
		    if(res<=diff)
		    c++;
		   
		}
		if(res>diff)
		return -1;
		return c;
	}
}
/*Sample Input

6

12 3 14 56 77 13 

13

2

Your Output

3
*/
