import java.util.Scanner;
public class slip1
{
public static void main (String[] args){
    int[] array = new int [20];
   int n=Integer.parseInt(args[0]);
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<n; i++)
    {
        array[i] = in.nextInt();
    }
    for(int i=0; i<n; i++){
        boolean isPrime = true;
        for (int j=2; j<i; j++){
            if(i%j==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(i + " are the prime numbers in the array ");
    }
}
}
