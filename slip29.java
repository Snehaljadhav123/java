import java.io.*;
class slip29
{
public static void main(String arg[])
{
DataInputStream myinput=new DataInputStream(System.in);
String name;
int bill = 0,id = 0;
try
{
System.out.println("enter name of customer");
name = myinput.readLine();
System.out.println("enter bill");
bill = Integer.parseInt(myinput.readLine());
System.out.println("enter id");
id = Integer.parseInt(myinput.readLine());
System.out.println ("name of customer is"+name);
System.out.println ("bill of customer"+bill);
System.out.println ("id of customer"+id);
}
catch(Exception e)
{
System.out.println("wrong input error!!!");
}
}
}
