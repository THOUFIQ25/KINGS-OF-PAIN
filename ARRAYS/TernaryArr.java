import java.util.*;
import java.lang.*;
import java.io.*;
//TERNARY ArrayIndexOutOfBoundsException
/*Given an array A of size N, find the minimum cost to convert it to a ternary array B. A ternary array can only have 0 or 1 or 2. After conversion, ensure that A[i] != B[i]. The cost of converting A[i] to B[i] is | A[i] - B[i] |.*/
class TernaryArr
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int[] ar = new int[n];
        int tc = 0;
        for (int i = 0; i < n; i++)
        {
            ar[i] = w.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            int ce = ar[i];
            int mincost = Integer.MAX_VALUE;
            for (int j = 0; j <= 2; j++)
            {
                if (ce != j)
                {
                    int cost = Math.abs(ar[i] - j);
                    mincost = Math.min(mincost, cost);
                }
            }
            tc += mincost;
        }
        System.out.println(tc);
    }
}
/*Example

Input

5

1 -1 2 0 5


Output

7


Explanation


Given A = {1, -1, 2, 0, 5} can be converted to B = {2, 0, 1, 1, 2},
with a cost of |1-2| + |-1-0| + |2-1| + |0-1| + |5-2| = 1 + 1 + 1 + 1 + 3 = 7.*/
