import java.util.*;
import java.lang.*;
import java.io.*;
//ZERO ROW & COLUMN
class ZeroRC
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
        boolean rows[] = new boolean[n];
        boolean col[] = new boolean[m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (ar[i][j] == 0)
                {
                    rows[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (rows[i] || col[j])
                    ar[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }
}
/*Sample Input

4 5



0 1 1 0 1 



1 1 1 1 1 



1 1 0 1 1 



1 1 1 1 1 

Your Output

0 0 0 0 0 
0 1 0 0 1 
0 0 0 0 0 
0 1 0 0 1 
*/
