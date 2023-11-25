
import java.util.*;

class program68
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number of row: ");
        int irow = sobj.nextInt();

        System.out.println("enter number of col: ");
        int icol = sobj.nextInt();

        matrix mobj = new matrix(irow,icol);
        mobj.accept();
        mobj.display();
    }
}

class matrix
{
    public int arr[][];

    public matrix(int i,int j)
    {
        arr = new int[i][j];
    }

    public void accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter elements: ");
        for(int i = 0;i < arr.length;i++)
        {
            for(int j = 0;j < arr[i].length;j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void display()
    {
        System.out.println("enter elements of matrix are: ");
        for(int i = 0;i < arr.length;i++)
        {
            for(int j = 0;j < arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}