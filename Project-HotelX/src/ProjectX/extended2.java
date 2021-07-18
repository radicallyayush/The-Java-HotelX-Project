package ProjectX;
import projectX1.Extended;
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




public class extended2
{
	protected static void main(String[] args)
	{
		Hotel Name = new Hotel("TAJ-Bengaluru");
		
		Destination DiName = new Destination("TAJ-Bengaluru","Embassy-Links");
	
		int r = 100;
		double b = 10000.00;
		
		
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
