package networkprogramming;
import java.net.*;
public class Objects{
  public static void main(String[]args){
	  try {
		InetAddress i1 = InetAddress.getByName("www.facebook.com");
		InetAddress i2 = InetAddress.getByName("www.janabhawana.com");
		InetAddress i3 = InetAddress.getByName("www.facebook.com");
		if(i1.equals(i2))
	  
			System.out.println("both are same address");
		{
			System.out.println("Are not same address");
		     }
			String s= i3.toString();
		
		{
				System.out.println("the result of toString:"+s);
				{
				System.out.println("the result of toString:"+i1.hashCode());
				
			}
			byte[]address=i1.getAddress();
			if(address.length==4)
			{
				System.out.println("address is IPV4:");
			}
			else if (address.length==16)
			{
				System.out.println("Address is IPV6:");
			}
			else{
				System.out.println("invalid address");
			}
			
		}	
		}catch(UnknownHostException e){
		// TODO: handle exception
		System.out.println("Host fail:");
	}
		}
}
 
		
  
  

