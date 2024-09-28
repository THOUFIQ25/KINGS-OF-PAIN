import java.util.*;
import java.lang.*;
import java.io.*;
//INTERCHANGE THE DIAGONALS
class ChanDia
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
        for (int i = 0; i < n; i++)
        {

            int t = ar[i][i];
            ar[i][i] = ar[i][n - 1 - i];
            ar[i][n - 1 - i] = t;

        }
        for (int i = 0; i < n; i++)
        {

            for (int j = 0; j < n; j++)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }


    }
}
/*Sample Input

4



5 6 7 8



13 14 15 16



1 2 3 4



9 10 11 12

Your Output

8 6 7 5 
13 15 14 16 
1 3 2 4 
12 10 11 9 
*/
