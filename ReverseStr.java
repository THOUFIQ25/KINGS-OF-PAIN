
//REVERSE A STRING 

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseStr
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        String s = w.nextLine();
        char[] ch = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n / 2; i++)
        {
            char t = ch[i];
            ch[i] = ch[n - i - 1];
            ch[n - i - 1] = t;
        }
        String str = new String(ch);
        System.out.println(str);
    }
}
/*Input

smart

Output

trams*/
