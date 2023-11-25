// approach 3

//////////////////////////////////////////////////

import java.util.*;

class program30
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int isize = sobj.nextInt();

        myarray mobj = new myarray(isize); 
        mobj.accept();
        mobj.display();
        System.out.println("addition of array is: "+mobj.summation());

    }
}

//////////////////////////////////////////////////

class arrayx
{
    protected int arr[];

    public arrayx(int isize)
    {
        arr = new int[isize];
    }

    protected void accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the elements: ");        
        for(int icnt = 0;icnt < arr.length;icnt++)
        {
            arr[icnt] = sobj.nextInt();
        }
    }

    protected void display()
    {
        System.out.println("elements of array are: ");
        for(int icnt = 0;icnt < arr.length;icnt++)
        {
            System.out.print(arr[icnt]+"\t");
        }
        System.out.println();
    }
}

//////////////////////////////////////////////////

class myarray extends arrayx
{
    public myarray(int isize)
    {
        super(isize);
    }

    public int summation()
    {
        int isum = 0;
        for(int icnt = 0;icnt < arr.length;icnt++)
        {
            isum = isum + arr[icnt];
        }
        return isum;
    }
}

//////////////////////////////////////////////////
