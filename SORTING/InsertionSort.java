import java.util.*;
import java.lang.*;
import java.io.*;

class InsertionSort
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
        for (int i = 1; i < ar.length; i++)
        {
            int k = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > k)
            {
                ar[j + 1] = ar[j];
                j -= 1;
            }
            ar[j + 1] = k;
            for (int x = 0; x < ar.length; x++)
            {
                System.out.print(ar[x] + " ");
            }
            System.out.println();
        }

    }
}
/* Sample Input

5

10 2 9 1 8

Your Output

2 10 9 1 8 
2 9 10 1 8 
1 2 9 10 8 
1 2 8 9 10 
*/
