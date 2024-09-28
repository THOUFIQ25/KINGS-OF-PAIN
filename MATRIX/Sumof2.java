import java.util.*;
import java.lang.*;
import java.io.*;
//SUM OF TWO MATRIX'S
class Sumof2
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int m = w.nextInt();
        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                a[i][j] = w.nextInt();
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                b[i][j] = w.nextInt();
            }
        }
        long s[][] = new long[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                s[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*Sample Input

2 3



5 -1 3



19 8 4



4 5 -6



1 -2 12



Your Output

9 4 -3 
20 6 16 
*/
