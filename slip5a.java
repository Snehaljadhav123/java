
import java.util.Scanner;
public class slip5a
{
    public static void main(String args[])
    {
        //Scanner class to take input
        Scanner scan = new Scanner(System.in);
        int row, col; 
        int mat1[][] = new int[3][3];
        int mat2[][] = new int[3][3];
        int add[][] = new int[3][3];
        int prod[][] = new int[3][3];

        //Entering first matrix
        System.out.println("Enter the 3x3 matrix elements for 1st matrix : "); 
        // Loop to take array elements as user input for first matrixn i.e mat1
        for(row=0;row<3;row++) 
            for(col=0;col<3;col++) 
                mat1[row][col] = scan.nextInt();
                
        //print the elements of first matrix i.e mat1         
        System.out.print("1st matrix : "); 
        for(row=0;row<3;row++) 
        { 
            // Used for formatting 
            System.out.print("\n"); 
            for(col=0;col<3;col++) 
            { 
                System.out.print(mat1[row][col]+" "); 
            } 
        }
        //Entering second matrix
        System.out.println("\nEnter the 3x3 matrix elements for 2nd matrix : ");    
        // Loop to take array elements as user input for second matrix
        for(row=0;row<3;row++) 
            for(col=0;col<3;col++) 
                mat2[row][col] = scan.nextInt();
        
        //print the elements of second matrix i.e mat2       
        System.out.print("2nd matrix : "); 
        for(row=0;row<3;row++) 
        { 
            // Used for formatting 
            System.out.print("\n"); 
            for(col=0;col<3;col++) 
            { 
                System.out.print(mat2[row][col]+" "); 
            } 
        }        
        int res[][] = new int[3][3], operationHolder = 0;
        int choice ;
        while(true)
        {
            //Prints the menu to choose operation from
            System.out.println("\n\nBASIC MATRIX OPERATIONS");
            System.out.println("_______________________");
            System.out.println("1. Addition of two matrices");
            System.out.println("2. Multiplication of two matrices");
            System.out.println("3. Exit");
            System.out.println("_______________________");
            System.out.println("Enter your choice : ");
            choice = scan.nextInt();
            // Switch cases to run the menu
            switch(choice)
            {
                case 1:   System.out.print("Addition of matrix : "); 
                              for(row=0;row<3;row++) 
                              { 
                                // Used for formatting 
                               System.out.print("\n"); 
                             for(col=0;col<3;col++) 
                            { 
                              add[row][col]=mat1[row][col] + mat2[row][col];
                              System.out.print(add[row][col]+" "); 
                           } 
                          }     
                        break;
                case 2: System.out.print("Addition of matrix : "); 
                              for(row=0;row<3;row++) 
                              { 
                                // Used for formatting 
                               System.out.print("\n"); 
                              for(col=0;col<3;col++) 
                            { 
                              prod[row][col] = 0;
                              for(int i = 0; i<3; i++)
                              prod[row][col]+=mat1[row][i]*mat2[i][col];
                              System.out.print(prod[row][col]+" "); 
                           } 
                          }     
                         break;
                case 3: System.out.println("Exited from the program");
                        return;
                default: System.out.println("Wrong input, please try again!!");
            }
        }
        
    }
    
}





























