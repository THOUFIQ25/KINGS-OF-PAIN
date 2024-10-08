import java.util.*;
import java.lang.*;
import java.io.*;

class Fib
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.println(fib(i));
        }

    }
    private static HashMap < Integer, Long > hm = new HashMap < > ();
    public static long fib(int n)
    {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        if (hm.containsKey(n))
        { 
                      return hm.get(n);
  
        }
        long res = fib(n - 1) + fib(n - 2);
        hm.put(n, res);
        return res;
    }
}
