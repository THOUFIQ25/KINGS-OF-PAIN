import java.util.*;
import java.lang.*;
import java.io.*;

class ShellSort
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
        {
            ar[i] = w.nextInt();
        }
        for (int g = n / 2; g > 0; g /= 2)
        {
            for (int i = g; i < n; i++)
            {
                int k = ar[i];
                int j = i;
                while (j >= g && ar[j - g] > k)
                {
                    ar[j] = ar[j - g];
                    j -= g;
                }
                ar[j] = k;
            }
            for (int x = 0; x < n; x++)
            {
                System.out.print(ar[x] + " ");
            }
            System.out.println();
        }




    }
}
/*Sample Input

8



4 3 12 1 13 9 5 6



Your Output

4 3 5 1 13 9 12 6 
4 1 5 3 12 6 13 9 
1 3 4 5 6 9 12 13 
*/
