
class Employee
{  
    int id,salary;  
    String name;  
    String desig;  
    Employee(int id, String name, int salary ,String desig)  
    {  
         this.id=id;  
         this.name=name;  
         this.salary=salary;  
         this.desig=desig;  
    }  
    public String toString() // overrides toString() method  
    {  
        return id+" "+name+" "+salary+" "+desig;  
    }  
    public static void main(String args[])  
    {  
        Employee E1=new Employee(111,"Rakesh",50000,"Manager");  
        Employee E2=new Employee(112,"Suresh",25000,"Engineer");  
        // both will print Employee.toString()  
        System.out.println("Employee details: "+E1);  
        System.out.println("Employee details: "+E2);  
     }  
}

