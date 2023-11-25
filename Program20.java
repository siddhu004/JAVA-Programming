

import java.util.*;

class program20
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number: ");
        int ino = sobj.nextInt();
        
        digits nobj = new digits();
        int iret = nobj.genericroot(ino);
        
        System.out.println("generic root is: "+iret);
    }
}

class digits
{
    public int genericroot(int ino)
    {
        int isum = 0;
        int idigit = 0;
        while(ino >= 10)
        {
            while(ino != 0)
            {
                idigit = ino % 10;
                isum = isum + idigit;
                ino = ino / 10;
            }
            if(isum >= 10)
            {
                ino = isum;
                isum = 0;
            }
            else
            {
                ino = isum;
                break;
            }
        }  
        return ino;      
    }
}

/*

ino = 985698

isum = 9+8+5+9+8
isum = 45
ino = 45
isum = 
*/