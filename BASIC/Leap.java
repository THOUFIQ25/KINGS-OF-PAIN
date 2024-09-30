import java.util.*;
import java.lang.*;
import java.io.*;
//LEAP YEAR OR NOT
class Leap
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner w = new Scanner(System.in);
        int year = w.nextInt();
        System.out.println(isleap(year));


    }
    public static boolean isleap(int year)
    {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;

        return false;
    }
}
/*Sample Input

2021

Your Output

false
*/
