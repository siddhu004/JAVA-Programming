
import java.util.*;

class program45
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string: ");
        String str = sobj.nextLine();

        str = str.toLowerCase();

        char arr[] = str.toCharArray();

        int freq[] = new int[26];
        int icnt = 0;

        for(icnt = 0;icnt < arr.length;icnt++)
        {
            freq[arr[icnt] - 'a']++;
        }

        System.out.println("frequency of each letter is: ");

        for(icnt = 0;icnt < freq.length;icnt++)
        {
            System.out.println("frequency of "+(char)(icnt+'a') + " is : " +freq[icnt]);
        }

    }
}

