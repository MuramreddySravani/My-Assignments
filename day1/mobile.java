package week1.day1;

public class mobile 
{
	public void makecall()
	{
		String mobilemodel= "iphone";
		float mobileweight=7.45f;
		     System.out.println("my mobilemodel is iphone");
		     System.out.println("my mobileweight is 7.45");
		     System.out.println("makecall");
		
	}
	public void sendmessage()
	{
		 boolean fullycharged = true;
		 int mobilecost= 60000;
		     System.out.println("mymobile is fully charged");
		     System.out.println("my mobile cost is 60000");
		     System.out.println("send a message");
	}
    public static void main(String[] args)
    {
    	mobile a=new mobile();
    	a.makecall();
    	a.sendmessage();
    	   System.out.println("this is my mobile");
		
	}
	{
		
	}

}
