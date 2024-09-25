import java.util.*;
import java.lang.*;
import java.io.*;

class Longest1
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
        int crntlen = 0;
        int maxlen = 0;
        for (int i = 0; i < n; i++)
        {
            if (ar[i] == 1)
            {
                crntlen++;
                if (crntlen > maxlen)
                {
                    maxlen = crntlen;
                }
            }
            else
            {
                crntlen = 0;
            }
        }
        System.out.println(maxlen);

    }
}

/*Sample Input

10



1 0 0 1 0 1 1 1 1 0



Your Output

4
*/
