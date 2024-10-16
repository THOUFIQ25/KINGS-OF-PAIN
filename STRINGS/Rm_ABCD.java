import java.util.*;
import java.lang.*;
import java.io.*;
/*AB and CD 
Given a string S of length N. You can apply the following operations any number of times:

1. In one operation you can remove any one occurrence of substring "AB" from S.
2. In one operation you can remove any one occurrence of substring "CD" from S.
Print the minimum possible length of the resulting string that you can obtain.

Note: The string concatenates after removing the substring and could produce new "AB" or "CD" substrings.*/
class Rm_ABCD
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        String str = w.next();
        System.out.println(letsremove(str));
    }
    public static int letsremove(String str)
    {
        char stack[] = new char[str.length()];
        int top = -1;
        for (char cc: str.toCharArray())
        {
            if (top >= 0 && ((stack[top] == 'A' && cc == 'B') || (stack[top] == 'C' && cc == 'D')))
                top--;
            else
                stack[++top] = cc;
        }
        return top + 1;
    }
}
/*Input

CCAAABBBDE



Output

2
*/
