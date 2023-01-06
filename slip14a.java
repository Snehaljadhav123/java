
package SY;
public class symark
{
        int ct,mt,et;
        public symark()
        {
                ct=0;mt=0;et=0;
        }
        public symark(int c,int m,int e)
        {
                this.ct=c;
                this.mt=m;
                this.et=e;
        }
	
}


package ty

package TY;
public class tymark
{
        int tt,pt;
        public tymark()
        {
                tt=0;pt=0;
        }
        public tymark(int t,int p)
        {
                this.tt=t;
                this.pt=p;
        }
}



prog

import java.io.*;
import SY.symark;
import TY.tymark;

public class set2b2
{
        private int rno;
        private String name;
        private symark sy1;
        private tymark ty1;
        private String grade;

        public set2b2()
        {
                rno=0;
                name="";
                sy1=new symark();
                ty1=new tymark();
                grade="";
        }
        public set2b2(int r,String na,int ct1,int mt1,int et1,int t1,int p,String g)
        {
                rno=r;
                name=na;
                sy1=new symark(ct1,mt1,et1);
                ty1=new tymark(t1,p);
                grade=g;

        }
        public void display(int ct1,int mt1,int et1,int t1,int p,String g)
        {
                System.out.println("roll no\t"+rno);
                System.out.println("name\t"+name);
                System.out.println("total of computer for sy:  "+ct1);
                System.out.println("total of maths for sy:  "+mt1);
                System.out.println("total of electronic for sy:  "+et1);
                System.out.println("total of theory for ty:  "+t1);
                System.out.println("total of practicals for ty:  "+p);
                System.out.println("grade:\n"+g);
        }

public static void main(String args[]) throws IOException
        {
                String g;
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("How many records to be created:");
                int n=Integer.parseInt(br.readLine());
                set2b2 s[]=new set2b2[n+1];
                for(int i=0;i<n;i++)
                {
                        System.out.println("Enter details of record no.:"+(i+1));
                        System.out.println("Roll Number:");
                        int r=Integer.parseInt(br.readLine());
                        System.out.println("Name:");
                        String na=br.readLine();
                        System.out.println("Computer Total of SY:");
                        int ct1=Integer.parseInt(br.readLine());
                        System.out.println("Maths Total of SY:");
                        int mt1=Integer.parseInt(br.readLine());
                        System.out.println("Electronics Total of SY:");
                        int et1=Integer.parseInt(br.readLine());
                        System.out.println("Theory Total of TY:");
                        int t1=Integer.parseInt(br.readLine());
                        System.out.println("Practical Total of TY");
                        int p=Integer.parseInt(br.readLine());
                        double avg=((ct1+mt1+et1+t1+p)/5);
                        if (avg>=70.0)
                                g="A";
                        else if(avg<70.0 && avg>=60.0)
                                g="B";
                        else if(avg<60.0 && avg>=50.0)
                                g="C";
                        else if(avg<50.0 && avg>=40.0)
                                g="Pass Class";
                        else
                                g="Fail";
                     	s[i]=new set2b2(r,na,ct1,mt1,et1,t1,p,g);
                        s[i].display(ct1,mt1,et1,t1,p,g);
                }
        }
}
