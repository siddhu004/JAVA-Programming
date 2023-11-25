// Approach 3

import java.util.*;

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

class Numbers
{
    public int factorial(int ivalue)
    {
        int imult = 1;
        for(int icnt = 1;icnt <= ivalue;icnt++)
        {
            imult = imult * icnt;
        }
        return imult;
    }
}

