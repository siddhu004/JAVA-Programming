
import java.util.*;

class program51
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string: ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");  // remove whitespaces except one
        str = str.trim();  // remove white spaces in strat string and end string
        
        System.out.println("updated string is: "+str);
    }
}