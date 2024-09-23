import java.util.*;
import java.lang.*;
import java.io.*;

class SelectionSort
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
        for (int i = 0; i < ar.length - 1; i++)
        {
            int mi = i;
            for (int j = i + 1; j < ar.length; j++)
            {
                if (ar[mi] > ar[j])
                {
                    mi = j;
                }
            }
            int t = ar[i];
            ar[i] = ar[mi];
            ar[mi] = t;
            for (int x = 0; x < n; x++)
            {
                System.out.print(ar[x] + " ");
            }
            System.out.println();
        }

    }
}
/*Sample Input

6



5 8 10 15 3 6

Your Output

3 8 10 15 5 6 
3 5 10 15 8 6 
3 5 6 15 8 10 
3 5 6 8 15 10 
3 5 6 8 10 15 
*/
