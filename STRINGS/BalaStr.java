import java.util.*;
import java.lang.*;
import java.io.*;
//BALANCED STRING
/*A balanced string is one that contains an equal quantity of 'L' and 'R' characters. Given a balanced string S, your task is to split it into some number of substrings such that each substring is also balanced. Output the maximum number of balanced strings you can obtain through this splitting process*/
class BalaStr
{
    public static void main(String[] args) throws java.lang.Exception
    {

        Scanner w = new Scanner(System.in);
        String str = w.nextLine();
        int lc = 0, rc = 0, bc = 0;
        for (char ch: str.toCharArray())
        {
            if (ch == 'L')
                lc++;
            else if (ch == 'R')
                rc++;
            if (lc == rc)
            {
                bc++;
                lc = 0;
                rc = 0;
            }
        }
        System.out.println(bc);
    }
}
/*Input

LRRLLLLRRLRR



Output

3



Explanation



The string 'LRLLLRRLRR' can be split into three substrings:
"LR", "RL" and "LLLRRLRR," each containing the same number of 'L' and 'R' characters. */
