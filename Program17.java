

import java.util.*;

class program17
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
        int idigit = 1;
        int ino = 0;
        while(ivalue != 0)
        {
            idigit = ivalue % 10;
            ino+=idigit;
            ivalue = ivalue / 10;
        }
        return ino;
    }
}