package networkprogramming;
import java.util.*;
import java.net.*;
public class GetNetwork {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
		Enumeration<NetworkInterface> in= NetworkInterface.getNetworkInterfaces();
		
		if (in==null)
		{
			System.out.println("Not Found");
	      } else
		    {
		    System.out.println(in);
		    }
		}catch (SocketException ex) {
			// TODO: handle exception
		
	 System.out.println("Socket exception error throw");
	}
	}
}
		
	
		
		


