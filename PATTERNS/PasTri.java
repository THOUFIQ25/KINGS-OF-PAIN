import java.util.*;
import java.lang.*;
import java.io.*;
//PASCALS TRINAGLE
class PasTri
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int[][] pas = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if (j == 0 || j == i)
                    pas[i][j] = 1;
                else
                    pas[i][j] = pas[i - 1][j - 1] + pas[i - 1][j];
                System.out.print(pas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*Sample Input

10

Your Output

1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
1 5 10 10 5 1 
1 6 15 20 15 6 1 
1 7 21 35 35 21 7 1 
1 8 28 56 70 56 28 8 1 
1 9 36 84 126 126 84 36 9 1 
*/
