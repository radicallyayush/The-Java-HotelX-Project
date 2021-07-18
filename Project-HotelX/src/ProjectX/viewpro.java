package ProjectX;

	class Hotel                                            //Super Class
	{
		String HotelName;                                    
		
		
		Hotel()                                              // Default Constructor
		{ 
	        HotelName ="null";
		}
		
		Hotel(String x)                                     //Parameterized Constructor
		{
			 HotelName = x;
		}
		
		void displayHotelname()                            //Member Function 
		{   
			
			System.out.println("This is "+HotelName+".");
			
		}
		void displayHotelname(int m)                            //Member Function 
		{   
			
			System.out.println(HotelName+" has currently "+m+" Unsold Rooms.");
		}
		void displayHotelname(double n)                            //Member Function
		{   
			
			System.out.println("The Average Rate at "+HotelName+" is Rs."+n+".");
		}
		
		
		void override()
		{
			System.out.println(HotelName+" is among India's Top Hotels.");
		}
		
		
	}
	 
	

	class Destination extends Hotel                  // Single Level Inheritance
	{
		String Destinationone;

		Destination()
		{
			Destinationone = "null";
		}
		
		Destination(String x, String y)
		{
			super(x);
			this.Destinationone = y;
		}
		
		
		void displaydestinationname()
		{
			System.out.println(HotelName+" is located in "+Destinationone+".");
		}
		void override()
		{
			System.out.println("The Top hotels are in "+Destinationone+" Region.");
		}
		
		
	}

	


	public class viewpro
	{
		public static void main(String[] args)
		{
			Hotel Name = new Hotel("ITC Mysuru");
			
			Destination DiName = new Destination("ITC Mysuru","Devaraj-URS-Road");
		
			int r = 400;
			double b = 4000.00;
			
			
			System.out.println("The Hotel & Location is given below ");
			Name.displayHotelname();
			DiName.displaydestinationname();
			System.out.print("\n");
			
			Name.displayHotelname(r);
			Name.displayHotelname(b);
			Name.override(); 
			DiName.override();
			
			
		}
		
	}
	
	


