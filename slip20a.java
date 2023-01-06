Addition.java
package tybca;
public class Addition{
int a,b,add;
double x,y,z,sum;
public Addition(int a,int b)
{
add=a+b;
System.out.println(“addition of 2 integer is :->”+add);
}
public Addition(double x, double y)
{

sub=x-y;
System.out.println(“Subtraction is :->”+sub);
}
protected void finalize()
{
a=b=0;
x=y=z=0;
}
}
Maximum.java
package pack2;
public class Maximum
{
int a,b,c;
public Maximum(int a,int b,int c)
{
if((a>b) &&(a>c))
System.out.println(a+” is Maximum “);
else
{
if(b>c)
System.out.println(b+” is Maximum “);
else
System.out.println(c+” is Maximum “);
}
}
}
PackDemo.java
import tybca.*;
class PackDemo
{
public static void main(String args[])
{
Addition obj=new Maths(2,6);
Addition obj1=new Maths(1.0,2.0,3.0);
Maximum m =new Maximum(8,9,5);
}
}



