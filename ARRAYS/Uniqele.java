import java.util.*;
import java.lang.*;
import java.io.*;
//UNIQUE ELEMENTS IN AN ARRAY
//O(N)
class Uniqele
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
        isUnique(ar);

    }
    public static void isUnique(int[] ar)
    {
        HashMap < Integer, Integer > hm = new HashMap < > ();
        for (int num: ar)
        {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int num: ar)
        {
            if (hm.get(num) == 1)
            {
                System.out.print(num + " ");
            }
        }
    }
}
/*Sample Input

6

1 2 2 15 6 1

Your Output

15 6 */
