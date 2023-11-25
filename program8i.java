package siddharth;

public class program8i
{
    public int factorial(int ivalue)
    {
        int imult = 1;
        for(int icnt = 1;icnt <= ivalue;icnt++)
        {
            imult = imult * icnt;
        }
        return imult;
    }
}

