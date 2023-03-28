package networkprogramming;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.net.*;
public class inet {
   
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
      try {
	InetAddress local = InetAddress.getByName("127.0.0.1");
	NetworkInterface n = NetworkInterface.getByInetAddress(local);
	if (n==null)
	{
		System.out.println("Not Found");
      } else
	    {
	    System.out.println(n);
	    }
	}catch (SocketException ex) {
		// TODO: handle exception
	
 System.out.println("Socket exception error throw");
}
}	
}


