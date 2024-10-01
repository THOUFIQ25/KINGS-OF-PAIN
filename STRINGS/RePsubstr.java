import java.util.*;
import java.lang.*;
import java.io.*;
//REPLACE A SUB STRING
class RePsubstr
{
    public static void main(String[] args) throws java.lang.Exception
    {
        String os = "Breaking Bad";
        String ns = "Good";
        String ts = "Bad";
        String rs = os.replace(ts, ns);
        System.out.print(rs);


    }
}
/*Your Output

Breaking Good*/
