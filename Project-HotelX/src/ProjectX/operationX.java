package ProjectX;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.util.Random;


public class operationX {

	public static void Opx (int n) throws IOException, URISyntaxException{
		
		Scanner x = new Scanner(System.in);
		String bck = "Back";
		System.out.println("Lets understand How HotelX Works");
		System.out.println("Hotels sell their rooms at bulk & Clients buy it in Bulk, they further sell it to retail customers.\n");
		System.out.println("However, the price is decided by demand and supply and not fixed by the Exchange,Hotel,HotelX or its employees\n");
		System.out.println("A base price is decided by hotels, (25% of Asking BID) referred to as 'BASE bid', illustrated below");
		System.out.println("A Lower price is decided by HotelX, (75% of Asking BID) referred to as 'Lower bid', illustrated below\n"); // Lower bid is being used to prevent hotels from                                                                                                                                    
		                                                                                                                             // Self bidding  during peak season.                                                                                                                                 
		RandomInt Rand=new RandomInt();
	    Rand.start();
        Main test = new Main();
        System.out.println("If you Want to go back, type 'Back' \n");
        String b = x.nextLine();
        if(b.equals(bck))
        {
        
        test.tom();
        }
      
	}

}

class RandomInt extends Thread                                     //Generates the Random Number
{
	public void run()
	{
	Random random=new Random();
	
	int randomNum=random.nextInt(10000);
	System.out.println("The random Price generated is "+randomNum);
	
	baseInteger s=new baseInteger(randomNum);
	s.start();

	lowerInteger c=new lowerInteger(randomNum);
    c.start();
	}
}
class baseInteger extends Thread                                   
{   int x;
	baseInteger(int n)
	{
		x=n;
	}
	public void run()
	{
		System.out.println();
		System.out.println("Base bid of the asking price is " +(0.25*x));
		System.out.println();
	}
}
class lowerInteger extends Thread                                     
{   int y;
	lowerInteger(int m)
	{
		y=m;
	}
	public void run()
	{
		System.out.println("Lower bid of the asking price is " +(y*0.75)+"\n");
	}


}