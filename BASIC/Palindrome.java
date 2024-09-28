import java.util.*;
import java.lang.*;
import java.io.*;
//PALINDROME
//A palindrome is a string that reads the same backward as forward, such as "madam" or "racecar."
class Palindrome
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        String s1 = w.nextLine().toLowerCase().trim();
        System.out.println(isPalindrome(s1));

    }
    public static boolean isPalindrome(String s1)
    {
        int left = 0;
        int right = s1.length() - 1;
        while (left < right)
        {
            if (s1.charAt(left) != s1.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
/*Sample Input

mom

Your Output

true
*/
