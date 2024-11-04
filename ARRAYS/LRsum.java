import java.util.*;
import java.lang.*;
import java.io.*;

/*Left Sum and Right Sum 
Given an array A of size N. Construct an array B, such that B[i] is calculated as follows:

Find leftSum => sum of elements to the left of index i in array A; if none, use 0.
Find rightSum => sum of elements to the right of index i in array A; if none, use 0.
B[i] = | leftSum - rightSum |
Your task is to simply print the B array.



Input Format

The first line of input contains the N - size of the array. The next line contains N integers - the elements of array A.



Output Format

Print the elements of the B array separated by space.



Constraints

1 <= N <= 103

0 <= arr[i] <= 100000



Example

Input

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
class LRsum
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int[] ar = new int[n];
        int totalsum = 0;
        for (int i = 0; i < n; i++)
        {
            ar[i] = w.nextInt();
            totalsum += ar[i];

        }
        int[] br = new int[n];
        int leftSum = 0;
        for (int i = 0; i < n; i++)
        {
            int rightSum = totalsum - leftSum - ar[i];
            br[i] = Math.abs(leftSum - rightSum);
            leftSum += ar[i];
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(br[i] + " ");
        }
    }
}
