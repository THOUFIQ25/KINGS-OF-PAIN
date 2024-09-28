import java.util.*;
import java.lang.*;
import java.io.*;

class BinarySe
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int k = w.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
        {
            ar[i] = w.nextInt();

        }
        boolean found = false;
        int low = 0;
        int high = n - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            System.out.println(low + " " + high + " " + mid);
            if (ar[mid] == k)
            {
                found = true;
                break;
            }
            else if (k < ar[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        if (found)
            System.out.println("True");
        else
            System.out.println("False");


    }
}
/*Sample Input

9 12



1 4 6 7 10 11 12 20 23



Your Output

0 8 4
5 8 6
True
*/
