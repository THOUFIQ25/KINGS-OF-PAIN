import java.util.*;
import java.lang.*;
import java.io.*;
//SMALL ELE IN AN ARRAY

class smallEle
{
    public static int findsmallele(int[] ar)
    {
        int min = ar[0];
        for (int i = 1; i < ar.length; i++)
        {
            if (ar[i] < min) //for largest ele ar[i]>max
            {
                min = ar[i];
            }
        }
        return min;
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
        {
            ar[i] = w.nextInt();
        }
        System.out.println(findsmallele(ar));

    }
}
/*Sample Input

5

10 3 45 2 8

Your Output

2
*/
