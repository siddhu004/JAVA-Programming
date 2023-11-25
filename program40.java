
//////////////////////////////////////////////////

import java.util.*;

class program40
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = sobj.nextLine();

        stringx obj = new stringx();

        String sret = obj.strtoggle(name);
        System.out.println("string is: "+sret);

    }
}

class stringx
{
    public String strtoggle(String str)
    {
        char arr[] = str.toCharArray();

        for(int icnt = 0;icnt < arr.length;icnt++)
        {
            if((arr[icnt] >= 'a') && (arr[icnt] <= 'z'))
            {
                arr[icnt] = (char)(arr[icnt] - 32);
            }
            else if((arr[icnt] >= 'A') && (arr[icnt] <= 'Z'))
            {
                arr[icnt] = (char)(arr[icnt] + 32);
            }
            else
            {}
        }        
        return new String(arr);
    }
}