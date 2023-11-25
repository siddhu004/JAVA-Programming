



import java.util.*;

class program16
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number: ");
        int ino = sobj.nextInt();
        
        digits nobj = new digits();
        int iret = nobj.countdigit(ino);
        
        System.out.println("number of digits are: "+iret);
    }
}

class digits
{
    public int countdigit(int ivalue)
    {
        int icount = 0;
        while(ivalue != 0)
        {
            icount++;
            ivalue = ivalue / 10;
        }
        return icount;
    }
}