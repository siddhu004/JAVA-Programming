
import java.util.*;

class program62
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter string: ");
        String str1 = sobj.nextLine();

        System.out.println("enter string: ");
        String str2 = sobj.nextLine();

        if(str1.length() != str2.length())
        {
            System.out.println("string are not anagram");
            return;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char arr[] = str1.toCharArray();
        char brr[] = str2.toCharArray();

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        
        int icnt = 0;

        for(icnt = 0;icnt < arr.length;icnt++)
        {
            freq1[arr[icnt] - 'a']++;
        }

        for(icnt = 0;icnt < brr.length;icnt++)
        {
            freq2[brr[icnt] - 'a']++;
        }

        for(icnt = 0;icnt < freq1.length;icnt++)
        {
            if(freq1[icnt] != freq2[icnt])
            {
                break;
            }
        }

        if(icnt == freq1.length)
        {
            System.out.println("strings are anagram");
        }
        else
        {
            System.out.println("string are not anagram");
        }
    }
}