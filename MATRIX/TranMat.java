import java.util.*;
import java.lang.*;
import java.io.*;
//TRANSPOSE OF A MATRIX
class TranMat
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
        for (int j = 0; j < m; j++)
        {
            for (int i = 0; i < n; i++)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*Sample Input

2 2



5 -1



19 8

Your Output

5 19 
-1 8 
*/
