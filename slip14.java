import java.io.*;
class NumberZeroException extends Exception
{
    public String toString()
    {
        return("Number is 0");
    }
}

class PrimeNumber
{
    static int no;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    PrimeNumber()
    {
        try
        {
            System.out.println("Enter any integer to check prime ");
            no=Integer.parseInt(br.readLine());
            if(no==0)
                throw new NumberZeroException();
        }
        catch(NumberZeroException ex)
        {
            System.out.println(ex);
        }
        catch(IOException ex1)
        {
            System.out.println("Enter proper number");
        }
    }

    public void prime()
    {
        int cnt=0;
        for(int i=2;i<=no/2;i++)
            if(no%i==0)
            {
                cnt++;
                break;
            }
        if(cnt==0)
            System.out.println(a+" Number is prime");
        else
            System.out.println(a+" Number is not prime");
    }
    public static void main(String args[])
    {
        PrimeNumber pn=new PrimeNumber();
        pn.prime();
    }
}
