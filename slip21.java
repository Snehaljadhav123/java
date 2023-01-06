import java.io.*;

class InvalidDayException extends Exception
{
	 InvalidDayException()
	{
		System.out.println("You Entered Invalid Day ........");
	}
} 
class InvalidMonthException extends Exception
{
	InvalidMonthException()
	{
		System.out.println("You Entered Invalid Month ........");
	}
} 
 class MyClass
{
	int day,mon,yr;	
	MyClass()
	{
		day=1;
		mon=1;
		yr=1991;	
	}
	MyClass(int a, int b, int c)
	{
		day=a;
		mon=b;
		yr=c;	
		System.out.println("You Entered Valid date...");
		System.out.println(day+"-"+mon+"-"+yr);
	}
}

class set4b1
{
	public static void main(String args[]) throws IOException
	{
		//BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		try
		{

			int c = Integer.parseInt(args[0]);
	                int b = Integer.parseInt(args[1]);
			int a = Integer.parseInt(args[2]);

			boolean leap=(c%400==0) || (c%4==0) && (c%100!=0);

			if(b<13&&b>0)
			{
			}
			else
				throw new InvalidMonthException(); 
				
			if(b==1||b==3||b==5||b==7||b==8||b==10||b==12)
			{
				if(a<32 &&a>0)
				{
				}
				else
					throw new InvalidDayException(); 
			}
			
			else if(b==4||b==6||b==9||b==11)
			{
				if(a<31&&a>0)
				{
					System.out.println("Accepted....");
				}
				else
					throw new InvalidDayException(); 
			}
			else
			{
				if(leap && a>29)
				{
					System.out.println("Accepted.....");
				}
				else
					throw new InvalidDayException(); 
			}
			
			MyClass m= new MyClass(a,b,c);
		}
		catch(InvalidMonthException m)
		{	
		}
		catch(InvalidDayException d)
		{	
		}
	}
}
