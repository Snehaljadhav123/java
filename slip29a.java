import java.util.*;

class Vehicle
{
	String company;
	double price;
	Scanner s=new Scanner(System.in);	

	void accept()
	{
		System.out.println("Enter Company Name :: ");
		company=s.next();
		System.out.println("Enter Price :: ");
		price=s.nextDouble();
	}
	void display()
	{
		System.out.println("Company Name ::"+company);
		System.out.println("Price ::"+price);
	}
	
}

class LightMotorVehicle extends Vehicle
{
	double mileage;

	void accept()
	{
		super.accept();
		System.out.println("Enter Mileage :: ");
		mileage=s.nextDouble();
	}
	
	void display()
	{
		System.out.println("For Light Motor Vehicle :: ");
		super.display();
		System.out.println("Mileage ::"+mileage);
	}
	
}

class HeavyMotorVehicle extends Vehicle
{
	double capacity;

	void accept()
	{
		super.accept();
		System.out.println("Enter Capacity in tons :: ");
		capacity=s.nextDouble();
	}
	
	void display()
	{
		System.out.println("For Heavy Motor Vehicle :: ");
		super.display();
		System.out.println("Capacity in tons :: "+capacity);
	}
	
}

class slip29a
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many objects to be created :: ");
		int n=s.nextInt();

		LightMotorVehicle[] l=new LightMotorVehicle[n];
		HeavyMotorVehicle[] h=new HeavyMotorVehicle[n];

		int lcnt=0;
		int hcnt=0;

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter \n 1.Light Motor Vehicle\n 2.Heavy Motor Vehicle");
			int ch=s.nextInt();
		
			if(ch==1)
			{
				l[lcnt]=new LightMotorVehicle();
				l[lcnt].accept();
				lcnt++;
			}
			else if(ch==2)
			{
				h[hcnt]=new HeavyMotorVehicle();
				h[hcnt].accept();
				hcnt++;
			}
		}

		for(int i=0;i<lcnt;i++)
		{	
			l[i].display();
			
		}
		for(int i=0;i<hcnt;i++)
		{	
			h[i].display();
		}
	}
}



































