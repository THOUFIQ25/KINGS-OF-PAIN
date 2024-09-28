import java.util.*;
import java.lang.*;
import java.io.*;
//LOWER TRIANGLE ELEMENT SUM
class LowerTSum
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int[][] ar = new int[n][n];
        int s = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                ar[i][j] = w.nextInt();
                if (i >= j)
                    s += ar[i][j];
            }
        }
        System.out.println(s);
    }
}
/*Input

3

5 9 -2

-3 4 1

2 6 1



Output

15



Explanation



The sum of the lower triangle matrix is 5 - 3 + 4 + 2 + 6 + 1 = 15.*/
