
import java.util.*;

class program55
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

        System.out.println("enter word that you want to search: ");
        String word = sobj.nextLine();

    
        for(String s : arr)
        {
            if(s.equals(word))
            {
                icount++;
            }
        }         
        System.out.println("frequency of india is: "+icount);
    }
}