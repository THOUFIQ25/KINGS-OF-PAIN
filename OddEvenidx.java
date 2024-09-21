/*Odd Even Index 
Given a string, print all the letters present at the odd index, followed by the letters present at the even index.
Input Format

The input contains a string S, consisting of ASCII characters.

Output Format

Print letters present at odd index, followed by the letters present at even index.

Constraints

1 <= len(S) <= 100

Example

Input

afdg5tg

Output

fgtad5g

 */
import java.util.*;
import java.lang.*;
import java.io.*;

class OddEvenidx
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        String str = w.nextLine();
        char[] ch = str.toCharArray();
        for (int i = 1; i < ch.length; i += 2)
        {

            System.out.print(ch[i]);
        }
        for (int i = 0; i < ch.length; i += 2)
        {

            System.out.print(ch[i]);
        }

    }
}

