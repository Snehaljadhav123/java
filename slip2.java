
public class slip2
{
   public static void main(String[] args) throws Exception
{
     float weight = Float.parseFloat(args[2]); //Weight   
     float height= Float.parseFloat(args[3]); //Height  
      System.out.println("First Name"+"  "+args[0]);
      System.out.println("Last Name"+"  "+args[1]); 
      System.out.println("Weight"+"  "+args[2]);
      System.out.println("Height"+"  "+args[3]);
       
       float bmi = weight/((height*height)/10);         
       System.out.println("Your BMI is: "+bmi);
 
       if(bmi < 18.5) {
           System.out.println("You are underweight");
       }else if (bmi < 25) {
           System.out.println("You are normal");
       }else if (bmi < 30) {
           System.out.println("You are overweight");
       }
      else {
           System.out.println("You are obese");
       }
   }
}
