// Approach 2

import java.util.*;

class program6
{
    public static int factorial(int ivalue)
    {
        int imult = 1;
        for(int icnt = 1;icnt <= ivalue;icnt++)
        {
            imult = imult * icnt;
        }
        return imult;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number: ");
        int ino = sobj.nextInt();

        int iret = factorial(ino);
        
        System.out.println("factorial is: "+iret);
    }
}