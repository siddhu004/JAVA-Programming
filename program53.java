
import java.util.*;

class program53
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string: ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");
        str = str.trim();
        int icount = 0;
        String arr[] = str.split(" ");
        for(String s : arr)
        {
            if(s.equals("india"))
            {
                icount++;
            }
        }        
        System.out.println("number of words are: "+icount);
    }
}