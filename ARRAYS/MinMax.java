import java.util.*;
import java.lang.*;
import java.io.*;
//MIN AND MAX ELEMENT IN AN ARRAY
class MinMax
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
        int min = ar[0];
        int max = ar[0];
        for (int i = 1; i < n; i++)
        {
            if (min > ar[i])
            {
                min = ar[i];
            }
            if (max < ar[i])
            {
                max = ar[i];
            }
        }
        System.out.println(min + " " + max + " ");
    }
}
