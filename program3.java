// automatically import pacakage named as lang
import java.util.*;

class program3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter first number: ");
        int ino1 = sobj.nextInt();
        
        System.out.println("enter second number: ");
        int ino2 = sobj.nextInt();

        int ians = 0;
        ians = ino1 + ino2;

        System.out.println("addition is : "+ians);
           
    }
}