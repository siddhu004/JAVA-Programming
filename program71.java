
import java.util.*;
class program71
{
    void swap(String s1,String s2)
    {
        String s3;
        s3 = s1;
        s1 = s2;
        s2 = s3;

        System.out.println("new string s1 ="+s1);
        System.out.println("new string s2 ="+s2);
    }
    void swap(int i1,int i2)
    {
        int i3;
        i3 = i1;
        i1 = i2;
        i2 = i3;

        System.out.println("new integer i1 ="+i1);
        System.out.println("new integer i2 ="+i2);
    }
    void swap(float f1,float f2)
    {
        float f3;
        f3 = f1;
        f1 = f2;
        f2 = f3;

        System.out.println("new float i1 ="+f1);
        System.out.println("new float i2 ="+f2);
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        program71 s = new program71();
        System.out.println("enter two string : ");
        String s1=sc.next();
        String s2=sc.next();

        System.out.println("enter two int : ");
        int i1=sc.nextInt();
        int i2=sc.nextInt();

        System.out.println("enter two float : ");
        float f1=sc.nextFloat();
        float f2=sc.nextFloat();

        s.swap(s1,s2);
        s.swap(i1,i2);
        s.swap(f1,f2);        
    }
}