
import java.util.*;

class program49
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string: ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");

        System.out.println("updated string is: "+str);
    }
}
