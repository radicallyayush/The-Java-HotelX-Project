package projectX1;

public class Extended                                            //Super Class
{
	public String HotelName;                                    
	
	
	public void Hotel()                                              // Default Constructor
	{ 
        HotelName ="null";
	}
	
	public void Hotel(String x)                                     //Parameterized Constructor
	{
		 HotelName = x;
	}
	
	public void displayHotelname()                            //Member Function 
	{   
		
		System.out.println("This is "+HotelName+".");
		
	}
	public void displayHotelname(int m)                            //Member Function 
	{   
		
		System.out.println(HotelName+" has currently "+m+" Unsold Rooms.");
	}
	public void displayHotelname(double n)                            //Member Function
	{   
		
		System.out.println("The Average Rate at "+HotelName+" is Rs."+n+".");
	}
	
	
	public void override()
	{
		System.out.println(HotelName+" is among India's Top Hotels.");
	}
	
	
}