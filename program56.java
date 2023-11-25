
import java.util.*;

class program56
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string: ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");
        str = str.trim();

        String arr[] = str.split(" ");

        int imax = 0;
        int ipos = 0;
        for(int icnt = 0;icnt < arr.length;icnt++)
        {
            if(arr[icnt].length() > imax)
            {
                imax = arr[icnt].length();
                ipos = icnt;
            }
        }
        System.out.println("largest word is: "+arr[ipos] +"with length: "+imax);
    }
}