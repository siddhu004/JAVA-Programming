import Marvellous.input;
import Marvellous.Mathematics;

public class PackageDemo
{
    public static void main(String Arg[])
    {

        input aobj = new input();
        Mathematics mobj = new Mathematics();
        int iret=0;
        iret=aobj.addition(10,11);
        System.out.println("addition is : "+iret);
        
        iret=aobj.substraction(10,11);
        System.out.println("substraction is : "+iret);

        iret=mobj.addition(10,11);
        System.out.println("addition is : "+iret);

        iret=mobj.substraction(10,11);
        System.out.println("substraction is : "+iret);
    }
}