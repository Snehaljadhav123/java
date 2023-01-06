
import java.util.*;
import java.lang.*;
class slip10
{
    public static void main (String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            
            //Calculating the cube of the number
            int cube = (int) Math.pow(num,3);
            
            System.out.println("Cube of the number "+num+" is "+cube+" .");
         
    }
}
