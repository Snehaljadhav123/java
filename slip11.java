import java.io.*;
interface Operation
{
  double PI=3.14;
  void volume();
}


class Cylinder implements Operation 
{
        
        
          public void volume()
          {
Scanner s= new Scanner(System.in);
         System.out.println("Enter the radius:");
         double r=s.nextDouble();
         System.out.println("Enter the height:");
         double h=s.nextDouble();
            double  vol=((22*r*r*h)/7);
             System.out.println("volume of Cylinder is: " +vol);
           }
   }
class slip11
{
   public static void main(String args[]) 
    {   
        Cylinder obj=new Cylinder();  
        obj.volume();
    }
}
