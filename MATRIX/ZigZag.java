import java.util.*;
import java.lang.*;
import java.io.*;
//Matrix Zig-Zag Traversal
class ZigZag
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int m = w.nextInt();
        int[][] ar = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                ar[i][j] = w.nextInt();
            }
        }
        for (int i = 0; i < n; i++)
        {
            if (i % 2 == 0)
            {
                for (int j = 0; j < m; j++)
                {
                    System.out.print(ar[i][j] + " ");
                }
            }
            else
            {
                for (int j = m - 1; j >= 0; j--)
                {
                    System.out.print(ar[i][j] + " ");
                }

            }
        }

    }
}
/*Sample Input

3 3



5 9 -2



-3 4 1



2 6 1

Your Output

5 9 -2 1 4 -3 2 6 1 */
