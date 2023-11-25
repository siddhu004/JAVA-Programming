



import java.util.*;

class program15
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter number: ");
        int ino = sobj.nextInt();
        
        Numbers nobj = new Numbers();
        int iret = nobj.evenfact(ino);
        
        System.out.println("multiplication of even factor is: "+iret);
    }
}

class Numbers
{
    public int evenfact(int ivalue)
    {
        int imult = 1;
        for(int icnt = 2;icnt <= ivalue;icnt+=2)   // complexity n/2
        {
            if((ivalue % icnt) == 0)
            {
                imult = imult * icnt;              
            }
        }
        if(imult == 1)
        {
            return 0;
        }
        return imult;
    }
}