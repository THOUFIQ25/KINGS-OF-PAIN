//UNIQUE ELEMENT

import java.util.*;
import java.lang.*;
import java.io.*;

class UniqELE
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
            int c = 0;
            for (int j = 0; j < ar.length; j++)
            {
                if (ar[i] == ar[j])
                    c++;
            }
            if (c == 1)

                System.out.print(ar[i] + " ");

        }


    }
}
/*Sample Input

7



5 4 10 9 21 4 10

Your Output

5 9 21 */
