//MERGE ARRAY AND SORT IT

import java.util.*;
import java.lang.*;
import java.io.*;

class MergeArr
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        ArrayList < Integer > ar = new ArrayList < > (n);
        for (int i = 0; i < n; i++)
        {
            ar.add(w.nextInt());
        }
        int m = w.nextInt();
        ArrayList < Integer > arr = new ArrayList < > (m);
        for (int i = 0; i < m; i++)
        {
            arr.add(w.nextInt());
        }
        ar.addAll(arr);
        Collections.sort(ar);
        for (int i = 0; i < ar.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(ar.get(i));
        }

    }
}

/*Sample Input

7



1 1 5 8 10 12 15



5



-1 2 4 5 7

Your Output

-1 1 1 2 4 5 5 7 8 10 12 15*/
