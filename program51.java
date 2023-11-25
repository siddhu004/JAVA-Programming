
import java.util.*;

class program51
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string: ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");
        str = str.trim();
        int ifrequency = 0;


        for(int icnt = 0;icnt < str.length();icnt++)
        {
            if(str.charAt(icnt) == ' ')
            {
                ifrequency++;
            }
        }
        
        if(str.length() == 0)
        {
            System.out.println("number of words are:0");
        }
        else
        {
            System.out.println("number of words are: "+(ifrequency+1));
        }
    }
}