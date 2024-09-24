import java.util.*;
import java.lang.*;
import java.io.*;

class DupEle
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
        int dup = -1;
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = i + 1; j < ar.length; j++)
            {
                if (ar[i] == ar[j])
                {
                    dup = ar[i];
                    break;
                }

            }
            if (dup != -1)
                break;
        }
        System.out.println(dup);

    }
}
/*Sample Input

6



5 4 10 9 21 10



Your Output

10
*/
