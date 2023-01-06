import java.io.*;

abstract class Staff
{
String name,id;
}
class OfficeStaff extends Staff
{
String department;
double salary;
public void accept() throws IOException
{
System.out.println("Enter the name, id, department and salary: ");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
name=br.readLine();
id=br.readLine();
department=br.readLine();
salary=Double.parseDouble(br.readLine());
}
public void display(){

System.out.println("Name: "+name);
System.out.println("Address: "+id);
System.out.println("Department: "+department);
System.out.println("Salary: "+salary);
System.out.println("----------------------");
}
}
public class slip1a
 {
public static void main(String [] args) throws IOException
{
int i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Office Staff Information");
System.out.println("Enter the number of Staff: ");
int n=Integer.parseInt(br.readLine());
OfficeStaff [] l=new OfficeStaff[n];
for(i=0;i<n;i++)
{
l[i]=new OfficeStaff();
l[i].accept();
}
for(i=0;i<n;i++)
{
l[i].display();
}

}
}

