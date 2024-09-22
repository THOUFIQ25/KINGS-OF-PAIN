import java.util.*;
import java.lang.*;
import java.io.*;

class BubbleSort
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
     
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 1; j < ar.length - i; j++)
            {
                if (ar[j - 1] > ar[j])
                {
                    int t = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = t;
                  
                }
            }
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

2 9 1 8 10 
2 1 8 9 10 
1 2 8 9 10 
1 2 8 9 10 
1 2 8 9 10 
*/
