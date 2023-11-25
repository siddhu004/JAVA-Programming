
//////////////////////////////////////////////////

import java.util.*;

class program37
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = sobj.nextLine();

        stringx obj = new stringx();

        String sret = obj.strlower(name);
        System.out.println("string is: "+sret);

    }
}

class stringx
{
    public String strlower(String str)
    {
        char arr[] = str.toCharArray();

        for(int icnt = 0;icnt < arr.length;icnt++)
        {
            if((arr[icnt] >= 'A') && (arr[icnt] <= 'Z'))
            {
                arr[icnt] = (char)(arr[icnt] + 32);
            }
        }        
        String ret = new String(arr);
        return ret;
    }
}