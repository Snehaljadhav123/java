

package student;
public class StudentInfo
{
     public int r_no;
     public String name;
     public String class;
     public int a,b,c,d,e,f;
     int total=0;
     public Student(int roll, String nm, int m1,int m2,int m3,int m4,int m5,int m6)
     {
          r_no = roll;
          name = nm;
          a = m1;
          b = m2;
          c = m3;
          d=m4;
          e=m5;
          f=m6;
         total= a+b+c+d+e+f;
     }
     public void displayper()
     {
          System.out.println("Roll_no : "+r_no);
          System.out.println("Name    : "+name);
          System.out.println("-----MARKS-------");
          System.out.println("Sub 1     : "+a);
          System.out.println("Sub 2     : "+b);
          System.out.println("Sub 3     : "+c);
          System.out.println("Sub 4     : "+d);
          System.out.println("Sub 5     : "+e);
          System.out.println("Sub 6     : "+f);

          System.out.println("Total     : "+total);
          System.out.println("percentage: "+total/3);
          System.out.println("------------------");
     }
}

import student.StudentInfo;
import java.util.*;
import java.lang.*;
import java.io.*;
class slip10a
{
     public static void main(String[] args)
     {
          String nm;
          int roll;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Roll no:= ");
          roll = sc.nextInt();
          System.out.print("Enter Name:= ");
          nm = sc.next();
          int m1,m2,m3,m4,m5,m6;
          System.out.print("Enter 6 sub mark:= ");
          m1 = sc.nextInt();
          m2 = sc.nextInt();
          m3 = sc.nextInt();
          m4=sc.nextInt();
          m5=sc.nextInt();
          m6=sc.nextInt();
          Student s = new Student( roll,nm,m1,m2,m3,m4,m5,m6);
          s.displayper();
     }
}
