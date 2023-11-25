
//////////////////////////////////////////////////

import java.util.*;

class program36
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = sobj.nextLine();

        stringx obj = new stringx();

        int iret = obj.countsmall(name);
        System.out.println("number of small letter is: "+iret);

        int iret1 = obj.countCapital(name);
        System.out.println("number of capital letter is: "+iret1);
    }
}

class stringx
{
    public int countsmall(String str)
    {

        int icount = 0;
        for(int icnt = 0;icnt < str.length();icnt++)
        {
            if((str.charAt(icnt) >= 'a') && (str.charAt(icnt) <= 'z'))
            {
                icount++;
            }
        }
        return icount;
    }

    public int countCapital(String str)
    {
        int icount1 = 0;
        for(int icnt = 0;icnt < str.length();icnt++)
        {
            if((str.charAt(icnt) >= 'A') && (str.charAt(icnt) <= 'Z'))
            {
                icount1++;
            }
        }
        return icount1;
    }
}