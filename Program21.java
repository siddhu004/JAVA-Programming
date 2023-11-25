

import java.util.*;

class program21
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number: ");
        int ino = sobj.nextInt();
        
        digits nobj = new digits();
        boolean bret = nobj.chkarmstrong(ino);
        if(bret == false)
        {
            System.out.println("given number is armstrong ");
        }
        else
        {
            System.out.println("given number is not a armstrong ");
        }
    }
}

class digits
{
    public boolean chkarmstrong(int ino)
    {
        int isum = 0;
        int icount = 0;
        int idigit = 0;
        int sum = 0;
        int ipower = 1;
        int ino1 = ino;

        while(ino1 != 0)            //count number of digits
        {
            icount++;
            ino1 = ino1 / 10;
        }

        ino1 = ino;

        while(ino1 != 0)           // addition of the armstrong multiplication
        {
            idigit = ino1 % 10;
            for(int icnt = 1;icnt <= icount;icnt++)
            {
                ipower = ipower*idigit;
            }
            sum = sum + ipower;
            ipower = 1;
            ino1 = ino1 / 10;
        }


        if(sum == ino1)     // chek number is armstrong is not
        {
            return true;
        }
        else
        {
            return false;
        }      
    }
}
