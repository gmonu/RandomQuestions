package First;

import java.util.*;



interface Vehicle
	{
		float tax= 10;
		
		void getRegistrationNumber(int n);
		void getownername(String name);		
	}
	
interface Engine extends Vehicle
	{

		public void getChasisNumber(int n);
	}

interface Features extends Vehicle
	{
		public void isAutostart(String n);	
		public void isDigitalSpeedOMeter(String n);
		public void getEngineFuelType(String n);
	
	}
	
class Bike implements Engine, Features
	{
	
	   public void getRegistrationNumber(int n)
	   {
		   System.out.println("Registration number: "+ n);
		   
	   }
		
	   public void getownername(String name)
	   {
		   System.out.println("Owner name:" + name );
		   
	   }
	   
	   public void getChasisNumber(int n)
	   {
		   System.out.println("Chasis Number" + n);
		   
	   }
	   public void isAutostart(String n)
	   {
		   System.out.println("Is autostart?" + n);
	   }
		public void isDigitalSpeedOMeter(String n)
		{
			System.out.println("Is Speed o meter?" + n);
		}
		public void getEngineFuelType(String n)
		{
			System.out.println("Type of Fuel :" + n);
		}
		
		int saleprice;
		int yearofmanufacturing;
		float taxprice = Vehicle.tax;
		float total_price = saleprice;
		
		public void printDetails()
		{
			System.out.println("SalePrice:"+saleprice);
			System.out.println("Year of manufacturer:"+yearofmanufacturing);
			System.out.println("Tax:"+taxprice+"%");
			System.out.println("Total price of Bike::"+total_price);			
			
			
		}
		
	}
	
class Car implements Engine, Features
	{
	   public void getRegistrationNumber(int n)
	   {
		   System.out.println("Registration number: "+ n);
		   
	   }
		
	   public void getownername(String name)
	   {
		   System.out.println("Owner name:" + name );
		   
	   }
	   
	   public void getChasisNumber(int n)
	   {
		   System.out.println("Chasis Number" + n);
		   
	   }
	   public void isAutostart(String n)
	   {
		   System.out.println("Is autostart?" + n);
	   }
		public void isDigitalSpeedOMeter(String n)
		{
			System.out.println("Is Speed o meter?" + n);
		}
		public void getEngineFuelType(String n)
		{
			System.out.println("Type of Fuel :" + n);
		}
		

		int saleprice;
		int yearofmanufacturing;
		float taxprice = Vehicle.tax;
		float total_price = saleprice;
		
		void printDetails()
		{
			System.out.println("SalePrice:"+saleprice);
			System.out.println("Year of manufacturer:"+yearofmanufacturing);
			System.out.println("Tax:"+taxprice+"%");
			System.out.println("Total price of Bike::"+total_price);	
			
		}
		
	}
	

public class Hibrid_Inheritance {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bike b = new Bike();
		Car c = new Car();
		System.out.println("Enter the type of Vehicle you want:\n 1. Car \n 2. Bike");
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter Registration number:");
			c.getRegistrationNumber(sc.nextInt());
			System.out.println("Enter Owner name");
			c.getownername(sc.next());
			System.out.println("Enter Chasis number:");
			c.getChasisNumber(sc.nextInt());
			System.out.println("Is this vehicle can Autostart:");
			c.isAutostart(sc.next());
			System.out.println("Is this vehicle have Digital Speed O Meter:");
			c.isDigitalSpeedOMeter(sc.next());
			System.out.println("Enter Fuel type of Engine");
			c.getEngineFuelType(sc.next());
			System.out.println("Enter Saleprice:");
			c.saleprice = sc.nextInt();
			System.out.println("Enter Year of Manufaturer");
			c.yearofmanufacturing = sc.nextInt();
			c.printDetails();
			
		}
		if(choice ==2)
		{
			System.out.println("Enter Registration number:");
			b.getRegistrationNumber(sc.nextInt());
			System.out.println("Enter Owner name");
			b.getownername(sc.next());
			System.out.println("Enter Chasis number:");
			b.getChasisNumber(sc.nextInt());
			System.out.println("Is this vehicle can Autostart:");
			b.isAutostart(sc.next());
			System.out.println("Is this vehicle have Digital Speed O Meter:");
			b.isDigitalSpeedOMeter(sc.next());
			System.out.println("Enter Fuel type of Engine");
			b.getEngineFuelType(sc.next());
			System.out.println("Enter Saleprice:");
			b.saleprice = sc.nextInt();
			System.out.println("Enter Year of Manufaturer");
			b.yearofmanufacturing = sc.nextInt();
			b.printDetails();
		
		}

	}
	
	

}
