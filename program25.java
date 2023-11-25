// approach 2

import java.util.*;

class program25
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int isize = sobj.nextInt();

        arrayx aobj = new arrayx(isize);   
        aobj.accept();
        aobj.display();

    }
}

class arrayx
{
    public int arr[];

    public arrayx(int isize)
    {
        arr = new int[isize];
    }

    public void accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the elements: ");        
        for(int icnt = 0;icnt < arr.length;icnt++)
        {
            arr[icnt] = sobj.nextInt();
        }
    }

    public void display()
    {
        System.out.println("elements of array are: ");
        for(int icnt = 0;icnt < arr.length;icnt++)
        {
            System.out.println(arr[icnt]+"\t");
        }
        System.out.println();
    }
}