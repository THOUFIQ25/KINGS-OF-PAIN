/*Gauntlets 
You have a collection of N gauntlets, each with a specific color represented by A[i]. 
Your goal is to maximize the number of pairs by repeatedly pairing up gauntlets of the same color. 
Determine the maximum number of pairs that can be formed.

Input Format

The first line of input contains an integer N. The second line of input contains an array of size N.

Output Format

For the given input, print a single line representing the answer.

Constraints

1 ≤ N ≤ 102

1 ≤ Ai ≤ 103

Example

Input

6

4 1 7 4 1 4


Output

2


You can do the operation twice as follows.



Choose two gauntlets with the color 1 and pair them.
Choose two gauntlets with the color 4 and pair them.
Then, you will be left with one sock with the color 4 and another with the color 7, so you can no longer do the operation. There is no way to do the operation three or more times, so you should print 2.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Gaunlets
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
        boolean pair[] = new boolean[n];
        int pai = 0;
        for (int i = 0; i < n; i++)
        {
            if (!pair[i])
            {
                for (int j = i + 1; j < n; j++)
                {
                    if (ar[i] == ar[j] && !pair[i])
                    {
                        pai++;
                        pair[i] = pair[j] = true;
                    }
                }
            }
        }
        System.out.println(pai);


    }
}

/*Sample Input

6



4 1 7 4 1 4

Your Output

2
*/
