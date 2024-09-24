
//FIRST AND LAST INDEX
import java.util.*;
import java.lang.*;
import java.io.*;

class FirLasIND
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
        int x = w.nextInt();
        int fo = -1, lo = -1;
        for (int i = 0; i < ar.length; i++)
        {
            if (x == ar[i])
            {
                fo = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--)
        {
            if (x == ar[i])
            {
                lo = i;
                break;
            }
        }
        System.out.println(fo + " " + lo);

    }
}
/*Sample Input

10



1 3 5 7 9 11 3 13 15 3



3



Your Output

1 9
*/
