// Approach 3

import java.util.*;
import siddharth.program8i;
class program7
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number: ");
        int ino = sobj.nextInt();
        
        Numbers nobj = new Numbers();
        int iret = nobj.factorial(ino);
        
        System.out.println("factorial is: "+iret);
    }
}

