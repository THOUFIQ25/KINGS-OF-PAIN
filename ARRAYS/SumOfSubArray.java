/* Sum of Subarrays 
Given an array of integers, answer queries of the form: [i, j]: Print the sum of array elements from A[i] to A[j], both inclusive.


Input Format

The first line of input contains the N-size of the array.
The next line contains N integers - elements of the array. 
The next line contains Q - number of queries. Each of the next Q lines contains 2 space-separated indexes: i and j.

Output Format

For each query, print the sum of array elements from A[i] to A[j], both inclusive, separated by a new line.


Constraints

30 points

1 <= N, Q <= 10000


70 points

1 <= N, Q <= 500000


General Constraints

-109 <= A[i] <= 109

0 <= i <= j <= N-1


Example

Input

10

1 30 13 -4 -5 12 -53 -12 43 100

4

0 5

1 7

2 3

7 9



Output

47

-19

9

131

*/


import java.util.*;
import java.lang.*;
import java.io.*;

class SumOfSubArray
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int[] ar = new int[n];
        int pre[] = new int[n + 1];
        for (int i = 0; i < n; i++)
        {
            ar[i] = w.nextInt();
        }
        pre[0] = ar[0];
        for (int i = 1; i <= n - 1; i++)
        {
            pre[i] = pre[i - 1] + ar[i];
        }
        int q = w.nextInt();
        int ans = 0;
        while (q-- > 0)
        {
            int x = w.nextInt();
            int y = w.nextInt();
            ans = pre[y];
            if (x != 0)
            {
                ans -= pre[x - 1];
            }
            System.out.println(ans);
        }


    }
}
