
import java.util.*;

class program48
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string: ");
        String str = sobj.nextLine();

        str = str.toLowerCase();

        str = str.replaceAll("\\s"," ");
        char arr[] = str.toCharArray();

        int freq[] = new int[26];
        int icnt = 0;

        for(char ch : arr)
        {
            freq[ch - 'a']++;
        }

        System.out.println("frequency of each letter is: ");

        for(icnt = 0;icnt < freq.length;icnt++)
        {
            if(freq[icnt] != 0)
            {
                System.out.println("frequency of "+(char)(icnt+'a') + " is : " +freq[icnt]);
            }
        }
    }
}
