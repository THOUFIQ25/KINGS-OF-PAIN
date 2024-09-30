import java.util.*;
import java.lang.*;
import java.io.*;
//Sparse Matrix 
class SparseMat
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int m = w.nextInt();
        int[][] ar = new int[n][m];
        int zc = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                ar[i][j] = w.nextInt();
                if (ar[i][j] == 0)
                    zc++;
            }
        }
        int ts = n * m;
        if (zc > ts / 2)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
/*Sample Input

2 3



5 0 0



0 8 0

Your Output

Yes
*/
