
//////////////////////////////////////////////////

import java.util.*;

class program34
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = sobj.nextLine();

        stringx obj = new stringx();

        int iret = obj.countsmall(name);
        System.out.println("number of small letter is: "+iret);
    }
}

class stringx
{
    public int countsmall(String str)
    {
        char arr[] = str.toCharArray();

        int icount = 0;
        for(int icnt = 0;icnt < arr.length;icnt++)
        {
            if((arr[icnt] >= 'a') && (arr[icnt] <= 'z'))
            {
                icount++;
            }
        }
        return icount;
    }
}