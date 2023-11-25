

///////////////////////////////////////////////////


//////////////////////////////////////////////////

import java.util.*;

class program44
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = sobj.nextLine();

        stringx obj = new stringx();

        String sret = obj.strreverse(name);
        System.out.println("string reverse is: "+sret);

    }
}

class stringx
{
    public String strreverse(String str)
    {
        char arr[] = str.toCharArray();

        int istart = 0;
        int iend = arr.length-1;

        char ctemp = ' ';
        while(istart < iend)
        {
            ctemp = arr[istart];
            arr[istart] = arr[iend];
            arr[iend] = ctemp;

            istart++;
            iend--;
        }
        return new String(arr);
    }
}