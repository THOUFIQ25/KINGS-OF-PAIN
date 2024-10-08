import java.util.*;
import java.lang.*;
import java.io.*;

class Fact
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        System.out.println(fact(n));

    }
    private static HashMap < Integer, Long > hm = new HashMap < > ();
    public static long fact(int n)
    {
        if (n == 0 || n == 1)
            return 1;
        else if (hm.containsKey(n))
            return hm.get(n);
        long res = n * fact(n - 1);
        hm.put(n, res);
        return res;
    }
}
