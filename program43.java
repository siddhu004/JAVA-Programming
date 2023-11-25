

///////////////////////////////////////////////////


//////////////////////////////////////////////////

import java.util.*;

class program43
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = sobj.nextLine();

        stringx obj = new stringx();

        String sret = obj.strwhtspcs(name);
        System.out.println("string is: "+sret);

    }
}

class stringx
{
    public String strwhtspcs(String str)
    {
        return str.replaceAll("\\s","");
    }
}