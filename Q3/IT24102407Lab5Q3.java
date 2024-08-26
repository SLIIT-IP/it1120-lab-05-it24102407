import java.util.Scanner;
public class IT24102407Lab5Q3
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Start Date(1-31): ");
		int StartDate = input.nextInt();
		
		System.out.print("Enter End Date(1-31): ");
		int EndDate = input.nextInt();
		
		final double PerDay = 48000.0d;
		
		final int ReserverdDates = EndDate - StartDate;
		
		if(StartDate>=1 && EndDate >=1 && StartDate<=31 && EndDate<=31 && StartDate!=0 && EndDate!=0 && StartDate<EndDate && ReserverdDates<3)
		{
			System.out.println(" ");
			System.out.println("Room Charge Per Day: Rs. 48000.0/=");
			System.out.println("Number of Days Reserved: "+ReserverdDates);
			double TotalAmount1 = ReserverdDates*PerDay;
			System.out.println("Total Amount to be Paid: Rs. "+TotalAmount1+"/=");
			
			
		}
		else if(StartDate>=1 && EndDate >=1 && StartDate<=31 && EndDate<=31 && StartDate!=0 && EndDate!=0 && StartDate<EndDate && ReserverdDates>=3 && ReserverdDates<=4)
		{
			System.out.println(" ");
			System.out.println("Room Charge Per Day: Rs. 48000.0/=");
			System.out.println("Number of Days Reserved: "+ReserverdDates);
			double TotalAmount2 = ReserverdDates*PerDay;
			double Discount1 = 0.10;
			double OnlyDiscount1 = TotalAmount2*Discount1;
			double LastAmount1 = TotalAmount2- OnlyDiscount1;
			System.out.println("Total Amount to be Paid: Rs. "+LastAmount1+"/=");
		}
		else if(StartDate>=1 && EndDate >=1 && StartDate<=31 && EndDate<=31 && StartDate!=0 && EndDate!=0 && StartDate<EndDate && ReserverdDates>=5)	
		{	
		    System.out.println(" ");
			System.out.println("Room Charge Per Day: Rs. 48000.0/=");
			System.out.println("Number of Days Reserved: "+ReserverdDates);
			double TotalAmount3 = ReserverdDates * PerDay;
			double Discount2 = 0.20;
			double OnlyDiscount2 = TotalAmount3*Discount2 ;
			double LastAmount2 = TotalAmount3-Discount2;
			System.out.println("Total Amount to be Paid: Rs. "+LastAmount2+"/=");
			
			
			
		}
		else if(StartDate>EndDate)
		{
			System.out.println("Error: Start Date must be less than End Date");
			
		}
		else if(StartDate==0 || EndDate==0 || StartDate>31 || EndDate>31)
		{
			System.out.println("Error: Days must be between 1 and 31");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}