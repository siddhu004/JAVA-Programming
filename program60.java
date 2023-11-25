
import java.util.*;

class program60
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string: ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");
        str = str.trim();

        String arr[] = str.split(" ");

        StringBuffer output = new StringBuffer();

        for(int icnt = arr.length-1; icnt >= 0; icnt--)
        {
            StringBuffer sb = new StringBuffer(arr[icnt]);
            output.append(sb.append(" "));
        }
        System.out.print(output);
    }
}