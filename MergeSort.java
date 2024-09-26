import java.util.*;
import java.lang.*;
import java.io.*;

class MergeSort
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
        divide(ar, 0, n - 1);
    }
    public static void divide(int[] ar, int si, int ei)
    {
        if (si >= ei)
            return;
        int mid = si + (ei - si) / 2;
        divide(ar, si, mid);
        divide(ar, mid + 1, ei);
        conqure(ar, si, mid, ei);
        PrintArr(ar);
    }
    public static void conqure(int[] ar, int si, int mid, int ei)
    {
        int[] mer = new int[ei - si + 1];
        int i1 = si;
        int i2 = mid + 1;
        int x = 0;
        while (i1 <= mid && i2 <= ei)
        {
            if (ar[i1] <= ar[i2])
            {
                mer[x++] = ar[i1++];
            }
            else
                mer[x++] = ar[i2++];
        }
        while (i1 <= mid)
        {
            mer[x++] = ar[i1++];
        }
        while (i2 <= ei)
        {
            mer[x++] = ar[i2++];
        }
        for (int i = 0, j = si; i< mer.length; i++, j++)
        {
            ar[j] = mer[i];
        }

    }
    public static void PrintArr(int[] ar)
    {
        for (int ele: ar)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}

/*Sample Input

6



5 1 3 15 10 4



Your Output

1 5 3 15 10 4 
1 3 5 15 10 4 
1 3 5 10 15 4 
1 3 5 4 10 15 
1 3 4 5 10 15 
*/
