class slip24
{
public static void main(String args[])throws Exception
{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println(“Enter name:”);
String name = br.readLine();
System.out.println(“Enter roll no.:”);
String number=br.readLine();
System.out.println(“Enter marks:”);

String marks=br.readLine();
System.out.println(“name:”+name);
System.out.println(“Roll No.:”+number);
System.out.println(“Marks:”+marks);
}
}
