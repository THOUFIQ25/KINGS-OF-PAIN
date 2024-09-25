import java.util.*;
import java.lang.*;
import java.io.*;

class MaxAlt
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
        int ca = 0;
        int ma = 0;
        for (int i = 0; i < n; i++)
        {
            ca += ar[i];
            if (ca > ma)
            {
                ma = ca;
            }
        }
        System.out.println(ma);

    }
}
/*Sample Input

5

-5 1 5 0 -7

Your Output

1


When the pilot started at point 0 his altitude was -5, when he moved to point 1 his altitude became (-5 + 1 = -4), at point 2 his altitude became(-4 + 5 = 1), at point 3

his became altitude remains(1 + 0 = 1), and at point 4 his altitude became (1 + -7 = -6). The maximum altitude that he reached in his journey was 1.
*/
