

///////////////////////////////////////////////////


//////////////////////////////////////////////////

import java.util.*;

class program41
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
        char arr[] = str.toCharArray();
        char brr[] = new char[arr.length];
         int i = 0;
        for(int icnt = 0;icnt < arr.length;icnt++)
        {
            if(arr[icnt] != ' ')
            {
                brr[i] = arr[icnt];
                i++;
            }            
        }        
        String ret = new String(brr);
        return ret;
    }
}