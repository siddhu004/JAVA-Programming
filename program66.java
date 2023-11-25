
import java.util.*;

class program66
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter first string: ");
        String str1 = sobj.nextLine();

        System.out.println("enter second string: ");
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

        Arrays.sort(arr);
        Arrays.sort(brr);

        if(Arrays.equals(arr,brr))
        {
            System.out.println("string are anagram");
        }
        else
        {
            System.out.println("string are not anagram");
        }
    }
}