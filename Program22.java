

import java.util.*;

class program22
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number: ");
        int ino = sobj.nextInt();
        
        digits nobj = new digits();
        
        int icount = nobj.cntdigit(ino);
        int sum = nobj.ipower(ino,icount);

        boolean bret = nobj.chkarmstrong1(ino,sum);
        if(bret == true)
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
        int icount = 0;
        int idigit = 0;
        int sum = 0;
        int ipower = 1;
            
        int cntdigit(int ino1)
        {
            while(ino1 != 0)            //count number of digits
            {
                icount++;
                ino1 = ino1 / 10;
            }
            return icount;
        }    


        int ipower(int ino1,int icount)
        {

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
            return sum;
        }
        

    boolean chkarmstrong1(int ino1,int sum)
    {
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

