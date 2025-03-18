import java.util.*;
import java.lang.*;
import java.io.*;
//SECOND SMALLEST AND LARGEST ELEMENT

class SecSmaLar
{
    public static void findele(int[] ar)
    {

        Arrays.sort(ar);
        int sse = ar[1];
        int sle = ar[ar.length - 2];
        System.out.println("sse=" + sse);
        System.out.println("sle=" + sle);
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
        findele(ar);

    }
}
/*Sample Input

5

10 3 45 2 8

Your Output
sse=3
sle=10
*/
