
import java.util.*;

class program67
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number of row: ");
        int irow = sobj.nextInt();

        System.out.println("enter number of col: ");
        int icol = sobj.nextInt();

        matrix mobj = new matrix(irow,icol);
    }
}

class matrix
{
    public int arr[][];

    public matrix(int i,int j)
    {
        arr = new int[i][j];
    }
}