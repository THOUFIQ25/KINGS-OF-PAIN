import java.util.*;
import java.lang.*;
import java.io.*;
//ANAMGRAM 
/*An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, "listen" and "silent" are anagrams.

Here's an optimized Java code to check if two strings are anagrams:
Approach:

    Sort and Compare: A simple approach to check for anagrams is to sort both strings and compare them. If both sorted strings are the same, then they are anagrams.
    Character Frequency Count: A more efficient approach is to count the frequency of each character in both strings and compare the frequencies.*/
class Anagram
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        String s1 = w.nextLine().toLowerCase().trim();
        String s2 = w.nextLine().toLowerCase().trim();
        System.out.println(isAnagram(s1, s2));
    }
    public static boolean isAnagram(String s1, String s2)
    {
        if (s1.length() != s2.length())
        {
            return false;
        }
        int[] chcount = new int[26];
        for (int i = 0; i < s1.length(); i++)
        {
            chcount[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++)
        {
            chcount[s2.charAt(i) - 'a']--;
        }
        for (int co: chcount)
        {
            if (co != 0)
                return false;
        }
        return true;
    }
}

/*Sample Input

listen 

silent

Your Output

true
*/
