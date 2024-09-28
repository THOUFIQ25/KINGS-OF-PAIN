import java.util.*;
import java.lang.*;
import java.io.*;
//SUB MATRIX SUM
class subS
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int[][] ar = new int[n][n];
        int i = w.nextInt();
        int j = w.nextInt();
        int k = w.nextInt();
        int l = w.nextInt();
        for (int x = 0; x < n; x++)
        {
            for (int y = 0; y < n; y++)
            {
                ar[x][y] = w.nextInt();
            }
        }
        int s = 0;
        for (int x = i; x <= k; x++)
        {
            for (int y = j; y <= l; y++)
            {
                s += ar[x][y];
            }
        }
        System.out.println(s);

    }
}
/*Sample Input

3



1 1 2 2



1 2 3



4 5 6



7 8 9

Your Output

28
*/
