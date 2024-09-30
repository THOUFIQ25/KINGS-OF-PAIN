import java.util.*;
import java.lang.*;
import java.io.*;
//NON REPEATING CHARACTER IN A STRING
class NonRep
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        String str = w.nextLine();
        int freq[] = new int[256];
        for (int fre: str.toCharArray())
        {
            freq[fre]++;
        }
        for (int i = 0; i < freq.length; i++)
        {
            if (freq[i] == 1)
                System.out.println((char) i + " " + freq[i] + " ");
        }

    }
}
/*Sample Input

swiss

Your Output

i 1 
w 1 
*/
