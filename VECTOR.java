import java.util.*;
import java.lang.*;
import java.io.*;

class VECTOR
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Vector < Integer > vec = new Vector < > ();
        //TRAKING ELEMENTS AS INPUT
        for (int i = 0; i <= 3; i++)
        {
            vec.add(i);
        }
        //PRINTING THE VECTOR
        for (int ot: vec)
        {
            System.out.println(ot);
        }
        //SIZE OF THE VECTOR
        System.out.println("size:" + vec.size());
        //CLONING VEC ELEMENTS
        Vector vc = (Vector) vec.clone();
        //DISPLAY CLONED vc
        System.out.println(vc);
        //TO REMOVE ALL VECTOR ELEMENTS
        vc.clear();
        //DISPLAY CLONED vc CLEAR
        System.out.println(vc);
        //TO ADD AT PARTICULAR Index
        vc.add(0, 25);
        vc.add(1, 255);
        //DISPLAY CLONED vc
        System.out.println(vc);
        //TO REPLACE AN ELE 
        vc.set(1, 65535);
        //DISPLAY CLONED vc
        System.out.println(vc);


    }
}
/*0
1
2
3
size:4
[0, 1, 2, 3]
[]
[25, 255]
[25, 65535] */
