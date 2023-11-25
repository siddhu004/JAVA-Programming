// Approach 1

import java.util.*;

class program5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number: ");
        int ino = sobj.nextInt();

        int imult = 1;
        for(int icnt = 1;icnt <= ino;icnt++)
        {
            imult = imult * icnt;
        }
        System.out.println("factorial is: "+imult);
    }
}