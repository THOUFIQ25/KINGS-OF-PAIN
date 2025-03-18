import java.util.*;
import java.lang.*;
import java.io.*;
//REVERSE ARRAY
class Revarr
{
    public static void rever(int[] ar)
    {
        int left = 0;
        int rig = ar.length - 1;
        while (left < rig)
        {
            int temp = ar[left];
            ar[left] = ar[rig];
            ar[rig] = temp;
            left++;
            rig--;
        }
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
        rever(ar);
        System.out.println("reversed array=" + Arrays.toString(ar));

    }
}
/*Sample Input

5

1 2 3 4 5

Your Output

reversed array=[5, 4, 3, 2, 1]
*/
