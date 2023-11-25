import java.util.*;

class ToString
{
    public static void main(String arg[])
    {
        int count = 0;
        int icnt = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Name : ");
        String name1 = sc.next();
        System.out.println("Enter a Name : ");
        String name2 = sc.next();

        int length1 = name1.length();
        int length2 = name2.length();

        if(length1 <= length2)
        {
            for(icnt = 0;icnt < length1;icnt++)
            {
                char a = name1.charAt(icnt);
                System.out.print(a);
                char b = name2.charAt(icnt);
                System.out.print(b);
                count++;
            }
            for(icnt = count;icnt < length2;icnt++)
            {
                char b = name2.charAt(icnt);
                System.out.print(b);
            }
        }
        else
        {
            for(icnt = 0;icnt < length2;icnt++)
            {
                char a = name1.charAt(icnt);
                System.out.print(a);
                char b = name2.charAt(icnt);
                System.out.print(b);
                count++;
            }
            for(icnt = count;icnt < length1;icnt++)
            {
                char a = name1.charAt(icnt);
                System.out.print(a);
            }
        }
    }
}
