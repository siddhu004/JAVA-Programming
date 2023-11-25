
import java.util.*;

class program65
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

        int freq[] = new int[26];
        int icnt = 0;

        for(icnt = 0;icnt < arr.length;icnt++)
        {
            freq[arr[icnt] - 'a']++;
            freq[brr[icnt] - 'a']--;
        }
        
        for(icnt = 0;icnt < freq.length;icnt++)
        {
            if(freq[icnt] != 0)
            {
                break;
            }
        }

        if(icnt == freq.length)
        {
            System.out.println("strings are anagram");
        }
        else
        {
            System.out.println("string are not anagram");
        }
    }
}