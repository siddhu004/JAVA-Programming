
import java.util.*;

class program52
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string: ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");
        str = str.trim();
        
        String arr[] = str.split(" ");
        System.out.println("number of words are: "+arr.length);
    }
}