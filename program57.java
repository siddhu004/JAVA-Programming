
import java.util.*;

class program57
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string: ");
        String str = sobj.nextLine();

        StringBuffer sbobj = new StringBuffer(str);
        
        sbobj = sbobj.reverse();

        System.out.println(sbobj);
    }
}