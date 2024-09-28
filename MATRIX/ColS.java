import java.util.*;
import java.lang.*;
import java.io.*;
//MATRIX COLUMN SUM
class ColS
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
            int res = 0;
            for (int j = 0; j < m; j++)
            {

                res += ar[j][i];
            }
            System.out.println(res);
        }



    }
}

/*Sample Input

2 2



5 -1



19 8

Your Output

24
7
*/
