

import java.util.*;

class program19
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number: ");
        int ino = sobj.nextInt();
        
        digits nobj = new digits();
        int iret = nobj.adddigit(ino);
        
        System.out.println("addition of digits are: "+iret);
    }
}

class digits
{
    public int adddigit(int ivalue)
    {
        if(ivalue < 0)
        {
            ivalue = -ivalue;
        }
        int idigit = 1;
        int ino = 0;
        while(ivalue != 0)
        {
            ino = ino + (ivalue % 10);
            ivalue = ivalue / 10;
        }
        return ino;
    }
}