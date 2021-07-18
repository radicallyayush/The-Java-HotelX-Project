/*This is a JAVA Project designed for Bidding/ Trading Hotel Rooms on the HotelX Bidding System designed during my Sophomore Year as a part of the OOP Java course @ NIE Mysore.

Name : AYUSH R PATIL
SEMESTER 4, 'A' SECTION
Course Code: IS4C04

Course Instructor: Mr. Suhaas KP, Assistant Professor, Department of Information Science and Engineering, The National Institute Of Engineering, Mysuru 570008

TOPIC: HotelX - Hotel Exchange

AIM: To provide for a better system to book hotels @ cheaper prices and to disrupt the existing system of Fixed price Booking by using the Floating/Demand-Supply Exchange Operation, similar to Equity Stock Exchanges.

Concepts Illustrated:

Abstraction- Classes.
Scope and Lifetime of variables.
Declaring objects.
Instance Variables of different data types.
Constructors/Methods.
'this' keyword.
Inheritance.
Overloading (Constructors)
Overriding.
Objects as parameters.
Access control mechanism.
Use of 'super'.
Packages.
Interfaces.
Exception Handling.
Creation of thread to execute a certain process.
Few string handling mechanisms.
Usage of URI.
The program is divided into two files in two packages in order to illustrate the concept of Packages in Java.

Project Conclusion: This project successfully completes its 2 primary objectives

Enables User to BID for Lower prices
Clears Hotel Inventories in Bulk, thus enhancing Room occupancy.
Finally, it can be said that this JAVA project can be exponentially scaled up by integrating Latest technologies and Frameworks for Deployment across millions of hotel rooms across the globe.

*/



package ProjectX;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {

        Scanner sc = new Scanner(System.in);
        final String OK = "hotelxpass";
        final String ck = "hotelxadmin";
        int n = 5;
        
        System.out.println("\n");
        
		System.out.println("---------------------HotelX Infinity Bid --------------------#acceleratechange\n");
		System.out.println("HotelX Console version: ACCEL4.0, Please Refer to T&C's at www.hotelx.netlify/t&c\n");
		System.out.println("___________________Enter the 'password' to continue to Main Exchange_____________\n"); //password:hotelxpass
		String s = sc.nextLine();
		if(s.equals(OK))
			
		{SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println("Authentication Successful\n");
	    System.out.println("Live Trading is currently live @ "+formatter.format(date)+"\n"); 
	    System.out.println("<-Main Menu->  Enter the desired Option\n");
	    System.out.println("--->1.Buy/Bid for hotel Rooms\n");
	    System.out.println("---->2.Generate Final Invoice & Hotel Info\n");
	    System.out.println("----->3.FAQ's & Understanding HotelX\n");
	    System.out.println("------>4.Dashboard (Admin Access Only)\n");
	    int x = sc.nextInt();
	    
	    switch(x)
	    {        
	      case 1: System.out.println("Exchange is Live, Fetching Seller Base Bid\n");
	              Placeorder po = new Placeorder();
	              po.main();
	              break;
	      case 2: System.out.println("Servers are currently fetching data");
                  viewpro pro = new viewpro();
                  pro.main(null);
                  break;
	      case 3: operationX op = new operationX();
                  op.Opx(n);
                  break;
	      case 4: System.out.println("---------------ACCESS CODE REQUIRED---------------\n");
	              Scanner sci = new Scanner(System.in);
	              String v = sci.nextLine();
	              if(v.equals(ck)) {
	    	      dashboard db = new dashboard();
	              db.main(null);
	              System.out.println("--------------UPCOMING BIDS (internal use only)(sensitive data)------------------------\n");
	              extended2 ex = new extended2();
	              ex.main(null);
	              }
	                       
	    }
		}
		else
		{
			System.out.println("Access denied. Wait for Assistance");
			
		}
        
	}
	
	
	public void tom() throws IOException, URISyntaxException
	{
		System.out.println("Welcome Back to main menu");
		 main(null);
		
	}
	
}
