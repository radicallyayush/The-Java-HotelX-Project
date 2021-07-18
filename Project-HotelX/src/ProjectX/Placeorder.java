package ProjectX;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Placeorder {

	public void main() throws IOException, URISyntaxException {
		int h = 4; // Maximum number of times you get to bid
		int n = 4000;
		Double f;
		Scanner po = new Scanner(System.in);
		System.out.println("Seller is Currently Live, Asking price ---> @ Rs."+n+" per room\n");
		System.out.println("Enter your Buy call price\n");
		Double z = po.nextDouble();
		f = z;
		outer:
		{
		if(z<(.25*n))
		{
			System.out.println("Base Bid is 25% of Asking price\n");	
			System.out.println("To Continue Bid Minimum Rs."+n/4+"\n");
			break outer;
		}
		}

		{
			while(h>0)
			{
				f = n*(0.80);
				System.out.println("OUTBID");
				System.out.println("NOW Asking/selling @ "+f);
				double m = po.nextDouble();
				if(m==f||(m>=f-100 && m<f))
				{
					System.out.println("SOLD @ Rs. "+m+" Redirecting You for Final Authentication\n");
					System.out.println("After Authentication, Please Continue in the CONSOLE");
					System.out.println("Enter what kind of music you would like to wait on 1.English POP  2.Fusion  3.Silence");
					Scanner we =  new Scanner(System.in) ;
					int music = we.nextInt();
					if(music == 2)
					{
					try
					{
					    Thread.sleep(4000);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					Desktop d = Desktop.getDesktop();
					d.browse(new URI("https://youtu.be/6d3ZBIR0X9Y"));
					try
					{
					    Thread.sleep(4000);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					Desktop dry = Desktop.getDesktop();
					dry.browse(new URI("https://ibb.co/6R3mw26"));
					}
					else if(music == 1)
					{
						try
						{
						    Thread.sleep(4000);
						}
						catch(InterruptedException ex)
						{
						    Thread.currentThread().interrupt();
						}
						Desktop mi = Desktop.getDesktop();
						mi.browse(new URI("https://www.youtube.com/watch?v=bRELpVnYWA8"));
						try
						{
						    Thread.sleep(4000);
						}
						catch(InterruptedException ex)
						{
						    Thread.currentThread().interrupt();
						}
						Desktop fi = Desktop.getDesktop();
						fi.browse(new URI("https://ibb.co/6R3mw26"));
						
					}
					else
					{
						System.out.println("Silent mode on");
						try
						{
						    Thread.sleep(4000);
						}
						catch(InterruptedException ex)
						{
						    Thread.currentThread().interrupt();
						}
						Desktop fly = Desktop.getDesktop();
						fly.browse(new URI("https://ibb.co/6R3mw26"));
					}
					try
					{
					    Thread.sleep(8000);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					Desktop sly = Desktop.getDesktop();
					sly.browse(new URI("https://gifted-meitner-56ed56.netlify.app/"));
					
					System.out.println("Confirmed! Please enter 2 to go main menu");
					System.out.println("I would like to offer my thanks to OOPJ (IS4C04) Faculty Mr.Suhaas KP for his support .");
					try
					{
					    Thread.sleep(15000);
					}
					catch(InterruptedException ex)
					{
					    Thread.currentThread().interrupt();
					}
					Desktop flyii = Desktop.getDesktop();
					flyii.browse(new URI("https://imgflip.com/i/5fia5o"));
					
					int u = po.nextInt();
					if(u==2)
					{
					 viewpro vp = new viewpro();
					 viewpro.main(null);
					 System.out.println("\n");
					 Main t = new Main();
					 t.tom();
					 
					}
					
				}
				else if(m>f)
				{
					System.out.println("Illegal Bid, Please Recheck");
				}
				else {
					n = n - 400;
					h--;
				}
				
			}
			System.out.println("Sorry, Hotel has been sold to a higher bidder\n");
			System.exit(1);
		}
		
	}
}
