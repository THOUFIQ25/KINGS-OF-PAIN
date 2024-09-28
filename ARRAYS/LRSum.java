import java.util.*;
import java.lang.*;
import java.io.*;

class LRSum
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
        {
            ar[i] = w.nextInt();

        }
        int[] pre = new int[n];
        int[] br = new int[n];
        pre[0] = ar[0];
        for (int i = 1; i < n; i++)
        {
            pre[i] = pre[i - 1] + ar[i];
        }
        for (int i = 0; i < n; i++)
        {
            int ls = (i == 0) ? 0 : pre[i - 1];
            int rs = pre[n - 1] - pre[i];
            br[i] = Math.abs(rs - ls);
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(br[i] + " ");

        }

    }
}
/*Given an array A of size N. Construct an array B, such that B[i] is calculated as follows:

Find leftSum => sum of elements to the left of index i in array A; if none, use 0.
Find rightSum => sum of elements to the right of index i in array A; if none, use 0.
B[i] = | leftSum - rightSum |
Your task is to simply print the B array.Input

3

6 7 7



Output

14 1 13



Explanation



At index 0:

LeftSum = 0, RightSum = 14

B[0] = | LeftSum - RightSum | = 14.



At index 1:

LeftSum = 6, RightSum = 7

B[1] = | LeftSum - RightSum | = 1.



At index 2:

LeftSum = 13, RightSum = 0

B[2] = | LeftSum - RightSum | = 13.*/
