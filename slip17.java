
import java.io.*;

class cust
{
 String name;
 long pno;
 double bal;
 double l_bal;
 void get()
 {
 BufferedReader bc=new BufferedReader(new InputStreamReader(System.in));
   try
   {
  System.out.print("\nEnter Customer Name: ");
  name=bc.readLine();
  System.out.print("\nEnter Customer Phone No.: ");
  pno=Long.parseLong(bc.readLine());
   }
    catch(Exception e)  {  }
 }
 void put()
 {
 System.out.println("\tCustomer Details: ");
 System.out.println("\tName\tPhone No.");
 System.out.println("\t========================================");
 System.out.println("\t"+name+"\t"+pno);
 }
}
    class deposit extends cust
    {
       int acno;
       
         void get_d()
         {
         BufferedReader bd=new BufferedReader(new InputStreamReader(System.in));
           try
           {
          System.out.print("\nEnter Account No.: ");
          acno=Integer.parseInt(bd.readLine());
          System.out.print("\nEnter Account Balance.: ");
          bal=Double.parseDouble(bd.readLine());
           }
            catch(Exception e)  {  }
         }

         void put_d()
         {
          bal=bal-l_bal; 
        System.out.println("\n\tDepositer Details: ");
         System.out.println("\tA/C No.\tBalance");
         System.out.println("\t========================================");
         System.out.println("\t"+acno+"\t"+bal);
           }
    }

    class borrower extends deposit
    {
       int l_no;
      
         void get_b()
         {
         get();
         get_d();

         BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
           try
           {
          System.out.print("\nEnter Loan No.: ");
          l_no=Integer.parseInt(b.readLine());
          System.out.print("\nEnter Loan Balance.: ");
          l_bal=Double.parseDouble(b.readLine());
          
           }
            catch(Exception e)  {  }
         }

         void put_b()
         {
         put();
         put_d();
         System.out.println("\n\tBorrower Details: ");
         System.out.println("\tLoan No.\tLoanBalance");
         System.out.println("\t========================================");
         System.out.println("\t"+l_no+"\t"+l_bal);
         }
    }
  class slip17
  {
    public static void main(String args[])
    {
     int n,i;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           try
           {
          System.out.print("\nHow many customer information enterd: ");
          n=Integer.parseInt(br.readLine());
          System.out.print("\nEnter "+n+" Customer Information: ");
          borrower obj[]=new borrower[n];
        for(i=0;i<n;i++)
        {
        obj[i]=new borrower();
        obj[i].get_b();
        }
        for(i=0;i<n;i++)
        {
         obj[i].put_b();
        }
          }
          catch(Exception e)   {    }
    }
 }

