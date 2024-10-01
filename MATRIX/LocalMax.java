import java.util.*;
import java.lang.*;
import java.io.*;
//Local Max in Matrix
class LocalMax
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int[][] ar = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                ar[i][j] = w.nextInt();
            }
        }
        int[][] d = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++)
        {
            for (int j = 0; j < n - 2; j++)
            {
                int maxe = Integer.MIN_VALUE;
                for (int x = i; x < i + 3; x++)
                {
                    for (int y = j; y < j + 3; y++)
                    {
                        maxe = Math.max(maxe,ar[x][y]);
                    }
                }
                            d[i][j] = maxe;

            }
        }
        for (int i = 0; i < n - 2; i++)
        {
            for (int j = 0; j < n - 2; j++)
            {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

    }
}
/*Sample Input

4



12 9 8 40



5 20 2 6



8 14 6 30



6 2 25 2

Your Output

20 40 
25 30 
*/
