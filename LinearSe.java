import java.util.*;
import java.lang.*;
import java.io.*;

class LinearSe
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
        System.out.println(linearser(ar, k));

    }
    public static int linearser(int[] ar, int k)
    {
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] == k)
                return i;
        }
        return -1;
    }
}
/*Sample Input

5 15



-2 -19 8 15 4

Your Output

3
*/
