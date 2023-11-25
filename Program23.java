

import java.util.*;

class program23
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int isize = sobj.nextInt();
        
        int arr[] = new int[isize];

        System.out.println("enter the elements: ");        
        for(int icnt = 0;icnt < isize;icnt++)
        {
            arr[icnt] = sobj.nextInt();
        }

        System.out.println("elements of array: ");
        for(int icnt = 0;icnt < isize;icnt++)
        {
            System.out.println(arr[icnt]);
        }
    }
}