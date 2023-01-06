import java.util.*;
import java.lang.*;
class slip16
{
    public static void main (String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            
            //Calculating the cube of the number
            int sqr = (int) Math.pow(num,2);
            
            System.out.println("Cube of the number "+num+" is "+sqr+" .");
         
    }
}
