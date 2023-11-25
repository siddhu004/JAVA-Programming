
//////////////////////////////////////////////////

import java.util.*;

class program33
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = sobj.nextLine();

        System.out.println("your name is: "+name);
        System.out.println("length of string is: "+name.length());
        
        for(int icnt = 0;icnt < name.length();icnt++)
        {
            System.out.println(name.charAt(icnt));
        }
    }
}
